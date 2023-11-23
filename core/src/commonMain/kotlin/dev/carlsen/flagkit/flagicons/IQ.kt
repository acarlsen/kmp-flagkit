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

val FlagIcons.IQ: ImageVector
    get() {
        if (_iq != null) {
            return _iq!!
        }
        _iq = Builder(name = "Iq", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDF1E35), 1.0f to Color(0xFFCC162C), start =
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
            path(fill = SolidColor(Color(0xFF0F7A40)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0f, 6.2558f)
                curveTo(14.0f, 6.1145f, 14.0923f, 6.0461f, 14.2319f, 6.116f)
                lineTo(14.7681f, 6.384f)
                curveTo(14.8962f, 6.4481f, 15.0f, 6.6074f, 15.0f, 6.7488f)
                lineTo(15.0f, 8.7512f)
                curveTo(15.0f, 8.8886f, 14.893f, 9.0f, 14.7477f, 9.0f)
                lineTo(14.2523f, 9.0f)
                curveTo(14.113f, 9.0f, 14.0f, 8.8861f, 14.0f, 8.7442f)
                lineTo(14.0f, 6.2558f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F7A40)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 6.2558f)
                curveTo(8.0f, 6.1145f, 8.0923f, 6.0461f, 8.2319f, 6.116f)
                lineTo(8.7681f, 6.384f)
                curveTo(8.8962f, 6.4481f, 9.0f, 6.6074f, 9.0f, 6.7488f)
                lineTo(9.0f, 8.7512f)
                curveTo(9.0f, 8.8886f, 8.893f, 9.0f, 8.7477f, 9.0f)
                lineTo(8.2523f, 9.0f)
                curveTo(8.113f, 9.0f, 8.0f, 8.8861f, 8.0f, 8.7442f)
                lineTo(8.0f, 6.2558f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F7A40)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 6.7488f)
                curveTo(12.0f, 6.6114f, 12.0923f, 6.4539f, 12.2319f, 6.384f)
                lineTo(12.7681f, 6.116f)
                curveTo(12.8962f, 6.0519f, 13.0f, 6.1139f, 13.0f, 6.2558f)
                lineTo(13.0f, 8.7442f)
                curveTo(13.0f, 8.8855f, 12.893f, 9.0f, 12.7477f, 9.0f)
                lineTo(12.2523f, 9.0f)
                curveTo(12.113f, 9.0f, 12.0f, 8.8926f, 12.0f, 8.7512f)
                lineTo(12.0f, 6.7488f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F7A40)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 7.7477f)
                curveTo(10.0f, 7.6109f, 10.0923f, 7.4539f, 10.2319f, 7.384f)
                lineTo(10.7681f, 7.116f)
                curveTo(10.8962f, 7.0519f, 11.0f, 7.1118f, 11.0f, 7.2423f)
                lineTo(11.0f, 8.0448f)
                lineTo(12.5f, 8.0448f)
                lineTo(12.5f, 9.0f)
                lineTo(11.2477f, 9.0f)
                curveTo(11.1109f, 9.0f, 10.893f, 9.0f, 10.7477f, 9.0f)
                lineTo(10.2523f, 9.0f)
                curveTo(10.113f, 9.0f, 10.0f, 8.8823f, 10.0f, 8.7523f)
                lineTo(10.0f, 7.7477f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F7A40)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 7.7477f)
                curveTo(6.0f, 7.6109f, 6.0923f, 7.4539f, 6.2319f, 7.384f)
                lineTo(6.7681f, 7.116f)
                curveTo(6.8962f, 7.0519f, 7.0f, 7.1118f, 7.0f, 7.2423f)
                lineTo(7.0f, 8.0448f)
                lineTo(8.5f, 8.0448f)
                lineTo(8.5f, 9.0f)
                lineTo(7.2477f, 9.0f)
                curveTo(7.1109f, 9.0f, 6.893f, 9.0f, 6.7477f, 9.0f)
                lineTo(6.2523f, 9.0f)
                curveTo(6.113f, 9.0f, 6.0f, 8.8823f, 6.0f, 8.7523f)
                lineTo(6.0f, 7.7477f)
                close()
            }
        }
        .build()
        return _iq!!
    }

private var _iq: ImageVector? = null
