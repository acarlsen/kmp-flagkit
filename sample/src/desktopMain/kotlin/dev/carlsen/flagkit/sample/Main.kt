package dev.carlsen.flagkit.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

public fun main() {
    application {
        Window(onCloseRequest = ::exitApplication) {
            Application()
        }
    }
}
