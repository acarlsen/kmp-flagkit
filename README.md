# [kmp-flagkit](https://github.com/acarlsen/kmp-flagkit)
![GitHub Workflow Status (with event)](https://img.shields.io/github/actions/workflow/status/acarlsen/kmp-flagkit/build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/dev.carlsen.flagkit/flagkit)](https://central.sonatype.com/namespace/dev.carlsen.flagkit)
[![Kotlin version](https://img.shields.io/badge/Kotlin-1.9.20-blueviolet?logo=kotlin&logoColor=white)](http://kotlinlang.org)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![badge][badge-jvm]
![badge][badge-android]
![badge][badge-ios]
![badge][badge-mac]
![badge][badge-js]
![badge][badge-wasm]

Flag icons in ImageVector format to use in Kotlin Multiplatform.

With heavy inspiration from the [FlagKit](https://github.com/madebybowtie/FlagKit) and [flagkit-android](https://github.com/murgupluoglu/flagkit-android) libraries.

## Platform Support
- Android
- Desktop
- iOS
- MacOS Native
- Web (JSCanvas)
- WebAssembly (Wasm)

## To use in your project

Add the repository:
```kotlin
repositories {
    mavenCentral()
}
```

Put in your dependencies block:

```kotlin
implementation("dev.carlsen.flagkit:flagkit:1.1.0")
```

## How to use

Country flags can be referenced by the [Alpha-2 code](https://www.iban.com/country-codes) for each country.

There are also a few other flags available. 

| Country/state    |  Code   |
|------------------|:-------:|
| England          | GB-ENG  |
| Northern Ireland | GB-NIR  |
| Scotland         | GB-SCT  |
| Wales            | GB-WLS  |
| Shetland         | GB-ZET  |
| California       | US-CA   |


```kotlin
Icon(
    imageVector = FlagIcons.DK,
    contentDescription = "Denmark",
)
```


[badge-android]: http://img.shields.io/badge/android-6EDB8D.svg?style=flat

[badge-ios]: http://img.shields.io/badge/ios-CDCDCD.svg?style=flat

[badge-js]: http://img.shields.io/badge/js-F8DB5D.svg?style=flat

[badge-jvm]: http://img.shields.io/badge/jvm-DB413D.svg?style=flat

[badge-linux]: http://img.shields.io/badge/linux-2D3F6C.svg?style=flat

[badge-windows]: http://img.shields.io/badge/windows-4D76CD.svg?style=flat

[badge-mac]: http://img.shields.io/badge/macos-111111.svg?style=flat

[badge-watchos]: http://img.shields.io/badge/watchos-C0C0C0.svg?style=flat

[badge-tvos]: http://img.shields.io/badge/tvos-808080.svg?style=flat

[badge-wasm]: https://img.shields.io/badge/wasm-624FE8.svg?style=flat

[badge-nodejs]: https://img.shields.io/badge/nodejs-68a063.svg?style=flat
