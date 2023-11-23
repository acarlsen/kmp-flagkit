import androidx.compose.ui.window.Window
import dev.carlsen.flagkit.sample.Application
import platform.AppKit.NSApp
import platform.AppKit.NSApplication

fun main() {
    NSApplication.sharedApplication()
    Window("kmp-flagkit") {
        Application()
    }
    NSApp?.run()
}

