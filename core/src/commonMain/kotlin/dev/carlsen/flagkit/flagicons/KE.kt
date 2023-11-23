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

val FlagIcons.KE: ImageVector
    get() {
        if (_ke != null) {
            return _ke!!
        }
        _ke = Builder(name = "Ke", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF018301), 1.0f to Color(0xFF006700), start =
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
            path(fill = linearGradient(0.0f to Color(0xFFDC0808), 1.0f to Color(0xFFBC0000), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBC0000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 12.5f)
                curveTo(11.5f, 12.5f, 13.0f, 10.5376f, 13.0f, 7.5f)
                curveTo(13.0f, 4.4624f, 11.5f, 2.5f, 10.5f, 2.5f)
                curveTo(9.5f, 2.5f, 8.0f, 4.4624f, 8.0f, 7.5f)
                curveTo(8.0f, 10.5376f, 9.5f, 12.5f, 10.5f, 12.5f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(6.5f,2.0f), end = Offset(6.5f,13.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.0f, 7.5f)
                    arcToRelative(2.5f, 5.5f, 0.0f, true, false, 5.0f, 0.0f)
                    arcToRelative(2.5f, 5.5f, 0.0f, true, false, -5.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(14.5f,2.0f), end = Offset(14.5f,13.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(12.0f, 7.5f)
                    arcToRelative(2.5f, 5.5f, 0.0f, true, false, 5.0f, 0.0f)
                    arcToRelative(2.5f, 5.5f, 0.0f, true, false, -5.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 9.0f)
                    curveTo(10.2239f, 9.0f, 10.0f, 8.3284f, 10.0f, 7.5f)
                    curveTo(10.0f, 6.6716f, 10.2239f, 6.0f, 10.5f, 6.0f)
                    curveTo(10.7761f, 6.0f, 11.0f, 6.6716f, 11.0f, 7.5f)
                    curveTo(11.0f, 8.3284f, 10.7761f, 9.0f, 10.5f, 9.0f)
                    close()
                    moveTo(10.5f, 6.0f)
                    curveTo(10.2239f, 6.0f, 10.0f, 5.1046f, 10.0f, 4.0f)
                    curveTo(10.0f, 2.8954f, 10.2239f, 2.0f, 10.5f, 2.0f)
                    curveTo(10.7761f, 2.0f, 11.0f, 2.8954f, 11.0f, 4.0f)
                    curveTo(11.0f, 5.1046f, 10.7761f, 6.0f, 10.5f, 6.0f)
                    close()
                    moveTo(10.5f, 13.0f)
                    curveTo(10.2239f, 13.0f, 10.0f, 12.1046f, 10.0f, 11.0f)
                    curveTo(10.0f, 9.8954f, 10.2239f, 9.0f, 10.5f, 9.0f)
                    curveTo(10.7761f, 9.0f, 11.0f, 9.8954f, 11.0f, 11.0f)
                    curveTo(11.0f, 12.1046f, 10.7761f, 13.0f, 10.5f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _ke!!
    }

private var _ke: ImageVector? = null
