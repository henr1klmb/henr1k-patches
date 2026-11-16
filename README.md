# henr1k patches

Custom [Morphe](https://github.com/MorpheApp) patches for multiple Apps

---

## Included Patches
<!-- PATCHES_START -->
> **[v1.2.0-dev.13](https://github.com/henr1klmb/henr1k-patches/releases/tag/v1.2.0-dev.13)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;16 patches total
<details open>
<summary>📦 DB Navigator&nbsp;&nbsp;•&nbsp;&nbsp;3 patches</summary>
<br>

**Package name:** `de.hafas.android.db`

**🎯 Supported versions:**

| 26.20.0 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [AMOLED dark mode](#amoled-dark-mode) | Replaces dark background colors in night mode with pure black (#FF000000). |  |
| [Disable tracking](#disable-tracking) | Disables Tracking and Analytics. |  |
| [Enable screenshots](#enable-screenshots) | Allow taking screenshots and screen recordings. |  |

</details>

<details open>
<summary>📦 NetMirror&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

**Package name:** `app.netmirror.netmirrornew`

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Custom icon](#custom-icon) | Changes the app name and optionally replaces the launcher icon. | • App name<br>• Custom icon PNG path (optional) |
| [Disable trackers](#disable-trackers) | Disables Tracking and Analytics. |  |

</details>

<details open>
<summary>📦 ÖBB Scotty&nbsp;&nbsp;•&nbsp;&nbsp;4 patches</summary>
<br>

**Package name:** `de.hafas.android.oebb`

**🎯 Supported versions:**

| 9.0.5 (72) |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable ads](#disable-ads) | Blocks Wegfinder ad, marketing banners and others. |  |
| [Disable tracking](#disable-tracking) | Disables Tracking and Analytics. |  |
| [Enable OSM map](#enable-osm-map) | Activates the built-in OpenStreetMap / HaCon map engine without requiring a Google Maps API key. | • Tile server URL |

</details>

<details open>
<summary>📦 SBB Mobile&nbsp;&nbsp;•&nbsp;&nbsp;3 patches</summary>
<br>

**Package name:** `ch.sbb.mobile.android.b2c`

**🎯 Supported versions:**

| 12.27.0.87.master |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable ads](#disable-ads) | Disables multiple ad types. |  |
| [Disable tracking](#disable-tracking) | Disables Tracking and Analytics. |  |
| [Enable screenshots](#enable-screenshots) | Allows taking screenshots and screen recordings. |  |

</details>

<details open>
<summary>📦 mydealz&nbsp;&nbsp;•&nbsp;&nbsp;3 patches</summary>
<br>

**Package name:** `com.tippingcanoe.mydealz`

**🎯 Supported versions:**

| 8.21.01 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable tracking](#disable-tracking) | Disables Tracking and Analytics. |  |
| [Hide popups](#hide-popups) | Disables in-app review prompts, popups, and surveys. |  |
| [Hide sponsored deals](#hide-sponsored-deals) | Hides sponsored deals, discussions, and in-feed advertisement cards. |  |

</details>

<details open>
<summary>📦 Reddit&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**Package name:** `com.reddit.frontpage`

**🎯 Supported versions:**

| 2026.46.0 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Hide AutoModerator comments](#hide-automoderator-comments) | Automatically hides comments from AutoModerator in by default. |  |

</details>

<!-- PATCHES_END -->
---
## Planned Patches / Work in progress
- [ ] **Comaprify** (`com.akshat.comparify`) – Disable ads & tracking
- [ ] **BookMyShow** (`com.bt.bms`) – AMOLED dark mode, disable ads & telemetry, hide Lounge & Live Events tabs
- [x] **Reddit** (`com.reddit.frontpage`) – Auto-collapse/hide AutoModerator comments
- [ ] **mobile.de** (`de.mobile.android.app`) – Disable ads, sponsored listings, tracking & AI features
- [ ] **ITVX** (`air.ITVMobilePlayer`) - Disable ads, focus on video ads
- [ ] **Channel 4** (`com.channel4.ondemand`) - Disable ads, focus on video ads
- [ ] **U** (`uk.co.uktv.dave`) - Disable ads, focus on video ads
- [x] **mydealz** (`com.tippingcanoe.mydealz`) – Hide sponsored deals & pop-ups, disable tracking

No unlock/premium patches planned currently!
Feel free to suggest a patch.

## Installation

1. Add this repository URL as a patch source in **Morphe Manager**:
   ```text
   https://github.com/henr1klmb/henr1k-patches
