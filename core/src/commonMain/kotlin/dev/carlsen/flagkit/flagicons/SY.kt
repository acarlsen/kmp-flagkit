package dev.carlsen.flagkit.flagicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.SY: ImageVector
    get() {
        if (_sy != null) {
            return _sy!!
        }
        _sy = ImageVector.Builder(
            name = "Sy",
            defaultWidth = 840.dp,
            defaultHeight = 600.dp,
            viewportWidth = 840f,
            viewportHeight = 600f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(840f)
                verticalLineToRelative(600f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(840f)
                verticalLineToRelative(400f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF007A3D))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(840f)
                verticalLineToRelative(200f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCE1126))) {
                moveToRelative(176.26f, 375f)
                lineToRelative(48.74f, -150f)
                lineToRelative(48.74f, 150f)
                lineToRelative(-127.6f, -92.71f)
                horizontalLineToRelative(157.72f)
                moveToRelative(322.4f, 92.71f)
                lineToRelative(48.74f, -150f)
                lineToRelative(48.74f, 150f)
                lineToRelative(-127.6f, -92.71f)
                horizontalLineToRelative(157.72f)
                moveToRelative(-352.6f, 92.71f)
                lineToRelative(48.74f, -150f)
                lineToRelative(48.74f, 150f)
                lineToRelative(-127.6f, -92.71f)
                horizontalLineToRelative(157.72f)
            }
        }.build()

        return _sy!!
    }

private var _sy: ImageVector? = null
