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

val FlagIcons.CV: ImageVector
    get() {
        if (_cv != null) {
            return _cv!!
        }
        _cv = Builder(name = "Cv", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0C49AE), 1.0f to Color(0xFF063B91), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0C49AE), 1.0f to Color(0xFF063B91), start =
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
                    Offset(10.5f,8.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFCD232E), 1.0f to Color(0xFFCD232E), start =
                    Offset(10.5f,9.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7D035)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                curveTo(7.7239f, 13.0f, 7.5f, 12.7761f, 7.5f, 12.5f)
                curveTo(7.5f, 12.2239f, 7.7239f, 12.0f, 8.0f, 12.0f)
                curveTo(8.2837f, 12.0f, 8.5603f, 11.9529f, 8.8219f, 11.8619f)
                curveTo(9.0827f, 11.7711f, 9.3677f, 11.909f, 9.4585f, 12.1698f)
                curveTo(9.5492f, 12.4306f, 9.4114f, 12.7156f, 9.1505f, 12.8064f)
                curveTo(8.7836f, 12.934f, 8.3959f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(10.6512f, 11.7851f)
                curveTo(10.9067f, 11.4888f, 11.1114f, 11.1516f, 11.2556f, 10.7871f)
                curveTo(11.3572f, 10.5303f, 11.2314f, 10.2398f, 10.9746f, 10.1382f)
                curveTo(10.7178f, 10.0367f, 10.4273f, 10.1625f, 10.3257f, 10.4192f)
                curveTo(10.2229f, 10.6792f, 10.0767f, 10.9201f, 9.894f, 11.1319f)
                curveTo(9.7136f, 11.341f, 9.7369f, 11.6567f, 9.946f, 11.8371f)
                curveTo(10.1551f, 12.0175f, 10.4708f, 11.9942f, 10.6512f, 11.7851f)
                close()
                moveTo(11.4681f, 9.026f)
                curveTo(11.4151f, 8.6353f, 11.2969f, 8.2594f, 11.1196f, 7.9117f)
                curveTo(10.9941f, 7.6657f, 10.693f, 7.568f, 10.447f, 7.6934f)
                curveTo(10.201f, 7.8189f, 10.1033f, 8.12f, 10.2287f, 8.366f)
                curveTo(10.3552f, 8.6139f, 10.4394f, 8.8817f, 10.4772f, 9.1603f)
                curveTo(10.5143f, 9.434f, 10.7662f, 9.6257f, 11.0398f, 9.5886f)
                curveTo(11.3135f, 9.5515f, 11.5052f, 9.2996f, 11.4681f, 9.026f)
                close()
                moveTo(9.8566f, 6.5326f)
                curveTo(9.5253f, 6.3249f, 9.1611f, 6.1738f, 8.7775f, 6.0868f)
                curveTo(8.5082f, 6.0257f, 8.2403f, 6.1944f, 8.1792f, 6.4637f)
                curveTo(8.1181f, 6.733f, 8.2868f, 7.0008f, 8.5561f, 7.062f)
                curveTo(8.8295f, 7.124f, 9.0891f, 7.2317f, 9.3255f, 7.3799f)
                curveTo(9.5595f, 7.5265f, 9.8681f, 7.4557f, 10.0147f, 7.2218f)
                curveTo(10.1614f, 6.9878f, 10.0906f, 6.6792f, 9.8566f, 6.5326f)
                close()
                moveTo(7.0576f, 6.1285f)
                curveTo(6.6791f, 6.2341f, 6.3226f, 6.4027f, 6.0016f, 6.6263f)
                curveTo(5.775f, 6.7841f, 5.7193f, 7.0958f, 5.8771f, 7.3223f)
                curveTo(6.0349f, 7.5489f, 6.3465f, 7.6047f, 6.5731f, 7.4469f)
                curveTo(6.8024f, 7.2872f, 7.0566f, 7.1669f, 7.3263f, 7.0917f)
                curveTo(7.5923f, 7.0175f, 7.7478f, 6.7417f, 7.6735f, 6.4757f)
                curveTo(7.5993f, 6.2097f, 7.3235f, 6.0543f, 7.0576f, 6.1285f)
                close()
                moveTo(4.8498f, 7.9732f)
                curveTo(4.6794f, 8.3242f, 4.5686f, 8.7023f, 4.5233f, 9.0942f)
                curveTo(4.4916f, 9.3685f, 4.6883f, 9.6166f, 4.9626f, 9.6483f)
                curveTo(5.2369f, 9.6801f, 5.485f, 9.4834f, 5.5167f, 9.2091f)
                curveTo(5.549f, 8.9294f, 5.6279f, 8.6601f, 5.7494f, 8.4099f)
                curveTo(5.87f, 8.1615f, 5.7664f, 7.8624f, 5.518f, 7.7418f)
                curveTo(5.2695f, 7.6212f, 4.9704f, 7.7248f, 4.8498f, 7.9732f)
                close()
                moveTo(4.7903f, 10.8976f)
                curveTo(4.9468f, 11.2567f, 5.1628f, 11.5867f, 5.4283f, 11.8741f)
                curveTo(5.6156f, 12.0769f, 5.9319f, 12.0895f, 6.1348f, 11.9022f)
                curveTo(6.3377f, 11.7148f, 6.3502f, 11.3985f, 6.1629f, 11.1956f)
                curveTo(5.973f, 10.9901f, 5.8187f, 10.7542f, 5.707f, 10.4979f)
                curveTo(5.5966f, 10.2448f, 5.302f, 10.1291f, 5.0488f, 10.2394f)
                curveTo(4.7957f, 10.3498f, 4.68f, 10.6444f, 4.7903f, 10.8976f)
                close()
                moveTo(6.9358f, 12.8351f)
                curveTo(6.6727f, 12.7512f, 6.5274f, 12.47f, 6.6113f, 12.2069f)
                curveTo(6.6952f, 11.9438f, 6.9765f, 11.7985f, 7.2396f, 11.8824f)
                curveTo(7.4687f, 11.9555f, 7.7085f, 11.9952f, 7.954f, 11.9996f)
                curveTo(8.2301f, 12.0045f, 8.4499f, 12.2324f, 8.445f, 12.5085f)
                curveTo(8.44f, 12.7846f, 8.2122f, 13.0044f, 7.9361f, 12.9994f)
                curveTo(7.5932f, 12.9933f, 7.2571f, 12.9376f, 6.9358f, 12.8351f)
                close()
            }
        }
        .build()
        return _cv!!
    }

private var _cv: ImageVector? = null
