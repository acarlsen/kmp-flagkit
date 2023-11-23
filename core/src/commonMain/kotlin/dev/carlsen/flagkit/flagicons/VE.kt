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

val FlagIcons.VE: ImageVector
    get() {
        if (_ve != null) {
            return _ve!!
        }
        _ve = Builder(name = "Ve", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF063191), 1.0f to Color(0xFF03287C), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE2213B), 1.0f to Color(0xFFCD1931), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,6.0f), end = Offset(10.5f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.0f)
                curveTo(10.2239f, 7.0f, 10.0f, 6.7761f, 10.0f, 6.5f)
                curveTo(10.0f, 6.2239f, 10.2239f, 6.0f, 10.5f, 6.0f)
                curveTo(10.7761f, 6.0f, 11.0f, 6.2239f, 11.0f, 6.5f)
                curveTo(11.0f, 6.7761f, 10.7761f, 7.0f, 10.5f, 7.0f)
                close()
                moveTo(8.5f, 7.5f)
                curveTo(8.2239f, 7.5f, 8.0f, 7.2761f, 8.0f, 7.0f)
                curveTo(8.0f, 6.7239f, 8.2239f, 6.5f, 8.5f, 6.5f)
                curveTo(8.7761f, 6.5f, 9.0f, 6.7239f, 9.0f, 7.0f)
                curveTo(9.0f, 7.2761f, 8.7761f, 7.5f, 8.5f, 7.5f)
                close()
                moveTo(12.5f, 7.5f)
                curveTo(12.2239f, 7.5f, 12.0f, 7.2761f, 12.0f, 7.0f)
                curveTo(12.0f, 6.7239f, 12.2239f, 6.5f, 12.5f, 6.5f)
                curveTo(12.7761f, 6.5f, 13.0f, 6.7239f, 13.0f, 7.0f)
                curveTo(13.0f, 7.2761f, 12.7761f, 7.5f, 12.5f, 7.5f)
                close()
                moveTo(7.5f, 9.0f)
                curveTo(7.2239f, 9.0f, 7.0f, 8.7761f, 7.0f, 8.5f)
                curveTo(7.0f, 8.2239f, 7.2239f, 8.0f, 7.5f, 8.0f)
                curveTo(7.7761f, 8.0f, 8.0f, 8.2239f, 8.0f, 8.5f)
                curveTo(8.0f, 8.7761f, 7.7761f, 9.0f, 7.5f, 9.0f)
                close()
                moveTo(13.5f, 9.0f)
                curveTo(13.2239f, 9.0f, 13.0f, 8.7761f, 13.0f, 8.5f)
                curveTo(13.0f, 8.2239f, 13.2239f, 8.0f, 13.5f, 8.0f)
                curveTo(13.7761f, 8.0f, 14.0f, 8.2239f, 14.0f, 8.5f)
                curveTo(14.0f, 8.7761f, 13.7761f, 9.0f, 13.5f, 9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD044), 1.0f to Color(0xFFFFCB2F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
        }
        .build()
        return _ve!!
    }

private var _ve: ImageVector? = null
