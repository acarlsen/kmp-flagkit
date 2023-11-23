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

val FlagIcons.KG: ImageVector
    get() {
        if (_kg != null) {
            return _kg!!
        }
        _kg = Builder(name = "Kg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF22A46), 1.0f to Color(0xFFE71834), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFF04D), 1.0f to Color(0xFFFFEE35), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFF04D), 1.0f to Color(0xFFFFEE35), start =
                    Offset(10.5f,2.1379f), end = Offset(10.5f,12.8621f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 11.0352f)
                lineTo(9.2761f, 12.8621f)
                lineTo(8.9661f, 10.6851f)
                lineTo(7.0708f, 11.8001f)
                lineTo(7.7361f, 9.7042f)
                lineTo(5.5447f, 9.8864f)
                lineTo(7.0534f, 8.2867f)
                lineTo(5.0f, 7.5f)
                lineTo(7.0534f, 6.7133f)
                lineTo(5.5447f, 5.1136f)
                lineTo(7.7361f, 5.2958f)
                lineTo(7.0708f, 3.1999f)
                lineTo(8.9661f, 4.3149f)
                lineTo(9.2761f, 2.1379f)
                lineTo(10.5f, 3.9648f)
                lineTo(11.7239f, 2.1379f)
                lineTo(12.0339f, 4.3149f)
                lineTo(13.9292f, 3.1999f)
                lineTo(13.2639f, 5.2958f)
                lineTo(15.4553f, 5.1136f)
                lineTo(13.9466f, 6.7133f)
                lineTo(16.0f, 7.5f)
                lineTo(13.9466f, 8.2867f)
                lineTo(15.4553f, 9.8864f)
                lineTo(13.2639f, 9.7042f)
                lineTo(13.9292f, 11.8001f)
                lineTo(12.0339f, 10.6851f)
                lineTo(11.7239f, 12.8621f)
                lineTo(10.5f, 11.0352f)
                close()
                moveTo(10.5f, 11.0f)
                curveTo(12.433f, 11.0f, 14.0f, 9.433f, 14.0f, 7.5f)
                curveTo(14.0f, 5.567f, 12.433f, 4.0f, 10.5f, 4.0f)
                curveTo(8.567f, 4.0f, 7.0f, 5.567f, 7.0f, 7.5f)
                curveTo(7.0f, 9.433f, 8.567f, 11.0f, 10.5f, 11.0f)
                close()
            }
        }
        .build()
        return _kg!!
    }

private var _kg: ImageVector? = null
