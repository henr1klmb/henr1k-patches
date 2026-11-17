<div align="center">

# 🧩 Henrik's Morphe Patches

**A personal collection of Android bytecode & resource patches built for the Morphe Patcher.**

[![Release](https://img.shields.io/github/v/release/henr1klmb/henr1k-patches?style=for-the-badge&color=6E56CF)](https://github.com/henr1klmb/henr1k-patches/releases)
[![Pre-Release](https://img.shields.io/github/v/release/henr1klmb/henr1k-patches?include_prereleases&label=dev&style=for-the-badge&color=E5484D)](https://github.com/henr1klmb/henr1k-patches/releases)
[![License](https://img.shields.io/github/license/henr1klmb/henr1k-patches?style=for-the-badge&color=30A46C)](LICENSE)
[![Issues](https://img.shields.io/github/issues/henr1klmb/henr1k-patches?style=for-the-badge&color=F76B15)](https://github.com/henr1klmb/henr1k-patches/issues)

[Quick Add to Morphe](https://morphe.software/add-source?github=henr1klmb/henr1k-patches) · [Patch List](#-available-patches) · [Build Guide](#-building-from-source) · [FAQ](#-faq)

</div>

---

> [!IMPORTANT]
> **Scope & Limitations**  
> These patches focus on client-side improvements, removing in-app ads, tracking SDKs, and many more. Features enforced strictly on the server side (cloud sync, AI backends, server-validated subscriptions) cannot be modified here.

---

## 🎯 What's Inside

This repository houses custom patches I maintain with the help of AI. They are tested on multiple devices and emulator before being released! This is made by me, a human ;)

---

## 🚀 Get the patches

### Option 1: One-Click Source Import (Recommended)
Tap the link below on your Android device to register this repository directly in **Morphe Manager**:

👉 **[Add `henr1klmb/henr1k-patches` to Morphe](https://morphe.software/add-source?github=henr1klmb/henr1k-patches)**

### Option 2: Manual Setup
1. Open **Morphe Manager** and navigate to **Sources** → **+**.
2. Paste the repository URL:
   ```text
   https://github.com/henr1klmb/henr1k-patches
   ```
3. *(Optional)* Enable **Pre-releases** in Morphe's settings if you want to test experimental patches. Work in progress! (Please don't complain about bugs etc in that case, thats why its pre-release)

---

## 🩹 Available Patches

<!-- PATCHES_START -->
<!-- Automatically populated by the release workflow -->
<!-- PATCHES_END -->

---

## 🛠️ Building from Source

To compile the `.mpp` patch bundle locally, make sure **JDK 17 or 21** and the **Android SDK** are configured:

```bash
git clone https://github.com/henr1klmb/henr1k-patches.git
cd henr1k-patches
./gradlew assembleRelease
```

The compiled patch bundle will be generated inside `patches/build/libs/`. For details on applying `.mpp` bundles via CLI or desktop tools, check the [Morphe Documentation](https://github.com/MorpheApp/morphe-documentation).

---

## 🐛 Reporting Issues

If an app update breaks an existing patch, feel free to open an issue. To help reproduce the problem quickly, please include:

- **Target App:** Name, package ID, and exact version number (e.g., `de.mobile.android.app`).
- **APK Source:** Clean, unmodded APK architecture (`arm64-v8a` preferred—no pre-patched or repacked splits).
- **Bundle Channel:** Whether you used a `stable` release or a `dev` pre-release.
- **Crash Logs:** Relevant stack traces captured via `adb logcat`.

---

## 💬 FAQ

<details>
<summary><strong>Why don't Google Sign-In or Google Cloud features work after patching?</strong></summary>
<br>
Patching requires re-signing the APK with a custom key, which invalidates signature checks used by Google Play Services. Install <strong>MicroG</strong> if an app relies on Google account authentication.
</details>

<details>
<summary><strong>Which APK format should I download?</strong></summary>
<br>
Always start from an unmodified APK or split bundle (<code>arm64-v8a</code>) obtained from a trusted archive such as APKMirror, or the ones suggested in the Morphe Manager .
</details>

<details>
<summary><strong>Can you add a patch for App XYZ?</strong></summary>
<br>
You are welcome to open an enhancement request, as long as the requested feature is handled client-side and not locked behind server authentication.
</details>

---

## ⚖️ Disclaimer & License

This project is intended strictly for **educational and personal research purposes**. It is not affiliated with or endorsed by any of the application developers mentioned in this repository. Use at your own risk, and support developers by purchasing legitimate subscriptions where applicable.

- Built on top of [Morphe](https://github.com/MorpheApp/) and [ReVanced](https://github.com/revanced).
- Distributed under the [GNU General Public License v3.0](LICENSE).
