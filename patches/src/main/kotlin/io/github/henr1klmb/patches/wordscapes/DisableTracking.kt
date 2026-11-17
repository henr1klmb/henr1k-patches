package io.github.henr1klmb.patches.wordscapes

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.patch

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

@Suppress("unused")
val disableTrackingPatch = patch(
    name = "Disable tracking",
    description = "Disables Tracking and Analytics.",
) {
    compatibleWith(WORDSCAPES_COMPATIBILITY)

    execute {
        // Disable Adjust attribution & telemetry
        AdjustSystemLifecycleContentProviderFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_FALSE.trimIndent(),
        )

        AdjustInitSdkFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_VOID,
        )

        AdjustTrackEventFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_VOID,
        )

        // Disable Firebase Analytics
        FirebaseInitProviderFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_FALSE.trimIndent(),
        )

        FirebaseAnalyticsLogEventFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_VOID,
        )

        // Disable Facebook AppEvents & Attribution
        FacebookInitProviderFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_FALSE.trimIndent(),
        )

        FacebookAppEventsLogEventFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_VOID,
        )
    }
}
