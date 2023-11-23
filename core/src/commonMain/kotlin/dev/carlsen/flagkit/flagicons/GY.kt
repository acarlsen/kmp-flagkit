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

val FlagIcons.GY: ImageVector
    get() {
        if (_gy != null) {
            return _gy!!
        }
        _gy = Builder(name = "Gy", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF08C55F), 1.0f to Color(0xFF009F49), start =
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
                    Offset(10.0f,0.0f), end = Offset(10.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(-1.0f, 15.0f)
                lineToRelative(0.0f, -15.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(21.0f, 7.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-21.0f, 7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD831), 1.0f to Color(0xFFFDD117), start =
                    Offset(9.66885f,1.0541f), end = Offset(9.66885f,13.9459f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 1.0541f)
                lineToRelative(0.0f, 12.8918f)
                lineToRelative(19.3377f, -6.4459f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(5.25f,0.0f), end = Offset(5.25f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(-1.0f, 15.0f)
                lineToRelative(0.0f, -15.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(11.5f, 7.5f)
                lineToRelative(-11.5f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE92034), 1.0f to Color(0xFFCE1225), start =
                    Offset(4.8347f,1.1939001f), end = Offset(4.8347f,13.8061f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 13.8061f)
                lineToRelative(9.6694f, -6.3061f)
                lineToRelative(-9.6694f, -6.3061f)
                close()
            }
        }
        .build()
        return _gy!!
    }

private var _gy: ImageVector? = null
