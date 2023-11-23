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

val FlagIcons.PT: ImageVector
    get() {
        if (_pt != null) {
            return _pt!!
        }
        _pt = Builder(name = "Pt", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF2936), 1.0f to Color(0xFFFD0D1B), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF128415), 1.0f to Color(0xFF0A650C), start =
                    Offset(4.0f,0.0f), end = Offset(4.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFAF94F), 1.0f to Color(0xFFF8F736), start =
                    Offset(8.0f,4.5f), end = Offset(8.0f,10.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                curveTo(9.1046f, 9.5f, 10.0f, 8.6046f, 10.0f, 7.5f)
                curveTo(10.0f, 6.3954f, 9.1046f, 5.5f, 8.0f, 5.5f)
                curveTo(6.8954f, 5.5f, 6.0f, 6.3954f, 6.0f, 7.5f)
                curveTo(6.0f, 8.6046f, 6.8954f, 9.5f, 8.0f, 9.5f)
                close()
                moveTo(8.0f, 10.5f)
                curveTo(6.3431f, 10.5f, 5.0f, 9.1569f, 5.0f, 7.5f)
                curveTo(5.0f, 5.8431f, 6.3431f, 4.5f, 8.0f, 4.5f)
                curveTo(9.6569f, 4.5f, 11.0f, 5.8431f, 11.0f, 7.5f)
                curveTo(11.0f, 9.1569f, 9.6569f, 10.5f, 8.0f, 10.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(8.0f,6.0f), end = Offset(8.0f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 6.2558f)
                curveTo(7.0f, 6.1145f, 7.1075f, 6.0f, 7.2452f, 6.0f)
                lineTo(8.7548f, 6.0f)
                curveTo(8.8902f, 6.0f, 9.0f, 6.1139f, 9.0f, 6.2558f)
                lineTo(9.0f, 8.001f)
                curveTo(9.0f, 8.5528f, 8.5561f, 9.0f, 8.0f, 9.0f)
                curveTo(7.4477f, 9.0f, 7.0f, 8.5573f, 7.0f, 8.001f)
                lineTo(7.0f, 6.2558f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1D50B5), 1.0f to Color(0xFF15439D), start =
                    Offset(8.0f,6.5f), end = Offset(8.0f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 8.0f)
                curveTo(8.2761f, 8.0f, 8.5f, 7.2761f, 8.5f, 7.0f)
                curveTo(8.5f, 6.7239f, 8.2761f, 6.5f, 8.0f, 6.5f)
                curveTo(7.7239f, 6.5f, 7.5f, 6.7239f, 7.5f, 7.0f)
                curveTo(7.5f, 7.2761f, 7.7239f, 8.0f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _pt!!
    }

private var _pt: ImageVector? = null
