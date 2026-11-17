package io.github.henr1klmb.patches.wordscapes

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

internal val WORDSCAPES_COMPATIBILITY = Compatibility(
    packageName = "com.peoplefun.wordcross",
    name = "Wordscapes",
    targets = listOf(AppTarget("3.14.40")),
)

private const val STRING_TYPE = "Ljava/lang/String;"
private const val BUNDLE_TYPE = "Landroid/os/Bundle;"
private const val FLOAT_TYPE = "F"
private const val BOOLEAN_TYPE = "Z"
private const val VOID_RETURN = "V"
private const val BOOLEAN_RETURN = "Z"

private const val ON_CREATE_NAME = "onCreate"
private const val LOG_EVENT_NAME = "logEvent"

// MaxUnityPlugin & Ad Classes
private const val MAX_UNITY_PLUGIN_CLASS = "Lcom/applovin/mediation/unity/MaxUnityPlugin;"
private const val MAX_UNITY_AD_MANAGER_CLASS = "Lcom/applovin/mediation/unity/MaxUnityAdManager;"

// Ad Provider Classes
private const val GOOGLE_MOBILE_ADS_INIT_PROVIDER_CLASS = "Lcom/google/android/gms/ads/MobileAdsInitProvider;"
private const val MOBILE_FUSE_SDK_INIT_PROVIDER_CLASS = "Lcom/mobilefuse/sdk/MobileFuseSdkInitProvider;"
private const val AUDIENCE_NETWORK_CONTENT_PROVIDER_CLASS = "Lcom/facebook/ads/AudienceNetworkContentProvider;"
private const val VUNGLE_PROVIDER_CLASS = "Lcom/vungle/ads/VungleProvider;"
private const val BIDMACHINE_INIT_PROVIDER_CLASS = "Lio/bidmachine/BidMachineInitProvider;"
private const val IRONSOURCE_LIFECYCLE_PROVIDER_CLASS = "Lcom/ironsource/lifecycle/IronsourceLifecycleProvider;"
private const val BIGO_ADS_PROVIDER_CLASS = "Lsg/bigo/ads/controller/provider/BigoAdsProvider;"
private const val MB_COMPONENT_LIFECYCLE_PROVIDER_CLASS = "Lcom/mbridge/msdk/foundation/tools/MBComponentLifCycleProvider;"

// Tracking Classes
private const val ADJUST_SYSTEM_LIFECYCLE_CONTENT_PROVIDER_CLASS = "Lcom/adjust/sdk/SystemLifecycleContentProvider;"
private const val ADJUST_CLASS = "Lcom/adjust/sdk/Adjust;"
private const val ADJUST_CONFIG_TYPE = "Lcom/adjust/sdk/AdjustConfig;"
private const val ADJUST_EVENT_TYPE = "Lcom/adjust/sdk/AdjustEvent;"
private const val FIREBASE_INIT_PROVIDER_CLASS = "Lcom/google/firebase/provider/FirebaseInitProvider;"
private const val FIREBASE_ANALYTICS_CLASS = "Lcom/google/firebase/analytics/FirebaseAnalytics;"
private const val FACEBOOK_INIT_PROVIDER_CLASS = "Lcom/facebook/internal/FacebookInitProvider;"
private const val FACEBOOK_APP_EVENTS_LOGGER_CLASS = "Lcom/facebook/appevents/AppEventsLogger;"

// --- MaxUnityPlugin Banner & MRec Fingerprints ---

internal object MaxUnityPluginCreateBanner1Fingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "createBanner",
    parameters = listOf(STRING_TYPE, FLOAT_TYPE, FLOAT_TYPE, BOOLEAN_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginCreateBanner2Fingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "createBanner",
    parameters = listOf(STRING_TYPE, STRING_TYPE, BOOLEAN_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginLoadBannerFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "loadBanner",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginShowBannerFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "showBanner",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginStartBannerAutoRefreshFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "startBannerAutoRefresh",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginCreateMRec1Fingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "createMRec",
    parameters = listOf(STRING_TYPE, FLOAT_TYPE, FLOAT_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginCreateMRec2Fingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "createMRec",
    parameters = listOf(STRING_TYPE, STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginLoadMRecFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "loadMRec",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginShowMRecFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "showMRec",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginStartMRecAutoRefreshFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "startMRecAutoRefresh",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

// --- MaxUnityPlugin Interstitial & AppOpen Fingerprints ---

internal object MaxUnityPluginIsInterstitialReadyFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "isInterstitialReady",
    parameters = listOf(STRING_TYPE),
    returnType = BOOLEAN_RETURN,
)

internal object MaxUnityPluginShowInterstitialFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "showInterstitial",
    parameters = listOf(STRING_TYPE, STRING_TYPE, STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginLoadInterstitialFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "loadInterstitial",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginIsAppOpenAdReadyFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "isAppOpenAdReady",
    parameters = listOf(STRING_TYPE),
    returnType = BOOLEAN_RETURN,
)

internal object MaxUnityPluginShowAppOpenAdFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "showAppOpenAd",
    parameters = listOf(STRING_TYPE, STRING_TYPE, STRING_TYPE),
    returnType = VOID_RETURN,
)

internal object MaxUnityPluginLoadAppOpenAdFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "loadAppOpenAd",
    parameters = listOf(STRING_TYPE),
    returnType = VOID_RETURN,
)

// --- MaxUnity Rewarded Ad Fingerprints ---

internal object MaxUnityPluginIsRewardedAdReadyFingerprint : Fingerprint(
    definingClass = MAX_UNITY_PLUGIN_CLASS,
    name = "isRewardedAdReady",
    parameters = listOf(STRING_TYPE),
    returnType = BOOLEAN_RETURN,
)

internal object MaxUnityAdManagerShowRewardedAdFingerprint : Fingerprint(
    definingClass = MAX_UNITY_AD_MANAGER_CLASS,
    name = "showRewardedAd",
    parameters = listOf(STRING_TYPE, STRING_TYPE, STRING_TYPE),
    returnType = VOID_RETURN,
)

// --- Ad Provider Fingerprints ---

internal object GoogleMobileAdsInitProviderFingerprint : Fingerprint(
    definingClass = GOOGLE_MOBILE_ADS_INIT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object MobileFuseSdkInitProviderFingerprint : Fingerprint(
    definingClass = MOBILE_FUSE_SDK_INIT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object AudienceNetworkContentProviderFingerprint : Fingerprint(
    definingClass = AUDIENCE_NETWORK_CONTENT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object VungleProviderFingerprint : Fingerprint(
    definingClass = VUNGLE_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object BidMachineInitProviderFingerprint : Fingerprint(
    definingClass = BIDMACHINE_INIT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object IronsourceLifecycleProviderFingerprint : Fingerprint(
    definingClass = IRONSOURCE_LIFECYCLE_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object BigoAdsProviderFingerprint : Fingerprint(
    definingClass = BIGO_ADS_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object MBComponentLifCycleProviderFingerprint : Fingerprint(
    definingClass = MB_COMPONENT_LIFECYCLE_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

// --- Tracking Fingerprints ---

internal object AdjustSystemLifecycleContentProviderFingerprint : Fingerprint(
    definingClass = ADJUST_SYSTEM_LIFECYCLE_CONTENT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object AdjustInitSdkFingerprint : Fingerprint(
    definingClass = ADJUST_CLASS,
    name = "initSdk",
    parameters = listOf(ADJUST_CONFIG_TYPE),
    returnType = VOID_RETURN,
)

internal object AdjustTrackEventFingerprint : Fingerprint(
    definingClass = ADJUST_CLASS,
    name = "trackEvent",
    parameters = listOf(ADJUST_EVENT_TYPE),
    returnType = VOID_RETURN,
)

internal object FirebaseInitProviderFingerprint : Fingerprint(
    definingClass = FIREBASE_INIT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object FirebaseAnalyticsLogEventFingerprint : Fingerprint(
    definingClass = FIREBASE_ANALYTICS_CLASS,
    name = LOG_EVENT_NAME,
    parameters = listOf(STRING_TYPE, BUNDLE_TYPE),
    returnType = VOID_RETURN,
)

internal object FacebookInitProviderFingerprint : Fingerprint(
    definingClass = FACEBOOK_INIT_PROVIDER_CLASS,
    name = ON_CREATE_NAME,
    parameters = emptyList(),
    returnType = BOOLEAN_RETURN,
)

internal object FacebookAppEventsLogEventFingerprint : Fingerprint(
    definingClass = FACEBOOK_APP_EVENTS_LOGGER_CLASS,
    name = LOG_EVENT_NAME,
    parameters = listOf(STRING_TYPE, BUNDLE_TYPE),
    returnType = VOID_RETURN,
)
