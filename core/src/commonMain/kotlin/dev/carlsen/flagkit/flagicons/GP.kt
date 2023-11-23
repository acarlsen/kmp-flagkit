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

val FlagIcons.GP: ImageVector
    get() {
        if (_gp != null) {
            return _gp!!
        }
        _gp = Builder(name = "Gp", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF25A057), 1.0f to Color(0xFF1C8245), start =
                    Offset(10.5f,3.002f), end = Offset(10.5f,8.002f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.25f, 3.002f)
                lineTo(12.75f, 3.002f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 13.0f, 3.252f)
                lineTo(13.0f, 7.752f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 12.75f, 8.002f)
                lineTo(8.25f, 8.002f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 8.0f, 7.752f)
                lineTo(8.0f, 3.252f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 8.25f, 3.002f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF31B8F4), 1.0f to Color(0xFF1EA2DC), start =
                    Offset(9.97225f,3.002f), end = Offset(9.97225f,7.8976f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 3.2432f)
                curveTo(8.0f, 3.11f, 8.1154f, 3.002f, 8.2502f, 3.002f)
                lineTo(11.7498f, 3.002f)
                curveTo(11.888f, 3.002f, 11.9445f, 3.0955f, 11.8753f, 3.212f)
                lineTo(10.5375f, 5.4645f)
                lineTo(8.1825f, 5.8195f)
                lineTo(8.0209f, 7.7517f)
                curveTo(8.0094f, 7.8899f, 8.0f, 7.8976f, 8.0f, 7.7609f)
                lineTo(8.0f, 3.2432f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE149), 1.0f to Color(0xFFFFDD32), start =
                    Offset(8.0f,3.5019999f), end = Offset(8.0f,6.502f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 5.002f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE149), 1.0f to Color(0xFFFFDD32), start =
                    Offset(10.5f,11.002f), end = Offset(10.5f,12.002f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.25f, 11.002f)
                lineTo(12.75f, 11.002f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 13.0f, 11.252f)
                lineTo(13.0f, 11.752f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 12.75f, 12.002f)
                lineTo(8.25f, 12.002f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 8.0f, 11.752f)
                lineTo(8.0f, 11.252f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 8.25f, 11.002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.1406f, 8.9523f)
                lineTo(8.16f, 8.9523f)
                curveTo(8.2f, 8.9523f, 8.2309f, 8.99f, 8.2309f, 9.0403f)
                lineTo(8.2309f, 9.286f)
                curveTo(8.2309f, 9.3249f, 8.2514f, 9.3592f, 8.304f, 9.3592f)
                lineTo(8.3634f, 9.3592f)
                curveTo(8.3691f, 9.3592f, 8.3749f, 9.3592f, 8.3749f, 9.3557f)
                curveTo(8.3749f, 9.3523f, 8.3703f, 9.3477f, 8.3657f, 9.3432f)
                lineTo(8.3291f, 9.3043f)
                curveTo(8.3234f, 9.2986f, 8.3189f, 9.2917f, 8.3189f, 9.2837f)
                lineTo(8.3189f, 9.0449f)
                curveTo(8.3189f, 8.982f, 8.2846f, 8.9374f, 8.2457f, 8.9169f)
                curveTo(8.2857f, 8.8917f, 8.3303f, 8.8403f, 8.3303f, 8.7134f)
                curveTo(8.3303f, 8.5649f, 8.2686f, 8.502f, 8.1497f, 8.502f)
                lineTo(8.0069f, 8.502f)
                curveTo(8.0023f, 8.502f, 8.0f, 8.5054f, 8.0f, 8.5089f)
                curveTo(8.0f, 8.5123f, 8.0057f, 8.5157f, 8.008f, 8.5192f)
                lineTo(8.0423f, 8.5523f)
                curveTo(8.0503f, 8.5603f, 8.0526f, 8.5706f, 8.0526f, 8.5843f)
                lineTo(8.0526f, 9.2769f)
                curveTo(8.0526f, 9.2906f, 8.0503f, 9.3009f, 8.0423f, 9.3089f)
                lineTo(8.008f, 9.342f)
                curveTo(8.0057f, 9.3454f, 8.0f, 9.3489f, 8.0f, 9.3523f)
                curveTo(8.0f, 9.3557f, 8.0023f, 9.3592f, 8.0069f, 9.3592f)
                lineTo(8.1863f, 9.3592f)
                curveTo(8.1909f, 9.3592f, 8.1931f, 9.3557f, 8.1931f, 9.3523f)
                curveTo(8.1931f, 9.3489f, 8.1874f, 9.3454f, 8.1851f, 9.342f)
                lineTo(8.1509f, 9.3089f)
                curveTo(8.1429f, 9.3009f, 8.1406f, 9.2906f, 8.1406f, 9.2769f)
                lineTo(8.1406f, 8.9523f)
                close()
                moveTo(8.1406f, 8.5592f)
                lineTo(8.1577f, 8.5592f)
                curveTo(8.2137f, 8.5592f, 8.2366f, 8.5969f, 8.2366f, 8.7134f)
                curveTo(8.2366f, 8.8506f, 8.2137f, 8.8952f, 8.1577f, 8.8952f)
                lineTo(8.1406f, 8.8952f)
                lineTo(8.1406f, 8.5592f)
                close()
                moveTo(8.5291f, 8.5592f)
                lineTo(8.5943f, 8.5592f)
                curveTo(8.6091f, 8.5592f, 8.6194f, 8.566f, 8.624f, 8.5809f)
                lineTo(8.6857f, 8.7957f)
                curveTo(8.6869f, 8.8003f, 8.6903f, 8.8037f, 8.6949f, 8.8037f)
                curveTo(8.6983f, 8.8037f, 8.7006f, 8.8014f, 8.7006f, 8.7969f)
                lineTo(8.7006f, 8.5123f)
                curveTo(8.7006f, 8.5066f, 8.696f, 8.502f, 8.6914f, 8.502f)
                lineTo(8.3954f, 8.502f)
                curveTo(8.3909f, 8.502f, 8.3886f, 8.5054f, 8.3886f, 8.5089f)
                curveTo(8.3886f, 8.5123f, 8.3943f, 8.5157f, 8.3966f, 8.5192f)
                lineTo(8.4309f, 8.5523f)
                curveTo(8.4389f, 8.5603f, 8.4411f, 8.5706f, 8.4411f, 8.5843f)
                lineTo(8.4411f, 9.2769f)
                curveTo(8.4411f, 9.2906f, 8.4389f, 9.3009f, 8.4309f, 9.3089f)
                lineTo(8.3966f, 9.342f)
                curveTo(8.3943f, 9.3466f, 8.3886f, 9.3489f, 8.3886f, 9.3523f)
                curveTo(8.3886f, 9.3557f, 8.3909f, 9.3592f, 8.3954f, 9.3592f)
                lineTo(8.6914f, 9.3592f)
                curveTo(8.6971f, 9.3592f, 8.7006f, 9.3546f, 8.7006f, 9.3489f)
                lineTo(8.7006f, 9.062f)
                curveTo(8.7006f, 9.0586f, 8.6983f, 9.0552f, 8.6949f, 9.0552f)
                curveTo(8.6914f, 9.0552f, 8.688f, 9.0574f, 8.6869f, 9.062f)
                lineTo(8.6251f, 9.2814f)
                curveTo(8.6206f, 9.2952f, 8.6091f, 9.302f, 8.5943f, 9.302f)
                lineTo(8.5291f, 9.302f)
                lineTo(8.5291f, 8.9546f)
                lineTo(8.5543f, 8.9546f)
                curveTo(8.56f, 8.9546f, 8.5646f, 8.9569f, 8.5669f, 8.9626f)
                lineTo(8.6057f, 9.046f)
                curveTo(8.608f, 9.0506f, 8.6091f, 9.054f, 8.6137f, 9.054f)
                curveTo(8.6171f, 9.054f, 8.6183f, 9.0517f, 8.6183f, 9.0483f)
                lineTo(8.6183f, 8.806f)
                curveTo(8.6183f, 8.8014f, 8.6171f, 8.7992f, 8.6137f, 8.7992f)
                curveTo(8.6103f, 8.7992f, 8.6091f, 8.8014f, 8.6069f, 8.806f)
                lineTo(8.5669f, 8.886f)
                curveTo(8.5646f, 8.8917f, 8.56f, 8.894f, 8.5543f, 8.894f)
                lineTo(8.5291f, 8.894f)
                lineTo(8.5291f, 8.5592f)
                close()
                moveTo(8.9691f, 9.15f)
                curveTo(8.9691f, 9.2586f, 8.944f, 9.302f, 8.9086f, 9.302f)
                curveTo(8.8674f, 9.302f, 8.8537f, 9.238f, 8.8537f, 8.9089f)
                curveTo(8.8537f, 8.6677f, 8.8674f, 8.5592f, 8.9154f, 8.5592f)
                curveTo(8.9657f, 8.5592f, 9.0149f, 8.7066f, 9.0389f, 8.7923f)
                curveTo(9.0411f, 8.7992f, 9.0446f, 8.8037f, 9.0491f, 8.8037f)
                curveTo(9.0526f, 8.8037f, 9.0549f, 8.8003f, 9.0549f, 8.7957f)
                lineTo(9.0549f, 8.5214f)
                curveTo(9.0549f, 8.51f, 9.0526f, 8.502f, 9.0469f, 8.502f)
                curveTo(9.0411f, 8.502f, 9.0343f, 8.5077f, 9.024f, 8.5169f)
                curveTo(9.0126f, 8.5272f, 9.0011f, 8.5352f, 8.9954f, 8.5352f)
                curveTo(8.9909f, 8.5352f, 8.9829f, 8.5317f, 8.9783f, 8.5283f)
                curveTo(8.9669f, 8.5192f, 8.944f, 8.502f, 8.9063f, 8.502f)
                curveTo(8.7657f, 8.502f, 8.76f, 8.7672f, 8.76f, 8.9077f)
                curveTo(8.76f, 9.0986f, 8.7657f, 9.3592f, 8.9086f, 9.3592f)
                curveTo(8.9337f, 9.3592f, 8.9566f, 9.3454f, 8.9806f, 9.3237f)
                curveTo(8.9851f, 9.3203f, 8.9886f, 9.3192f, 8.992f, 9.3192f)
                curveTo(8.9966f, 9.3192f, 8.9989f, 9.3203f, 9.0034f, 9.3237f)
                lineTo(9.0377f, 9.3546f)
                curveTo(9.04f, 9.3569f, 9.0446f, 9.3592f, 9.0491f, 9.3592f)
                curveTo(9.0526f, 9.3592f, 9.0549f, 9.3569f, 9.0549f, 9.3534f)
                lineTo(9.0549f, 8.9946f)
                curveTo(9.0549f, 8.9832f, 9.0583f, 8.9752f, 9.0663f, 8.9694f)
                lineTo(9.0994f, 8.942f)
                curveTo(9.1029f, 8.9374f, 9.1051f, 8.9352f, 9.1051f, 8.9306f)
                curveTo(9.1051f, 8.926f, 9.1017f, 8.9237f, 9.0971f, 8.9237f)
                lineTo(8.928f, 8.9237f)
                curveTo(8.9223f, 8.9237f, 8.9189f, 8.926f, 8.9189f, 8.9306f)
                curveTo(8.9189f, 8.9352f, 8.92f, 8.9374f, 8.9246f, 8.942f)
                lineTo(8.9566f, 8.9694f)
                curveTo(8.9646f, 8.9763f, 8.9691f, 8.9832f, 8.9691f, 8.9946f)
                lineTo(8.9691f, 9.15f)
                close()
                moveTo(9.1714f, 9.2769f)
                curveTo(9.1714f, 9.2906f, 9.1691f, 9.3009f, 9.1611f, 9.3089f)
                lineTo(9.1269f, 9.342f)
                curveTo(9.1246f, 9.3454f, 9.1189f, 9.3489f, 9.1189f, 9.3523f)
                curveTo(9.1189f, 9.3557f, 9.1211f, 9.3592f, 9.1257f, 9.3592f)
                lineTo(9.3051f, 9.3592f)
                curveTo(9.3097f, 9.3592f, 9.312f, 9.3557f, 9.312f, 9.3523f)
                curveTo(9.312f, 9.3489f, 9.3063f, 9.3454f, 9.304f, 9.342f)
                lineTo(9.2697f, 9.3089f)
                curveTo(9.2617f, 9.3009f, 9.2594f, 9.2906f, 9.2594f, 9.2769f)
                lineTo(9.2594f, 8.5843f)
                curveTo(9.2594f, 8.5706f, 9.2617f, 8.5603f, 9.2697f, 8.5523f)
                lineTo(9.304f, 8.5192f)
                curveTo(9.3063f, 8.5157f, 9.312f, 8.5123f, 9.312f, 8.5089f)
                curveTo(9.312f, 8.5054f, 9.3097f, 8.502f, 9.3051f, 8.502f)
                lineTo(9.1257f, 8.502f)
                curveTo(9.1211f, 8.502f, 9.1189f, 8.5054f, 9.1189f, 8.5089f)
                curveTo(9.1189f, 8.5123f, 9.1246f, 8.5157f, 9.1269f, 8.5192f)
                lineTo(9.1611f, 8.5523f)
                curveTo(9.1691f, 8.5603f, 9.1714f, 8.5706f, 9.1714f, 8.5843f)
                lineTo(9.1714f, 9.2769f)
                close()
                moveTo(9.5097f, 8.502f)
                curveTo(9.3726f, 8.502f, 9.3577f, 8.7432f, 9.3577f, 8.9077f)
                curveTo(9.3577f, 9.1237f, 9.3726f, 9.3592f, 9.5097f, 9.3592f)
                curveTo(9.648f, 9.3592f, 9.6629f, 9.1237f, 9.6629f, 8.9077f)
                curveTo(9.6629f, 8.7432f, 9.648f, 8.502f, 9.5097f, 8.502f)
                lineTo(9.5097f, 8.502f)
                close()
                moveTo(9.5097f, 8.5592f)
                curveTo(9.544f, 8.5592f, 9.5691f, 8.6552f, 9.5691f, 8.9089f)
                curveTo(9.5691f, 9.206f, 9.544f, 9.302f, 9.5097f, 9.302f)
                curveTo(9.4766f, 9.302f, 9.4514f, 9.206f, 9.4514f, 8.9089f)
                curveTo(9.4514f, 8.6552f, 9.4766f, 8.5592f, 9.5097f, 8.5592f)
                lineTo(9.5097f, 8.5592f)
                close()
                moveTo(9.7554f, 9.2769f)
                curveTo(9.7554f, 9.2906f, 9.752f, 9.2997f, 9.7451f, 9.3089f)
                lineTo(9.7166f, 9.342f)
                curveTo(9.7143f, 9.3454f, 9.7086f, 9.3489f, 9.7086f, 9.3534f)
                curveTo(9.7086f, 9.3557f, 9.7109f, 9.3592f, 9.7154f, 9.3592f)
                lineTo(9.8663f, 9.3592f)
                curveTo(9.8709f, 9.3592f, 9.8731f, 9.3557f, 9.8731f, 9.3534f)
                curveTo(9.8731f, 9.3489f, 9.8686f, 9.3454f, 9.8651f, 9.342f)
                lineTo(9.8343f, 9.3077f)
                curveTo(9.8263f, 9.2997f, 9.8229f, 9.2906f, 9.8229f, 9.2769f)
                lineTo(9.8229f, 8.7077f)
                lineTo(9.8251f, 8.7077f)
                lineTo(9.9589f, 9.3306f)
                curveTo(9.9623f, 9.3477f, 9.9714f, 9.3592f, 9.9817f, 9.3592f)
                lineTo(10.0297f, 9.3592f)
                curveTo(10.0377f, 9.3592f, 10.0411f, 9.3546f, 10.0411f, 9.3466f)
                lineTo(10.0411f, 8.5843f)
                curveTo(10.0411f, 8.5706f, 10.0446f, 8.5614f, 10.0514f, 8.5523f)
                lineTo(10.08f, 8.5192f)
                curveTo(10.0834f, 8.5157f, 10.088f, 8.5123f, 10.088f, 8.5077f)
                curveTo(10.088f, 8.5054f, 10.0857f, 8.502f, 10.0811f, 8.502f)
                lineTo(9.9303f, 8.502f)
                curveTo(9.9257f, 8.502f, 9.9234f, 8.5054f, 9.9234f, 8.5077f)
                curveTo(9.9234f, 8.5123f, 9.9291f, 8.5157f, 9.9314f, 8.5192f)
                lineTo(9.9634f, 8.5534f)
                curveTo(9.9714f, 8.5614f, 9.9737f, 8.5706f, 9.9737f, 8.5843f)
                lineTo(9.9737f, 9.0129f)
                lineTo(9.9714f, 9.0129f)
                lineTo(9.8663f, 8.5214f)
                curveTo(9.864f, 8.51f, 9.8606f, 8.502f, 9.8526f, 8.502f)
                lineTo(9.7154f, 8.502f)
                curveTo(9.7109f, 8.502f, 9.7086f, 8.5054f, 9.7086f, 8.5077f)
                curveTo(9.7086f, 8.5123f, 9.7143f, 8.5157f, 9.7166f, 8.5192f)
                lineTo(9.7451f, 8.5523f)
                curveTo(9.752f, 8.5614f, 9.7554f, 8.5706f, 9.7554f, 8.5843f)
                lineTo(9.7554f, 9.2769f)
                close()
                moveTo(8.2274f, 10.2929f)
                curveTo(8.2274f, 10.4014f, 8.2023f, 10.4449f, 8.1669f, 10.4449f)
                curveTo(8.1257f, 10.4449f, 8.112f, 10.3809f, 8.112f, 10.0517f)
                curveTo(8.112f, 9.8106f, 8.1257f, 9.702f, 8.1737f, 9.702f)
                curveTo(8.224f, 9.702f, 8.2731f, 9.8494f, 8.2971f, 9.9352f)
                curveTo(8.2994f, 9.942f, 8.3029f, 9.9466f, 8.3074f, 9.9466f)
                curveTo(8.3109f, 9.9466f, 8.3131f, 9.9432f, 8.3131f, 9.9386f)
                lineTo(8.3131f, 9.6643f)
                curveTo(8.3131f, 9.6529f, 8.3109f, 9.6449f, 8.3051f, 9.6449f)
                curveTo(8.2994f, 9.6449f, 8.2926f, 9.6506f, 8.2823f, 9.6597f)
                curveTo(8.2709f, 9.67f, 8.2594f, 9.678f, 8.2537f, 9.678f)
                curveTo(8.2491f, 9.678f, 8.2411f, 9.6746f, 8.2366f, 9.6712f)
                curveTo(8.2251f, 9.662f, 8.2023f, 9.6449f, 8.1646f, 9.6449f)
                curveTo(8.024f, 9.6449f, 8.0183f, 9.91f, 8.0183f, 10.0506f)
                curveTo(8.0183f, 10.2414f, 8.024f, 10.502f, 8.1669f, 10.502f)
                curveTo(8.192f, 10.502f, 8.2149f, 10.4883f, 8.2389f, 10.4666f)
                curveTo(8.2434f, 10.4632f, 8.2469f, 10.462f, 8.2503f, 10.462f)
                curveTo(8.2549f, 10.462f, 8.2571f, 10.4632f, 8.2617f, 10.4666f)
                lineTo(8.296f, 10.4974f)
                curveTo(8.2983f, 10.4997f, 8.3029f, 10.502f, 8.3074f, 10.502f)
                curveTo(8.3109f, 10.502f, 8.3131f, 10.4997f, 8.3131f, 10.4963f)
                lineTo(8.3131f, 10.1374f)
                curveTo(8.3131f, 10.126f, 8.3166f, 10.118f, 8.3246f, 10.1123f)
                lineTo(8.3577f, 10.0849f)
                curveTo(8.3611f, 10.0803f, 8.3634f, 10.078f, 8.3634f, 10.0734f)
                curveTo(8.3634f, 10.0689f, 8.36f, 10.0666f, 8.3554f, 10.0666f)
                lineTo(8.1863f, 10.0666f)
                curveTo(8.1806f, 10.0666f, 8.1771f, 10.0689f, 8.1771f, 10.0734f)
                curveTo(8.1771f, 10.078f, 8.1783f, 10.0803f, 8.1829f, 10.0849f)
                lineTo(8.2149f, 10.1123f)
                curveTo(8.2229f, 10.1192f, 8.2274f, 10.126f, 8.2274f, 10.1374f)
                lineTo(8.2274f, 10.2929f)
                close()
                moveTo(8.4183f, 10.3786f)
                curveTo(8.4183f, 10.4494f, 8.4651f, 10.502f, 8.5554f, 10.502f)
                curveTo(8.6331f, 10.502f, 8.688f, 10.4494f, 8.688f, 10.3786f)
                lineTo(8.688f, 9.7272f)
                curveTo(8.688f, 9.7134f, 8.6914f, 9.702f, 8.6971f, 9.6952f)
                lineTo(8.7326f, 9.662f)
                curveTo(8.736f, 9.6586f, 8.7383f, 9.6552f, 8.7383f, 9.6517f)
                curveTo(8.7383f, 9.6483f, 8.736f, 9.6449f, 8.7314f, 9.6449f)
                lineTo(8.5749f, 9.6449f)
                curveTo(8.5703f, 9.6449f, 8.568f, 9.6483f, 8.568f, 9.6517f)
                curveTo(8.568f, 9.6552f, 8.5703f, 9.6586f, 8.5737f, 9.662f)
                lineTo(8.6091f, 9.6952f)
                curveTo(8.616f, 9.702f, 8.6183f, 9.7134f, 8.6183f, 9.7272f)
                lineTo(8.6183f, 10.3489f)
                curveTo(8.6183f, 10.3992f, 8.6069f, 10.4449f, 8.5646f, 10.4449f)
                curveTo(8.5109f, 10.4449f, 8.5063f, 10.3992f, 8.5063f, 10.3489f)
                lineTo(8.5063f, 9.7272f)
                curveTo(8.5063f, 9.7134f, 8.5097f, 9.702f, 8.5154f, 9.6952f)
                lineTo(8.5509f, 9.662f)
                curveTo(8.5543f, 9.6586f, 8.5566f, 9.6552f, 8.5566f, 9.6517f)
                curveTo(8.5566f, 9.6483f, 8.5543f, 9.6449f, 8.5497f, 9.6449f)
                lineTo(8.3749f, 9.6449f)
                curveTo(8.3703f, 9.6449f, 8.368f, 9.6483f, 8.368f, 9.6517f)
                curveTo(8.368f, 9.6552f, 8.3703f, 9.6586f, 8.3737f, 9.662f)
                lineTo(8.4091f, 9.6952f)
                curveTo(8.416f, 9.702f, 8.4183f, 9.7134f, 8.4183f, 9.7272f)
                lineTo(8.4183f, 10.3786f)
                close()
                moveTo(8.9851f, 10.4312f)
                curveTo(8.9863f, 10.4414f, 8.984f, 10.4494f, 8.9794f, 10.454f)
                lineTo(8.9486f, 10.4849f)
                curveTo(8.9451f, 10.4883f, 8.9406f, 10.4917f, 8.9406f, 10.4952f)
                curveTo(8.9406f, 10.4986f, 8.9429f, 10.502f, 8.9486f, 10.502f)
                lineTo(9.1131f, 10.502f)
                curveTo(9.1189f, 10.502f, 9.1211f, 10.4986f, 9.1211f, 10.4952f)
                curveTo(9.1211f, 10.4917f, 9.1177f, 10.4883f, 9.1143f, 10.4849f)
                lineTo(9.0811f, 10.4552f)
                curveTo(9.0731f, 10.4483f, 9.0697f, 10.4357f, 9.0686f, 10.4243f)
                lineTo(8.96f, 9.6574f)
                curveTo(8.9589f, 9.6506f, 8.9554f, 9.6449f, 8.9497f, 9.6449f)
                lineTo(8.9074f, 9.6449f)
                curveTo(8.9017f, 9.6449f, 8.8994f, 9.6494f, 8.8983f, 9.6552f)
                lineTo(8.7943f, 10.4232f)
                curveTo(8.7931f, 10.4334f, 8.792f, 10.4449f, 8.7851f, 10.4517f)
                lineTo(8.7531f, 10.4837f)
                curveTo(8.7497f, 10.4872f, 8.7451f, 10.4917f, 8.7451f, 10.4952f)
                curveTo(8.7451f, 10.4986f, 8.7474f, 10.502f, 8.752f, 10.502f)
                lineTo(8.8834f, 10.502f)
                curveTo(8.8891f, 10.502f, 8.8914f, 10.4986f, 8.8914f, 10.4952f)
                curveTo(8.8914f, 10.4917f, 8.8846f, 10.4872f, 8.88f, 10.4814f)
                lineTo(8.8549f, 10.4552f)
                curveTo(8.8503f, 10.4494f, 8.848f, 10.4426f, 8.8491f, 10.4346f)
                lineTo(8.8663f, 10.3089f)
                curveTo(8.8674f, 10.3043f, 8.8697f, 10.3009f, 8.8731f, 10.3009f)
                lineTo(8.9577f, 10.3009f)
                curveTo(8.9634f, 10.3009f, 8.9669f, 10.3054f, 8.968f, 10.3112f)
                lineTo(8.9851f, 10.4312f)
                close()
                moveTo(8.88f, 10.2403f)
                curveTo(8.8777f, 10.2403f, 8.8754f, 10.238f, 8.8766f, 10.2334f)
                lineTo(8.9143f, 9.9523f)
                lineTo(8.9166f, 9.9523f)
                lineTo(8.9566f, 10.2323f)
                curveTo(8.9577f, 10.2369f, 8.9554f, 10.2403f, 8.952f, 10.2403f)
                lineTo(8.88f, 10.2403f)
                close()
                moveTo(9.1897f, 10.4197f)
                curveTo(9.1897f, 10.4334f, 9.1874f, 10.4437f, 9.1794f, 10.4517f)
                lineTo(9.1451f, 10.4849f)
                curveTo(9.1429f, 10.4894f, 9.1371f, 10.4917f, 9.1371f, 10.4952f)
                curveTo(9.1371f, 10.4986f, 9.1394f, 10.502f, 9.144f, 10.502f)
                lineTo(9.2949f, 10.502f)
                curveTo(9.4103f, 10.502f, 9.4789f, 10.4243f, 9.4789f, 10.0517f)
                curveTo(9.4789f, 9.7557f, 9.4103f, 9.6449f, 9.2949f, 9.6449f)
                lineTo(9.144f, 9.6449f)
                curveTo(9.1394f, 9.6449f, 9.1371f, 9.6483f, 9.1371f, 9.6517f)
                curveTo(9.1371f, 9.6552f, 9.1429f, 9.6586f, 9.1451f, 9.662f)
                lineTo(9.1794f, 9.6952f)
                curveTo(9.1874f, 9.7032f, 9.1897f, 9.7134f, 9.1897f, 9.7272f)
                lineTo(9.1897f, 10.4197f)
                close()
                moveTo(9.2777f, 9.702f)
                lineTo(9.2983f, 9.702f)
                curveTo(9.3429f, 9.702f, 9.3851f, 9.7454f, 9.3851f, 10.0517f)
                curveTo(9.3851f, 10.4014f, 9.3429f, 10.4449f, 9.2983f, 10.4449f)
                lineTo(9.2777f, 10.4449f)
                lineTo(9.2777f, 9.702f)
                close()
                moveTo(9.6651f, 9.702f)
                lineTo(9.7303f, 9.702f)
                curveTo(9.7451f, 9.702f, 9.7554f, 9.7089f, 9.76f, 9.7237f)
                lineTo(9.8217f, 9.9386f)
                curveTo(9.8229f, 9.9432f, 9.8263f, 9.9466f, 9.8309f, 9.9466f)
                curveTo(9.8343f, 9.9466f, 9.8366f, 9.9443f, 9.8366f, 9.9397f)
                lineTo(9.8366f, 9.6552f)
                curveTo(9.8366f, 9.6494f, 9.832f, 9.6449f, 9.8274f, 9.6449f)
                lineTo(9.5314f, 9.6449f)
                curveTo(9.5269f, 9.6449f, 9.5246f, 9.6483f, 9.5246f, 9.6517f)
                curveTo(9.5246f, 9.6552f, 9.5303f, 9.6586f, 9.5326f, 9.662f)
                lineTo(9.5669f, 9.6952f)
                curveTo(9.5749f, 9.7032f, 9.5771f, 9.7134f, 9.5771f, 9.7272f)
                lineTo(9.5771f, 10.4197f)
                curveTo(9.5771f, 10.4334f, 9.5749f, 10.4437f, 9.5669f, 10.4517f)
                lineTo(9.5326f, 10.4849f)
                curveTo(9.5303f, 10.4894f, 9.5246f, 10.4917f, 9.5246f, 10.4952f)
                curveTo(9.5246f, 10.4986f, 9.5269f, 10.502f, 9.5314f, 10.502f)
                lineTo(9.8274f, 10.502f)
                curveTo(9.8331f, 10.502f, 9.8366f, 10.4974f, 9.8366f, 10.4917f)
                lineTo(9.8366f, 10.2049f)
                curveTo(9.8366f, 10.2014f, 9.8343f, 10.198f, 9.8309f, 10.198f)
                curveTo(9.8274f, 10.198f, 9.824f, 10.2003f, 9.8229f, 10.2049f)
                lineTo(9.7611f, 10.4243f)
                curveTo(9.7566f, 10.438f, 9.7451f, 10.4449f, 9.7303f, 10.4449f)
                lineTo(9.6651f, 10.4449f)
                lineTo(9.6651f, 10.0974f)
                lineTo(9.6903f, 10.0974f)
                curveTo(9.696f, 10.0974f, 9.7006f, 10.0997f, 9.7029f, 10.1054f)
                lineTo(9.7417f, 10.1889f)
                curveTo(9.744f, 10.1934f, 9.7451f, 10.1969f, 9.7497f, 10.1969f)
                curveTo(9.7531f, 10.1969f, 9.7543f, 10.1946f, 9.7543f, 10.1912f)
                lineTo(9.7543f, 9.9489f)
                curveTo(9.7543f, 9.9443f, 9.7531f, 9.942f, 9.7497f, 9.942f)
                curveTo(9.7463f, 9.942f, 9.7451f, 9.9443f, 9.7429f, 9.9489f)
                lineTo(9.7029f, 10.0289f)
                curveTo(9.7006f, 10.0346f, 9.696f, 10.0369f, 9.6903f, 10.0369f)
                lineTo(9.6651f, 10.0369f)
                lineTo(9.6651f, 9.702f)
                close()
                moveTo(9.9303f, 10.4197f)
                curveTo(9.9303f, 10.4334f, 9.928f, 10.4437f, 9.92f, 10.4517f)
                lineTo(9.8857f, 10.4849f)
                curveTo(9.8834f, 10.4894f, 9.8777f, 10.4917f, 9.8777f, 10.4952f)
                curveTo(9.8777f, 10.4986f, 9.88f, 10.502f, 9.8846f, 10.502f)
                lineTo(10.1646f, 10.502f)
                curveTo(10.1737f, 10.502f, 10.1771f, 10.4963f, 10.1771f, 10.486f)
                lineTo(10.1771f, 10.206f)
                curveTo(10.1771f, 10.2014f, 10.1749f, 10.198f, 10.1714f, 10.198f)
                curveTo(10.1669f, 10.198f, 10.1669f, 10.2014f, 10.1646f, 10.206f)
                lineTo(10.0937f, 10.4277f)
                curveTo(10.0891f, 10.4414f, 10.0777f, 10.4449f, 10.064f, 10.4449f)
                lineTo(10.0183f, 10.4449f)
                lineTo(10.0183f, 9.7272f)
                curveTo(10.0183f, 9.7134f, 10.0206f, 9.7032f, 10.0286f, 9.6952f)
                lineTo(10.0629f, 9.662f)
                curveTo(10.0651f, 9.6586f, 10.0709f, 9.6552f, 10.0709f, 9.6517f)
                curveTo(10.0709f, 9.6483f, 10.0686f, 9.6449f, 10.064f, 9.6449f)
                lineTo(9.8846f, 9.6449f)
                curveTo(9.88f, 9.6449f, 9.8777f, 9.6483f, 9.8777f, 9.6517f)
                curveTo(9.8777f, 9.6552f, 9.8834f, 9.6586f, 9.8857f, 9.662f)
                lineTo(9.92f, 9.6952f)
                curveTo(9.928f, 9.7032f, 9.9303f, 9.7134f, 9.9303f, 9.7272f)
                lineTo(9.9303f, 10.4197f)
                close()
                moveTo(10.3886f, 9.6449f)
                curveTo(10.2514f, 9.6449f, 10.2366f, 9.886f, 10.2366f, 10.0506f)
                curveTo(10.2366f, 10.2666f, 10.2514f, 10.502f, 10.3886f, 10.502f)
                curveTo(10.5269f, 10.502f, 10.5417f, 10.2666f, 10.5417f, 10.0506f)
                curveTo(10.5417f, 9.886f, 10.5269f, 9.6449f, 10.3886f, 9.6449f)
                lineTo(10.3886f, 9.6449f)
                close()
                moveTo(10.3886f, 9.702f)
                curveTo(10.4229f, 9.702f, 10.448f, 9.798f, 10.448f, 10.0517f)
                curveTo(10.448f, 10.3489f, 10.4229f, 10.4449f, 10.3886f, 10.4449f)
                curveTo(10.3554f, 10.4449f, 10.3303f, 10.3489f, 10.3303f, 10.0517f)
                curveTo(10.3303f, 9.798f, 10.3554f, 9.702f, 10.3886f, 9.702f)
                lineTo(10.3886f, 9.702f)
                close()
                moveTo(10.6286f, 10.3786f)
                curveTo(10.6286f, 10.4494f, 10.6754f, 10.502f, 10.7657f, 10.502f)
                curveTo(10.8434f, 10.502f, 10.8983f, 10.4494f, 10.8983f, 10.3786f)
                lineTo(10.8983f, 9.7272f)
                curveTo(10.8983f, 9.7134f, 10.9017f, 9.702f, 10.9074f, 9.6952f)
                lineTo(10.9429f, 9.662f)
                curveTo(10.9463f, 9.6586f, 10.9486f, 9.6552f, 10.9486f, 9.6517f)
                curveTo(10.9486f, 9.6483f, 10.9463f, 9.6449f, 10.9417f, 9.6449f)
                lineTo(10.7851f, 9.6449f)
                curveTo(10.7806f, 9.6449f, 10.7783f, 9.6483f, 10.7783f, 9.6517f)
                curveTo(10.7783f, 9.6552f, 10.7806f, 9.6586f, 10.784f, 9.662f)
                lineTo(10.8194f, 9.6952f)
                curveTo(10.8263f, 9.702f, 10.8286f, 9.7134f, 10.8286f, 9.7272f)
                lineTo(10.8286f, 10.3489f)
                curveTo(10.8286f, 10.3992f, 10.8171f, 10.4449f, 10.7749f, 10.4449f)
                curveTo(10.7211f, 10.4449f, 10.7166f, 10.3992f, 10.7166f, 10.3489f)
                lineTo(10.7166f, 9.7272f)
                curveTo(10.7166f, 9.7134f, 10.72f, 9.702f, 10.7257f, 9.6952f)
                lineTo(10.7611f, 9.662f)
                curveTo(10.7646f, 9.6586f, 10.7669f, 9.6552f, 10.7669f, 9.6517f)
                curveTo(10.7669f, 9.6483f, 10.7646f, 9.6449f, 10.76f, 9.6449f)
                lineTo(10.5851f, 9.6449f)
                curveTo(10.5806f, 9.6449f, 10.5783f, 9.6483f, 10.5783f, 9.6517f)
                curveTo(10.5783f, 9.6552f, 10.5806f, 9.6586f, 10.584f, 9.662f)
                lineTo(10.6194f, 9.6952f)
                curveTo(10.6263f, 9.702f, 10.6286f, 9.7134f, 10.6286f, 9.7272f)
                lineTo(10.6286f, 10.3786f)
                close()
                moveTo(11.0194f, 10.4197f)
                curveTo(11.0194f, 10.4334f, 11.0171f, 10.4437f, 11.0091f, 10.4517f)
                lineTo(10.9749f, 10.4849f)
                curveTo(10.9726f, 10.4894f, 10.9669f, 10.4917f, 10.9669f, 10.4952f)
                curveTo(10.9669f, 10.4986f, 10.9691f, 10.502f, 10.9737f, 10.502f)
                lineTo(11.1611f, 10.502f)
                curveTo(11.1657f, 10.502f, 11.168f, 10.4986f, 11.168f, 10.4952f)
                curveTo(11.168f, 10.4917f, 11.1634f, 10.4883f, 11.16f, 10.4849f)
                lineTo(11.1177f, 10.4517f)
                curveTo(11.1086f, 10.4449f, 11.1074f, 10.4334f, 11.1074f, 10.4197f)
                lineTo(11.1074f, 10.1032f)
                lineTo(11.1463f, 10.1032f)
                curveTo(11.2491f, 10.1032f, 11.2971f, 10.014f, 11.2971f, 9.8666f)
                curveTo(11.2971f, 9.6917f, 11.2354f, 9.6449f, 11.1463f, 9.6449f)
                lineTo(10.9737f, 9.6449f)
                curveTo(10.9691f, 9.6449f, 10.9669f, 9.6483f, 10.9669f, 9.6517f)
                curveTo(10.9669f, 9.6552f, 10.9726f, 9.6586f, 10.9749f, 9.662f)
                lineTo(11.0091f, 9.6952f)
                curveTo(11.0171f, 9.7032f, 11.0194f, 9.7134f, 11.0194f, 9.7272f)
                lineTo(11.0194f, 10.4197f)
                close()
                moveTo(11.1074f, 9.702f)
                lineTo(11.1406f, 9.702f)
                curveTo(11.1886f, 9.702f, 11.2034f, 9.7397f, 11.2034f, 9.8666f)
                curveTo(11.2034f, 9.9934f, 11.1886f, 10.046f, 11.1406f, 10.046f)
                lineTo(11.1074f, 10.046f)
                lineTo(11.1074f, 9.702f)
                close()
                moveTo(11.4789f, 9.702f)
                lineTo(11.544f, 9.702f)
                curveTo(11.5589f, 9.702f, 11.5691f, 9.7089f, 11.5737f, 9.7237f)
                lineTo(11.6354f, 9.9386f)
                curveTo(11.6366f, 9.9432f, 11.64f, 9.9466f, 11.6446f, 9.9466f)
                curveTo(11.648f, 9.9466f, 11.6503f, 9.9443f, 11.6503f, 9.9397f)
                lineTo(11.6503f, 9.6552f)
                curveTo(11.6503f, 9.6494f, 11.6457f, 9.6449f, 11.6411f, 9.6449f)
                lineTo(11.3451f, 9.6449f)
                curveTo(11.3406f, 9.6449f, 11.3383f, 9.6483f, 11.3383f, 9.6517f)
                curveTo(11.3383f, 9.6552f, 11.344f, 9.6586f, 11.3463f, 9.662f)
                lineTo(11.3806f, 9.6952f)
                curveTo(11.3886f, 9.7032f, 11.3909f, 9.7134f, 11.3909f, 9.7272f)
                lineTo(11.3909f, 10.4197f)
                curveTo(11.3909f, 10.4334f, 11.3886f, 10.4437f, 11.3806f, 10.4517f)
                lineTo(11.3463f, 10.4849f)
                curveTo(11.344f, 10.4894f, 11.3383f, 10.4917f, 11.3383f, 10.4952f)
                curveTo(11.3383f, 10.4986f, 11.3406f, 10.502f, 11.3451f, 10.502f)
                lineTo(11.6411f, 10.502f)
                curveTo(11.6469f, 10.502f, 11.6503f, 10.4974f, 11.6503f, 10.4917f)
                lineTo(11.6503f, 10.2049f)
                curveTo(11.6503f, 10.2014f, 11.648f, 10.198f, 11.6446f, 10.198f)
                curveTo(11.6411f, 10.198f, 11.6377f, 10.2003f, 11.6366f, 10.2049f)
                lineTo(11.5749f, 10.4243f)
                curveTo(11.5703f, 10.438f, 11.5589f, 10.4449f, 11.544f, 10.4449f)
                lineTo(11.4789f, 10.4449f)
                lineTo(11.4789f, 10.0974f)
                lineTo(11.504f, 10.0974f)
                curveTo(11.5097f, 10.0974f, 11.5143f, 10.0997f, 11.5166f, 10.1054f)
                lineTo(11.5554f, 10.1889f)
                curveTo(11.5577f, 10.1934f, 11.5589f, 10.1969f, 11.5634f, 10.1969f)
                curveTo(11.5669f, 10.1969f, 11.568f, 10.1946f, 11.568f, 10.1912f)
                lineTo(11.568f, 9.9489f)
                curveTo(11.568f, 9.9443f, 11.5669f, 9.942f, 11.5634f, 9.942f)
                curveTo(11.56f, 9.942f, 11.5589f, 9.9443f, 11.5566f, 9.9489f)
                lineTo(11.5166f, 10.0289f)
                curveTo(11.5143f, 10.0346f, 11.5097f, 10.0369f, 11.504f, 10.0369f)
                lineTo(11.4789f, 10.0369f)
                lineTo(11.4789f, 9.702f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9742f, 1.5834f)
                curveTo(14.3486f, 1.1666f, 14.762f, 1.0944f, 14.9536f, 1.7008f)
                curveTo(15.1199f, 2.2275f, 14.8278f, 2.7892f, 14.3012f, 2.9556f)
                curveTo(14.2341f, 2.9768f, 14.1248f, 3.0144f, 14.0021f, 3.0595f)
                curveTo(13.7601f, 3.1483f, 13.5319f, 3.2424f, 13.3291f, 3.3376f)
                curveTo(13.0199f, 3.4827f, 12.7942f, 3.6216f, 12.7089f, 3.7073f)
                curveTo(12.6445f, 3.772f, 12.5504f, 3.894f, 12.4419f, 4.0579f)
                curveTo(12.3396f, 4.2124f, 12.2275f, 4.399f, 12.1081f, 4.6136f)
                curveTo(11.8915f, 5.0028f, 10.0501f, 6.5232f, 9.6671f, 6.6154f)
                curveTo(9.369f, 6.6872f, 9.1462f, 6.7693f, 9.0816f, 6.8155f)
                curveTo(9.0299f, 6.8524f, 8.939f, 6.942f, 8.8314f, 7.0685f)
                curveTo(8.7274f, 7.1907f, 8.6122f, 7.3415f, 8.4888f, 7.5168f)
                curveTo(8.3452f, 7.7208f, 8.1968f, 7.9489f, 8.0497f, 8.1905f)
                curveTo(7.9751f, 8.3131f, 7.9107f, 8.4226f, 7.872f, 8.4915f)
                curveTo(7.6017f, 8.9731f, 6.9922f, 9.1444f, 6.5105f, 8.874f)
                curveTo(5.8488f, 8.5026f, 6.8149f, 6.3521f, 7.3082f, 5.7723f)
                curveTo(7.5198f, 5.5237f, 7.7183f, 5.3316f, 7.9184f, 5.1886f)
                curveTo(8.2299f, 4.9658f, 8.644f, 4.8047f, 9.1988f, 4.6711f)
                curveTo(9.4687f, 4.606f, 9.7613f, 4.5507f, 10.0694f, 4.5052f)
                curveTo(9.9197f, 4.5273f, 9.8973f, 4.5491f, 9.8788f, 4.576f)
                curveTo(9.9156f, 4.5224f, 9.9642f, 4.4367f, 10.0231f, 4.3217f)
                curveTo(10.0468f, 4.2755f, 10.0614f, 4.2463f, 10.1003f, 4.167f)
                curveTo(10.129f, 4.1081f, 10.224f, 3.9103f, 10.2344f, 3.8888f)
                curveTo(10.2877f, 3.7788f, 10.3255f, 3.7039f, 10.3605f, 3.641f)
                curveTo(10.5042f, 3.3828f, 10.642f, 3.1536f, 10.7743f, 2.9537f)
                curveTo(10.9543f, 2.6819f, 11.123f, 2.4657f, 11.2911f, 2.2967f)
                curveTo(11.4919f, 2.0949f, 12.1698f, 1.8273f, 12.9742f, 1.5834f)
                close()
            }
            path(fill = SolidColor(Color(0xFF29568D)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6455f, 2.6494f)
                curveTo(11.5002f, 2.7955f, 11.3501f, 2.9899f, 11.1912f, 3.2298f)
                curveTo(11.0641f, 3.4218f, 10.9324f, 3.6415f, 10.7974f, 3.8841f)
                curveTo(10.6314f, 4.1824f, 10.3108f, 4.9749f, 10.1425f, 4.9998f)
                curveTo(9.862f, 5.0413f, 9.581f, 5.0933f, 9.3159f, 5.1572f)
                curveTo(8.8433f, 5.271f, 8.4702f, 5.4087f, 8.2092f, 5.5953f)
                curveTo(8.0418f, 5.7149f, 7.8705f, 5.8832f, 7.689f, 6.0964f)
                curveTo(7.5509f, 6.2587f, 6.5145f, 8.3029f, 6.7553f, 8.438f)
                curveTo(6.9961f, 8.5732f, 7.3009f, 8.4875f, 7.436f, 8.2467f)
                curveTo(7.4705f, 8.1853f, 7.5351f, 8.0743f, 7.6226f, 7.9305f)
                curveTo(7.7686f, 7.6907f, 7.9236f, 7.451f, 8.0799f, 7.229f)
                curveTo(8.2096f, 7.0447f, 8.3343f, 6.8812f, 8.4506f, 6.7445f)
                curveTo(8.5836f, 6.5882f, 8.7009f, 6.473f, 8.7908f, 6.4087f)
                curveTo(8.9207f, 6.3159f, 9.1932f, 6.2153f, 9.55f, 6.1293f)
                curveTo(9.7829f, 6.0732f, 11.5155f, 4.6502f, 11.6712f, 4.3705f)
                curveTo(11.7946f, 4.1487f, 11.9134f, 3.9504f, 12.025f, 3.7819f)
                curveTo(12.1505f, 3.5923f, 12.2632f, 3.4464f, 12.3545f, 3.3547f)
                curveTo(12.4911f, 3.2173f, 12.7616f, 3.0516f, 13.1166f, 2.885f)
                curveTo(13.3418f, 2.7792f, 13.5856f, 2.6797f, 13.8298f, 2.5901f)
                curveTo(13.9762f, 2.5364f, 14.089f, 2.4983f, 14.1506f, 2.4788f)
                curveTo(14.4139f, 2.3956f, 14.56f, 2.1147f, 14.4768f, 1.8514f)
                curveTo(14.3936f, 1.5881f, 11.8837f, 2.4099f, 11.6455f, 2.6494f)
                close()
            }
        }
        .build()
        return _gp!!
    }

private var _gp: ImageVector? = null
