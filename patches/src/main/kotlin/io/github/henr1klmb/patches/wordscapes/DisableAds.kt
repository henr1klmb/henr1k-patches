package io.github.henr1klmb.patches.wordscapes

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.patch

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

@Suppress("unused")
val disableAdsPatch = patch(
    name = "Disable ads",
    description = "Disables any form of ads.",
) {
    compatibleWith(WORDSCAPES_COMPATIBILITY)

    execute {
        // --- 1. Block Banners and MRec Ads ---
        MaxUnityPluginCreateBanner1Fingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginCreateBanner2Fingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginLoadBannerFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginShowBannerFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginStartBannerAutoRefreshFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginCreateMRec1Fingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginCreateMRec2Fingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginLoadMRecFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginShowMRecFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginStartMRecAutoRefreshFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)

        // --- 2. Block Unsolicited Interstitials & App Open Ads ---
        MaxUnityPluginIsInterstitialReadyFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        MaxUnityPluginShowInterstitialFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginLoadInterstitialFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginIsAppOpenAdReadyFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        MaxUnityPluginShowAppOpenAdFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)
        MaxUnityPluginLoadAppOpenAdFingerprint.methodOrNull?.addInstructions(0, RETURN_VOID)

        // --- 3. Ad Providers ---
        GoogleMobileAdsInitProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        MobileFuseSdkInitProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        AudienceNetworkContentProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        VungleProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        BidMachineInitProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        IronsourceLifecycleProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        BigoAdsProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
        MBComponentLifCycleProviderFingerprint.methodOrNull?.addInstructions(0, RETURN_FALSE.trimIndent())
    }
}
