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

val FlagIcons.NF: ImageVector
    get() {
        if (_nf != null) {
            return _nf!!
        }
        _nf = Builder(name = "Nf", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF219646), 1.0f to Color(0xFF197837), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF219646), 1.0f to Color(0xFF197837), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF259D4B), 1.0f to Color(0xFF197837), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.4436f, 4.0031f)
                lineTo(9.8656f, 2.4839f)
                curveTo(9.9398f, 2.2166f, 10.2319f, 2.0f, 10.5f, 2.0f)
                curveTo(10.7761f, 2.0f, 11.0618f, 2.2225f, 11.1344f, 2.4839f)
                lineTo(11.5564f, 4.0031f)
                curveTo(11.5379f, 4.0011f, 11.5191f, 4.0f, 11.5f, 4.0f)
                curveTo(11.2239f, 4.0f, 11.0f, 4.2239f, 11.0f, 4.5f)
                curveTo(11.0f, 4.7761f, 11.2239f, 5.0f, 11.5f, 5.0f)
                curveTo(11.6146f, 5.0f, 11.7203f, 4.9614f, 11.8046f, 4.8965f)
                lineTo(12.1148f, 6.0132f)
                curveTo(12.0779f, 6.0046f, 12.0395f, 6.0f, 12.0f, 6.0f)
                curveTo(11.7239f, 6.0f, 11.5f, 6.2239f, 11.5f, 6.5f)
                curveTo(11.5f, 6.7761f, 11.7239f, 7.0f, 12.0f, 7.0f)
                curveTo(12.136f, 7.0f, 12.2592f, 6.9457f, 12.3494f, 6.8577f)
                lineTo(12.6755f, 8.0317f)
                curveTo(12.6209f, 8.0112f, 12.5617f, 8.0f, 12.5f, 8.0f)
                curveTo(12.2239f, 8.0f, 12.0f, 8.2239f, 12.0f, 8.5f)
                curveTo(12.0f, 8.7761f, 12.2239f, 9.0f, 12.5f, 9.0f)
                curveTo(12.6588f, 9.0f, 12.8002f, 8.926f, 12.8918f, 8.8106f)
                lineTo(13.5f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                lineTo(10.0f, 11.0f)
                lineTo(7.5f, 11.0f)
                lineTo(8.1082f, 8.8106f)
                curveTo(8.1998f, 8.926f, 8.3412f, 9.0f, 8.5f, 9.0f)
                curveTo(8.7761f, 9.0f, 9.0f, 8.7761f, 9.0f, 8.5f)
                curveTo(9.0f, 8.2239f, 8.7761f, 8.0f, 8.5f, 8.0f)
                curveTo(8.4383f, 8.0f, 8.3791f, 8.0112f, 8.3245f, 8.0317f)
                lineTo(8.6506f, 6.8577f)
                curveTo(8.7408f, 6.9457f, 8.864f, 7.0f, 9.0f, 7.0f)
                curveTo(9.2761f, 7.0f, 9.5f, 6.7761f, 9.5f, 6.5f)
                curveTo(9.5f, 6.2239f, 9.2761f, 6.0f, 9.0f, 6.0f)
                curveTo(8.9605f, 6.0f, 8.9221f, 6.0046f, 8.8852f, 6.0132f)
                lineTo(9.1954f, 4.8965f)
                curveTo(9.2797f, 4.9614f, 9.3854f, 5.0f, 9.5f, 5.0f)
                curveTo(9.7761f, 5.0f, 10.0f, 4.7761f, 10.0f, 4.5f)
                curveTo(10.0f, 4.2239f, 9.7761f, 4.0f, 9.5f, 4.0f)
                curveTo(9.4809f, 4.0f, 9.4621f, 4.0011f, 9.4436f, 4.0031f)
                lineTo(9.4436f, 4.0031f)
                close()
            }
        }
        .build()
        return _nf!!
    }

private var _nf: ImageVector? = null
