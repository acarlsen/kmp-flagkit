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

val FlagIcons.EC: ImageVector
    get() {
        if (_ec != null) {
            return _ec!!
        }
        _ec = Builder(name = "Ec", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0748AE), 1.0f to Color(0xFF003993), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDE2035), 1.0f to Color(0xFFCE1126), start =
                    Offset(10.5f,11.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD935), 1.0f to Color(0xFFFDD216), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFBDC44), 1.0f to Color(0xFFFFDC32), start =
                    Offset(10.5f,6.0f), end = Offset(10.5f,9.6001f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.3f, 6.0f)
                curveTo(8.8142f, 6.3649f, 8.5f, 6.9458f, 8.5f, 7.6001f)
                curveTo(8.5f, 8.7047f, 9.3954f, 9.6001f, 10.5f, 9.6001f)
                curveTo(11.6046f, 9.6001f, 12.5f, 8.7047f, 12.5f, 7.6001f)
                curveTo(12.5f, 6.9458f, 12.1858f, 6.3649f, 11.7f, 6.0f)
                lineTo(11.0f, 8.1001f)
                lineTo(10.0f, 8.1001f)
                lineTo(9.3f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5FC0DC)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 5.5f)
                lineToRelative(0.5f, 2.5f)
                lineToRelative(-1.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3F2821)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.66f, strokeAlpha = 0.66f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6768f, 3.8232f)
                curveTo(9.6098f, 3.7563f, 9.5108f, 3.7329f, 9.4209f, 3.7628f)
                lineTo(7.9209f, 4.2628f)
                curveTo(7.79f, 4.3065f, 7.7192f, 4.4481f, 7.7628f, 4.5791f)
                curveTo(7.8065f, 4.71f, 7.9481f, 4.7808f, 8.0791f, 4.7372f)
                lineTo(9.4325f, 4.286f)
                lineTo(10.3232f, 5.1768f)
                curveTo(10.4209f, 5.2744f, 10.5791f, 5.2744f, 10.6768f, 5.1768f)
                lineTo(11.5675f, 4.286f)
                lineTo(12.9209f, 4.7372f)
                curveTo(13.0519f, 4.7808f, 13.1935f, 4.71f, 13.2372f, 4.5791f)
                curveTo(13.2808f, 4.4481f, 13.21f, 4.3065f, 13.0791f, 4.2628f)
                lineTo(11.5791f, 3.7628f)
                curveTo(11.4892f, 3.7329f, 11.3902f, 3.7563f, 11.3232f, 3.8232f)
                lineTo(10.5f, 4.6464f)
                lineTo(9.6768f, 3.8232f)
                close()
            }
        }
        .build()
        return _ec!!
    }

private var _ec: ImageVector? = null
