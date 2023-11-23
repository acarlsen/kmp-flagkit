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

val FlagIcons.EG: ImageVector
    get() {
        if (_eg != null) {
            return _eg!!
        }
        _eg = Builder(name = "Eg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE41D33), 1.0f to Color(0xFFCE1126), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF4B32E)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.25f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin
                    = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 6.4954f)
                curveTo(8.0f, 6.2218f, 8.2319f, 6.0f, 8.5f, 6.0f)
                lineTo(8.7477f, 6.0f)
                curveTo(8.887f, 6.0f, 9.0461f, 6.0923f, 9.116f, 6.2319f)
                lineTo(9.5f, 7.0f)
                curveTo(9.5f, 7.0f, 10.0493f, 6.0f, 10.5f, 6.0f)
                curveTo(11.0f, 6.0f, 11.5f, 7.0f, 11.5f, 7.0f)
                lineTo(11.884f, 6.2319f)
                curveTo(11.9481f, 6.1038f, 12.107f, 6.0f, 12.2523f, 6.0f)
                lineTo(12.5f, 6.0f)
                curveTo(12.7761f, 6.0f, 13.0f, 6.2158f, 13.0f, 6.4954f)
                lineTo(13.0f, 8.5046f)
                curveTo(13.0f, 8.7782f, 12.8161f, 8.8774f, 12.5901f, 8.7267f)
                lineTo(11.5f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 8.5f)
                curveTo(11.0f, 8.7761f, 10.7681f, 9.0f, 10.5f, 9.0f)
                lineTo(10.5f, 9.0f)
                curveTo(10.2239f, 9.0f, 10.0f, 8.7681f, 10.0f, 8.5f)
                lineTo(10.0f, 8.0f)
                lineTo(9.5f, 8.0f)
                lineTo(8.4099f, 8.7267f)
                curveTo(8.1835f, 8.8777f, 8.0f, 8.7842f, 8.0f, 8.5046f)
                lineTo(8.0f, 6.4954f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC6A846)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 8.0657f)
                lineTo(12.5f, 6.5f)
                lineTo(12.309f, 6.5f)
                lineTo(11.7696f, 7.5788f)
                lineTo(12.5f, 8.0657f)
                close()
                moveTo(8.691f, 6.5f)
                lineTo(8.5007f, 6.5f)
                curveTo(8.5004f, 6.4993f, 8.5f, 6.498f, 8.5f, 6.4954f)
                lineTo(8.5f, 8.0657f)
                lineTo(9.2304f, 7.5788f)
                lineTo(8.691f, 6.5f)
                close()
                moveTo(10.5f, 7.5f)
                lineTo(10.5f, 8.5f)
                lineTo(10.5f, 7.5f)
                lineTo(11.191f, 7.5f)
                lineTo(11.0528f, 7.2236f)
                curveTo(11.0025f, 7.1231f, 10.907f, 6.9593f, 10.7875f, 6.8f)
                curveTo(10.6669f, 6.6392f, 10.5563f, 6.5395f, 10.5157f, 6.5095f)
                curveTo(10.4428f, 6.5564f, 10.3378f, 6.6622f, 10.2263f, 6.8062f)
                curveTo(10.0998f, 6.9694f, 9.9954f, 7.1367f, 9.9382f, 7.2407f)
                lineTo(9.7958f, 7.5f)
                lineTo(10.5f, 7.5f)
                close()
                moveTo(11.3739f, 6.7764f)
                curveTo(11.4532f, 6.9064f, 11.5f, 7.0f, 11.5f, 7.0f)
                lineTo(11.6118f, 6.7764f)
                curveTo(11.6118f, 6.7764f, 11.8434f, 6.5807f, 11.7686f, 6.4627f)
                lineTo(11.884f, 6.2319f)
                curveTo(11.9481f, 6.1038f, 12.107f, 6.0f, 12.2523f, 6.0f)
                lineTo(12.5f, 6.0f)
                curveTo(12.7761f, 6.0f, 13.0f, 6.2158f, 13.0f, 6.4954f)
                lineTo(13.0f, 8.5046f)
                curveTo(13.0f, 8.7782f, 12.8161f, 8.8774f, 12.5901f, 8.7267f)
                lineTo(11.5f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 8.5f)
                curveTo(11.0f, 8.7761f, 10.7681f, 9.0f, 10.5f, 9.0f)
                curveTo(10.2239f, 9.0f, 10.0f, 8.7681f, 10.0f, 8.5f)
                lineTo(10.0f, 8.0f)
                lineTo(9.5f, 8.0f)
                lineTo(8.4099f, 8.7267f)
                curveTo(8.1835f, 8.8777f, 8.0f, 8.7842f, 8.0f, 8.5046f)
                lineTo(8.0f, 6.4954f)
                curveTo(8.0f, 6.2218f, 8.2319f, 6.0f, 8.5f, 6.0f)
                lineTo(8.7477f, 6.0f)
                curveTo(8.887f, 6.0f, 9.0461f, 6.0923f, 9.116f, 6.2319f)
                lineTo(9.2362f, 6.4724f)
                curveTo(9.1648f, 6.5803f, 9.3827f, 6.7655f, 9.3827f, 6.7655f)
                lineTo(9.5f, 7.0f)
                curveTo(9.5f, 7.0f, 9.553f, 6.9035f, 9.6396f, 6.7704f)
                lineTo(9.8177f, 6.5173f)
                curveTo(10.0131f, 6.2617f, 10.2695f, 6.0f, 10.5f, 6.0f)
                curveTo(10.7509f, 6.0f, 11.0019f, 6.2519f, 11.1896f, 6.5028f)
                lineTo(11.3739f, 6.7764f)
                close()
            }
        }
        .build()
        return _eg!!
    }

private var _eg: ImageVector? = null
