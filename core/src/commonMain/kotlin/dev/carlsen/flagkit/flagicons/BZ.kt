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

val FlagIcons.BZ: ImageVector
    get() {
        if (_bz != null) {
            return _bz!!
        }
        _bz = Builder(name = "Bz", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF094995), 1.0f to Color(0xFF074185), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 2.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFD5182F), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,2.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFD5182F), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,13.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 13.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-4.5f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF118014)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 11.0f)
                curveTo(10.2239f, 11.0f, 10.0f, 10.7761f, 10.0f, 10.5f)
                curveTo(10.0f, 10.2239f, 10.2239f, 10.0f, 10.5f, 10.0f)
                curveTo(10.7837f, 10.0f, 11.0603f, 9.9529f, 11.3219f, 9.8619f)
                curveTo(11.5827f, 9.7711f, 11.8677f, 9.909f, 11.9585f, 10.1698f)
                curveTo(12.0492f, 10.4306f, 11.9114f, 10.7156f, 11.6505f, 10.8064f)
                curveTo(11.2836f, 10.934f, 10.8959f, 11.0f, 10.5f, 11.0f)
                close()
                moveTo(13.1512f, 9.7851f)
                curveTo(13.4067f, 9.4888f, 13.6114f, 9.1516f, 13.7556f, 8.7871f)
                curveTo(13.8572f, 8.5303f, 13.7314f, 8.2398f, 13.4746f, 8.1382f)
                curveTo(13.2178f, 8.0367f, 12.9273f, 8.1625f, 12.8257f, 8.4192f)
                curveTo(12.7229f, 8.6792f, 12.5767f, 8.9201f, 12.394f, 9.1319f)
                curveTo(12.2136f, 9.341f, 12.2369f, 9.6567f, 12.446f, 9.8371f)
                curveTo(12.6551f, 10.0175f, 12.9708f, 9.9942f, 13.1512f, 9.7851f)
                close()
                moveTo(13.9681f, 7.026f)
                curveTo(13.9151f, 6.6353f, 13.7969f, 6.2594f, 13.6196f, 5.9117f)
                curveTo(13.4941f, 5.6657f, 13.193f, 5.568f, 12.947f, 5.6934f)
                curveTo(12.701f, 5.8189f, 12.6033f, 6.12f, 12.7287f, 6.366f)
                curveTo(12.8552f, 6.6139f, 12.9394f, 6.8817f, 12.9772f, 7.1603f)
                curveTo(13.0143f, 7.434f, 13.2662f, 7.6257f, 13.5398f, 7.5886f)
                curveTo(13.8135f, 7.5515f, 14.0052f, 7.2996f, 13.9681f, 7.026f)
                close()
                moveTo(12.3566f, 4.5326f)
                curveTo(12.0253f, 4.3249f, 11.6611f, 4.1738f, 11.2775f, 4.0868f)
                curveTo(11.0082f, 4.0257f, 10.7403f, 4.1944f, 10.6792f, 4.4637f)
                curveTo(10.6181f, 4.733f, 10.7868f, 5.0008f, 11.0561f, 5.062f)
                curveTo(11.3295f, 5.124f, 11.5891f, 5.2317f, 11.8255f, 5.3799f)
                curveTo(12.0595f, 5.5265f, 12.3681f, 5.4557f, 12.5147f, 5.2218f)
                curveTo(12.6614f, 4.9878f, 12.5906f, 4.6792f, 12.3566f, 4.5326f)
                close()
                moveTo(9.5576f, 4.1285f)
                curveTo(9.1791f, 4.2341f, 8.8226f, 4.4027f, 8.5016f, 4.6263f)
                curveTo(8.275f, 4.7841f, 8.2193f, 5.0958f, 8.3771f, 5.3223f)
                curveTo(8.5349f, 5.5489f, 8.8465f, 5.6047f, 9.0731f, 5.4469f)
                curveTo(9.3024f, 5.2872f, 9.5566f, 5.1669f, 9.8263f, 5.0917f)
                curveTo(10.0923f, 5.0175f, 10.2478f, 4.7417f, 10.1735f, 4.4757f)
                curveTo(10.0993f, 4.2097f, 9.8235f, 4.0543f, 9.5576f, 4.1285f)
                close()
                moveTo(7.3498f, 5.9732f)
                curveTo(7.1794f, 6.3242f, 7.0686f, 6.7023f, 7.0233f, 7.0942f)
                curveTo(6.9916f, 7.3685f, 7.1883f, 7.6166f, 7.4626f, 7.6483f)
                curveTo(7.7369f, 7.6801f, 7.985f, 7.4834f, 8.0167f, 7.2091f)
                curveTo(8.049f, 6.9294f, 8.1279f, 6.6601f, 8.2494f, 6.4099f)
                curveTo(8.37f, 6.1615f, 8.2664f, 5.8624f, 8.018f, 5.7418f)
                curveTo(7.7695f, 5.6212f, 7.4704f, 5.7248f, 7.3498f, 5.9732f)
                close()
                moveTo(7.2903f, 8.8976f)
                curveTo(7.4468f, 9.2567f, 7.6628f, 9.5867f, 7.9283f, 9.8741f)
                curveTo(8.1156f, 10.0769f, 8.4319f, 10.0895f, 8.6348f, 9.9022f)
                curveTo(8.8377f, 9.7148f, 8.8502f, 9.3985f, 8.6629f, 9.1956f)
                curveTo(8.4731f, 8.9901f, 8.3187f, 8.7542f, 8.207f, 8.4979f)
                curveTo(8.0966f, 8.2448f, 7.802f, 8.1291f, 7.5488f, 8.2394f)
                curveTo(7.2957f, 8.3498f, 7.18f, 8.6444f, 7.2903f, 8.8976f)
                close()
                moveTo(9.4358f, 10.8351f)
                curveTo(9.1727f, 10.7512f, 9.0274f, 10.47f, 9.1113f, 10.2069f)
                curveTo(9.1952f, 9.9438f, 9.4765f, 9.7985f, 9.7396f, 9.8824f)
                curveTo(9.9687f, 9.9555f, 10.2085f, 9.9952f, 10.454f, 9.9996f)
                curveTo(10.7301f, 10.0045f, 10.9499f, 10.2324f, 10.945f, 10.5085f)
                curveTo(10.94f, 10.7846f, 10.7122f, 11.0044f, 10.4361f, 10.9994f)
                curveTo(10.0932f, 10.9933f, 9.7571f, 10.9376f, 9.4358f, 10.8351f)
                close()
            }
        }
        .build()
        return _bz!!
    }

private var _bz: ImageVector? = null
