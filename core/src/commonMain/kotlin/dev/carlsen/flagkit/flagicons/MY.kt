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

val FlagIcons.MY: ImageVector
    get() {
        if (_my != null) {
            return _my!!
        }
        _my = Builder(name = "My", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE1244A), 1.0f to Color(0xFFBE1134), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 1.0f)
                lineTo(10.0f, 1.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(10.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                lineTo(21.0f, 3.0f)
                lineTo(10.0f, 3.0f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(10.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                lineTo(21.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(0.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(0.0f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(0.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 14.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0C3F8E), 1.0f to Color(0xFF032A67), start =
                    Offset(6.0f,0.0f), end = Offset(6.0f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD34F), 1.0f to Color(0xFFFFCB2F), start =
                    Offset(5.97495f,1.0f), end = Offset(5.97495f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.8736f, 1.6569f)
                curveTo(6.6017f, 1.5555f, 6.3073f, 1.5f, 6.0f, 1.5f)
                curveTo(4.6193f, 1.5f, 3.5f, 2.6193f, 3.5f, 4.0f)
                curveTo(3.5f, 5.3807f, 4.6193f, 6.5f, 6.0f, 6.5f)
                curveTo(6.3073f, 6.5f, 6.6017f, 6.4445f, 6.8736f, 6.3431f)
                curveTo(6.3602f, 6.7542f, 5.7088f, 7.0f, 5.0f, 7.0f)
                curveTo(3.3431f, 7.0f, 2.0f, 5.6569f, 2.0f, 4.0f)
                curveTo(2.0f, 2.3431f, 3.3431f, 1.0f, 5.0f, 1.0f)
                curveTo(5.7088f, 1.0f, 6.3602f, 1.2458f, 6.8736f, 1.6569f)
                close()
                moveTo(8.0f, 4.82f)
                lineTo(7.1322f, 5.8019f)
                lineTo(7.3589f, 4.5113f)
                lineTo(6.0501f, 4.445f)
                lineTo(7.2006f, 3.8175f)
                lineTo(6.4363f, 2.753f)
                lineTo(7.6442f, 3.2612f)
                lineTo(8.0f, 2.0f)
                lineTo(8.3558f, 3.2612f)
                lineTo(9.5637f, 2.753f)
                lineTo(8.7994f, 3.8175f)
                lineTo(9.9499f, 4.445f)
                lineTo(8.6411f, 4.5113f)
                lineTo(8.8678f, 5.8019f)
                lineTo(8.0f, 4.82f)
                close()
            }
        }
        .build()
        return _my!!
    }

private var _my: ImageVector? = null
