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

val FlagIcons.KH: ImageVector
    get() {
        if (_kh != null) {
            return _kh!!
        }
        _kh = Builder(name = "Kh", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0F3EB6), 1.0f to Color(0xFF09339F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0F3EB6), 1.0f to Color(0xFF09339F), start =
                    Offset(10.5f,11.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED1A3C), 1.0f to Color(0xFFDE0B2D), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.5f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.5f, 8.0f)
                lineTo(8.5f, 8.0f)
                lineTo(8.5f, 10.0f)
                lineTo(6.5f, 10.0f)
                lineTo(7.5f, 8.0f)
                close()
                moveTo(9.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(12.5f, 8.0f)
                lineTo(13.5f, 8.0f)
                lineTo(14.5f, 10.0f)
                lineTo(12.5f, 10.0f)
                lineTo(12.5f, 8.0f)
                close()
                moveTo(12.5f, 6.5078f)
                curveTo(12.5f, 6.2274f, 12.7319f, 6.0f, 13.0f, 6.0f)
                curveTo(13.2761f, 6.0f, 13.5f, 6.2213f, 13.5f, 6.5078f)
                lineTo(13.5f, 7.5f)
                lineTo(12.5f, 7.5f)
                lineTo(12.5f, 6.5078f)
                close()
                moveTo(9.0f, 6.5454f)
                lineTo(10.0f, 6.5454f)
                lineTo(10.0f, 5.9982f)
                curveTo(10.0f, 5.7231f, 10.2319f, 5.5f, 10.5f, 5.5f)
                curveTo(10.7761f, 5.5f, 11.0f, 5.7217f, 11.0f, 5.9982f)
                lineTo(11.0f, 6.5454f)
                lineTo(12.0f, 6.5454f)
                lineTo(12.0f, 7.5f)
                lineTo(9.0f, 7.5f)
                lineTo(9.0f, 6.5454f)
                close()
                moveTo(7.5f, 6.5078f)
                curveTo(7.5f, 6.2274f, 7.7319f, 6.0f, 8.0f, 6.0f)
                curveTo(8.2761f, 6.0f, 8.5f, 6.2213f, 8.5f, 6.5078f)
                lineTo(8.5f, 7.5f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 6.5078f)
                close()
            }
        }
        .build()
        return _kh!!
    }

private var _kh: ImageVector? = null
