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

val FlagIcons.LK: ImageVector
    get() {
        if (_lk != null) {
            return _lk!!
        }
        _lk = Builder(name = "Lk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFBF19), 1.0f to Color(0xFFFFB800), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFA52531), 1.0f to Color(0xFF8E1F29), start =
                    Offset(14.0f,1.0f), end = Offset(14.0f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 1.0f)
                lineTo(19.2493f, 1.0f)
                curveTo(19.6639f, 1.0f, 20.0f, 1.3344f, 20.0f, 1.7551f)
                lineTo(20.0f, 13.2449f)
                curveTo(20.0f, 13.6619f, 19.6665f, 14.0f, 19.2493f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 1.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF03664F), 1.0f to Color(0xFF005642), start =
                    Offset(2.5f,1.0f), end = Offset(2.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.0f, 1.7551f)
                curveTo(1.0f, 1.3381f, 1.3441f, 1.0f, 1.757f, 1.0f)
                lineTo(4.0f, 1.0f)
                lineTo(4.0f, 14.0f)
                lineTo(1.757f, 14.0f)
                curveTo(1.3389f, 14.0f, 1.0f, 13.6656f, 1.0f, 13.2449f)
                lineTo(1.0f, 1.7551f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF6816), 1.0f to Color(0xFFFF5B01), start =
                    Offset(5.5f,1.0f), end = Offset(5.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.5f, 1.0f)
                lineTo(6.5f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 1.5f)
                lineTo(7.0f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 14.0f)
                lineTo(4.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 13.5f)
                lineTo(4.0f, 1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 1.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFBF18), 1.0f to Color(0xFFFFB800), start =
                    Offset(14.0f,2.0f), end = Offset(14.0f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 3.0f)
                curveTo(9.2239f, 3.0f, 9.0f, 2.7761f, 9.0f, 2.5f)
                lineTo(9.0f, 2.0f)
                lineTo(9.5f, 2.0f)
                curveTo(9.7761f, 2.0f, 10.0f, 2.2239f, 10.0f, 2.5f)
                curveTo(10.0f, 2.7761f, 9.7761f, 3.0f, 9.5f, 3.0f)
                close()
                moveTo(18.5f, 3.0f)
                curveTo(18.2239f, 3.0f, 18.0f, 2.7761f, 18.0f, 2.5f)
                curveTo(18.0f, 2.2239f, 18.2239f, 2.0f, 18.5f, 2.0f)
                lineTo(19.0f, 2.0f)
                lineTo(19.0f, 2.5f)
                curveTo(19.0f, 2.7761f, 18.7761f, 3.0f, 18.5f, 3.0f)
                close()
                moveTo(18.5f, 12.0f)
                curveTo(18.7761f, 12.0f, 19.0f, 12.2239f, 19.0f, 12.5f)
                lineTo(19.0f, 13.0f)
                lineTo(18.5f, 13.0f)
                curveTo(18.2239f, 13.0f, 18.0f, 12.7761f, 18.0f, 12.5f)
                curveTo(18.0f, 12.2239f, 18.2239f, 12.0f, 18.5f, 12.0f)
                close()
                moveTo(9.5f, 12.0f)
                curveTo(9.7761f, 12.0f, 10.0f, 12.2239f, 10.0f, 12.5f)
                curveTo(10.0f, 12.7761f, 9.7761f, 13.0f, 9.5f, 13.0f)
                lineTo(9.0f, 13.0f)
                lineTo(9.0f, 12.5f)
                curveTo(9.0f, 12.2239f, 9.2239f, 12.0f, 9.5f, 12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFBF18), 1.0f to Color(0xFFFFB800), start =
                    Offset(13.753f,4.1124f), end = Offset(13.753f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 9.5f)
                curveTo(12.0f, 9.2239f, 11.7734f, 9.0f, 11.5f, 9.0f)
                lineTo(12.0f, 9.0f)
                curveTo(11.7239f, 9.0f, 11.2914f, 8.924f, 11.0254f, 8.8154f)
                curveTo(11.0254f, 8.8154f, 10.0f, 8.5f, 10.0f, 8.0f)
                curveTo(10.0f, 7.5f, 10.2034f, 7.3856f, 10.2034f, 7.3856f)
                curveTo(10.3672f, 7.1726f, 10.4179f, 6.7976f, 10.3154f, 6.5253f)
                curveTo(10.3154f, 6.5253f, 9.9001f, 5.5997f, 10.0f, 5.0f)
                curveTo(10.0999f, 4.4003f, 10.5708f, 4.251f, 10.5708f, 4.251f)
                curveTo(10.8078f, 4.1124f, 11.0f, 4.2158f, 11.0f, 4.4954f)
                lineTo(11.0f, 6.5046f)
                curveTo(11.0f, 6.7782f, 11.1928f, 7.0964f, 11.4532f, 7.2266f)
                lineTo(11.5468f, 7.2734f)
                curveTo(11.7971f, 7.3986f, 12.1582f, 7.3418f, 12.3527f, 7.1473f)
                lineTo(12.1473f, 7.3527f)
                curveTo(12.3421f, 7.1579f, 12.3072f, 6.9036f, 12.0468f, 6.7734f)
                lineTo(11.5f, 6.5f)
                lineTo(11.5f, 6.0f)
                lineTo(12.0f, 6.0f)
                curveTo(12.2761f, 6.0f, 12.3072f, 5.9036f, 12.0468f, 5.7734f)
                lineTo(11.5f, 5.5f)
                lineTo(11.5f, 5.0f)
                lineTo(12.0f, 5.0f)
                curveTo(12.2761f, 5.0f, 12.6582f, 4.8418f, 12.8527f, 4.6473f)
                lineTo(12.6473f, 4.8527f)
                curveTo(12.8421f, 4.6579f, 13.2319f, 4.5f, 13.5f, 4.5f)
                lineTo(13.5f, 4.5f)
                curveTo(13.7761f, 4.5f, 14.0964f, 4.6928f, 14.2266f, 4.9532f)
                lineTo(14.2734f, 5.0468f)
                curveTo(14.3986f, 5.2971f, 14.4305f, 5.7086f, 14.3418f, 5.9746f)
                lineTo(14.1582f, 6.5254f)
                curveTo(14.0708f, 6.7875f, 14.2307f, 7.0f, 14.5059f, 7.0f)
                lineTo(15.9941f, 7.0f)
                curveTo(16.2735f, 7.0f, 16.6582f, 6.8418f, 16.8527f, 6.6473f)
                lineTo(16.6473f, 6.8527f)
                curveTo(16.8421f, 6.6579f, 16.8072f, 6.4036f, 16.5468f, 6.2734f)
                lineTo(16.4532f, 6.2266f)
                curveTo(16.2029f, 6.1014f, 15.7681f, 6.0f, 15.5f, 6.0f)
                lineTo(15.5f, 6.0f)
                curveTo(15.2239f, 6.0f, 15.0f, 5.7681f, 15.0f, 5.5f)
                lineTo(15.0f, 5.5f)
                curveTo(15.0f, 5.2239f, 15.1582f, 4.8418f, 15.3527f, 4.6473f)
                lineTo(15.5f, 4.5f)
                lineTo(15.5f, 5.0f)
                curveTo(15.5f, 5.2761f, 15.7266f, 5.5f, 16.0f, 5.5f)
                lineTo(15.5f, 5.5f)
                curveTo(15.7761f, 5.5f, 16.2319f, 5.5f, 16.5f, 5.5f)
                lineTo(16.5f, 5.5f)
                curveTo(16.7761f, 5.5f, 17.0964f, 5.6928f, 17.2266f, 5.9532f)
                lineTo(17.2734f, 6.0468f)
                curveTo(17.3986f, 6.2971f, 17.5197f, 6.7196f, 17.5371f, 6.9943f)
                curveTo(17.5371f, 6.9943f, 17.6059f, 7.4703f, 17.5f, 8.0f)
                curveTo(17.3941f, 8.5297f, 17.274f, 8.5886f, 17.274f, 8.5886f)
                curveTo(17.1227f, 8.8158f, 17.0f, 9.214f, 17.0f, 9.5047f)
                lineTo(17.0f, 10.4953f)
                curveTo(17.0f, 10.774f, 16.7681f, 11.0f, 16.5f, 11.0f)
                lineTo(16.5f, 11.0f)
                curveTo(16.2239f, 11.0f, 16.0964f, 10.8072f, 16.2266f, 10.5468f)
                lineTo(16.2734f, 10.4532f)
                curveTo(16.3986f, 10.2029f, 16.4036f, 9.8072f, 16.2734f, 9.5468f)
                lineTo(16.2266f, 9.4532f)
                curveTo(16.1014f, 9.2029f, 16.0f, 9.2319f, 16.0f, 9.5f)
                lineTo(16.0f, 9.5f)
                curveTo(16.0f, 9.7761f, 15.9036f, 10.1928f, 15.7734f, 10.4532f)
                lineTo(15.7266f, 10.5468f)
                curveTo(15.6014f, 10.7971f, 15.2681f, 11.0f, 15.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                curveTo(14.7239f, 11.0f, 14.5964f, 10.8072f, 14.7266f, 10.5468f)
                lineTo(14.7734f, 10.4532f)
                curveTo(14.8986f, 10.2029f, 15.0f, 9.7681f, 15.0f, 9.5f)
                lineTo(15.0f, 9.5f)
                curveTo(15.0f, 9.2239f, 14.786f, 9.0f, 14.4953f, 9.0f)
                lineTo(13.5047f, 9.0f)
                curveTo(13.226f, 9.0f, 13.0f, 9.2319f, 13.0f, 9.5f)
                lineTo(13.0f, 9.5f)
                curveTo(13.0f, 9.7761f, 12.9036f, 10.1928f, 12.7734f, 10.4532f)
                lineTo(12.7266f, 10.5468f)
                curveTo(12.6014f, 10.7971f, 12.2681f, 11.0f, 12.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                curveTo(11.7239f, 11.0f, 11.5964f, 10.8072f, 11.7266f, 10.5468f)
                lineTo(11.7734f, 10.4532f)
                curveTo(11.8986f, 10.2029f, 12.0f, 9.7681f, 12.0f, 9.5f)
                lineTo(12.0f, 9.5f)
                close()
            }
        }
        .build()
        return _lk!!
    }

private var _lk: ImageVector? = null
