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

val FlagIcons.YT: ImageVector
    get() {
        if (_yt != null) {
            return _yt!!
        }
        _yt = Builder(name = "Yt", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = SolidColor(Color(0xFFD8D8D8)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 4.491f)
                curveTo(8.0f, 4.2198f, 8.2148f, 4.0f, 8.4977f, 4.0f)
                lineTo(12.5023f, 4.0f)
                curveTo(12.7772f, 4.0f, 13.0f, 4.2279f, 13.0f, 4.491f)
                lineTo(13.0f, 9.509f)
                curveTo(13.0f, 9.7802f, 12.7818f, 10.0079f, 12.4994f, 10.0309f)
                curveTo(12.4994f, 10.0309f, 11.0f, 10.0f, 10.5f, 10.9406f)
                curveTo(10.0f, 10.0f, 8.5006f, 10.0309f, 8.5006f, 10.0309f)
                curveTo(8.2241f, 10.0138f, 8.0f, 9.7721f, 8.0f, 9.509f)
                lineTo(8.0f, 4.491f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF979797)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.5f, 4.5f)
                lineTo(12.5f, 4.491f)
                curveTo(12.5f, 4.498f, 12.4993f, 4.4996f, 12.5f, 4.5f)
                close()
                moveTo(12.5f, 4.5f)
                curveTo(12.5004f, 4.5002f, 12.501f, 4.5f, 12.5023f, 4.5f)
                lineTo(12.5f, 4.5f)
                close()
                moveTo(8.5f, 4.5f)
                lineTo(8.5f, 9.509f)
                curveTo(8.5f, 9.5097f, 8.5204f, 9.5312f, 8.4903f, 9.531f)
                curveTo(8.4934f, 9.531f, 8.4934f, 9.531f, 8.4995f, 9.5309f)
                curveTo(8.8417f, 9.5273f, 9.2926f, 9.5791f, 9.7496f, 9.7436f)
                curveTo(10.0348f, 9.8463f, 10.2884f, 9.9842f, 10.5f, 10.1624f)
                curveTo(10.7116f, 9.9842f, 10.9652f, 9.8463f, 11.2504f, 9.7436f)
                curveTo(11.6941f, 9.5839f, 12.1321f, 9.5304f, 12.4704f, 9.5307f)
                curveTo(12.4898f, 9.526f, 12.5f, 9.5145f, 12.5f, 9.509f)
                lineTo(12.5f, 4.5f)
                curveTo(12.5f, 4.5f, 12.5f, 4.5f, 12.5f, 4.5f)
                lineTo(8.5f, 4.5f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 4.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(3.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1B2CA9), 1.0f to Color(0xFF132294),
                        start = Offset(10.5f,4.0f), end = Offset(10.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 4.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(3.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 7.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(4.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFE6402C), 1.0f to Color(0xFFD1321F),
                        start = Offset(10.5f,7.0f), end = Offset(10.5f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 7.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(4.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFD0D0D0), 1.0f to Color(0xFFC4C4C4),
                        start = Offset(15.9796505f,3.4439f), end = Offset(15.9796505f,10.8394f)),
                        stroke = SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.039f, 4.7258f)
                    lineTo(15.039f, 4.2623f)
                    lineTo(15.5f, 4.0f)
                    curveTo(15.5f, 4.0f, 15.0449f, 3.4439f, 15.2699f, 3.4439f)
                    curveTo(15.5449f, 3.4439f, 16.6991f, 3.81f, 17.0f, 4.0f)
                    curveTo(17.3009f, 4.19f, 17.4534f, 4.4184f, 17.4958f, 4.8497f)
                    curveTo(17.5381f, 5.281f, 17.1798f, 5.8313f, 17.1798f, 5.8313f)
                    lineTo(17.0f, 6.2498f)
                    lineTo(17.7881f, 6.0715f)
                    curveTo(17.7881f, 6.0715f, 17.9157f, 6.8975f, 17.3355f, 7.5f)
                    curveTo(16.7553f, 8.1025f, 15.9412f, 7.9895f, 15.9412f, 7.9895f)
                    lineTo(15.7775f, 7.5f)
                    curveTo(15.7775f, 7.5f, 15.2461f, 7.7064f, 14.9336f, 8.1741f)
                    curveTo(14.6211f, 8.6418f, 14.533f, 9.4502f, 15.039f, 9.9492f)
                    curveTo(15.545f, 10.4482f, 16.38f, 10.4059f, 16.7781f, 9.7044f)
                    curveTo(16.7781f, 9.7044f, 16.9379f, 9.084f, 16.5698f, 8.7923f)
                    curveTo(16.2017f, 8.5006f, 15.9525f, 9.1033f, 15.9412f, 9.0701f)
                    curveTo(15.8697f, 8.8597f, 15.7775f, 8.5006f, 16.369f, 8.5006f)
                    curveTo(16.9606f, 8.5006f, 17.2649f, 9.1367f, 17.1798f, 9.6257f)
                    curveTo(17.0947f, 10.1147f, 16.924f, 10.579f, 15.7775f, 10.7092f)
                    curveTo(14.6309f, 10.8394f, 14.3358f, 9.3861f, 14.3358f, 9.3861f)
                    curveTo(14.3358f, 9.3861f, 14.0436f, 8.03f, 14.3358f, 7.0507f)
                    curveTo(14.6281f, 6.0715f, 15.0612f, 6.0472f, 15.9412f, 5.5095f)
                    curveTo(16.8212f, 4.9719f, 15.41f, 5.3272f, 15.41f, 5.3272f)
                    curveTo(15.41f, 5.3272f, 14.7398f, 5.8313f, 14.5297f, 5.6478f)
                    curveTo(14.3196f, 5.4644f, 15.039f, 4.7258f, 15.039f, 4.7258f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(15.75f,3.75f), end = Offset(15.75f,5.75f)), stroke =
                        SolidColor(Color(0x00000000)), fillAlpha = 0.3f, strokeLineWidth = 1.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.75f, 4.75f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFD0D0D0), 1.0f to Color(0xFFC4C4C4),
                        start = Offset(5.02035f,3.4439f), end = Offset(5.02035f,10.8394f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.961f, 4.7258f)
                    lineTo(5.961f, 4.2623f)
                    lineTo(5.5f, 4.0f)
                    curveTo(5.5f, 4.0f, 5.9551f, 3.4439f, 5.7301f, 3.4439f)
                    curveTo(5.4551f, 3.4439f, 4.3009f, 3.81f, 4.0f, 4.0f)
                    curveTo(3.6991f, 4.19f, 3.5466f, 4.4184f, 3.5042f, 4.8497f)
                    curveTo(3.4619f, 5.281f, 3.8202f, 5.8313f, 3.8202f, 5.8313f)
                    lineTo(4.0f, 6.2498f)
                    lineTo(3.2119f, 6.0715f)
                    curveTo(3.2119f, 6.0715f, 3.0843f, 6.8975f, 3.6645f, 7.5f)
                    curveTo(4.2447f, 8.1025f, 5.0588f, 7.9895f, 5.0588f, 7.9895f)
                    lineTo(5.2225f, 7.5f)
                    curveTo(5.2225f, 7.5f, 5.7539f, 7.7064f, 6.0664f, 8.1741f)
                    curveTo(6.3789f, 8.6418f, 6.467f, 9.4502f, 5.961f, 9.9492f)
                    curveTo(5.455f, 10.4482f, 4.62f, 10.4059f, 4.2219f, 9.7044f)
                    curveTo(4.2219f, 9.7044f, 4.0621f, 9.084f, 4.4302f, 8.7923f)
                    curveTo(4.7983f, 8.5006f, 5.0475f, 9.1033f, 5.0588f, 9.0701f)
                    curveTo(5.1303f, 8.8597f, 5.2225f, 8.5006f, 4.631f, 8.5006f)
                    curveTo(4.0394f, 8.5006f, 3.7351f, 9.1367f, 3.8202f, 9.6257f)
                    curveTo(3.9053f, 10.1147f, 4.076f, 10.579f, 5.2225f, 10.7092f)
                    curveTo(6.3691f, 10.8394f, 6.6642f, 9.3861f, 6.6642f, 9.3861f)
                    curveTo(6.6642f, 9.3861f, 6.9564f, 8.03f, 6.6642f, 7.0507f)
                    curveTo(6.3719f, 6.0715f, 5.9388f, 6.0472f, 5.0588f, 5.5095f)
                    curveTo(4.1788f, 4.9719f, 5.59f, 5.3272f, 5.59f, 5.3272f)
                    curveTo(5.59f, 5.3272f, 6.2602f, 5.8313f, 6.4703f, 5.6478f)
                    curveTo(6.6804f, 5.4644f, 5.961f, 4.7258f, 5.961f, 4.7258f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(5.25f,3.75f), end = Offset(5.25f,5.75f)), stroke =
                        SolidColor(Color(0x00000000)), fillAlpha = 0.3f, strokeLineWidth = 1.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.25f, 4.75f)
                    moveToRelative(1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(10.5f,5.0f), end = Offset(10.5f,6.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.6338f, 5.0f)
                    curveTo(9.5487f, 5.1471f, 9.5f, 5.3179f, 9.5f, 5.5f)
                    curveTo(9.5f, 6.0523f, 9.9477f, 6.5f, 10.5f, 6.5f)
                    curveTo(11.0523f, 6.5f, 11.5f, 6.0523f, 11.5f, 5.5f)
                    curveTo(11.5f, 5.3179f, 11.4513f, 5.1471f, 11.3662f, 5.0f)
                    curveTo(11.1933f, 5.2989f, 10.8701f, 5.5f, 10.5f, 5.5f)
                    curveTo(10.1299f, 5.5f, 9.8067f, 5.2989f, 9.6338f, 5.0f)
                    lineTo(9.6338f, 5.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF7E04B), 1.0f to Color(0xFFEAD135),
                        start = Offset(10.5f,8.0f), end = Offset(10.5f,9.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.5f, 9.0f)
                    curveTo(9.2239f, 9.0f, 9.0f, 8.7761f, 9.0f, 8.5f)
                    curveTo(9.0f, 8.2239f, 9.2239f, 8.0f, 9.5f, 8.0f)
                    curveTo(9.7761f, 8.0f, 10.0f, 8.2239f, 10.0f, 8.5f)
                    curveTo(10.0f, 8.7761f, 9.7761f, 9.0f, 9.5f, 9.0f)
                    close()
                    moveTo(11.5f, 9.0f)
                    curveTo(11.2239f, 9.0f, 11.0f, 8.7761f, 11.0f, 8.5f)
                    curveTo(11.0f, 8.2239f, 11.2239f, 8.0f, 11.5f, 8.0f)
                    curveTo(11.7761f, 8.0f, 12.0f, 8.2239f, 12.0f, 8.5f)
                    curveTo(12.0f, 8.7761f, 11.7761f, 9.0f, 11.5f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _yt!!
    }

private var _yt: ImageVector? = null
