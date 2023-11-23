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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.BM: ImageVector
    get() {
        if (_bm != null) {
            return _bm!!
        }
        _bm = Builder(name = "Bm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDC1F37), 1.0f to Color(0xFFCF142C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF042C90), 1.0f to Color(0xFF00247E), start =
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
                    Offset(4.1238503f,-0.9021f), end = Offset(4.1238503f,7.9021f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.23f)
                lineTo(-1.3516f, -0.5f)
                lineTo(0.6602f, -0.5f)
                lineTo(4.1602f, 2.0f)
                lineTo(4.8566f, 2.0f)
                lineTo(9.5f, -0.9021f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.5525f, 9.3331f, 0.8765f, 9.0822f, 1.0558f)
                lineTo(6.0f, 3.2573f)
                lineTo(6.0f, 3.77f)
                lineTo(9.1372f, 6.4591f)
                curveTo(9.5993f, 6.8552f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.5048f, 7.5f, 8.2053f, 7.4039f, 8.0009f, 7.258f)
                lineTo(4.8398f, 5.0f)
                lineTo(4.1434f, 5.0f)
                lineTo(-0.5f, 7.9021f)
                lineTo(-0.5f, 6.2427f)
                lineTo(3.0f, 3.7427f)
                lineTo(3.0f, 3.23f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 3.0f)
                lineTo(-0.0f, 0.0f)
                lineTo(0.5f, 0.0f)
                lineTo(4.0f, 2.5f)
                lineTo(5.0f, 2.5f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 0.25f)
                curveTo(9.0f, 0.3881f, 8.9135f, 0.5618f, 8.7915f, 0.6489f)
                lineTo(5.5f, 3.0f)
                lineTo(5.5f, 4.0f)
                lineTo(8.8118f, 6.8387f)
                curveTo(8.9158f, 6.9278f, 8.884f, 7.0f, 8.75f, 7.0f)
                lineTo(8.75f, 7.0f)
                curveTo(8.6119f, 7.0f, 8.4135f, 6.9382f, 8.2915f, 6.8511f)
                lineTo(5.0f, 4.5f)
                lineTo(4.0f, 4.5f)
                lineTo(-0.0f, 7.0f)
                lineTo(-0.0f, 6.5f)
                lineTo(3.5f, 4.0f)
                lineTo(3.5f, 3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.75f,0.0f), end = Offset(4.75f,7.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0f, 2.5f)
                lineTo(-0.0f, 4.5f)
                lineTo(3.5f, 4.5f)
                lineTo(3.5f, 7.0046f)
                curveTo(3.5f, 7.2782f, 3.714f, 7.5f, 4.0047f, 7.5f)
                lineTo(4.9953f, 7.5f)
                curveTo(5.274f, 7.5f, 5.5f, 7.2842f, 5.5f, 7.0046f)
                lineTo(5.5f, 4.5f)
                lineTo(9.0095f, 4.5f)
                curveTo(9.2804f, 4.5f, 9.5f, 4.286f, 9.5f, 3.9953f)
                lineTo(9.5f, 3.0047f)
                curveTo(9.5f, 2.726f, 9.2849f, 2.5f, 9.0095f, 2.5f)
                lineTo(5.5f, 2.5f)
                lineTo(5.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                lineTo(3.5f, 2.5f)
                lineTo(-0.0f, 2.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0f, 3.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(-4.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(15.0f,5.0f), end = Offset(15.0f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 7.5f)
                lineTo(13.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 7.5f)
                curveTo(17.0f, 9.0f, 15.0f, 10.0f, 15.0f, 10.0f)
                curveTo(15.0f, 10.0f, 13.0f, 9.0f, 13.0f, 7.5f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF65B5D2)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.0f, 8.0f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFE20B0C), 1.0f to Color(0xFFD40001),
                        start = Offset(15.0f,6.0f), end = Offset(15.0f,8.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.0f, 7.0f)
                    curveTo(14.7239f, 7.0f, 14.5f, 6.7761f, 14.5f, 6.5f)
                    curveTo(14.5f, 6.2239f, 14.7239f, 6.0f, 15.0f, 6.0f)
                    curveTo(15.2761f, 6.0f, 15.5f, 6.2239f, 15.5f, 6.5f)
                    curveTo(15.5f, 6.7761f, 15.2761f, 7.0f, 15.0f, 7.0f)
                    close()
                    moveTo(14.0f, 8.0f)
                    curveTo(13.7239f, 8.0f, 13.5f, 7.7761f, 13.5f, 7.5f)
                    curveTo(13.5f, 7.2239f, 13.7239f, 7.0f, 14.0f, 7.0f)
                    curveTo(14.2761f, 7.0f, 14.5f, 7.2239f, 14.5f, 7.5f)
                    curveTo(14.5f, 7.7761f, 14.2761f, 8.0f, 14.0f, 8.0f)
                    close()
                    moveTo(16.0f, 8.0f)
                    curveTo(15.7239f, 8.0f, 15.5f, 7.7761f, 15.5f, 7.5f)
                    curveTo(15.5f, 7.2239f, 15.7239f, 7.0f, 16.0f, 7.0f)
                    curveTo(16.2761f, 7.0f, 16.5f, 7.2239f, 16.5f, 7.5f)
                    curveTo(16.5f, 7.7761f, 16.2761f, 8.0f, 16.0f, 8.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF2F8F22)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.0f, 9.0f)
                    horizontalLineToRelative(4.0f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-4.0f)
                    close()
                }
            }
        }
        .build()
        return _bm!!
    }

private var _bm: ImageVector? = null
