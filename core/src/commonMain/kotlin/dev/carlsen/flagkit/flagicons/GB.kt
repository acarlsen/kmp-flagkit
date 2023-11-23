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

val FlagIcons.GB: ImageVector
    get() {
        if (_gb != null) {
            return _gb!!
        }
        _gb = Builder(name = "Gb", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0A17A7), 1.0f to Color(0xFF030E88), start =
                    Offset(10.4981f,0.0f), end = Offset(10.4981f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0019f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.49815f,-1.4373f), end = Offset(10.49815f,16.4373f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0034f, 10.0f)
                lineTo(-0.0019f, 10.0f)
                lineTo(-0.0019f, 5.0f)
                lineTo(5.0034f, 5.0f)
                lineTo(-2.0821f, 0.2207f)
                lineTo(-0.9637f, -1.4373f)
                lineTo(7.9981f, 4.6075f)
                lineTo(7.9981f, -1.0f)
                lineTo(12.9981f, -1.0f)
                lineTo(12.9981f, 4.6075f)
                lineTo(21.96f, -1.4373f)
                lineTo(23.0784f, 0.2207f)
                lineTo(15.9928f, 5.0f)
                lineTo(20.9981f, 5.0f)
                lineTo(20.9981f, 10.0f)
                lineTo(15.9928f, 10.0f)
                lineTo(23.0784f, 14.7793f)
                lineTo(21.96f, 16.4373f)
                lineTo(12.9981f, 10.3925f)
                lineTo(12.9981f, 16.0f)
                lineTo(7.9981f, 16.0f)
                lineTo(7.9981f, 10.3925f)
                lineTo(-0.9637f, 16.4373f)
                lineTo(-2.0821f, 14.7793f)
                lineTo(5.0034f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDB1F35)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.1365f, 4.958f)
                lineTo(23.6355f, -1.2911f)
                curveTo(23.7509f, -1.367f, 23.7829f, -1.5221f, 23.707f, -1.6374f)
                curveTo(23.6311f, -1.7527f, 23.4761f, -1.7847f, 23.3607f, -1.7089f)
                lineTo(13.8617f, 4.5403f)
                curveTo(13.7463f, 4.6162f, 13.7143f, 4.7712f, 13.7902f, 4.8865f)
                curveTo(13.8661f, 5.0019f, 14.0211f, 5.0339f, 14.1365f, 4.958f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDB1F35)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.868f, 10.4804f)
                lineTo(23.3833f, 16.2201f)
                curveTo(23.4978f, 16.2972f, 23.6532f, 16.267f, 23.7304f, 16.1525f)
                curveTo(23.8076f, 16.038f, 23.7773f, 15.8826f, 23.6628f, 15.8055f)
                lineTo(15.1474f, 10.0658f)
                curveTo(15.0329f, 9.9887f, 14.8776f, 10.0189f, 14.8004f, 10.1334f)
                curveTo(14.7232f, 10.2479f, 14.7535f, 10.4033f, 14.868f, 10.4804f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDB1F35)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.142f, 4.5255f)
                lineTo(-2.7403f, -1.4605f)
                curveTo(-2.8548f, -1.5377f, -3.0102f, -1.5074f, -3.0873f, -1.393f)
                curveTo(-3.1645f, -1.2785f, -3.1342f, -1.1231f, -3.0197f, -1.0459f)
                lineTo(5.8625f, 4.9402f)
                curveTo(5.977f, 5.0173f, 6.1324f, 4.9871f, 6.2096f, 4.8726f)
                curveTo(6.2867f, 4.7581f, 6.2565f, 4.6027f, 6.142f, 4.5255f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDB1F35)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8275f, 9.9953f)
                lineTo(-3.0182f, 16.5245f)
                curveTo(-3.1332f, 16.6008f, -3.1647f, 16.7559f, -3.0883f, 16.871f)
                curveTo(-3.012f, 16.9861f, -2.8569f, 17.0175f, -2.7418f, 16.9412f)
                lineTo(7.1038f, 10.412f)
                curveTo(7.2189f, 10.3357f, 7.2503f, 10.1806f, 7.174f, 10.0655f)
                curveTo(7.0977f, 9.9504f, 6.9425f, 9.919f, 6.8275f, 9.9953f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE6273E), 1.0f to Color(0xFFCF152B), start =
                    Offset(10.4981f,0.0f), end = Offset(10.4981f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0019f, 9.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-9.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(-9.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gb!!
    }

private var _gb: ImageVector? = null
