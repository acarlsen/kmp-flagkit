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

val FlagIcons.ES: ImageVector
    get() {
        if (_es != null) {
            return _es!!
        }
        _es = Builder(name = "Es", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDD172C), 1.0f to Color(0xFFC60B1F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDD172C), 1.0f to Color(0xFFC60B1F), start =
                    Offset(10.5f,11.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD133), 1.0f to Color(0xFFFFC500), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFEDB1)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.5f, 7.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(-1.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA41517)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.915f, 8.4595f)
                curveTo(4.9397f, 8.755f, 5.2061f, 9.0f, 5.5f, 9.0f)
                curveTo(5.7943f, 9.0f, 6.0604f, 8.7539f, 6.085f, 8.4595f)
                lineTo(6.2066f, 7.0f)
                lineTo(4.7934f, 7.0f)
                lineTo(4.915f, 8.4595f)
                close()
                moveTo(4.2913f, 6.9954f)
                curveTo(4.2685f, 6.7218f, 4.4807f, 6.5f, 4.7559f, 6.5f)
                lineTo(6.2441f, 6.5f)
                curveTo(6.5235f, 6.5f, 6.732f, 6.7158f, 6.7087f, 6.9954f)
                lineTo(6.5832f, 8.501f)
                curveTo(6.5373f, 9.0528f, 6.0561f, 9.5f, 5.5f, 9.5f)
                curveTo(4.9477f, 9.5f, 4.4631f, 9.0573f, 4.4168f, 8.501f)
                lineTo(4.2913f, 6.9954f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA41517)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.5f, 7.5f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(-0.5f, 0.0f)
                lineToRelative(-0.5f, 1.0f)
                lineToRelative(-0.5f, -1.0f)
                lineToRelative(-0.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA41517)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA41517)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA41517)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.5f, 5.5f)
                curveTo(4.5f, 5.2239f, 4.714f, 5.0f, 5.0047f, 5.0f)
                lineTo(5.9953f, 5.0f)
                curveTo(6.274f, 5.0f, 6.5f, 5.2319f, 6.5f, 5.5f)
                lineTo(6.5f, 5.7477f)
                curveTo(6.5f, 5.887f, 6.3925f, 6.0f, 6.2548f, 6.0f)
                lineTo(4.7452f, 6.0f)
                curveTo(4.6098f, 6.0f, 4.5f, 5.893f, 4.5f, 5.7477f)
                lineTo(4.5f, 5.5f)
                close()
            }
        }
        .build()
        return _es!!
    }

private var _es: ImageVector? = null
