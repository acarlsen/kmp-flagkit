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

val FlagIcons.VI: ImageVector
    get() {
        if (_vi != null) {
            return _vi!!
        }
        _vi = Builder(name = "Vi", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = SolidColor(Color(0xFF1583C4)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3491f, 6.5045f)
                lineTo(13.2784f, 12.3843f)
                curveTo(13.2145f, 12.5067f, 13.2619f, 12.6577f, 13.3843f, 12.7216f)
                curveTo(13.5067f, 12.7855f, 13.6577f, 12.7381f, 13.7216f, 12.6157f)
                lineTo(16.7923f, 6.736f)
                curveTo(16.8562f, 6.6136f, 16.8088f, 6.4626f, 16.6864f, 6.3986f)
                curveTo(16.564f, 6.3347f, 16.413f, 6.3821f, 16.3491f, 6.5045f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1583C4)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7809f, 7.8132f)
                lineTo(13.3017f, 12.3478f)
                curveTo(13.2176f, 12.4574f, 13.2383f, 12.6143f, 13.3478f, 12.6983f)
                curveTo(13.4574f, 12.7824f, 13.6143f, 12.7617f, 13.6983f, 12.6522f)
                lineTo(17.1776f, 8.1175f)
                curveTo(17.2616f, 8.008f, 17.241f, 7.851f, 17.1314f, 7.767f)
                curveTo(17.0219f, 7.6829f, 16.865f, 7.7036f, 16.7809f, 7.8132f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1583C4)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2227f, 7.4089f)
                lineTo(13.2672f, 12.4089f)
                curveTo(13.2169f, 12.5375f, 13.2804f, 12.6825f, 13.4089f, 12.7328f)
                curveTo(13.5375f, 12.7831f, 13.6825f, 12.7196f, 13.7328f, 12.5911f)
                lineTo(15.6884f, 7.5911f)
                curveTo(15.7387f, 7.4625f, 15.6752f, 7.3175f, 15.5466f, 7.2672f)
                curveTo(15.418f, 7.2169f, 15.273f, 7.2804f, 15.2227f, 7.4089f)
                close()
            }
            path(fill = SolidColor(Color(0xFF409347)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2608f, 6.5727f)
                curveTo(4.2892f, 6.6663f, 4.3407f, 6.8285f, 4.4105f, 7.0368f)
                curveTo(4.5267f, 7.3838f, 4.6517f, 7.731f, 4.7809f, 8.0559f)
                curveTo(4.9292f, 8.4289f, 5.0738f, 8.7488f, 5.2124f, 9.001f)
                curveTo(5.237f, 9.0457f, 5.2614f, 9.0883f, 5.2856f, 9.1286f)
                curveTo(5.4455f, 9.3952f, 5.6993f, 9.7428f, 6.028f, 10.155f)
                curveTo(6.09f, 10.2329f, 6.1544f, 10.3125f, 6.2209f, 10.3938f)
                curveTo(6.4602f, 10.6866f, 6.7164f, 10.9879f, 6.9724f, 11.2812f)
                curveTo(7.1261f, 11.4572f, 7.2458f, 11.5916f, 7.3145f, 11.6676f)
                curveTo(7.4071f, 11.7701f, 7.5652f, 11.7781f, 7.6676f, 11.6855f)
                curveTo(7.7701f, 11.5929f, 7.7781f, 11.4348f, 7.6855f, 11.3324f)
                curveTo(7.6185f, 11.2583f, 7.5007f, 11.126f, 7.3491f, 10.9523f)
                curveTo(7.0963f, 10.6628f, 6.8435f, 10.3655f, 6.608f, 10.0773f)
                curveTo(6.5427f, 9.9976f, 6.4797f, 9.9195f, 6.4189f, 9.8433f)
                curveTo(6.1029f, 9.447f, 5.8603f, 9.1146f, 5.7144f, 8.8714f)
                curveTo(5.6935f, 8.8366f, 5.6722f, 8.7995f, 5.6506f, 8.7601f)
                curveTo(5.5235f, 8.5289f, 5.3869f, 8.2265f, 5.2455f, 7.8712f)
                curveTo(5.1201f, 7.5558f, 4.9981f, 7.2169f, 4.8846f, 6.8779f)
                curveTo(4.8164f, 6.6745f, 4.7663f, 6.5167f, 4.7392f, 6.4273f)
                curveTo(4.6991f, 6.2952f, 4.5595f, 6.2207f, 4.4273f, 6.2608f)
                curveTo(4.2952f, 6.3009f, 4.2207f, 6.4405f, 4.2608f, 6.5727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1583C4)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.5f)
                lineTo(19.0f, 9.0f)
                curveTo(19.0f, 9.2761f, 19.2239f, 9.5f, 19.5f, 9.5f)
                curveTo(19.7761f, 9.5f, 20.0f, 9.2761f, 20.0f, 9.0f)
                lineTo(20.0f, 6.5f)
                curveTo(20.0f, 6.2239f, 19.7761f, 6.0f, 19.5f, 6.0f)
                curveTo(19.2239f, 6.0f, 19.0f, 6.2239f, 19.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1583C4)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 7.6537f)
                lineTo(1.9642f, 6.3143f)
                curveTo(1.8617f, 6.0579f, 1.5707f, 5.9332f, 1.3143f, 6.0358f)
                curveTo(1.0579f, 6.1383f, 0.9332f, 6.4293f, 1.0358f, 6.6857f)
                lineTo(2.0358f, 9.1857f)
                curveTo(2.2034f, 9.6048f, 2.7966f, 9.6048f, 2.9642f, 9.1857f)
                lineTo(3.9642f, 6.6857f)
                curveTo(4.0668f, 6.4293f, 3.9421f, 6.1383f, 3.6857f, 6.0358f)
                curveTo(3.4293f, 5.9332f, 3.1383f, 6.0579f, 3.0358f, 6.3143f)
                lineTo(2.5f, 7.6537f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF8CE61), 1.0f to Color(0xFFF3C44B), start =
                    Offset(10.4999f,1.9474f), end = Offset(10.4999f,12.7394f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.0f, 6.5f)
                curveTo(15.0f, 6.5f, 15.0357f, 7.1645f, 14.197f, 7.5f)
                curveTo(13.3582f, 7.8355f, 12.5f, 7.5f, 12.5f, 7.5f)
                curveTo(12.5f, 7.5f, 13.1176f, 7.8627f, 13.5f, 8.5f)
                curveTo(13.8824f, 9.1373f, 13.6823f, 9.4833f, 14.0f, 9.801f)
                curveTo(14.3177f, 10.1187f, 14.8913f, 9.902f, 15.1184f, 10.1743f)
                curveTo(15.3455f, 10.4465f, 15.3277f, 10.7581f, 15.0f, 11.0f)
                curveTo(14.6723f, 11.2419f, 14.5683f, 11.1291f, 14.197f, 10.8815f)
                curveTo(13.8256f, 10.634f, 14.0f, 10.3867f, 14.0f, 10.3867f)
                curveTo(14.0f, 10.3867f, 13.3607f, 10.0557f, 12.8722f, 9.9127f)
                curveTo(12.5f, 9.2182f, 12.0f, 9.0f, 12.0f, 9.0f)
                lineTo(12.0f, 9.5f)
                curveTo(12.0f, 9.5f, 13.0f, 10.0128f, 13.0f, 10.5f)
                curveTo(13.0f, 10.713f, 12.5378f, 11.4165f, 12.0f, 11.9169f)
                curveTo(11.3075f, 12.5613f, 10.5f, 12.7394f, 10.5f, 12.7394f)
                lineTo(10.5f, 5.5f)
                lineTo(13.5f, 5.0f)
                curveTo(13.5f, 5.0f, 12.1187f, 3.9132f, 15.25f, 3.1533f)
                curveTo(18.3813f, 2.3933f, 19.0297f, 2.2357f, 19.0297f, 2.2357f)
                curveTo(19.5656f, 2.1055f, 19.7707f, 2.3769f, 19.4722f, 2.8414f)
                curveTo(19.4722f, 2.8414f, 19.448f, 2.94f, 19.0f, 3.5f)
                curveTo(18.552f, 4.06f, 18.4536f, 4.1598f, 18.0f, 4.5f)
                curveTo(17.5464f, 4.8402f, 17.5464f, 4.5902f, 17.0f, 5.0f)
                curveTo(16.4536f, 5.4098f, 16.4334f, 5.7833f, 16.0f, 6.0f)
                curveTo(15.5666f, 6.2167f, 15.0f, 6.0f, 15.0f, 6.0f)
                lineTo(15.0f, 6.5f)
                close()
                moveTo(5.9998f, 6.5f)
                lineTo(5.9998f, 6.0f)
                curveTo(5.9998f, 6.0f, 5.4332f, 6.2167f, 4.9998f, 6.0f)
                curveTo(4.5663f, 5.7833f, 4.5462f, 5.4098f, 3.9998f, 5.0f)
                curveTo(3.4533f, 4.5902f, 3.4533f, 4.8402f, 2.9998f, 4.5f)
                curveTo(2.5462f, 4.1598f, 2.4477f, 4.06f, 1.9998f, 3.5f)
                curveTo(1.5518f, 2.94f, 1.5276f, 2.8414f, 1.5276f, 2.8414f)
                curveTo(1.2291f, 2.3769f, 1.4342f, 2.1055f, 1.9701f, 2.2357f)
                curveTo(1.9701f, 2.2357f, 2.6184f, 2.3933f, 5.7498f, 3.1533f)
                curveTo(8.8811f, 3.9132f, 7.4998f, 5.0f, 7.4998f, 5.0f)
                lineTo(10.4998f, 5.5f)
                lineTo(10.4998f, 12.7394f)
                curveTo(10.4998f, 12.7394f, 9.6922f, 12.5613f, 8.9998f, 11.9169f)
                curveTo(8.462f, 11.4165f, 7.9998f, 10.713f, 7.9998f, 10.5f)
                curveTo(7.9998f, 10.0128f, 8.9998f, 9.5f, 8.9998f, 9.5f)
                lineTo(8.9998f, 9.0f)
                curveTo(8.9998f, 9.0f, 8.4998f, 9.2182f, 8.1276f, 9.9127f)
                curveTo(7.6391f, 10.0557f, 6.9998f, 10.3867f, 6.9998f, 10.3867f)
                curveTo(6.9998f, 10.3867f, 7.1742f, 10.634f, 6.8028f, 10.8815f)
                curveTo(6.4314f, 11.1291f, 6.3274f, 11.2419f, 5.9998f, 11.0f)
                curveTo(5.6721f, 10.7581f, 5.6543f, 10.4465f, 5.8814f, 10.1743f)
                curveTo(6.1084f, 9.902f, 6.6821f, 10.1187f, 6.9998f, 9.801f)
                curveTo(7.3175f, 9.4833f, 7.1174f, 9.1373f, 7.4998f, 8.5f)
                curveTo(7.8821f, 7.8627f, 8.4998f, 7.5f, 8.4998f, 7.5f)
                curveTo(8.4998f, 7.5f, 7.6415f, 7.8355f, 6.8028f, 7.5f)
                curveTo(5.9641f, 7.1645f, 5.9998f, 6.5f, 5.9998f, 6.5f)
                close()
                moveTo(9.2483f, 4.7264f)
                curveTo(9.2275f, 4.5872f, 8.9299f, 4.4758f, 9.0626f, 4.4417f)
                curveTo(9.3102f, 4.3779f, 9.4345f, 4.2991f, 9.5562f, 4.0892f)
                curveTo(9.6096f, 3.9969f, 9.369f, 4.0574f, 9.4474f, 3.9664f)
                curveTo(9.8589f, 3.4892f, 9.9445f, 3.1186f, 9.6807f, 2.9941f)
                curveTo(9.11f, 2.725f, 9.0395f, 3.4205f, 9.0626f, 3.134f)
                curveTo(9.079f, 2.9296f, 9.0997f, 2.7655f, 9.1257f, 2.6827f)
                curveTo(9.2405f, 2.3174f, 9.8232f, 2.3394f, 9.8589f, 2.2678f)
                curveTo(10.0054f, 1.975f, 10.1734f, 1.9474f, 10.5f, 2.0f)
                curveTo(10.8266f, 2.0526f, 10.9752f, 2.2088f, 11.1051f, 2.4686f)
                curveTo(11.2035f, 2.6654f, 11.1753f, 2.9713f, 11.2828f, 3.2632f)
                curveTo(11.3524f, 3.4522f, 11.4538f, 3.5569f, 11.5299f, 3.7459f)
                curveTo(11.5743f, 3.856f, 11.2413f, 3.6383f, 11.2828f, 3.7459f)
                curveTo(11.3962f, 4.0398f, 11.6794f, 4.0272f, 11.8488f, 4.2929f)
                curveTo(11.9182f, 4.4019f, 11.5931f, 4.2733f, 11.6144f, 4.4417f)
                curveTo(11.6288f, 4.5554f, 12.0f, 5.0f, 12.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                curveTo(9.0f, 5.0f, 9.2663f, 4.8469f, 9.2483f, 4.7264f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeAlpha = 0.08f, strokeLineWidth = 0.5f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.1232f, 10.1689f)
                lineTo(14.3695f, 10.2964f)
                lineTo(14.211f, 10.5213f)
                curveTo(14.1982f, 10.555f, 14.2097f, 10.5895f, 14.3356f, 10.6735f)
                curveTo(14.6383f, 10.8753f, 14.6408f, 10.8768f, 14.684f, 10.8836f)
                curveTo(14.7098f, 10.8877f, 14.7522f, 10.8722f, 14.8515f, 10.7989f)
                curveTo(15.0527f, 10.6504f, 15.0699f, 10.5064f, 14.9264f, 10.3344f)
                curveTo(14.895f, 10.2967f, 14.821f, 10.2766f, 14.5984f, 10.2562f)
                curveTo(14.536f, 10.2505f, 14.536f, 10.2505f, 14.4691f, 10.2434f)
                curveTo(14.3366f, 10.2284f, 14.2233f, 10.2057f, 14.1232f, 10.1689f)
                close()
                moveTo(13.9508f, 10.0825f)
                curveTo(13.906f, 10.0529f, 13.8637f, 10.0182f, 13.8232f, 9.9777f)
                curveTo(13.6505f, 9.805f, 13.5897f, 9.6494f, 13.5349f, 9.3514f)
                curveTo(13.4711f, 9.0043f, 13.4308f, 8.8706f, 13.2856f, 8.6286f)
                curveTo(13.197f, 8.4808f, 13.0887f, 8.3402f, 12.965f, 8.2078f)
                curveTo(12.7408f, 7.9676f, 12.5162f, 7.7995f, 12.3734f, 7.7156f)
                lineTo(12.591f, 7.2672f)
                curveTo(12.6283f, 7.2817f, 12.7044f, 7.3061f, 12.8109f, 7.3312f)
                curveTo(13.2212f, 7.4279f, 13.6561f, 7.4322f, 14.0553f, 7.2866f)
                curveTo(14.0797f, 7.2775f, 14.0797f, 7.2775f, 14.1041f, 7.2679f)
                curveTo(14.3197f, 7.1816f, 14.4747f, 7.069f, 14.5812f, 6.9373f)
                curveTo(14.7119f, 6.7757f, 14.7531f, 6.615f, 14.7502f, 6.5099f)
                lineTo(14.7504f, 6.5134f)
                lineTo(14.75f, 6.5f)
                lineTo(14.75f, 5.6367f)
                lineTo(15.0893f, 5.7665f)
                curveTo(15.1113f, 5.7749f, 15.1577f, 5.7898f, 15.2215f, 5.8051f)
                curveTo(15.3857f, 5.8447f, 15.5537f, 5.8588f, 15.7024f, 5.8344f)
                curveTo(15.771f, 5.8232f, 15.8332f, 5.8039f, 15.8882f, 5.7764f)
                curveTo(16.0145f, 5.7132f, 16.0948f, 5.6376f, 16.2129f, 5.4821f)
                curveTo(16.5494f, 5.039f, 16.582f, 5.001f, 16.85f, 4.8f)
                curveTo(17.1171f, 4.5997f, 17.2621f, 4.5339f, 17.4955f, 4.476f)
                lineTo(17.5088f, 4.4727f)
                curveTo(17.6348f, 4.4412f, 17.7036f, 4.4098f, 17.85f, 4.3f)
                curveTo(18.2829f, 3.9753f, 18.3667f, 3.8914f, 18.8048f, 3.3438f)
                curveTo(19.1164f, 2.9543f, 19.2294f, 2.782f, 19.2619f, 2.7063f)
                curveTo(19.4358f, 2.4356f, 19.4099f, 2.4006f, 19.0887f, 2.4786f)
                curveTo(19.0077f, 2.4983f, 19.0077f, 2.4983f, 18.3731f, 2.6524f)
                curveTo(17.6812f, 2.8204f, 16.6789f, 3.0637f, 15.309f, 3.3962f)
                curveTo(14.6502f, 3.5561f, 14.1726f, 3.7361f, 13.8598f, 3.9283f)
                curveTo(13.3907f, 4.2166f, 13.3612f, 4.4397f, 13.5483f, 4.6891f)
                curveTo(13.5905f, 4.7455f, 13.6324f, 4.7861f, 13.6546f, 4.8035f)
                lineTo(14.0995f, 5.1535f)
                lineTo(10.75f, 5.7118f)
                lineTo(10.75f, 12.3979f)
                curveTo(10.7644f, 12.3924f, 10.7791f, 12.3866f, 10.7942f, 12.3806f)
                curveTo(11.0646f, 12.273f, 11.3352f, 12.1268f, 11.5868f, 11.9372f)
                curveTo(11.6714f, 11.8735f, 11.7524f, 11.8058f, 11.8297f, 11.7339f)
                curveTo(12.2872f, 11.3082f, 12.75f, 10.637f, 12.75f, 10.5f)
                curveTo(12.75f, 10.4927f, 12.7492f, 10.4847f, 12.7476f, 10.4759f)
                curveTo(12.7262f, 10.3606f, 12.5803f, 10.1915f, 12.3492f, 10.0167f)
                curveTo(12.1753f, 9.8851f, 11.9991f, 9.7805f, 11.8859f, 9.7225f)
                lineTo(11.75f, 9.6528f)
                lineTo(11.75f, 8.6181f)
                lineTo(12.1f, 8.7709f)
                curveTo(12.2943f, 8.8557f, 12.5658f, 9.0509f, 12.8315f, 9.3919f)
                curveTo(12.9064f, 9.4881f, 12.9767f, 9.5918f, 13.0417f, 9.7035f)
                curveTo(13.1084f, 9.7252f, 13.1784f, 9.75f, 13.2515f, 9.7777f)
                curveTo(13.3389f, 9.8108f, 13.4297f, 9.8476f, 13.5231f, 9.8875f)
                curveTo(13.6829f, 9.9558f, 13.8303f, 10.024f, 13.9508f, 10.0825f)
                close()
                moveTo(13.9508f, 10.0825f)
                curveTo(14.0134f, 10.1129f, 14.0688f, 10.1407f, 14.1149f, 10.1646f)
                lineTo(14.1232f, 10.1689f)
                curveTo(14.0611f, 10.1461f, 14.0041f, 10.1178f, 13.9508f, 10.0825f)
                close()
                moveTo(10.2498f, 5.7118f)
                lineTo(10.4587f, 5.7466f)
                lineTo(10.2498f, 5.5f)
                lineTo(10.2498f, 5.7118f)
                close()
                moveTo(10.2498f, 12.3979f)
                lineTo(10.2498f, 12.7394f)
                lineTo(10.5536f, 12.4952f)
                curveTo(10.4948f, 12.4823f, 10.3887f, 12.4512f, 10.2498f, 12.3979f)
                close()
                moveTo(7.9581f, 9.7035f)
                curveTo(7.9408f, 9.7333f, 7.9238f, 9.7636f, 7.9072f, 9.7946f)
                lineTo(8.0573f, 9.6727f)
                curveTo(8.0251f, 9.6822f, 7.9921f, 9.6924f, 7.9581f, 9.7035f)
                close()
                moveTo(6.7888f, 10.5213f)
                lineTo(6.7955f, 10.5307f)
                curveTo(6.7871f, 10.5179f, 6.7883f, 10.5199f, 6.7882f, 10.5197f)
                curveTo(6.7884f, 10.5203f, 6.7886f, 10.5208f, 6.7888f, 10.5213f)
                close()
                moveTo(7.049f, 10.0825f)
                curveTo(6.9864f, 10.1129f, 6.931f, 10.1407f, 6.8848f, 10.1646f)
                lineTo(6.8766f, 10.1689f)
                curveTo(6.9387f, 10.1461f, 6.9956f, 10.1178f, 7.049f, 10.0825f)
                close()
                moveTo(9.4991f, 4.75f)
                lineTo(11.4946f, 4.75f)
                curveTo(11.4172f, 4.6361f, 11.3768f, 4.5552f, 11.3664f, 4.473f)
                curveTo(11.3538f, 4.3735f, 11.3709f, 4.297f, 11.4088f, 4.2397f)
                curveTo(11.2198f, 4.1197f, 11.1216f, 4.0227f, 11.0495f, 3.8359f)
                curveTo(10.998f, 3.7024f, 11.0417f, 3.5885f, 11.1268f, 3.5235f)
                curveTo(11.0946f, 3.4638f, 11.0714f, 3.4128f, 11.0482f, 3.3496f)
                curveTo(11.0338f, 3.3106f, 11.0211f, 3.2705f, 11.0098f, 3.2292f)
                curveTo(10.9795f, 3.1181f, 10.9681f, 3.0493f, 10.9409f, 2.8497f)
                curveTo(10.9198f, 2.6951f, 10.9052f, 2.6278f, 10.8815f, 2.5804f)
                curveTo(10.7714f, 2.3601f, 10.6767f, 2.2817f, 10.4602f, 2.2468f)
                curveTo(10.1996f, 2.2048f, 10.1633f, 2.2181f, 10.0826f, 2.3796f)
                curveTo(10.0285f, 2.4878f, 9.9713f, 2.5127f, 9.8449f, 2.5448f)
                curveTo(9.8867f, 2.5342f, 9.629f, 2.5922f, 9.5626f, 2.6144f)
                curveTo(9.5024f, 2.6345f, 9.4571f, 2.6564f, 9.4246f, 2.6803f)
                curveTo(9.5362f, 2.6792f, 9.6579f, 2.707f, 9.7873f, 2.768f)
                curveTo(10.2187f, 2.9715f, 10.161f, 3.4316f, 9.7858f, 3.943f)
                curveTo(9.828f, 4.0272f, 9.8223f, 4.1285f, 9.7724f, 4.2145f)
                curveTo(9.6816f, 4.3713f, 9.5828f, 4.4783f, 9.4512f, 4.5565f)
                curveTo(9.4733f, 4.596f, 9.488f, 4.6391f, 9.4956f, 4.6895f)
                curveTo(9.4986f, 4.71f, 9.4997f, 4.7302f, 9.4991f, 4.75f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 6.5f)
                lineTo(8.0f, 4.0f)
                curveTo(8.0f, 4.0f, 8.4985f, 4.489f, 9.1628f, 4.489f)
                curveTo(9.8272f, 4.489f, 10.5f, 4.0f, 10.5f, 4.0f)
                curveTo(10.5f, 4.0f, 11.1266f, 4.489f, 11.7511f, 4.489f)
                curveTo(12.3756f, 4.489f, 13.0f, 4.0f, 13.0f, 4.0f)
                lineTo(13.0f, 6.5f)
                curveTo(13.0f, 9.0f, 10.5f, 10.0f, 10.5f, 10.0f)
                curveTo(10.5f, 10.0f, 8.0f, 9.0f, 8.0f, 6.5f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF1E357F), 1.0f to Color(0xFF162966),
                        start = Offset(10.5f,4.0f), end = Offset(10.5f,6.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 4.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(2.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFBC1443), 1.0f to Color(0xFFA30B35),
                        start = Offset(10.5f,6.0f), end = Offset(10.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 6.0f)
                    lineTo(9.0f, 6.0f)
                    lineTo(9.0f, 10.0f)
                    lineTo(8.0f, 10.0f)
                    lineTo(8.0f, 6.0f)
                    close()
                    moveTo(10.0f, 6.0f)
                    lineTo(11.0f, 6.0f)
                    lineTo(11.0f, 10.0f)
                    lineTo(10.0f, 10.0f)
                    lineTo(10.0f, 6.0f)
                    close()
                    moveTo(12.0f, 6.0f)
                    lineTo(13.0f, 6.0f)
                    lineTo(13.0f, 10.0f)
                    lineTo(12.0f, 10.0f)
                    lineTo(12.0f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _vi!!
    }

private var _vi: ImageVector? = null
