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

val FlagIcons.UM: ImageVector
    get() {
        if (_um != null) {
            return _um!!
        }
        _um = Builder(name = "Um", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFD02F44), 1.0f to Color(0xFFB12537), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(0.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                lineTo(21.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(0.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                lineTo(21.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 4.0f)
                close()
                moveTo(0.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 6.0f)
                close()
                moveTo(0.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(0.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(0.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 14.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF46467F), 1.0f to Color(0xFF3C3C6D), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.5f,1.0f), end = Offset(4.5f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.5f, 2.0f)
                curveTo(1.2239f, 2.0f, 1.0f, 1.7761f, 1.0f, 1.5f)
                curveTo(1.0f, 1.2239f, 1.2239f, 1.0f, 1.5f, 1.0f)
                curveTo(1.7761f, 1.0f, 2.0f, 1.2239f, 2.0f, 1.5f)
                curveTo(2.0f, 1.7761f, 1.7761f, 2.0f, 1.5f, 2.0f)
                close()
                moveTo(3.5f, 2.0f)
                curveTo(3.2239f, 2.0f, 3.0f, 1.7761f, 3.0f, 1.5f)
                curveTo(3.0f, 1.2239f, 3.2239f, 1.0f, 3.5f, 1.0f)
                curveTo(3.7761f, 1.0f, 4.0f, 1.2239f, 4.0f, 1.5f)
                curveTo(4.0f, 1.7761f, 3.7761f, 2.0f, 3.5f, 2.0f)
                close()
                moveTo(5.5f, 2.0f)
                curveTo(5.2239f, 2.0f, 5.0f, 1.7761f, 5.0f, 1.5f)
                curveTo(5.0f, 1.2239f, 5.2239f, 1.0f, 5.5f, 1.0f)
                curveTo(5.7761f, 1.0f, 6.0f, 1.2239f, 6.0f, 1.5f)
                curveTo(6.0f, 1.7761f, 5.7761f, 2.0f, 5.5f, 2.0f)
                close()
                moveTo(7.5f, 2.0f)
                curveTo(7.2239f, 2.0f, 7.0f, 1.7761f, 7.0f, 1.5f)
                curveTo(7.0f, 1.2239f, 7.2239f, 1.0f, 7.5f, 1.0f)
                curveTo(7.7761f, 1.0f, 8.0f, 1.2239f, 8.0f, 1.5f)
                curveTo(8.0f, 1.7761f, 7.7761f, 2.0f, 7.5f, 2.0f)
                close()
                moveTo(2.5f, 3.0f)
                curveTo(2.2239f, 3.0f, 2.0f, 2.7761f, 2.0f, 2.5f)
                curveTo(2.0f, 2.2239f, 2.2239f, 2.0f, 2.5f, 2.0f)
                curveTo(2.7761f, 2.0f, 3.0f, 2.2239f, 3.0f, 2.5f)
                curveTo(3.0f, 2.7761f, 2.7761f, 3.0f, 2.5f, 3.0f)
                close()
                moveTo(4.5f, 3.0f)
                curveTo(4.2239f, 3.0f, 4.0f, 2.7761f, 4.0f, 2.5f)
                curveTo(4.0f, 2.2239f, 4.2239f, 2.0f, 4.5f, 2.0f)
                curveTo(4.7761f, 2.0f, 5.0f, 2.2239f, 5.0f, 2.5f)
                curveTo(5.0f, 2.7761f, 4.7761f, 3.0f, 4.5f, 3.0f)
                close()
                moveTo(6.5f, 3.0f)
                curveTo(6.2239f, 3.0f, 6.0f, 2.7761f, 6.0f, 2.5f)
                curveTo(6.0f, 2.2239f, 6.2239f, 2.0f, 6.5f, 2.0f)
                curveTo(6.7761f, 2.0f, 7.0f, 2.2239f, 7.0f, 2.5f)
                curveTo(7.0f, 2.7761f, 6.7761f, 3.0f, 6.5f, 3.0f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(7.2239f, 4.0f, 7.0f, 3.7761f, 7.0f, 3.5f)
                curveTo(7.0f, 3.2239f, 7.2239f, 3.0f, 7.5f, 3.0f)
                curveTo(7.7761f, 3.0f, 8.0f, 3.2239f, 8.0f, 3.5f)
                curveTo(8.0f, 3.7761f, 7.7761f, 4.0f, 7.5f, 4.0f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(5.2239f, 4.0f, 5.0f, 3.7761f, 5.0f, 3.5f)
                curveTo(5.0f, 3.2239f, 5.2239f, 3.0f, 5.5f, 3.0f)
                curveTo(5.7761f, 3.0f, 6.0f, 3.2239f, 6.0f, 3.5f)
                curveTo(6.0f, 3.7761f, 5.7761f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(3.5f, 4.0f)
                curveTo(3.2239f, 4.0f, 3.0f, 3.7761f, 3.0f, 3.5f)
                curveTo(3.0f, 3.2239f, 3.2239f, 3.0f, 3.5f, 3.0f)
                curveTo(3.7761f, 3.0f, 4.0f, 3.2239f, 4.0f, 3.5f)
                curveTo(4.0f, 3.7761f, 3.7761f, 4.0f, 3.5f, 4.0f)
                close()
                moveTo(1.5f, 4.0f)
                curveTo(1.2239f, 4.0f, 1.0f, 3.7761f, 1.0f, 3.5f)
                curveTo(1.0f, 3.2239f, 1.2239f, 3.0f, 1.5f, 3.0f)
                curveTo(1.7761f, 3.0f, 2.0f, 3.2239f, 2.0f, 3.5f)
                curveTo(2.0f, 3.7761f, 1.7761f, 4.0f, 1.5f, 4.0f)
                close()
                moveTo(2.5f, 5.0f)
                curveTo(2.2239f, 5.0f, 2.0f, 4.7761f, 2.0f, 4.5f)
                curveTo(2.0f, 4.2239f, 2.2239f, 4.0f, 2.5f, 4.0f)
                curveTo(2.7761f, 4.0f, 3.0f, 4.2239f, 3.0f, 4.5f)
                curveTo(3.0f, 4.7761f, 2.7761f, 5.0f, 2.5f, 5.0f)
                close()
                moveTo(4.5f, 5.0f)
                curveTo(4.2239f, 5.0f, 4.0f, 4.7761f, 4.0f, 4.5f)
                curveTo(4.0f, 4.2239f, 4.2239f, 4.0f, 4.5f, 4.0f)
                curveTo(4.7761f, 4.0f, 5.0f, 4.2239f, 5.0f, 4.5f)
                curveTo(5.0f, 4.7761f, 4.7761f, 5.0f, 4.5f, 5.0f)
                close()
                moveTo(6.5f, 5.0f)
                curveTo(6.2239f, 5.0f, 6.0f, 4.7761f, 6.0f, 4.5f)
                curveTo(6.0f, 4.2239f, 6.2239f, 4.0f, 6.5f, 4.0f)
                curveTo(6.7761f, 4.0f, 7.0f, 4.2239f, 7.0f, 4.5f)
                curveTo(7.0f, 4.7761f, 6.7761f, 5.0f, 6.5f, 5.0f)
                close()
                moveTo(7.5f, 6.0f)
                curveTo(7.2239f, 6.0f, 7.0f, 5.7761f, 7.0f, 5.5f)
                curveTo(7.0f, 5.2239f, 7.2239f, 5.0f, 7.5f, 5.0f)
                curveTo(7.7761f, 5.0f, 8.0f, 5.2239f, 8.0f, 5.5f)
                curveTo(8.0f, 5.7761f, 7.7761f, 6.0f, 7.5f, 6.0f)
                close()
                moveTo(5.5f, 6.0f)
                curveTo(5.2239f, 6.0f, 5.0f, 5.7761f, 5.0f, 5.5f)
                curveTo(5.0f, 5.2239f, 5.2239f, 5.0f, 5.5f, 5.0f)
                curveTo(5.7761f, 5.0f, 6.0f, 5.2239f, 6.0f, 5.5f)
                curveTo(6.0f, 5.7761f, 5.7761f, 6.0f, 5.5f, 6.0f)
                close()
                moveTo(3.5f, 6.0f)
                curveTo(3.2239f, 6.0f, 3.0f, 5.7761f, 3.0f, 5.5f)
                curveTo(3.0f, 5.2239f, 3.2239f, 5.0f, 3.5f, 5.0f)
                curveTo(3.7761f, 5.0f, 4.0f, 5.2239f, 4.0f, 5.5f)
                curveTo(4.0f, 5.7761f, 3.7761f, 6.0f, 3.5f, 6.0f)
                close()
                moveTo(1.5f, 6.0f)
                curveTo(1.2239f, 6.0f, 1.0f, 5.7761f, 1.0f, 5.5f)
                curveTo(1.0f, 5.2239f, 1.2239f, 5.0f, 1.5f, 5.0f)
                curveTo(1.7761f, 5.0f, 2.0f, 5.2239f, 2.0f, 5.5f)
                curveTo(2.0f, 5.7761f, 1.7761f, 6.0f, 1.5f, 6.0f)
                close()
            }
        }
        .build()
        return _um!!
    }

private var _um: ImageVector? = null
