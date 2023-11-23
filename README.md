# [kmp-flagkit](https://github.com/acarlsen/kmp-flagkit)
Flag icons in ImageVector format to use in Kotlin Multiplatform.

With heavy inspiration from the [flagkit-android](https://github.com/murgupluoglu/flagkit-android) library.

## Platform Support
- Android
- Desktop
- iOS
- MacOS Native
- Web (JSCanvas)

## To use in your project

Add the repository:
```kotlin
repositories {
    mavenCentral()
}
```

Put in your dependencies block:

```kotlin
implementation("dev.carlsen.flagkit:flagkit:1.0")
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
