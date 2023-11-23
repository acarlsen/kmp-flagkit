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

val FlagIcons.VA: ImageVector
    get() {
        if (_va != null) {
            return _va!!
        }
        _va = Builder(name = "Va", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFDE048), 1.0f to Color(0xFFFFDF32), start =
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
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFCDCCCC), 1.0f to Color(0xFFE4E4E4), start =
                    Offset(15.9697f,5.4645f), end = Offset(15.9697f,11.3536f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.682f, 8.6464f)
                curveTo(19.2678f, 9.2322f, 19.2678f, 10.182f, 18.682f, 10.7678f)
                curveTo(18.0962f, 11.3536f, 17.1464f, 11.3536f, 16.5607f, 10.7678f)
                curveTo(16.0988f, 10.3059f, 16.0011f, 9.6179f, 16.2675f, 9.0604f)
                lineTo(14.0858f, 6.8787f)
                lineTo(13.7322f, 7.2322f)
                lineTo(13.3787f, 7.5858f)
                lineTo(12.6716f, 6.8787f)
                lineTo(13.0251f, 6.5251f)
                lineTo(13.7322f, 5.818f)
                lineTo(14.0858f, 5.4645f)
                lineTo(14.4393f, 5.818f)
                lineTo(16.9746f, 8.3532f)
                curveTo(17.5321f, 8.0869f, 18.2202f, 8.1846f, 18.682f, 8.6464f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFCD9D25), 1.0f to Color(0xFFEBB93A), start =
                    Offset(15.0303f,5.4645f), end = Offset(15.0303f,11.3536f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0254f, 8.3532f)
                curveTo(13.4679f, 8.0869f, 12.7798f, 8.1846f, 12.318f, 8.6464f)
                curveTo(11.7322f, 9.2322f, 11.7322f, 10.182f, 12.318f, 10.7678f)
                curveTo(12.9038f, 11.3536f, 13.8536f, 11.3536f, 14.4393f, 10.7678f)
                curveTo(14.9012f, 10.3059f, 14.9989f, 9.6179f, 14.7325f, 9.0604f)
                lineTo(16.9142f, 6.8787f)
                lineTo(17.2678f, 7.2322f)
                lineTo(17.6213f, 7.5858f)
                lineTo(18.3284f, 6.8787f)
                lineTo(17.9749f, 6.5251f)
                lineTo(17.2678f, 5.818f)
                lineTo(16.9142f, 5.4645f)
                lineTo(16.5607f, 5.818f)
                lineTo(14.0254f, 8.3532f)
                lineTo(14.0254f, 8.3532f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFCD9D25), 1.0f to Color(0xFFEBB93A), start =
                    Offset(15.5f,2.0f), end = Offset(15.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.5f, 5.0f)
                curveTo(14.6716f, 5.0f, 14.0f, 4.7761f, 14.0f, 4.5f)
                curveTo(14.0f, 4.2239f, 14.6716f, 4.0f, 15.5f, 4.0f)
                curveTo(16.3284f, 4.0f, 17.0f, 4.2239f, 17.0f, 4.5f)
                curveTo(17.0f, 4.7761f, 16.3284f, 5.0f, 15.5f, 5.0f)
                close()
                moveTo(15.5f, 2.5f)
                curveTo(15.0858f, 2.5f, 14.75f, 2.3881f, 14.75f, 2.25f)
                curveTo(14.75f, 2.1119f, 15.0858f, 2.0f, 15.5f, 2.0f)
                curveTo(15.9142f, 2.0f, 16.25f, 2.1119f, 16.25f, 2.25f)
                curveTo(16.25f, 2.3881f, 15.9142f, 2.5f, 15.5f, 2.5f)
                close()
                moveTo(15.5f, 3.6667f)
                curveTo(14.9477f, 3.6667f, 14.5f, 3.5174f, 14.5f, 3.3333f)
                curveTo(14.5f, 3.1492f, 14.9477f, 3.0f, 15.5f, 3.0f)
                curveTo(16.0523f, 3.0f, 16.5f, 3.1492f, 16.5f, 3.3333f)
                curveTo(16.5f, 3.5174f, 16.0523f, 3.6667f, 15.5f, 3.6667f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF5252C), 1.0f to Color(0xFFF6151C), start =
                    Offset(15.5f,9.9383f), end = Offset(15.5f,12.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0257f, 10.6581f)
                curveTo(13.1062f, 10.8998f, 13.2733f, 11.234f, 13.5534f, 11.5701f)
                curveTo(14.0329f, 12.1455f, 14.6828f, 12.5f, 15.5f, 12.5f)
                curveTo(16.3172f, 12.5f, 16.9671f, 12.1455f, 17.4466f, 11.5701f)
                curveTo(17.7267f, 11.234f, 17.8938f, 10.8998f, 17.9743f, 10.6581f)
                curveTo(18.0617f, 10.3961f, 17.9201f, 10.113f, 17.6581f, 10.0257f)
                curveTo(17.3961f, 9.9383f, 17.113f, 10.0799f, 17.0257f, 10.3419f)
                curveTo(16.9812f, 10.4752f, 16.8671f, 10.7035f, 16.6784f, 10.9299f)
                curveTo(16.3767f, 11.292f, 15.9953f, 11.5f, 15.5f, 11.5f)
                curveTo(15.0047f, 11.5f, 14.6233f, 11.292f, 14.3216f, 10.9299f)
                curveTo(14.1329f, 10.7035f, 14.0188f, 10.4752f, 13.9743f, 10.3419f)
                curveTo(13.887f, 10.0799f, 13.6039f, 9.9383f, 13.3419f, 10.0257f)
                curveTo(13.0799f, 10.113f, 12.9383f, 10.3961f, 13.0257f, 10.6581f)
                close()
            }
        }
        .build()
        return _va!!
    }

private var _va: ImageVector? = null
