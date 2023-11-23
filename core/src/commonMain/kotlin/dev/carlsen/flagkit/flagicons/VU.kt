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

val FlagIcons.VU: ImageVector
    get() {
        if (_vu != null) {
            return _vu!!
        }
        _vu = Builder(name = "Vu", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF27AB53), 1.0f to Color(0xFF219447), start =
                    Offset(10.700001f,9.0f), end = Offset(10.700001f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.2f, 9.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEC2547), 1.0f to Color(0xFFCE1A39), start =
                    Offset(10.700001f,0.0f), end = Offset(10.700001f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.2f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.700001f,0.0f), end = Offset(10.700001f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.2f, 6.0f)
                lineTo(21.2f, 6.0f)
                lineTo(21.2f, 9.0f)
                lineTo(8.2f, 9.0f)
                lineTo(0.2f, 15.0f)
                lineTo(0.2f, 0.0f)
                lineTo(8.2f, 6.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD449), 1.0f to Color(0xFFFDCD34), start =
                    Offset(10.1f,0.8f), end = Offset(10.1f,14.2f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8667f, 7.5f)
                lineTo(-0.6f, 1.9f)
                lineTo(-1.0f, 1.6f)
                lineTo(-0.4f, 0.8f)
                lineTo(0.0f, 1.1f)
                lineTo(7.8667f, 7.0f)
                lineTo(20.7f, 7.0f)
                lineTo(21.2f, 7.0f)
                lineTo(21.2f, 8.0f)
                lineTo(20.7f, 8.0f)
                lineTo(7.7f, 8.0f)
                lineTo(8.0f, 7.9f)
                lineTo(0.0f, 13.9f)
                lineTo(-0.4f, 14.2f)
                lineTo(-1.0f, 13.4f)
                lineTo(-0.6f, 13.1f)
                lineTo(6.8667f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD449), 1.0f to Color(0xFFFDCD34), start =
                    Offset(2.6999998f,6.0f), end = Offset(2.6999998f,10.0191f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.7f, 9.0f)
                curveTo(1.8716f, 9.0f, 1.2f, 8.3284f, 1.2f, 7.5f)
                curveTo(1.2f, 6.6716f, 1.8716f, 6.0f, 2.7f, 6.0f)
                curveTo(3.5284f, 6.0f, 4.2f, 6.6716f, 4.2f, 7.5f)
                curveTo(4.2f, 8.2272f, 3.3868f, 9.8627f, 2.7f, 10.0f)
                curveTo(2.6044f, 10.0191f, 2.8012f, 9.0f, 2.7f, 9.0f)
                close()
                moveTo(2.7f, 8.25f)
                curveTo(2.9761f, 8.5f, 3.2f, 7.7761f, 3.2f, 7.5f)
                curveTo(3.2f, 7.2239f, 2.9761f, 7.0f, 2.7f, 7.0f)
                curveTo(2.4239f, 7.0f, 2.2f, 7.2239f, 2.2f, 7.5f)
                curveTo(2.2f, 7.7761f, 2.4239f, 8.5f, 2.7f, 8.25f)
                close()
            }
        }
        .build()
        return _vu!!
    }

private var _vu: ImageVector? = null
