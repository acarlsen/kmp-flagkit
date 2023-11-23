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

val FlagIcons.WS: ImageVector
    get() {
        if (_ws != null) {
            return _ws!!
        }
        _ws = Builder(name = "Ws", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE31F37), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF083B9A), 1.0f to Color(0xFF042E7D), start =
                    Offset(5.5f,0.0f), end = Offset(5.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-11.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.25f,0.7929f), end = Offset(5.25f,7.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 7.0f)
                lineTo(4.2929f, 7.2071f)
                lineTo(4.5f, 6.5f)
                lineTo(4.2929f, 5.7929f)
                lineTo(5.0f, 6.0f)
                lineTo(5.7071f, 5.7929f)
                lineTo(5.5f, 6.5f)
                lineTo(5.7071f, 7.2071f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(5.0f, 2.0f)
                lineTo(4.2929f, 2.2071f)
                lineTo(4.5f, 1.5f)
                lineTo(4.2929f, 0.7929f)
                lineTo(5.0f, 1.0f)
                lineTo(5.7071f, 0.7929f)
                lineTo(5.5f, 1.5f)
                lineTo(5.7071f, 2.2071f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(3.0f, 4.5f)
                lineTo(2.2929f, 4.7071f)
                lineTo(2.5f, 4.0f)
                lineTo(2.2929f, 3.2929f)
                lineTo(3.0f, 3.5f)
                lineTo(3.7071f, 3.2929f)
                lineTo(3.5f, 4.0f)
                lineTo(3.7071f, 4.7071f)
                lineTo(3.0f, 4.5f)
                close()
                moveTo(7.5f, 4.0f)
                lineTo(6.7929f, 4.2071f)
                lineTo(7.0f, 3.5f)
                lineTo(6.7929f, 2.7929f)
                lineTo(7.5f, 3.0f)
                lineTo(8.2071f, 2.7929f)
                lineTo(8.0f, 3.5f)
                lineTo(8.2071f, 4.2071f)
                lineTo(7.5f, 4.0f)
                close()
                moveTo(6.25f, 5.5f)
                curveTo(6.1119f, 5.5f, 6.0f, 5.3881f, 6.0f, 5.25f)
                curveTo(6.0f, 5.1119f, 6.1119f, 5.0f, 6.25f, 5.0f)
                curveTo(6.3881f, 5.0f, 6.5f, 5.1119f, 6.5f, 5.25f)
                curveTo(6.5f, 5.3881f, 6.3881f, 5.5f, 6.25f, 5.5f)
                close()
            }
        }
        .build()
        return _ws!!
    }

private var _ws: ImageVector? = null
