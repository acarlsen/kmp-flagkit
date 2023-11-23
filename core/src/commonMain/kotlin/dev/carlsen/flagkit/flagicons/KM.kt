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

val FlagIcons.KM: ImageVector
    get() {
        if (_km != null) {
            return _km!!
        }
        _km = Builder(name = "Km", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFCB49), 1.0f to Color(0xFFFFC638), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDC1D34), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF4985D4), 1.0f to Color(0xFF3D77C2), start =
                    Offset(10.5f,11.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF4BA343), 1.0f to Color(0xFF408D39), start =
                    Offset(5.0f,0.0f), end = Offset(5.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 15.0f)
                lineToRelative(10.0f, -7.5f)
                lineToRelative(-10.0f, -7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(3.5f,4.5f), end = Offset(3.5f,10.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.75f, 4.5945f)
                curveTo(4.5103f, 4.5328f, 4.259f, 4.5f, 4.0f, 4.5f)
                curveTo(2.3431f, 4.5f, 1.0f, 5.8431f, 1.0f, 7.5f)
                curveTo(1.0f, 9.1569f, 2.3431f, 10.5f, 4.0f, 10.5f)
                curveTo(4.259f, 10.5f, 4.5103f, 10.4672f, 4.75f, 10.4055f)
                curveTo(3.4561f, 10.0725f, 2.5f, 8.8979f, 2.5f, 7.5f)
                curveTo(2.5f, 6.1021f, 3.4561f, 4.9275f, 4.75f, 4.5945f)
                close()
                moveTo(5.5f, 6.0f)
                curveTo(5.2239f, 6.0f, 5.0f, 5.7761f, 5.0f, 5.5f)
                curveTo(5.0f, 5.2239f, 5.2239f, 5.0f, 5.5f, 5.0f)
                curveTo(5.7761f, 5.0f, 6.0f, 5.2239f, 6.0f, 5.5f)
                curveTo(6.0f, 5.7761f, 5.7761f, 6.0f, 5.5f, 6.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(5.2239f, 8.0f, 5.0f, 7.7761f, 5.0f, 7.5f)
                curveTo(5.0f, 7.2239f, 5.2239f, 7.0f, 5.5f, 7.0f)
                curveTo(5.7761f, 7.0f, 6.0f, 7.2239f, 6.0f, 7.5f)
                curveTo(6.0f, 7.7761f, 5.7761f, 8.0f, 5.5f, 8.0f)
                close()
                moveTo(5.5f, 10.0f)
                curveTo(5.2239f, 10.0f, 5.0f, 9.7761f, 5.0f, 9.5f)
                curveTo(5.0f, 9.2239f, 5.2239f, 9.0f, 5.5f, 9.0f)
                curveTo(5.7761f, 9.0f, 6.0f, 9.2239f, 6.0f, 9.5f)
                curveTo(6.0f, 9.7761f, 5.7761f, 10.0f, 5.5f, 10.0f)
                close()
            }
        }
        .build()
        return _km!!
    }

private var _km: ImageVector? = null
