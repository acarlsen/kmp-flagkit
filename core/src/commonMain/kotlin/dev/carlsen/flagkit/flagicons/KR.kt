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

val FlagIcons.KR: ImageVector
    get() {
        if (_kr != null) {
            return _kr!!
        }
        _kr = Builder(name = "Kr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE01B41), 1.0f to Color(0xFFC51335), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0E4B9C), 1.0f to Color(0xFF053677),
                        start = Offset(10.25f,6.5f), end = Offset(10.25f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.0f, 8.0f)
                    curveTo(8.0f, 8.9375f, 9.5f, 9.5f, 10.5f, 8.0f)
                    curveTo(11.5f, 6.5f, 13.5f, 6.5f, 14.0f, 8.0f)
                    curveTo(14.5f, 9.5f, 14.0f, 11.0f, 14.0f, 11.0f)
                    lineTo(7.0f, 11.0f)
                    curveTo(7.0f, 11.0f, 6.0f, 7.0625f, 7.0f, 8.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(10.5f,2.5045f), end = Offset(10.5f,12.4955f)), stroke =
                        SolidColor(Color(0x00000000)), fillAlpha = 0.75f, strokeAlpha = 0.75f,
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.208f, 3.9225f)
                    curveTo(14.1374f, 3.8001f, 14.1728f, 3.6475f, 14.2987f, 3.5748f)
                    lineTo(14.7276f, 3.3271f)
                    curveTo(14.8483f, 3.2575f, 15.0031f, 3.2996f, 15.074f, 3.4225f)
                    lineTo(16.3183f, 5.5775f)
                    curveTo(16.3889f, 5.6999f, 16.3535f, 5.8525f, 16.2276f, 5.9252f)
                    lineTo(15.7987f, 6.1729f)
                    curveTo(15.678f, 6.2425f, 15.5232f, 6.2004f, 15.4522f, 6.0775f)
                    lineTo(14.208f, 3.9225f)
                    close()
                    moveTo(15.5071f, 3.1725f)
                    curveTo(15.4364f, 3.0501f, 15.4718f, 2.8975f, 15.5977f, 2.8248f)
                    lineTo(16.0267f, 2.5771f)
                    curveTo(16.1473f, 2.5075f, 16.3022f, 2.5496f, 16.3731f, 2.6725f)
                    lineTo(17.6173f, 4.8275f)
                    curveTo(17.6879f, 4.9499f, 17.6525f, 5.1025f, 17.5267f, 5.1752f)
                    lineTo(17.0977f, 5.4229f)
                    curveTo(16.977f, 5.4925f, 16.8222f, 5.4504f, 16.7513f, 5.3275f)
                    lineTo(15.5071f, 3.1725f)
                    close()
                    moveTo(3.3827f, 10.1725f)
                    curveTo(3.3121f, 10.0501f, 3.3475f, 9.8975f, 3.4733f, 9.8248f)
                    lineTo(3.9023f, 9.5771f)
                    curveTo(4.023f, 9.5075f, 4.1778f, 9.5496f, 4.2487f, 9.6725f)
                    lineTo(5.4929f, 11.8275f)
                    curveTo(5.5636f, 11.9499f, 5.5282f, 12.1025f, 5.4023f, 12.1752f)
                    lineTo(4.9733f, 12.4229f)
                    curveTo(4.8527f, 12.4925f, 4.6978f, 12.4504f, 4.6269f, 12.3275f)
                    lineTo(3.3827f, 10.1725f)
                    close()
                    moveTo(4.6817f, 9.4225f)
                    curveTo(4.6111f, 9.3001f, 4.6465f, 9.1475f, 4.7724f, 9.0748f)
                    lineTo(5.2013f, 8.8271f)
                    curveTo(5.322f, 8.7575f, 5.4768f, 8.7996f, 5.5478f, 8.9225f)
                    lineTo(6.792f, 11.0775f)
                    curveTo(6.8626f, 11.1999f, 6.8272f, 11.3525f, 6.7013f, 11.4252f)
                    lineTo(6.2724f, 11.6729f)
                    curveTo(6.1517f, 11.7425f, 5.9969f, 11.7004f, 5.926f, 11.5775f)
                    lineTo(4.6817f, 9.4225f)
                    close()
                    moveTo(15.4522f, 8.9225f)
                    curveTo(15.5229f, 8.8001f, 15.6728f, 8.7545f, 15.7987f, 8.8271f)
                    lineTo(16.2276f, 9.0748f)
                    curveTo(16.3483f, 9.1445f, 16.3892f, 9.2996f, 16.3183f, 9.4225f)
                    lineTo(15.074f, 11.5775f)
                    curveTo(15.0034f, 11.6999f, 14.8535f, 11.7455f, 14.7276f, 11.6729f)
                    lineTo(14.2987f, 11.4252f)
                    curveTo(14.178f, 11.3555f, 14.1371f, 11.2004f, 14.208f, 11.0775f)
                    lineTo(15.4522f, 8.9225f)
                    close()
                    moveTo(16.7513f, 9.6725f)
                    curveTo(16.8219f, 9.5501f, 16.9718f, 9.5045f, 17.0977f, 9.5771f)
                    lineTo(17.5267f, 9.8248f)
                    curveTo(17.6473f, 9.8945f, 17.6882f, 10.0496f, 17.6173f, 10.1725f)
                    lineTo(16.3731f, 12.3275f)
                    curveTo(16.3024f, 12.4499f, 16.1525f, 12.4955f, 16.0267f, 12.4229f)
                    lineTo(15.5977f, 12.1752f)
                    curveTo(15.477f, 12.1055f, 15.4361f, 11.9504f, 15.5071f, 11.8275f)
                    lineTo(16.7513f, 9.6725f)
                    close()
                    moveTo(4.6269f, 2.6725f)
                    curveTo(4.6976f, 2.5501f, 4.8475f, 2.5045f, 4.9733f, 2.5771f)
                    lineTo(5.4023f, 2.8248f)
                    curveTo(5.523f, 2.8945f, 5.5639f, 3.0496f, 5.4929f, 3.1725f)
                    lineTo(4.2487f, 5.3275f)
                    curveTo(4.1781f, 5.4499f, 4.0282f, 5.4955f, 3.9023f, 5.4229f)
                    lineTo(3.4733f, 5.1752f)
                    curveTo(3.3527f, 5.1055f, 3.3118f, 4.9504f, 3.3827f, 4.8275f)
                    lineTo(4.6269f, 2.6725f)
                    close()
                    moveTo(5.926f, 3.4225f)
                    curveTo(5.9966f, 3.3001f, 6.1465f, 3.2545f, 6.2724f, 3.3271f)
                    lineTo(6.7013f, 3.5748f)
                    curveTo(6.822f, 3.6445f, 6.8629f, 3.7996f, 6.792f, 3.9225f)
                    lineTo(5.5478f, 6.0775f)
                    curveTo(5.4771f, 6.1999f, 5.3272f, 6.2455f, 5.2013f, 6.1729f)
                    lineTo(4.7724f, 5.9252f)
                    curveTo(4.6517f, 5.8555f, 4.6108f, 5.7004f, 4.6817f, 5.5775f)
                    lineTo(5.926f, 3.4225f)
                    close()
                }
            }
        }
        .build()
        return _kr!!
    }

private var _kr: ImageVector? = null
