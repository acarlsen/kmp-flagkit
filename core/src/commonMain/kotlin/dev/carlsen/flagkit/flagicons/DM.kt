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

val FlagIcons.DM: ImageVector
    get() {
        if (_dm != null) {
            return _dm!!
        }
        _dm = Builder(name = "Dm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF108753), 1.0f to Color(0xFF0B6B41), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF108753), 1.0f to Color(0xFF0B6B41), start =
                    Offset(10.5f,9.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(10.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFCD449), 1.0f to Color(0xFFFCD036), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 7.0f)
                lineTo(9.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE02C42), 1.0f to Color(0xFFD22036), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0E673F)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                curveTo(10.2239f, 10.5f, 10.0f, 10.2761f, 10.0f, 10.0f)
                curveTo(10.0f, 9.7239f, 10.2239f, 9.5f, 10.5f, 9.5f)
                curveTo(10.7735f, 9.5f, 11.0385f, 9.4454f, 11.2838f, 9.3407f)
                curveTo(11.5378f, 9.2324f, 11.8316f, 9.3504f, 11.9399f, 9.6044f)
                curveTo(12.0483f, 9.8584f, 11.9302f, 10.1522f, 11.6762f, 10.2605f)
                curveTo(11.3073f, 10.4178f, 10.909f, 10.5f, 10.5f, 10.5f)
                close()
                moveTo(13.3165f, 8.5351f)
                curveTo(13.4306f, 8.2247f, 13.4928f, 7.8961f, 13.4994f, 7.5597f)
                curveTo(13.5f, 7.4403f, 13.4981f, 7.3687f, 13.4929f, 7.2928f)
                curveTo(13.4741f, 7.0173f, 13.2355f, 6.8092f, 12.96f, 6.8281f)
                curveTo(12.6845f, 6.8469f, 12.4764f, 7.0855f, 12.4953f, 7.361f)
                curveTo(12.4987f, 7.4106f, 12.4999f, 7.4585f, 12.4995f, 7.5477f)
                curveTo(12.4952f, 7.7649f, 12.4538f, 7.9836f, 12.3779f, 8.1901f)
                curveTo(12.2826f, 8.4493f, 12.4155f, 8.7366f, 12.6747f, 8.8319f)
                curveTo(12.9338f, 8.9272f, 13.2212f, 8.7943f, 13.3165f, 8.5351f)
                close()
                moveTo(12.3669f, 5.1515f)
                curveTo(12.0512f, 4.9003f, 11.6877f, 4.7146f, 11.2968f, 4.6071f)
                curveTo(11.0305f, 4.5339f, 10.7553f, 4.6904f, 10.6821f, 4.9567f)
                curveTo(10.6089f, 5.2229f, 10.7655f, 5.4981f, 11.0317f, 5.5713f)
                curveTo(11.2916f, 5.6428f, 11.5336f, 5.7664f, 11.7442f, 5.934f)
                curveTo(11.9602f, 6.1059f, 12.2748f, 6.0702f, 12.4468f, 5.8541f)
                curveTo(12.6187f, 5.638f, 12.5829f, 5.3235f, 12.3669f, 5.1515f)
                close()
                moveTo(8.9437f, 4.9348f)
                curveTo(8.5989f, 5.1444f, 8.2993f, 5.4218f, 8.0636f, 5.7492f)
                curveTo(7.9023f, 5.9734f, 7.9533f, 6.2858f, 8.1774f, 6.4471f)
                curveTo(8.4015f, 6.6084f, 8.714f, 6.5575f, 8.8753f, 6.3333f)
                curveTo(9.0327f, 6.1146f, 9.2329f, 5.9293f, 9.4631f, 5.7894f)
                curveTo(9.699f, 5.646f, 9.7741f, 5.3384f, 9.6306f, 5.1024f)
                curveTo(9.4872f, 4.8664f, 9.1796f, 4.7914f, 8.9437f, 4.9348f)
                close()
                moveTo(7.5642f, 8.1197f)
                curveTo(7.6477f, 8.5171f, 7.811f, 8.891f, 8.0426f, 9.2212f)
                curveTo(8.2012f, 9.4473f, 8.513f, 9.502f, 8.7391f, 9.3434f)
                curveTo(8.9651f, 9.1848f, 9.0199f, 8.873f, 8.8613f, 8.6469f)
                curveTo(8.7069f, 8.4269f, 8.5983f, 8.1782f, 8.5428f, 7.914f)
                curveTo(8.486f, 7.6437f, 8.2209f, 7.4707f, 7.9506f, 7.5275f)
                curveTo(7.6804f, 7.5843f, 7.5074f, 7.8494f, 7.5642f, 8.1197f)
                close()
                moveTo(10.1049f, 10.4742f)
                curveTo(9.8311f, 10.4381f, 9.6384f, 10.1869f, 9.6745f, 9.9131f)
                curveTo(9.7106f, 9.6393f, 9.9618f, 9.4467f, 10.2356f, 9.4827f)
                curveTo(10.3165f, 9.4934f, 10.3986f, 9.4992f, 10.4814f, 9.4999f)
                curveTo(10.7575f, 9.5024f, 10.9793f, 9.7283f, 10.9768f, 10.0044f)
                curveTo(10.9743f, 10.2806f, 10.7484f, 10.5024f, 10.4723f, 10.4999f)
                curveTo(10.3488f, 10.4988f, 10.2262f, 10.4901f, 10.1049f, 10.4742f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0E673F)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 8.5f)
                curveTo(11.0523f, 8.5f, 11.0f, 8.0523f, 11.0f, 7.5f)
                curveTo(11.0f, 6.9477f, 11.0523f, 6.5f, 10.5f, 6.5f)
                curveTo(9.9477f, 6.5f, 10.0f, 6.9477f, 10.0f, 7.5f)
                curveTo(10.0f, 8.0523f, 9.9477f, 8.5f, 10.5f, 8.5f)
                close()
            }
        }
        .build()
        return _dm!!
    }

private var _dm: ImageVector? = null
