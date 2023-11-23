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

val FlagIcons.SG: ImageVector
    get() {
        if (_sg != null) {
            return _sg!!
        }
        _sg = Builder(name = "Sg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE12237), 1.0f to Color(0xFFCE1126), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.0f,1.0f), end = Offset(6.0f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.8736f, 1.6569f)
                curveTo(6.6017f, 1.5555f, 6.3073f, 1.5f, 6.0f, 1.5f)
                curveTo(4.6193f, 1.5f, 3.5f, 2.6193f, 3.5f, 4.0f)
                curveTo(3.5f, 5.3807f, 4.6193f, 6.5f, 6.0f, 6.5f)
                curveTo(6.3073f, 6.5f, 6.6017f, 6.4445f, 6.8736f, 6.3431f)
                curveTo(6.3602f, 6.7542f, 5.7088f, 7.0f, 5.0f, 7.0f)
                curveTo(3.3431f, 7.0f, 2.0f, 5.6569f, 2.0f, 4.0f)
                curveTo(2.0f, 2.3431f, 3.3431f, 1.0f, 5.0f, 1.0f)
                curveTo(5.7088f, 1.0f, 6.3602f, 1.2458f, 6.8736f, 1.6569f)
                lineTo(6.8736f, 1.6569f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(5.2239f, 4.0f, 5.0f, 3.7761f, 5.0f, 3.5f)
                curveTo(5.0f, 3.2239f, 5.2239f, 3.0f, 5.5f, 3.0f)
                curveTo(5.7761f, 3.0f, 6.0f, 3.2239f, 6.0f, 3.5f)
                curveTo(6.0f, 3.7761f, 5.7761f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(6.5f, 6.0f)
                curveTo(6.2239f, 6.0f, 6.0f, 5.7761f, 6.0f, 5.5f)
                curveTo(6.0f, 5.2239f, 6.2239f, 5.0f, 6.5f, 5.0f)
                curveTo(6.7761f, 5.0f, 7.0f, 5.2239f, 7.0f, 5.5f)
                curveTo(7.0f, 5.7761f, 6.7761f, 6.0f, 6.5f, 6.0f)
                close()
                moveTo(8.5f, 6.0f)
                curveTo(8.2239f, 6.0f, 8.0f, 5.7761f, 8.0f, 5.5f)
                curveTo(8.0f, 5.2239f, 8.2239f, 5.0f, 8.5f, 5.0f)
                curveTo(8.7761f, 5.0f, 9.0f, 5.2239f, 9.0f, 5.5f)
                curveTo(9.0f, 5.7761f, 8.7761f, 6.0f, 8.5f, 6.0f)
                close()
                moveTo(9.5f, 4.0f)
                curveTo(9.2239f, 4.0f, 9.0f, 3.7761f, 9.0f, 3.5f)
                curveTo(9.0f, 3.2239f, 9.2239f, 3.0f, 9.5f, 3.0f)
                curveTo(9.7761f, 3.0f, 10.0f, 3.2239f, 10.0f, 3.5f)
                curveTo(10.0f, 3.7761f, 9.7761f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(7.5f, 2.5f)
                curveTo(7.2239f, 2.5f, 7.0f, 2.2761f, 7.0f, 2.0f)
                curveTo(7.0f, 1.7239f, 7.2239f, 1.5f, 7.5f, 1.5f)
                curveTo(7.7761f, 1.5f, 8.0f, 1.7239f, 8.0f, 2.0f)
                curveTo(8.0f, 2.2761f, 7.7761f, 2.5f, 7.5f, 2.5f)
                close()
            }
        }
        .build()
        return _sg!!
    }

private var _sg: ImageVector? = null
