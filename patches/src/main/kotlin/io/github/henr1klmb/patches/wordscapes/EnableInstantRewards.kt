package io.github.henr1klmb.patches.wordscapes

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.patch
import io.github.henr1klmb.patches.shared.ensureRegisters

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val DISPATCH_INSTANT_REWARDS = """
    new-instance v0, Lorg/json/JSONObject;
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    const-string v1, "name"
    const-string v2, "OnRewardedAdDisplayedEvent"
    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    const-string v1, "adUnitId"
    invoke-static {v0, v1, p1}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0}, Lcom/applovin/mediation/unity/MaxUnityAdManager;->forwardUnityEvent(Lorg/json/JSONObject;)V

    new-instance v0, Lorg/json/JSONObject;
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    const-string v1, "name"
    const-string v2, "OnRewardedAdReceivedRewardEvent"
    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    const-string v1, "adUnitId"
    invoke-static {v0, v1, p1}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    const-string v1, "rewardLabel"
    const-string v2, ""
    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    const-string v1, "rewardAmount"
    const-string v2, "0"
    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0}, Lcom/applovin/mediation/unity/MaxUnityAdManager;->forwardUnityEvent(Lorg/json/JSONObject;)V

    new-instance v0, Lorg/json/JSONObject;
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    const-string v1, "name"
    const-string v2, "OnRewardedAdHiddenEvent"
    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    const-string v1, "adUnitId"
    invoke-static {v0, v1, p1}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0}, Lcom/applovin/mediation/unity/MaxUnityAdManager;->forwardUnityEvent(Lorg/json/JSONObject;)V

    return-void
"""

@Suppress("unused")
val enableInstantRewardsPatch = patch(
    name = "Enable instant rewards",
    description = "Enables instant rewards without watching video ads.",
) {
    compatibleWith(WORDSCAPES_COMPATIBILITY)

    execute {
        // Always report rewarded ads as available/loaded to Unity
        MaxUnityPluginIsRewardedAdReadyFingerprint.methodOrNull?.addInstructions(
            0,
            RETURN_TRUE.trimIndent(),
        )

        // When showRewardedAd is invoked, immediately fire reward events and return
        MaxUnityAdManagerShowRewardedAdFingerprint.methodOrNull?.let { method ->
            method.ensureRegisters(7)
            method.addInstructions(
                0,
                DISPATCH_INSTANT_REWARDS.trimIndent(),
            )
        }
    }
}
