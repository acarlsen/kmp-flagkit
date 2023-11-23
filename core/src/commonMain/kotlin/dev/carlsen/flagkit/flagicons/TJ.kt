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

val FlagIcons.TJ: ImageVector
    get() {
        if (_tj != null) {
            return _tj!!
        }
        _tj = Builder(name = "Tj", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFD9101C), 1.0f to Color(0xFFCA0814), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0F7811), 1.0f to Color(0xFF0A650C), start =
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
            path(fill = SolidColor(Color(0xFFFAD14E)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.066f, 8.0f)
                curveTo(10.024f, 7.7825f, 10.0f, 7.5904f, 10.0f, 7.5f)
                curveTo(10.0f, 7.2239f, 10.2239f, 7.0f, 10.5f, 7.0f)
                curveTo(10.7761f, 7.0f, 11.0f, 7.2239f, 11.0f, 7.5f)
                curveTo(11.0f, 7.5904f, 10.976f, 7.7825f, 10.934f, 8.0f)
                lineTo(11.5046f, 8.0f)
                curveTo(11.7782f, 8.0f, 12.0f, 8.2319f, 12.0f, 8.5f)
                curveTo(12.0f, 8.7761f, 11.7842f, 9.0f, 11.5046f, 9.0f)
                lineTo(9.4954f, 9.0f)
                curveTo(9.2218f, 9.0f, 9.0f, 8.7681f, 9.0f, 8.5f)
                curveTo(9.0f, 8.2239f, 9.2158f, 8.0f, 9.4954f, 8.0f)
                lineTo(10.066f, 8.0f)
                lineTo(10.066f, 8.0f)
                close()
                moveTo(9.5f, 7.0f)
                curveTo(9.2239f, 7.0f, 9.0f, 6.7761f, 9.0f, 6.5f)
                curveTo(9.0f, 6.2239f, 9.2239f, 6.0f, 9.5f, 6.0f)
                curveTo(9.7761f, 6.0f, 10.0f, 6.2239f, 10.0f, 6.5f)
                curveTo(10.0f, 6.7761f, 9.7761f, 7.0f, 9.5f, 7.0f)
                close()
                moveTo(11.5f, 7.0f)
                curveTo(11.2239f, 7.0f, 11.0f, 6.7761f, 11.0f, 6.5f)
                curveTo(11.0f, 6.2239f, 11.2239f, 6.0f, 11.5f, 6.0f)
                curveTo(11.7761f, 6.0f, 12.0f, 6.2239f, 12.0f, 6.5f)
                curveTo(12.0f, 6.7761f, 11.7761f, 7.0f, 11.5f, 7.0f)
                close()
                moveTo(13.5f, 8.0f)
                curveTo(13.2239f, 8.0f, 13.0f, 7.7761f, 13.0f, 7.5f)
                curveTo(13.0f, 7.2239f, 13.2239f, 7.0f, 13.5f, 7.0f)
                curveTo(13.7761f, 7.0f, 14.0f, 7.2239f, 14.0f, 7.5f)
                curveTo(14.0f, 7.7761f, 13.7761f, 8.0f, 13.5f, 8.0f)
                close()
                moveTo(7.5f, 8.0f)
                curveTo(7.2239f, 8.0f, 7.0f, 7.7761f, 7.0f, 7.5f)
                curveTo(7.0f, 7.2239f, 7.2239f, 7.0f, 7.5f, 7.0f)
                curveTo(7.7761f, 7.0f, 8.0f, 7.2239f, 8.0f, 7.5f)
                curveTo(8.0f, 7.7761f, 7.7761f, 8.0f, 7.5f, 8.0f)
                close()
            }
        }
        .build()
        return _tj!!
    }

private var _tj: ImageVector? = null
