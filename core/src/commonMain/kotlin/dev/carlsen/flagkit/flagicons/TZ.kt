package dev.carlsen.flagkit.flagicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.TZ: ImageVector
    get() {
        if (_tz != null) {
            return _tz!!
        }
        _tz = Builder(name = "Tz", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
                21.0f, viewportHeight = 15.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF33CC4D), 1.0f to Color(0xFF2AB441), start =
                    Offset(10.501499f,0.0038995743f), end = Offset(10.501499f,10.0039f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 10.0039f)
                lineToRelative(21.0f, -10.0f)
                lineToRelative(-21.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2DAFE4), 1.0f to Color(0xFF1BA4DC), start =
                    Offset(10.501499f,5.0038996f), end = Offset(10.501499f,15.0039f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 15.0039f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD84F), 1.0f to Color(0xFFFCD036), start =
                    Offset(10.501598f,-1.9959998f), end = Offset(10.501598f,17.004f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.3133f, 17.004f)
                lineToRelative(20.3163f, -12.695f)
                lineToRelative(-3.9398f, -6.305f)
                lineToRelative(-20.3162f, 12.695f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5015f,-2.3000002f), end = Offset(10.5015f,17.3079f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.4704f, 17.3079f)
                lineToRelative(24.5934f, -15.3677f)
                lineToRelative(-2.6496f, -4.2402f)
                lineToRelative(-24.5934f, 15.3677f)
                close()
            }
        }
        .build()
        return _tz!!
    }

private var _tz: ImageVector? = null
