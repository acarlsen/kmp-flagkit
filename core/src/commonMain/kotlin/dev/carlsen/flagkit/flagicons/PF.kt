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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.PF: ImageVector
    get() {
        if (_pf != null) {
            return _pf!!
        }
        _pf = Builder(name = "Pf", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE02639), 1.0f to Color(0xFFCA1A2C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDC2235), 1.0f to Color(0xFFCA1A2C), start =
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
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFA135), 1.0f to Color(0xFFFD9C2D),
                        start = Offset(10.5f,5.0f), end = Offset(10.5f,7.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 5.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(2.5f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.0f, 6.5f)
                    lineToRelative(3.0f, 0.0f)
                    lineToRelative(-0.5f, 1.0f)
                    lineToRelative(-2.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFDF2034), 1.0f to Color(0xFFCA1A2C),
                        start = Offset(10.5f,5.0f), end = Offset(10.5f,8.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.0f, 5.0f)
                    lineTo(11.0f, 5.0f)
                    lineTo(11.0f, 6.4953f)
                    curveTo(11.0f, 6.774f, 10.7681f, 7.0f, 10.5f, 7.0f)
                    curveTo(10.2239f, 7.0f, 10.0f, 6.786f, 10.0f, 6.4953f)
                    lineTo(10.0f, 5.0f)
                    close()
                    moveTo(9.0f, 6.0f)
                    curveTo(9.0f, 6.0f, 9.75f, 7.5f, 10.5f, 7.5f)
                    curveTo(11.25f, 7.5f, 12.0f, 6.0f, 12.0f, 6.0f)
                    lineTo(12.0f, 7.0f)
                    curveTo(12.0f, 7.5523f, 11.5573f, 8.0f, 11.001f, 8.0f)
                    lineTo(9.999f, 8.0f)
                    curveTo(9.4472f, 8.0f, 9.0f, 7.5561f, 9.0f, 7.0f)
                    lineTo(9.0f, 6.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0B4BAD), 1.0f to Color(0xFF08429A),
                        start = Offset(10.5f,8.0f), end = Offset(10.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 8.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(2.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 8.5f)
                    lineToRelative(5.0f, 0.0f)
                    lineToRelative(0.0f, 0.5f)
                    lineToRelative(-5.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _pf!!
    }

private var _pf: ImageVector? = null
