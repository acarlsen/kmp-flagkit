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

val FlagIcons.BL: ImageVector
    get() {
        if (_bl != null) {
            return _bl!!
        }
        _bl = Builder(name = "Bl", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF216CD3), 1.0f to Color(0xFF1557B2), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,13.0602f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                lineTo(14.0f, 5.0f)
                lineTo(14.0f, 9.4912f)
                curveTo(14.0f, 10.0484f, 13.6644f, 10.7877f, 13.2406f, 11.151f)
                lineTo(11.646f, 12.5177f)
                curveTo(11.0131f, 13.0602f, 9.9836f, 13.0573f, 9.354f, 12.5177f)
                lineTo(7.7594f, 11.151f)
                curveTo(7.34f, 10.7914f, 7.0f, 10.0499f, 7.0f, 9.4912f)
                lineTo(7.0f, 5.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(10.5f,6.0f), end = Offset(10.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.5f, 7.0f)
                    curveTo(8.2239f, 7.0f, 8.0f, 6.7761f, 8.0f, 6.5f)
                    curveTo(8.0f, 6.2239f, 8.2239f, 6.0f, 8.5f, 6.0f)
                    curveTo(8.7761f, 6.0f, 9.0f, 6.2239f, 9.0f, 6.5f)
                    curveTo(9.0f, 6.7761f, 8.7761f, 7.0f, 8.5f, 7.0f)
                    close()
                    moveTo(10.5f, 7.0f)
                    curveTo(10.2239f, 7.0f, 10.0f, 6.7761f, 10.0f, 6.5f)
                    curveTo(10.0f, 6.2239f, 10.2239f, 6.0f, 10.5f, 6.0f)
                    curveTo(10.7761f, 6.0f, 11.0f, 6.2239f, 11.0f, 6.5f)
                    curveTo(11.0f, 6.7761f, 10.7761f, 7.0f, 10.5f, 7.0f)
                    close()
                    moveTo(12.5f, 7.0f)
                    curveTo(12.2239f, 7.0f, 12.0f, 6.7761f, 12.0f, 6.5f)
                    curveTo(12.0f, 6.2239f, 12.2239f, 6.0f, 12.5f, 6.0f)
                    curveTo(12.7761f, 6.0f, 13.0f, 6.2239f, 13.0f, 6.5f)
                    curveTo(13.0f, 6.7761f, 12.7761f, 7.0f, 12.5f, 7.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(10.5f,10.5f), end = Offset(10.5f,12.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.0f, 11.5f)
                    curveTo(8.7239f, 11.5f, 8.5f, 11.2761f, 8.5f, 11.0f)
                    curveTo(8.5f, 10.7239f, 8.7239f, 10.5f, 9.0f, 10.5f)
                    curveTo(9.2761f, 10.5f, 9.5f, 10.7239f, 9.5f, 11.0f)
                    curveTo(9.5f, 11.2761f, 9.2761f, 11.5f, 9.0f, 11.5f)
                    close()
                    moveTo(10.5f, 12.0f)
                    curveTo(10.2239f, 12.0f, 10.0f, 11.7761f, 10.0f, 11.5f)
                    curveTo(10.0f, 11.2239f, 10.2239f, 11.0f, 10.5f, 11.0f)
                    curveTo(10.7761f, 11.0f, 11.0f, 11.2239f, 11.0f, 11.5f)
                    curveTo(11.0f, 11.7761f, 10.7761f, 12.0f, 10.5f, 12.0f)
                    close()
                    moveTo(12.0f, 11.5f)
                    curveTo(11.7239f, 11.5f, 11.5f, 11.2761f, 11.5f, 11.0f)
                    curveTo(11.5f, 10.7239f, 11.7239f, 10.5f, 12.0f, 10.5f)
                    curveTo(12.2761f, 10.5f, 12.5f, 10.7239f, 12.5f, 11.0f)
                    curveTo(12.5f, 11.2761f, 12.2761f, 11.5f, 12.0f, 11.5f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFE12539), 1.0f to Color(0xFFCA192C),
                        start = Offset(10.5f,8.0f), end = Offset(10.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.0f, 8.0f)
                    horizontalLineToRelative(7.0f)
                    verticalLineToRelative(2.0f)
                    horizontalLineToRelative(-7.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 9.0f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E),
                        start = Offset(10.5f,3.0f), end = Offset(10.5f,5.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(6.5f, 3.5f)
                    curveTo(6.5f, 3.5f, 8.5f, 3.0f, 10.5f, 3.0f)
                    curveTo(12.5f, 3.0f, 14.5f, 3.5f, 14.5f, 3.5f)
                    lineTo(14.0f, 5.5f)
                    curveTo(14.0f, 5.5f, 12.25f, 5.0f, 10.5f, 5.0f)
                    curveTo(8.75f, 5.0f, 7.0f, 5.5f, 7.0f, 5.5f)
                    lineTo(6.5f, 3.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5E5216)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 4.5f)
                    curveTo(10.2239f, 4.5f, 10.0f, 4.2761f, 10.0f, 4.0f)
                    curveTo(10.0f, 3.7239f, 10.2239f, 3.5f, 10.5f, 3.5f)
                    curveTo(10.7761f, 3.5f, 11.0f, 3.7239f, 11.0f, 4.0f)
                    curveTo(11.0f, 4.2761f, 10.7761f, 4.5f, 10.5f, 4.5f)
                    close()
                    moveTo(12.5f, 4.5f)
                    curveTo(12.2239f, 4.5f, 12.0f, 4.2761f, 12.0f, 4.0f)
                    curveTo(12.0f, 3.7239f, 12.2239f, 3.5f, 12.5f, 3.5f)
                    curveTo(12.7761f, 3.5f, 13.0f, 3.7239f, 13.0f, 4.0f)
                    curveTo(13.0f, 4.2761f, 12.7761f, 4.5f, 12.5f, 4.5f)
                    close()
                    moveTo(8.5f, 4.5f)
                    curveTo(8.2239f, 4.5f, 8.0f, 4.2761f, 8.0f, 4.0f)
                    curveTo(8.0f, 3.7239f, 8.2239f, 3.5f, 8.5f, 3.5f)
                    curveTo(8.7761f, 3.5f, 9.0f, 3.7239f, 9.0f, 4.0f)
                    curveTo(9.0f, 4.2761f, 8.7761f, 4.5f, 8.5f, 4.5f)
                    close()
                }
            }
        }
        .build()
        return _bl!!
    }

private var _bl: ImageVector? = null
