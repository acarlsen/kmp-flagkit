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

val FlagIcons.HK: ImageVector
    get() {
        if (_hk != null) {
            return _hk!!
        }
        _hk = Builder(name = "Hk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF0371D), 1.0f to Color(0xFFDE290F), start =
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
                    Offset(10.5393f,3.0001f), end = Offset(10.5393f,11.8156f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 7.1904f)
                curveTo(11.202f, 6.6904f, 11.0f, 7.5989f, 11.0f, 7.1904f)
                curveTo(11.0f, 6.362f, 11.8954f, 5.6904f, 13.0f, 5.6904f)
                curveTo(14.1046f, 5.6904f, 15.0f, 6.362f, 15.0f, 7.1904f)
                curveTo(14.0511f, 7.1904f, 13.9564f, 7.6904f, 13.5f, 7.6904f)
                curveTo(12.9401f, 7.6904f, 12.798f, 7.6904f, 12.0f, 7.1904f)
                close()
                moveTo(13.25f, 7.0f)
                curveTo(13.3881f, 7.0f, 13.5f, 6.8881f, 13.5f, 6.75f)
                curveTo(13.5f, 6.6119f, 13.3881f, 6.5f, 13.25f, 6.5f)
                curveTo(13.1119f, 6.5f, 13.0f, 6.6119f, 13.0f, 6.75f)
                curveTo(13.0f, 6.8881f, 13.1119f, 7.0f, 13.25f, 7.0f)
                close()
                moveTo(11.4391f, 8.9625f)
                curveTo(11.668f, 8.049f, 10.7415f, 8.1376f, 11.13f, 8.0114f)
                curveTo(11.9179f, 7.7554f, 12.8333f, 8.3995f, 13.1747f, 9.45f)
                curveTo(13.516f, 10.5005f, 13.154f, 11.5596f, 12.3661f, 11.8156f)
                curveTo(12.0729f, 10.9132f, 11.5681f, 10.9776f, 11.4271f, 10.5435f)
                curveTo(11.254f, 10.0111f, 11.2101f, 9.8759f, 11.4391f, 8.9625f)
                close()
                moveTo(12.0064f, 10.0924f)
                curveTo(12.0491f, 10.2238f, 12.1901f, 10.2956f, 12.3214f, 10.253f)
                curveTo(12.4527f, 10.2103f, 12.5246f, 10.0693f, 12.4819f, 9.9379f)
                curveTo(12.4392f, 9.8066f, 12.2982f, 9.7348f, 12.1669f, 9.7774f)
                curveTo(12.0356f, 9.8201f, 11.9637f, 9.9611f, 12.0064f, 10.0924f)
                close()
                moveTo(9.5804f, 8.9766f)
                curveTo(10.5198f, 8.912f, 10.1493f, 8.0583f, 10.3894f, 8.3888f)
                curveTo(10.8763f, 9.059f, 10.5466f, 10.1286f, 9.653f, 10.7779f)
                curveTo(8.7594f, 11.4271f, 7.6403f, 11.4101f, 7.1533f, 10.7399f)
                curveTo(7.921f, 10.1822f, 7.7037f, 9.722f, 8.0729f, 9.4537f)
                curveTo(8.5259f, 9.1246f, 8.6409f, 9.0411f, 9.5804f, 8.9766f)
                close()
                moveTo(8.681f, 9.8653f)
                curveTo(8.5693f, 9.9465f, 8.5445f, 10.1028f, 8.6257f, 10.2145f)
                curveTo(8.7068f, 10.3262f, 8.8632f, 10.351f, 8.9749f, 10.2698f)
                curveTo(9.0866f, 10.1887f, 9.1114f, 10.0323f, 9.0302f, 9.9206f)
                curveTo(8.949f, 9.8089f, 8.7927f, 9.7842f, 8.681f, 9.8653f)
                close()
                moveTo(8.9926f, 7.2132f)
                curveTo(9.3443f, 8.0868f, 10.0417f, 7.4705f, 9.8016f, 7.801f)
                curveTo(9.3147f, 8.4712f, 8.1955f, 8.4882f, 7.3019f, 7.839f)
                curveTo(6.4083f, 7.1897f, 6.0786f, 6.1201f, 6.5655f, 5.4499f)
                curveTo(7.3332f, 6.0076f, 7.7037f, 5.6588f, 8.0729f, 5.927f)
                curveTo(8.5259f, 6.2561f, 8.6409f, 6.3397f, 8.9926f, 7.2132f)
                close()
                moveTo(7.8694f, 6.6325f)
                curveTo(7.7577f, 6.5513f, 7.6014f, 6.5761f, 7.5202f, 6.6878f)
                curveTo(7.4391f, 6.7995f, 7.4638f, 6.9559f, 7.5755f, 7.037f)
                curveTo(7.6872f, 7.1182f, 7.8436f, 7.0934f, 7.9247f, 6.9817f)
                curveTo(8.0059f, 6.87f, 7.9811f, 6.7137f, 7.8694f, 6.6325f)
                close()
                moveTo(10.488f, 6.1093f)
                curveTo(9.7659f, 6.7137f, 10.5675f, 7.1866f, 10.179f, 7.0603f)
                curveTo(9.3911f, 6.8043f, 9.0291f, 5.7452f, 9.3704f, 4.6947f)
                curveTo(9.7118f, 3.6442f, 10.6272f, 3.0001f, 11.415f, 3.2561f)
                curveTo(11.1218f, 4.1585f, 11.5681f, 4.4032f, 11.4271f, 4.8372f)
                curveTo(11.254f, 5.3697f, 11.2101f, 5.5049f, 10.488f, 6.1093f)
                close()
                moveTo(10.6932f, 4.8616f)
                curveTo(10.7359f, 4.7303f, 10.664f, 4.5893f, 10.5327f, 4.5466f)
                curveTo(10.4014f, 4.504f, 10.2603f, 4.5758f, 10.2177f, 4.7071f)
                curveTo(10.175f, 4.8384f, 10.2469f, 4.9795f, 10.3782f, 5.0221f)
                curveTo(10.5095f, 5.0648f, 10.6505f, 4.9929f, 10.6932f, 4.8616f)
                close()
            }
        }
        .build()
        return _hk!!
    }

private var _hk: ImageVector? = null
