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

val FlagIcons.TG: ImageVector
    get() {
        if (_tg != null) {
            return _tg!!
        }
        _tg = Builder(name = "Tg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFD44D), 1.0f to Color(0xFFFFCD2F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF159A74), 1.0f to Color(0xFF0C6A4F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 0.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED1F45), 1.0f to Color(0xFFD01739), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.4999995f,1.5f), end = Offset(4.4999995f,6.9271f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.5f, 5.67f)
                lineToRelative(-1.7634f, 1.2571f)
                lineToRelative(0.6506f, -2.0655f)
                lineToRelative(-1.7404f, -1.2886f)
                lineToRelative(2.1655f, -0.0195f)
                lineToRelative(0.6877f, -2.0535f)
                lineToRelative(0.6877f, 2.0535f)
                lineToRelative(2.1655f, 0.0195f)
                lineToRelative(-1.7404f, 1.2886f)
                lineToRelative(0.6506f, 2.0655f)
                close()
            }
        }
        .build()
        return _tg!!
    }

private var _tg: ImageVector? = null
