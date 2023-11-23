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

val FlagIcons.GS: ImageVector
    get() {
        if (_gs != null) {
            return _gs!!
        }
        _gs = Builder(name = "Gs", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF07319C), 1.0f to Color(0xFF00247E), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
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
                lineTo(-0.0f, -0.0f)
                lineTo(0.5f, -0.0f)
                lineTo(4.0f, 2.5f)
                lineTo(5.0f, 2.5f)
                lineTo(9.0f, -0.0f)
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
                lineTo(5.5f, -0.0f)
                lineTo(3.5f, -0.0f)
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
            path(fill = linearGradient(0.0f to Color(0xFF1E1E1E), 1.0f to Color(0xFF000000), start =
                    Offset(18.5f,8.0f), end = Offset(18.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.5f, 9.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(18.0f,8.5f), end = Offset(18.0f,11.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(17.0f, 10.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFA2ADB0), 1.0f to Color(0xFF8B9497),
                        start = Offset(14.5f,8.0f), end = Offset(14.5f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.5f, 9.5f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF4F4F4F), 1.0f to Color(0xFF2B2B2B),
                        start = Offset(15.0f,8.5f), end = Offset(15.0f,11.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 10.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFEC241), 1.0f to Color(0xFFFEBB2C),
                        start = Offset(16.5f,12.0f), end = Offset(16.5f,13.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(16.5f, 12.5f)
                    curveTo(17.3284f, 13.0f, 18.0f, 12.7761f, 18.0f, 12.5f)
                    curveTo(18.0f, 12.2239f, 17.3284f, 12.0f, 16.5f, 12.0f)
                    curveTo(15.6716f, 12.0f, 15.0f, 12.2239f, 15.0f, 12.5f)
                    curveTo(15.0f, 12.7761f, 15.6716f, 13.0f, 16.5f, 12.5f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(18.5f,4.5f), end = Offset(18.5f,6.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(18.5f, 5.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFA84B14), 1.0f to Color(0xFF913F0E),
                        start = Offset(16.5f,3.5f), end = Offset(16.5f,5.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(16.5f, 4.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFCFB063), 1.0f to Color(0xFFBEA157),
                        start = Offset(16.5f,2.75f), end = Offset(16.5f,4.75f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.5f, 3.75f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(16.5f,10.5f), end = Offset(16.5f,12.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(16.5f, 11.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(14.5f,4.5f), end = Offset(14.5f,6.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.5f, 5.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFF2D42FF), 1.0f to Color(0xFF0B24FC),
                        start = Offset(15.0f,5.5f), end = Offset(15.0f,7.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.0f, 6.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFF2D42FF), 1.0f to Color(0xFF0B24FC),
                        start = Offset(18.0f,5.5f), end = Offset(18.0f,7.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(18.0f, 6.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFE3DC3D), 1.0f to Color(0xFFCFC82A),
                        start = Offset(18.0f,7.0f), end = Offset(20.0f,8.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(18.0f, 8.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF7F7D7D), 1.0f to Color(0xFF656263),
                        start = Offset(16.5f,5.0f), end = Offset(16.5f,8.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(16.0f, 7.5f)
                    lineTo(15.5f, 8.0f)
                    lineTo(17.5f, 8.0f)
                    lineTo(17.0f, 7.5f)
                    lineTo(17.5f, 6.0f)
                    curveTo(17.5f, 6.0f, 17.0523f, 5.0f, 16.5f, 5.0f)
                    curveTo(15.9477f, 5.0f, 15.5f, 6.0f, 15.5f, 6.0f)
                    lineTo(16.0f, 7.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF5D0543)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(16.5f, 6.5f)
                    curveTo(16.5f, 6.5f, 17.0f, 6.3881f, 17.0f, 6.12f)
                    curveTo(17.0f, 6.1119f, 16.5f, 6.0f, 16.5f, 6.0f)
                    curveTo(16.5f, 6.0f, 16.0f, 6.1119f, 16.0f, 6.12f)
                    curveTo(16.0f, 6.3881f, 16.5f, 6.5f, 16.5f, 6.5f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(16.51765f,8.0f), end = Offset(16.51765f,11.4377f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.0068f, 8.5059f)
                    curveTo(15.0031f, 8.2265f, 15.2158f, 8.0f, 15.4954f, 8.0f)
                    lineTo(17.5046f, 8.0f)
                    curveTo(17.7782f, 8.0f, 18.0031f, 8.2307f, 18.0068f, 8.5059f)
                    lineTo(18.0303f, 10.2512f)
                    curveTo(18.0322f, 10.3886f, 17.9342f, 10.5656f, 17.8228f, 10.639f)
                    lineTo(16.7278f, 11.361f)
                    curveTo(16.6113f, 11.4377f, 16.4195f, 11.4344f, 16.3106f, 11.361f)
                    lineTo(15.2399f, 10.639f)
                    curveTo(15.126f, 10.5623f, 15.0322f, 10.3926f, 15.0303f, 10.2512f)
                    lineTo(15.0068f, 8.5059f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(17.5f, 10.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF225DA4)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.5f, 9.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0F8012), 1.0f to Color(0xFF0B6A0D),
                        start = Offset(16.5f,8.0f), end = Offset(16.5f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.0f, 8.0f)
                    lineToRelative(3.0f, 0.0f)
                    lineToRelative(-1.5f, 3.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFCF44), 1.0f to Color(0xFFFCC72E),
                        start = Offset(16.5f,8.5f), end = Offset(16.5f,10.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(15.5f, 9.5f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _gs!!
    }

private var _gs: ImageVector? = null
