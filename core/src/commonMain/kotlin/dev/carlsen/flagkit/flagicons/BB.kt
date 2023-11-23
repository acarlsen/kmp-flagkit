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

val FlagIcons.BB: ImageVector
    get() {
        if (_bb != null) {
            return _bb!!
        }
        _bb = Builder(name = "Bb", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1132C7), 1.0f to Color(0xFF0522A5), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF08379D), 1.0f to Color(0xFF042A7D), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF08379D), 1.0f to Color(0xFF042A7D), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFCC50), 1.0f to Color(0xFFFFC63C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.501249f,4.5934f), end = Offset(10.501249f,10.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.3783f, 4.7086f)
                curveTo(10.4566f, 4.5934f, 10.5844f, 4.5984f, 10.6564f, 4.7086f)
                lineTo(11.3638f, 5.7914f)
                curveTo(11.439f, 5.9066f, 11.3828f, 6.0f, 11.2461f, 6.0f)
                lineTo(11.0039f, 6.0f)
                curveTo(10.8637f, 6.0f, 10.7607f, 6.1074f, 10.7749f, 6.2488f)
                lineTo(10.9751f, 8.2512f)
                curveTo(10.9889f, 8.3886f, 11.116f, 8.5f, 11.25f, 8.5f)
                curveTo(11.3881f, 8.5f, 11.5781f, 8.4227f, 11.6805f, 8.3214f)
                lineTo(11.8195f, 8.1839f)
                curveTo(11.9192f, 8.0853f, 12.0f, 7.8978f, 12.0f, 7.7517f)
                lineTo(12.0f, 7.2537f)
                curveTo(12.0f, 7.1136f, 11.9219f, 6.9219f, 11.8195f, 6.8195f)
                lineTo(11.6805f, 6.6805f)
                curveTo(11.5808f, 6.5808f, 11.5984f, 6.4672f, 11.7344f, 6.4219f)
                lineTo(12.7656f, 6.0781f)
                curveTo(12.8951f, 6.035f, 12.9802f, 6.1074f, 12.9542f, 6.2488f)
                lineTo(12.586f, 8.2512f)
                curveTo(12.5607f, 8.3886f, 12.4586f, 8.5785f, 12.359f, 8.6742f)
                lineTo(11.6812f, 9.3258f)
                curveTo(11.5811f, 9.422f, 11.384f, 9.5f, 11.25f, 9.5f)
                curveTo(11.1119f, 9.5f, 11.0f, 9.607f, 11.0f, 9.7523f)
                lineTo(11.0f, 10.2477f)
                curveTo(11.0f, 10.387f, 10.893f, 10.5f, 10.7477f, 10.5f)
                lineTo(10.2523f, 10.5f)
                curveTo(10.113f, 10.5f, 10.0f, 10.393f, 10.0f, 10.2477f)
                lineTo(10.0f, 9.7523f)
                curveTo(10.0f, 9.613f, 9.884f, 9.5f, 9.75f, 9.5f)
                curveTo(9.6119f, 9.5f, 9.4215f, 9.4215f, 9.3258f, 9.3258f)
                lineTo(8.6742f, 8.6742f)
                curveTo(8.578f, 8.578f, 8.4785f, 8.3926f, 8.4502f, 8.2512f)
                lineTo(8.0498f, 6.2488f)
                curveTo(8.0223f, 6.1114f, 8.0984f, 6.0328f, 8.2344f, 6.0781f)
                lineTo(9.2656f, 6.4219f)
                curveTo(9.3951f, 6.465f, 9.4219f, 6.5781f, 9.3195f, 6.6805f)
                lineTo(9.1805f, 6.8195f)
                curveTo(9.0808f, 6.9192f, 9.0f, 7.1076f, 9.0f, 7.2537f)
                lineTo(9.0f, 7.7517f)
                curveTo(9.0f, 7.8918f, 9.0781f, 8.0827f, 9.1805f, 8.1839f)
                lineTo(9.3195f, 8.3214f)
                curveTo(9.4192f, 8.4201f, 9.616f, 8.5f, 9.75f, 8.5f)
                curveTo(9.8881f, 8.5f, 10.0107f, 8.3926f, 10.0249f, 8.2512f)
                lineTo(10.2251f, 6.2488f)
                curveTo(10.2389f, 6.1114f, 10.1328f, 6.0f, 9.9961f, 6.0f)
                lineTo(9.7539f, 6.0f)
                curveTo(9.6137f, 6.0f, 9.5669f, 5.9016f, 9.6418f, 5.7914f)
                lineTo(10.3783f, 4.7086f)
                close()
            }
        }
        .build()
        return _bb!!
    }

private var _bb: ImageVector? = null
