# Payeer UI

Payeer UI is a small Android Jetpack Compose sample that recreates a Payeer-style wallet home screen. It focuses on building a dark crypto wallet dashboard with a top app bar, action icons, and a vertical list of wallet balances.

The project is UI-only. It uses static sample wallet data and local drawable assets for cryptocurrency icons.

## Features

- Payeer-inspired wallet home screen
- Jetpack Compose implementation
- Dark dashboard layout
- Material `TopAppBar` with notification, account, and settings actions
- Reusable `WalletItem` composable for wallet rows
- Circular crypto icons loaded from drawable resources
- Static sample balances and USD values
- Compose preview scaffold included in the source

## Tech Stack

- Kotlin
- Android Jetpack Compose
- Compose Material
- AndroidX Activity Compose
- Gradle / Android Gradle Plugin
- JUnit and AndroidX test dependencies

## Project Structure

```text
.
+-- README.md
+-- Payeer/
|   +-- build.gradle
|   +-- settings.gradle
|   +-- gradle.properties
|   +-- app/
|       +-- build.gradle
|       +-- src/main/
|           +-- AndroidManifest.xml
|           +-- java/com/alirahimi/payeersample/
|           |   +-- MainActivity.kt
|           |   +-- ui/theme/
|           |       +-- Color.kt
|           |       +-- Shape.kt
|           |       +-- Theme.kt
|           |       +-- Type.kt
|           +-- res/drawable/
|               +-- bitcoin.png
|               +-- ethereum.png
|               +-- bitcoincash.png
|               +-- litecoin.png
|               +-- dash.png
|               +-- tether.png
|               +-- ripple.png
|               +-- dogecoin.png
|               +-- tron.png
```

## Main Screen

`MainActivity.kt` contains the complete screen implementation. The activity calls `setContent` and renders a Compose `Scaffold` with a dark background.

The screen includes:

- Title: `Payeer Account`
- Top bar action icons for notifications, account, and settings
- A wallet list for Bitcoin, Ethereum, Bitcoin Cash, Litecoin, Dash, Tether, Ripple, Dogecoin, and Tron
- Each row showing currency name, abbreviation, icon, amount, and USD value

## Main Composables

| Composable | Purpose |
| --- | --- |
| `WalletItem` | Renders one wallet row with icon, name, symbol, balance, and USD value. |
| `CircleImageView` | Displays a drawable as a clipped circular image. |
| `DefaultPreview` | Basic Compose preview entry point. |
| `PayeerSampleTheme` | Provides Material colors, typography, and shapes. |

## Sample Wallet Data

The wallet rows are currently hard-coded in `MainActivity.kt`:

| Currency | Symbol |
| --- | --- |
| Bitcoin | BTC |
| Ethereum | ETH |
| Bitcoin Cash | BCH |
| Litecoin | LTC |
| Dash | DASH |
| Tether | USDT |
| Ripple | XRP |
| Dogecoin | DOGE |
| Tron | TRX |

## Requirements

- Android Studio
- JDK 8 or newer
- Android SDK with compile SDK 32
- Android device or emulator running Android 5.0+ because `minSdk` is 21

Project configuration:

| Setting | Value |
| --- | --- |
| Application ID | `com.alirahimi.payeersample` |
| Min SDK | 21 |
| Target SDK | 32 |
| Compile SDK | 32 |
| Version | 1.0 |
| Android Gradle Plugin | 7.1.3 |
| Kotlin Plugin | 1.5.21 |
| Compose Version | 1.0.1 |

## How to Run

Open the `Payeer` folder in Android Studio, let Gradle sync, then run the `app` configuration on an emulator or Android device.

From the terminal, run commands from inside the Android project folder:

```bash
cd Payeer
./gradlew assembleDebug
```

Install on a connected device:

```bash
./gradlew installDebug
```

## Notes

- This repository contains a UI sample, not a connected wallet or payment application.
- The wallet values are static demo data.
- Top bar action buttons currently have empty click handlers.
- The root repository contains the Android project inside the `Payeer/` directory.
- Cryptocurrency images are stored locally in `app/src/main/res/drawable`.

## Possible Improvements

- Move wallet data into a model list instead of repeating `WalletItem` calls
- Add navigation or behavior for the top bar actions
- Add a real account summary section
- Add state management with ViewModel
- Add previews for `WalletItem` and the full dashboard
- Add screenshot assets to the README
- Update Compose and Android Gradle Plugin versions
