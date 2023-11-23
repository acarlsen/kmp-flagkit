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

val FlagIcons.ZM: ImageVector
    get() {
        if (_zm != null) {
            return _zm!!
        }
        _zm = Builder(name = "Zm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF2A8815), 1.0f to Color(0xFF35A51D), start =
                    Offset(10.5f,15.0f), end = Offset(10.5f,4.592426E-16f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEF8A34), 1.0f to Color(0xFFEC7E21), start =
                    Offset(16.53795f,1.3965f), end = Offset(16.53795f,4.6703f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.1957f, 3.624f)
                curveTo(16.1957f, 3.624f, 15.7926f, 3.7769f, 15.3622f, 3.624f)
                curveTo(15.0197f, 3.5022f, 14.6753f, 3.0904f, 14.3923f, 2.9474f)
                curveTo(14.2282f, 2.8644f, 14.5327f, 2.4691f, 14.2079f, 2.5758f)
                curveTo(13.8832f, 2.6825f, 13.3528f, 2.1868f, 13.3528f, 2.1868f)
                curveTo(13.3528f, 2.1868f, 12.8049f, 1.5189f, 13.612f, 1.5189f)
                curveTo(14.4191f, 1.5189f, 16.1216f, 2.0988f, 16.1216f, 2.0988f)
                curveTo(16.1216f, 2.0988f, 16.1853f, 1.7993f, 16.3242f, 1.6613f)
                curveTo(16.463f, 1.5233f, 16.5659f, 1.3965f, 16.7934f, 1.4309f)
                curveTo(17.0209f, 1.4653f, 17.1466f, 1.7858f, 17.1466f, 1.7858f)
                lineTo(16.7934f, 1.9206f)
                lineTo(16.7934f, 2.1868f)
                curveTo(16.7934f, 2.1868f, 19.1547f, 1.4626f, 19.7129f, 1.5189f)
                curveTo(20.271f, 1.5752f, 19.8218f, 2.1876f, 19.4849f, 2.5758f)
                curveTo(19.3545f, 2.726f, 18.929f, 3.0319f, 18.6702f, 2.7866f)
                curveTo(18.4115f, 2.5413f, 18.5075f, 3.0518f, 18.2393f, 3.2166f)
                curveTo(17.802f, 3.4854f, 17.6378f, 3.7317f, 17.4875f, 3.8034f)
                curveTo(17.3371f, 3.8751f, 17.0083f, 3.8034f, 17.0083f, 3.8034f)
                lineTo(17.1044f, 4.0499f)
                curveTo(17.1044f, 4.0499f, 17.1313f, 4.3462f, 17.0083f, 4.4644f)
                curveTo(16.8853f, 4.5825f, 16.7998f, 4.6658f, 16.5f, 4.6304f)
                curveTo(16.2002f, 4.595f, 16.0587f, 4.6703f, 15.959f, 4.3405f)
                curveTo(15.8594f, 4.0108f, 16.1957f, 3.624f, 16.1957f, 3.624f)
                close()
                moveTo(16.4427f, 3.2824f)
                lineTo(16.4427f, 4.0539f)
                lineTo(16.7819f, 3.7703f)
                lineTo(16.4427f, 3.2824f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF48D36), 1.0f to Color(0xFFEC7E21), start =
                    Offset(19.5f,6.0f), end = Offset(19.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(18.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(16.5f,6.0f), end = Offset(16.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEC322B), 1.0f to Color(0xFFDB261F), start =
                    Offset(13.5f,6.0f), end = Offset(13.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _zm!!
    }

private var _zm: ImageVector? = null
