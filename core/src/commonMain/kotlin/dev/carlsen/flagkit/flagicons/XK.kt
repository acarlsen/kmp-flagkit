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

val FlagIcons.XK: ImageVector
    get() {
        if (_xk != null) {
            return _xk!!
        }
        _xk = Builder(name = "Xk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF2F5FBF), 1.0f to Color(0xFF244EA3), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,2.2929f), end = Offset(10.5f,6.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 3.5f)
                lineTo(8.2929f, 3.7071f)
                lineTo(8.5f, 3.0f)
                lineTo(8.2929f, 2.2929f)
                lineTo(9.0f, 2.5f)
                lineTo(9.7071f, 2.2929f)
                lineTo(9.5f, 3.0f)
                lineTo(9.7071f, 3.7071f)
                lineTo(9.0f, 3.5f)
                close()
                moveTo(12.0f, 3.5f)
                lineTo(11.2929f, 3.7071f)
                lineTo(11.5f, 3.0f)
                lineTo(11.2929f, 2.2929f)
                lineTo(12.0f, 2.5f)
                lineTo(12.7071f, 2.2929f)
                lineTo(12.5f, 3.0f)
                lineTo(12.7071f, 3.7071f)
                lineTo(12.0f, 3.5f)
                close()
                moveTo(15.0f, 4.5f)
                lineTo(14.2929f, 4.7071f)
                lineTo(14.5f, 4.0f)
                lineTo(14.2929f, 3.2929f)
                lineTo(15.0f, 3.5f)
                lineTo(15.7071f, 3.2929f)
                lineTo(15.5f, 4.0f)
                lineTo(15.7071f, 4.7071f)
                lineTo(15.0f, 4.5f)
                close()
                moveTo(17.0f, 6.5f)
                lineTo(16.2929f, 6.7071f)
                lineTo(16.5f, 6.0f)
                lineTo(16.2929f, 5.2929f)
                lineTo(17.0f, 5.5f)
                lineTo(17.7071f, 5.2929f)
                lineTo(17.5f, 6.0f)
                lineTo(17.7071f, 6.7071f)
                lineTo(17.0f, 6.5f)
                close()
                moveTo(4.0f, 6.5f)
                lineTo(3.2929f, 6.7071f)
                lineTo(3.5f, 6.0f)
                lineTo(3.2929f, 5.2929f)
                lineTo(4.0f, 5.5f)
                lineTo(4.7071f, 5.2929f)
                lineTo(4.5f, 6.0f)
                lineTo(4.7071f, 6.7071f)
                lineTo(4.0f, 6.5f)
                close()
                moveTo(6.0f, 4.5f)
                lineTo(5.2929f, 4.7071f)
                lineTo(5.5f, 4.0f)
                lineTo(5.2929f, 3.2929f)
                lineTo(6.0f, 3.5f)
                lineTo(6.7071f, 3.2929f)
                lineTo(6.5f, 4.0f)
                lineTo(6.7071f, 4.7071f)
                lineTo(6.0f, 4.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE9C072), 1.0f to Color(0xFFCFA557), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 10.0f)
                lineToRelative(-1.0f, -0.5f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(0.5f, -1.0f)
                lineToRelative(1.0f, -0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(1.0f, 0.5f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(1.5f, 1.0f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-0.5f, -1.0f)
                lineToRelative(-1.5f, 1.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _xk!!
    }

private var _xk: ImageVector? = null
