package dev.carlsen.flagkit.flagicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.MP: ImageVector
    get() {
        if (_mp != null) {
            return _mp!!
        }
        _mp = Builder(name = "Mp", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1E8BD6), 1.0f to Color(0xFF1074BA), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,2.5f), end = Offset(10.5f,12.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 12.5f)
                curveTo(13.2614f, 12.5f, 15.5f, 10.2614f, 15.5f, 7.5f)
                curveTo(15.5f, 4.7386f, 13.2614f, 2.5f, 10.5f, 2.5f)
                curveTo(7.7386f, 2.5f, 5.5f, 4.7386f, 5.5f, 7.5f)
                curveTo(5.5f, 10.2614f, 7.7386f, 12.5f, 10.5f, 12.5f)
                lineTo(10.5f, 12.5f)
                close()
                moveTo(10.5f, 11.5f)
                curveTo(8.2909f, 11.5f, 6.5f, 9.7091f, 6.5f, 7.5f)
                curveTo(6.5f, 5.2909f, 8.2909f, 3.5f, 10.5f, 3.5f)
                curveTo(12.7091f, 3.5f, 14.5f, 5.2909f, 14.5f, 7.5f)
                curveTo(14.5f, 9.7091f, 12.7091f, 11.5f, 10.5f, 11.5f)
                lineTo(10.5f, 11.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFA9A7A9), 1.0f to Color(0xFF8C8A8C), start =
                    Offset(10.5002f,5.0f), end = Offset(10.5002f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.9377f, 5.997f)
                curveTo(8.9721f, 5.4464f, 9.4427f, 5.0f, 9.999f, 5.0f)
                lineTo(11.001f, 5.0f)
                curveTo(11.5528f, 5.0f, 12.0283f, 5.453f, 12.0623f, 5.997f)
                lineTo(12.4377f, 12.003f)
                curveTo(12.4721f, 12.5536f, 12.0566f, 13.0f, 11.4906f, 13.0f)
                lineTo(9.5094f, 13.0f)
                curveTo(8.9519f, 13.0f, 8.5283f, 12.547f, 8.5623f, 12.003f)
                lineTo(8.9377f, 5.997f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5001f,4.6500006f), end = Offset(10.5001f,10.9816f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 9.515f)
                lineToRelative(-2.0572f, 1.4666f)
                lineToRelative(0.7591f, -2.4098f)
                lineToRelative(-2.0305f, -1.5034f)
                lineToRelative(2.5264f, -0.0227f)
                lineToRelative(0.8023f, -2.3957f)
                lineToRelative(0.8023f, 2.3957f)
                lineToRelative(2.5264f, 0.0227f)
                lineToRelative(-2.0305f, 1.5034f)
                lineToRelative(0.7591f, 2.4098f)
                close()
            }
        }
        .build()
        return _mp!!
    }

private var _mp: ImageVector? = null
