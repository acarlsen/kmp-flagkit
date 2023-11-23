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

val FlagIcons.BA: ImageVector
    get() {
        if (_ba != null) {
            return _ba!!
        }
        _ba = Builder(name = "Ba", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0B36B2), 1.0f to Color(0xFF042993), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD045), 1.0f to Color(0xFFFECA2F), start =
                    Offset(11.75f,0.0f), end = Offset(11.75f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.0f, 15.0f)
                lineToRelative(0.0f, -15.0f)
                lineToRelative(-10.5f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(13.0f,12.7929f), end = Offset(13.0f,14.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 14.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(11.0f,9.7929f), end = Offset(11.0f,11.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.0f, 11.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(9.0f,6.7929f), end = Offset(9.0f,8.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 8.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(7.0f,3.7929f), end = Offset(7.0f,5.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.0f,0.79289997f), end = Offset(5.0f,2.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
        }
        .build()
        return _ba!!
    }

private var _ba: ImageVector? = null
