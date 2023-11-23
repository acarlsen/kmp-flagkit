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

val FlagIcons.LB: ImageVector
    get() {
        if (_lb != null) {
            return _lb!!
        }
        _lb = Builder(name = "Lb", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF03340), 1.0f to Color(0xFFEB212E), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF03340), 1.0f to Color(0xFFEB212E), start =
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
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1FC065), 1.0f to Color(0xFF17A555), start =
                    Offset(10.501699f,5.1359f), end = Offset(10.501699f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.6502f, 9.3498f)
                curveTo(9.8434f, 9.1566f, 9.8418f, 8.8418f, 9.6473f, 8.6473f)
                lineTo(9.8527f, 8.8527f)
                curveTo(9.6579f, 8.6579f, 9.286f, 8.5535f, 9.0159f, 8.621f)
                lineTo(7.9841f, 8.879f)
                curveTo(7.7168f, 8.9458f, 7.6846f, 8.8616f, 7.9047f, 8.6965f)
                lineTo(9.0953f, 7.8035f)
                curveTo(9.3188f, 7.6359f, 9.2787f, 7.5f, 8.9922f, 7.5f)
                lineTo(8.5078f, 7.5f)
                curveTo(8.2274f, 7.5f, 8.1991f, 7.4005f, 8.4439f, 7.2781f)
                lineTo(9.5561f, 6.7219f)
                curveTo(9.8013f, 6.5994f, 9.7787f, 6.5f, 9.4922f, 6.5f)
                lineTo(9.0078f, 6.5f)
                curveTo(8.7274f, 6.5f, 8.6846f, 6.3616f, 8.9047f, 6.1965f)
                lineTo(10.0953f, 5.3035f)
                curveTo(10.3188f, 5.1359f, 10.6846f, 5.1384f, 10.9047f, 5.3035f)
                lineTo(12.0953f, 6.1965f)
                curveTo(12.3188f, 6.3641f, 12.2787f, 6.5f, 11.9922f, 6.5f)
                lineTo(11.5078f, 6.5f)
                curveTo(11.2274f, 6.5f, 11.1991f, 6.5995f, 11.4439f, 6.7219f)
                lineTo(12.5561f, 7.2781f)
                curveTo(12.8013f, 7.4006f, 12.7787f, 7.5f, 12.4922f, 7.5f)
                lineTo(12.0078f, 7.5f)
                curveTo(11.7274f, 7.5f, 11.6846f, 7.6384f, 11.9047f, 7.8035f)
                lineTo(13.0953f, 8.6965f)
                curveTo(13.3188f, 8.8641f, 13.286f, 8.9465f, 13.0159f, 8.879f)
                lineTo(11.9841f, 8.621f)
                curveTo(11.7168f, 8.5542f, 11.3418f, 8.6582f, 11.1473f, 8.8527f)
                lineTo(11.3527f, 8.6473f)
                curveTo(11.1579f, 8.8421f, 11.1563f, 9.1563f, 11.3498f, 9.3498f)
                lineTo(11.6502f, 9.6502f)
                curveTo(11.8434f, 9.8434f, 11.7842f, 10.0f, 11.5046f, 10.0f)
                lineTo(9.4954f, 10.0f)
                curveTo(9.2218f, 10.0f, 9.1563f, 9.8438f, 9.3498f, 9.6502f)
                lineTo(9.6502f, 9.3498f)
                close()
            }
        }
        .build()
        return _lb!!
    }

private var _lb: ImageVector? = null
