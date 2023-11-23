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

val FlagIcons.KZ: ImageVector
    get() {
        if (_kz != null) {
            return _kz!!
        }
        _kz = Builder(name = "Kz", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF30C6E0), 1.0f to Color(0xFF1CB0C9), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFCD4B), 1.0f to Color(0xFFFEC531), start =
                    Offset(10.5f,4.5f), end = Offset(10.5f,10.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFCD4B), 1.0f to Color(0xFFFEC531), start =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFCD4B), 1.0f to Color(0xFFFEC531), start =
                    Offset(2.0f,1.0f), end = Offset(2.0f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.0f, 1.2523f)
                curveTo(1.0f, 1.113f, 1.107f, 1.0f, 1.2523f, 1.0f)
                lineTo(1.7477f, 1.0f)
                curveTo(1.887f, 1.0f, 2.0f, 1.107f, 2.0f, 1.2523f)
                lineTo(2.0f, 1.7477f)
                curveTo(2.0f, 1.887f, 1.893f, 2.0f, 1.7477f, 2.0f)
                lineTo(1.2523f, 2.0f)
                curveTo(1.113f, 2.0f, 1.0f, 1.893f, 1.0f, 1.7477f)
                lineTo(1.0f, 1.2523f)
                close()
                moveTo(1.0f, 3.2523f)
                curveTo(1.0f, 3.113f, 1.107f, 3.0f, 1.2523f, 3.0f)
                lineTo(1.7477f, 3.0f)
                curveTo(1.887f, 3.0f, 2.0f, 3.107f, 2.0f, 3.2523f)
                lineTo(2.0f, 3.7477f)
                curveTo(2.0f, 3.887f, 1.893f, 4.0f, 1.7477f, 4.0f)
                lineTo(1.2523f, 4.0f)
                curveTo(1.113f, 4.0f, 1.0f, 3.893f, 1.0f, 3.7477f)
                lineTo(1.0f, 3.2523f)
                close()
                moveTo(1.0f, 5.2523f)
                curveTo(1.0f, 5.113f, 1.107f, 5.0f, 1.2523f, 5.0f)
                lineTo(1.7477f, 5.0f)
                curveTo(1.887f, 5.0f, 2.0f, 5.107f, 2.0f, 5.2523f)
                lineTo(2.0f, 5.7477f)
                curveTo(2.0f, 5.887f, 1.893f, 6.0f, 1.7477f, 6.0f)
                lineTo(1.2523f, 6.0f)
                curveTo(1.113f, 6.0f, 1.0f, 5.893f, 1.0f, 5.7477f)
                lineTo(1.0f, 5.2523f)
                close()
                moveTo(1.0f, 7.2523f)
                curveTo(1.0f, 7.113f, 1.107f, 7.0f, 1.2523f, 7.0f)
                lineTo(1.7477f, 7.0f)
                curveTo(1.887f, 7.0f, 2.0f, 7.107f, 2.0f, 7.2523f)
                lineTo(2.0f, 7.7477f)
                curveTo(2.0f, 7.887f, 1.893f, 8.0f, 1.7477f, 8.0f)
                lineTo(1.2523f, 8.0f)
                curveTo(1.113f, 8.0f, 1.0f, 7.893f, 1.0f, 7.7477f)
                lineTo(1.0f, 7.2523f)
                close()
                moveTo(1.0f, 9.2523f)
                curveTo(1.0f, 9.113f, 1.107f, 9.0f, 1.2523f, 9.0f)
                lineTo(1.7477f, 9.0f)
                curveTo(1.887f, 9.0f, 2.0f, 9.107f, 2.0f, 9.2523f)
                lineTo(2.0f, 9.7477f)
                curveTo(2.0f, 9.887f, 1.893f, 10.0f, 1.7477f, 10.0f)
                lineTo(1.2523f, 10.0f)
                curveTo(1.113f, 10.0f, 1.0f, 9.893f, 1.0f, 9.7477f)
                lineTo(1.0f, 9.2523f)
                close()
                moveTo(1.0f, 11.2523f)
                curveTo(1.0f, 11.113f, 1.107f, 11.0f, 1.2523f, 11.0f)
                lineTo(1.7477f, 11.0f)
                curveTo(1.887f, 11.0f, 2.0f, 11.107f, 2.0f, 11.2523f)
                lineTo(2.0f, 11.7477f)
                curveTo(2.0f, 11.887f, 1.893f, 12.0f, 1.7477f, 12.0f)
                lineTo(1.2523f, 12.0f)
                curveTo(1.113f, 12.0f, 1.0f, 11.893f, 1.0f, 11.7477f)
                lineTo(1.0f, 11.2523f)
                close()
                moveTo(1.0f, 13.2523f)
                curveTo(1.0f, 13.113f, 1.107f, 13.0f, 1.2523f, 13.0f)
                lineTo(1.7477f, 13.0f)
                curveTo(1.887f, 13.0f, 2.0f, 13.107f, 2.0f, 13.2523f)
                lineTo(2.0f, 13.7477f)
                curveTo(2.0f, 13.887f, 1.893f, 14.0f, 1.7477f, 14.0f)
                lineTo(1.2523f, 14.0f)
                curveTo(1.113f, 14.0f, 1.0f, 13.893f, 1.0f, 13.7477f)
                lineTo(1.0f, 13.2523f)
                close()
                moveTo(2.0f, 12.2523f)
                curveTo(2.0f, 12.113f, 2.107f, 12.0f, 2.2523f, 12.0f)
                lineTo(2.7477f, 12.0f)
                curveTo(2.887f, 12.0f, 3.0f, 12.107f, 3.0f, 12.2523f)
                lineTo(3.0f, 12.7477f)
                curveTo(3.0f, 12.887f, 2.893f, 13.0f, 2.7477f, 13.0f)
                lineTo(2.2523f, 13.0f)
                curveTo(2.113f, 13.0f, 2.0f, 12.893f, 2.0f, 12.7477f)
                lineTo(2.0f, 12.2523f)
                close()
                moveTo(2.0f, 10.2523f)
                curveTo(2.0f, 10.113f, 2.107f, 10.0f, 2.2523f, 10.0f)
                lineTo(2.7477f, 10.0f)
                curveTo(2.887f, 10.0f, 3.0f, 10.107f, 3.0f, 10.2523f)
                lineTo(3.0f, 10.7477f)
                curveTo(3.0f, 10.887f, 2.893f, 11.0f, 2.7477f, 11.0f)
                lineTo(2.2523f, 11.0f)
                curveTo(2.113f, 11.0f, 2.0f, 10.893f, 2.0f, 10.7477f)
                lineTo(2.0f, 10.2523f)
                close()
                moveTo(2.0f, 8.2523f)
                curveTo(2.0f, 8.113f, 2.107f, 8.0f, 2.2523f, 8.0f)
                lineTo(2.7477f, 8.0f)
                curveTo(2.887f, 8.0f, 3.0f, 8.107f, 3.0f, 8.2523f)
                lineTo(3.0f, 8.7477f)
                curveTo(3.0f, 8.887f, 2.893f, 9.0f, 2.7477f, 9.0f)
                lineTo(2.2523f, 9.0f)
                curveTo(2.113f, 9.0f, 2.0f, 8.893f, 2.0f, 8.7477f)
                lineTo(2.0f, 8.2523f)
                close()
                moveTo(2.0f, 6.2523f)
                curveTo(2.0f, 6.113f, 2.107f, 6.0f, 2.2523f, 6.0f)
                lineTo(2.7477f, 6.0f)
                curveTo(2.887f, 6.0f, 3.0f, 6.107f, 3.0f, 6.2523f)
                lineTo(3.0f, 6.7477f)
                curveTo(3.0f, 6.887f, 2.893f, 7.0f, 2.7477f, 7.0f)
                lineTo(2.2523f, 7.0f)
                curveTo(2.113f, 7.0f, 2.0f, 6.893f, 2.0f, 6.7477f)
                lineTo(2.0f, 6.2523f)
                close()
                moveTo(2.0f, 4.2523f)
                curveTo(2.0f, 4.113f, 2.107f, 4.0f, 2.2523f, 4.0f)
                lineTo(2.7477f, 4.0f)
                curveTo(2.887f, 4.0f, 3.0f, 4.107f, 3.0f, 4.2523f)
                lineTo(3.0f, 4.7477f)
                curveTo(3.0f, 4.887f, 2.893f, 5.0f, 2.7477f, 5.0f)
                lineTo(2.2523f, 5.0f)
                curveTo(2.113f, 5.0f, 2.0f, 4.893f, 2.0f, 4.7477f)
                lineTo(2.0f, 4.2523f)
                close()
                moveTo(2.0f, 2.2523f)
                curveTo(2.0f, 2.113f, 2.107f, 2.0f, 2.2523f, 2.0f)
                lineTo(2.7477f, 2.0f)
                curveTo(2.887f, 2.0f, 3.0f, 2.107f, 3.0f, 2.2523f)
                lineTo(3.0f, 2.7477f)
                curveTo(3.0f, 2.887f, 2.893f, 3.0f, 2.7477f, 3.0f)
                lineTo(2.2523f, 3.0f)
                curveTo(2.113f, 3.0f, 2.0f, 2.893f, 2.0f, 2.7477f)
                lineTo(2.0f, 2.2523f)
                close()
            }
        }
        .build()
        return _kz!!
    }

private var _kz: ImageVector? = null
