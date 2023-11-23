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

val FlagIcons.GI: ImageVector
    get() {
        if (_gi != null) {
            return _gi!!
        }
        _gi = Builder(name = "Gi", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE71924), 1.0f to Color(0xFFD6101B), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEA1824), 1.0f to Color(0xFFD6101B), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 4.4905f)
                curveTo(8.0f, 4.2151f, 7.774f, 4.0f, 7.4953f, 4.0f)
                lineTo(6.5047f, 4.0f)
                curveTo(6.214f, 4.0f, 6.0f, 4.2196f, 6.0f, 4.4905f)
                lineTo(6.0f, 6.7548f)
                lineTo(6.0f, 8.0f)
                lineTo(5.0f, 9.0f)
                lineTo(16.0f, 9.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 6.7548f)
                lineTo(15.0f, 4.4905f)
                curveTo(15.0f, 4.2151f, 14.774f, 4.0f, 14.4953f, 4.0f)
                lineTo(13.5047f, 4.0f)
                curveTo(13.214f, 4.0f, 13.0f, 4.2196f, 13.0f, 4.4905f)
                lineTo(13.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 3.4905f)
                curveTo(12.0f, 3.2151f, 11.7782f, 3.0f, 11.5046f, 3.0f)
                lineTo(9.4954f, 3.0f)
                curveTo(9.2158f, 3.0f, 9.0f, 3.2196f, 9.0f, 3.4905f)
                lineTo(9.0f, 6.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 8.0f)
                curveTo(6.7239f, 8.0f, 6.5f, 7.7761f, 6.5f, 7.5f)
                curveTo(6.5f, 7.2239f, 6.7239f, 7.0f, 7.0f, 7.0f)
                curveTo(7.2761f, 7.0f, 7.5f, 7.2239f, 7.5f, 7.5f)
                curveTo(7.5f, 7.7761f, 7.2761f, 8.0f, 7.0f, 8.0f)
                close()
                moveTo(7.0f, 6.0f)
                curveTo(6.7239f, 6.0f, 6.5f, 5.7761f, 6.5f, 5.5f)
                curveTo(6.5f, 5.2239f, 6.7239f, 5.0f, 7.0f, 5.0f)
                curveTo(7.2761f, 5.0f, 7.5f, 5.2239f, 7.5f, 5.5f)
                curveTo(7.5f, 5.7761f, 7.2761f, 6.0f, 7.0f, 6.0f)
                close()
                moveTo(10.5f, 8.0f)
                curveTo(10.2239f, 8.0f, 10.0f, 7.7761f, 10.0f, 7.5f)
                curveTo(10.0f, 7.2239f, 10.2239f, 7.0f, 10.5f, 7.0f)
                curveTo(10.7761f, 7.0f, 11.0f, 7.2239f, 11.0f, 7.5f)
                curveTo(11.0f, 7.7761f, 10.7761f, 8.0f, 10.5f, 8.0f)
                close()
                moveTo(10.5f, 5.0f)
                curveTo(10.2239f, 5.0f, 10.0f, 4.7761f, 10.0f, 4.5f)
                curveTo(10.0f, 4.2239f, 10.2239f, 4.0f, 10.5f, 4.0f)
                curveTo(10.7761f, 4.0f, 11.0f, 4.2239f, 11.0f, 4.5f)
                curveTo(11.0f, 4.7761f, 10.7761f, 5.0f, 10.5f, 5.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveTo(13.7239f, 8.0f, 13.5f, 7.7761f, 13.5f, 7.5f)
                curveTo(13.5f, 7.2239f, 13.7239f, 7.0f, 14.0f, 7.0f)
                curveTo(14.2761f, 7.0f, 14.5f, 7.2239f, 14.5f, 7.5f)
                curveTo(14.5f, 7.7761f, 14.2761f, 8.0f, 14.0f, 8.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveTo(13.7239f, 6.0f, 13.5f, 5.7761f, 13.5f, 5.5f)
                curveTo(13.5f, 5.2239f, 13.7239f, 5.0f, 14.0f, 5.0f)
                curveTo(14.2761f, 5.0f, 14.5f, 5.2239f, 14.5f, 5.5f)
                curveTo(14.5f, 5.7761f, 14.2761f, 6.0f, 14.0f, 6.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFECCE3E), 1.0f to Color(0xFFD9BC2D), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 9.9431f)
                lineTo(10.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 9.9431f)
                curveTo(11.5826f, 9.8058f, 12.0f, 9.4354f, 12.0f, 9.0f)
                curveTo(12.0f, 8.4477f, 11.3284f, 8.0f, 10.5f, 8.0f)
                curveTo(9.6716f, 8.0f, 9.0f, 8.4477f, 9.0f, 9.0f)
                curveTo(9.0f, 9.4354f, 9.4174f, 9.8058f, 10.0f, 9.9431f)
                close()
            }
        }
        .build()
        return _gi!!
    }

private var _gi: ImageVector? = null
