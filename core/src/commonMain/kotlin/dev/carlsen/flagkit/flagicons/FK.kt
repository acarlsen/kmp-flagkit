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

val FlagIcons.FK: ImageVector
    get() {
        if (_fk != null) {
            return _fk!!
        }
        _fk = Builder(name = "Fk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1F8BDE), 1.0f to Color(0xFF1075C2), start =
                    Offset(15.5f,4.0f), end = Offset(15.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 7.5f)
                lineTo(13.0f, 4.5096f)
                curveTo(13.0f, 4.2282f, 13.2148f, 4.0f, 13.4977f, 4.0f)
                lineTo(17.5023f, 4.0f)
                curveTo(17.7772f, 4.0f, 18.0f, 4.2266f, 18.0f, 4.5096f)
                lineTo(18.0f, 7.5f)
                curveTo(18.0f, 10.0f, 15.5f, 11.0f, 15.5f, 11.0f)
                curveTo(15.5f, 11.0f, 13.0f, 10.0f, 13.0f, 7.5f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.5f,4.0f), end = Offset(15.5f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.0f, 7.5f)
                    lineTo(13.0f, 4.5096f)
                    curveTo(13.0f, 4.2282f, 13.2148f, 4.0f, 13.4977f, 4.0f)
                    lineTo(17.5023f, 4.0f)
                    curveTo(17.7772f, 4.0f, 18.0f, 4.2266f, 18.0f, 4.5096f)
                    lineTo(18.0f, 7.5f)
                    curveTo(18.0f, 10.0f, 15.5f, 11.0f, 15.5f, 11.0f)
                    curveTo(15.5f, 11.0f, 13.0f, 10.0f, 13.0f, 7.5f)
                    close()
                    moveTo(15.6441f, 10.3697f)
                    curveTo(15.9072f, 10.2206f, 16.1709f, 10.036f, 16.4155f, 9.8159f)
                    curveTo(17.0987f, 9.201f, 17.5f, 8.4385f, 17.5f, 7.5f)
                    lineTo(17.5f, 4.5096f)
                    curveTo(17.5f, 4.5009f, 13.4986f, 4.5f, 13.4986f, 4.5f)
                    curveTo(13.4992f, 4.5006f, 13.5f, 7.5f, 13.5f, 7.5f)
                    curveTo(13.5f, 8.4385f, 13.9013f, 9.201f, 14.5845f, 9.8159f)
                    curveTo(14.8291f, 10.036f, 15.0928f, 10.2206f, 15.3559f, 10.3697f)
                    curveTo(15.4086f, 10.3996f, 15.4569f, 10.4257f, 15.5f, 10.448f)
                    curveTo(15.5431f, 10.4257f, 15.5914f, 10.3996f, 15.6441f, 10.3697f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF187536), 1.0f to Color(0xFF0E5023),
                        start = Offset(15.50065f,7.0f), end = Offset(15.50065f,8.347f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.1582f, 7.4746f)
                    curveTo(14.0708f, 7.2125f, 14.2158f, 7.0f, 14.4954f, 7.0f)
                    lineTo(16.5046f, 7.0f)
                    curveTo(16.7782f, 7.0f, 16.9305f, 7.2086f, 16.8418f, 7.4746f)
                    lineTo(16.6582f, 8.0254f)
                    curveTo(16.5708f, 8.2875f, 16.3628f, 8.3307f, 16.1337f, 8.1582f)
                    curveTo(16.1337f, 8.1582f, 16.2219f, 8.0f, 15.5f, 8.0f)
                    curveTo(14.7781f, 8.0f, 14.8663f, 8.1582f, 14.8663f, 8.1582f)
                    curveTo(14.664f, 8.347f, 14.4305f, 8.2914f, 14.3418f, 8.0254f)
                    lineTo(14.1582f, 7.4746f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.5f,5.0f), end = Offset(15.5f,7.0672f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.5f, 7.0f)
                    curveTo(14.7707f, 7.0538f, 15.0905f, 6.5f, 15.5f, 6.5f)
                    curveTo(15.9367f, 6.5f, 16.2259f, 7.0672f, 16.5f, 7.0f)
                    curveTo(16.7459f, 6.9397f, 17.0f, 6.2611f, 17.0f, 6.0f)
                    curveTo(17.0f, 5.4477f, 16.3284f, 5.0f, 15.5f, 5.0f)
                    curveTo(14.6716f, 5.0f, 14.0f, 5.4477f, 14.0f, 6.0f)
                    curveTo(14.0f, 6.2793f, 14.2231f, 6.945f, 14.5f, 7.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.3251f,8.8819f), end = Offset(15.3251f,10.3536f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.6768f, 10.1768f)
                    curveTo(12.7549f, 10.0987f, 12.7549f, 10.0987f, 13.0265f, 9.827f)
                    lineTo(13.327f, 9.5265f)
                    curveTo(13.4227f, 9.4309f, 13.5772f, 9.4308f, 13.673f, 9.5265f)
                    lineTo(13.9735f, 9.827f)
                    curveTo(14.2644f, 10.1179f, 14.7355f, 10.1181f, 15.0265f, 9.827f)
                    lineTo(15.327f, 9.5265f)
                    curveTo(15.4227f, 9.4309f, 15.5772f, 9.4308f, 15.673f, 9.5265f)
                    lineTo(15.9735f, 9.827f)
                    curveTo(16.2644f, 10.1179f, 16.7355f, 10.1181f, 17.0265f, 9.827f)
                    lineTo(17.327f, 9.5265f)
                    curveTo(17.4227f, 9.4309f, 17.5772f, 9.4308f, 17.673f, 9.5265f)
                    lineTo(17.9735f, 9.827f)
                    lineTo(18.1502f, 10.0038f)
                    lineTo(18.5038f, 9.6502f)
                    lineTo(18.327f, 9.4735f)
                    lineTo(18.0265f, 9.173f)
                    curveTo(17.7355f, 8.8819f, 17.2644f, 8.8821f, 16.9735f, 9.173f)
                    lineTo(16.673f, 9.4735f)
                    curveTo(16.5772f, 9.5692f, 16.4227f, 9.5691f, 16.327f, 9.4735f)
                    lineTo(16.0265f, 9.173f)
                    curveTo(15.7355f, 8.8819f, 15.2644f, 8.8821f, 14.9735f, 9.173f)
                    lineTo(14.673f, 9.4735f)
                    curveTo(14.5772f, 9.5692f, 14.4227f, 9.5691f, 14.327f, 9.4735f)
                    lineTo(14.0265f, 9.173f)
                    curveTo(13.7355f, 8.8819f, 13.2644f, 8.8821f, 12.9735f, 9.173f)
                    lineTo(12.673f, 9.4735f)
                    lineTo(12.3232f, 9.8232f)
                    lineTo(12.1464f, 10.0f)
                    lineTo(12.5f, 10.3536f)
                    lineTo(12.6768f, 10.1768f)
                    lineTo(12.6768f, 10.1768f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.3251f,7.3819f), end = Offset(15.3251f,8.8536f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(12.6768f, 8.6768f)
                    curveTo(12.7549f, 8.5987f, 12.7549f, 8.5987f, 13.0265f, 8.327f)
                    lineTo(13.327f, 8.0265f)
                    curveTo(13.4227f, 7.9309f, 13.5772f, 7.9308f, 13.673f, 8.0265f)
                    lineTo(13.9735f, 8.327f)
                    curveTo(14.2644f, 8.6179f, 14.7355f, 8.6181f, 15.0265f, 8.327f)
                    lineTo(15.327f, 8.0265f)
                    curveTo(15.4227f, 7.9309f, 15.5772f, 7.9308f, 15.673f, 8.0265f)
                    lineTo(15.9735f, 8.327f)
                    curveTo(16.2644f, 8.6179f, 16.7355f, 8.6181f, 17.0265f, 8.327f)
                    lineTo(17.327f, 8.0265f)
                    curveTo(17.4227f, 7.9309f, 17.5772f, 7.9308f, 17.673f, 8.0265f)
                    lineTo(17.9735f, 8.327f)
                    lineTo(18.1502f, 8.5038f)
                    lineTo(18.5038f, 8.1502f)
                    lineTo(18.327f, 7.9735f)
                    lineTo(18.0265f, 7.673f)
                    curveTo(17.7355f, 7.3819f, 17.2644f, 7.3821f, 16.9735f, 7.673f)
                    lineTo(16.673f, 7.9735f)
                    curveTo(16.5772f, 8.0692f, 16.4227f, 8.0691f, 16.327f, 7.9735f)
                    lineTo(16.0265f, 7.673f)
                    curveTo(15.7355f, 7.3819f, 15.2644f, 7.3821f, 14.9735f, 7.673f)
                    lineTo(14.673f, 7.9735f)
                    curveTo(14.5772f, 8.0692f, 14.4227f, 8.0691f, 14.327f, 7.9735f)
                    lineTo(14.0265f, 7.673f)
                    curveTo(13.7355f, 7.3819f, 13.2644f, 7.3821f, 12.9735f, 7.673f)
                    lineTo(12.673f, 7.9735f)
                    lineTo(12.3232f, 8.3232f)
                    lineTo(12.1464f, 8.5f)
                    lineTo(12.5f, 8.8536f)
                    lineTo(12.6768f, 8.6768f)
                    lineTo(12.6768f, 8.6768f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(15.3251f,10.3819f), end = Offset(15.3251f,11.8536f)), stroke
                        = SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap =
                        Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(12.6768f, 11.6768f)
                    curveTo(12.7549f, 11.5987f, 12.7549f, 11.5987f, 13.0265f, 11.327f)
                    lineTo(13.327f, 11.0265f)
                    curveTo(13.4227f, 10.9309f, 13.5772f, 10.9308f, 13.673f, 11.0265f)
                    lineTo(13.9735f, 11.327f)
                    curveTo(14.2644f, 11.6179f, 14.7355f, 11.6181f, 15.0265f, 11.327f)
                    lineTo(15.327f, 11.0265f)
                    curveTo(15.4227f, 10.9309f, 15.5772f, 10.9308f, 15.673f, 11.0265f)
                    lineTo(15.9735f, 11.327f)
                    curveTo(16.2644f, 11.6179f, 16.7355f, 11.6181f, 17.0265f, 11.327f)
                    lineTo(17.327f, 11.0265f)
                    curveTo(17.4227f, 10.9309f, 17.5772f, 10.9308f, 17.673f, 11.0265f)
                    lineTo(17.9735f, 11.327f)
                    lineTo(18.1502f, 11.5038f)
                    lineTo(18.5038f, 11.1502f)
                    lineTo(18.327f, 10.9735f)
                    lineTo(18.0265f, 10.673f)
                    curveTo(17.7355f, 10.3819f, 17.2644f, 10.3821f, 16.9735f, 10.673f)
                    lineTo(16.673f, 10.9735f)
                    curveTo(16.5772f, 11.0692f, 16.4227f, 11.0691f, 16.327f, 10.9735f)
                    lineTo(16.0265f, 10.673f)
                    curveTo(15.7355f, 10.3819f, 15.2644f, 10.3821f, 14.9735f, 10.673f)
                    lineTo(14.673f, 10.9735f)
                    curveTo(14.5772f, 11.0692f, 14.4227f, 11.0691f, 14.327f, 10.9735f)
                    lineTo(14.0265f, 10.673f)
                    curveTo(13.7355f, 10.3819f, 13.2644f, 10.3821f, 12.9735f, 10.673f)
                    lineTo(12.673f, 10.9735f)
                    lineTo(12.3232f, 11.3232f)
                    lineTo(12.1464f, 11.5f)
                    lineTo(12.5f, 11.8536f)
                    lineTo(12.6768f, 11.6768f)
                    lineTo(12.6768f, 11.6768f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.5f, 3.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.5f, 0.0f)
                    lineTo(4.0f, 2.5f)
                    lineTo(5.0f, 2.5f)
                    lineTo(9.0f, 0.0f)
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
                    lineTo(0.0f, 7.0f)
                    lineTo(0.0f, 6.5f)
                    lineTo(3.5f, 4.0f)
                    lineTo(3.5f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.25f, 3.115f)
                    lineTo(-0.6758f, -0.25f)
                    lineTo(0.5f, -0.25f)
                    lineTo(0.6453f, -0.2034f)
                    lineTo(4.0801f, 2.25f)
                    lineTo(4.9283f, 2.25f)
                    lineTo(9.25f, -0.4511f)
                    lineTo(9.25f, 0.25f)
                    curveTo(9.25f, 0.4717f, 9.1221f, 0.72f, 8.9369f, 0.8523f)
                    lineTo(5.75f, 3.1287f)
                    lineTo(5.75f, 3.885f)
                    lineTo(8.9745f, 6.6489f)
                    curveTo(9.257f, 6.891f, 9.1132f, 7.25f, 8.75f, 7.25f)
                    curveTo(8.5569f, 7.25f, 8.3082f, 7.1702f, 8.1462f, 7.0545f)
                    lineTo(4.9199f, 4.75f)
                    lineTo(4.0717f, 4.75f)
                    lineTo(-0.25f, 7.4511f)
                    lineTo(-0.25f, 6.3713f)
                    lineTo(3.25f, 3.8713f)
                    lineTo(3.25f, 3.115f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(4.75f,0.0f), end = Offset(4.75f,7.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 2.5f)
                    lineTo(0.0f, 4.5f)
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
                    lineTo(5.5f, 0.0f)
                    lineTo(3.5f, 0.0f)
                    lineTo(3.5f, 2.5f)
                    lineTo(0.0f, 2.5f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.0f)
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
            }
        }
        .build()
        return _fk!!
    }

private var _fk: ImageVector? = null
