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

val FlagIcons.BH: ImageVector
    get() {
        if (_bh != null) {
            return _bh!!
        }
        _bh = Builder(name = "Bh", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE7243B), 1.0f to Color(0xFFCC162C), start =
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
                    Offset(3.75f,0.0f), end = Offset(3.75f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 15.0f)
                lineToRelative(7.5f, 0.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.5f, -1.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(-6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bh!!
    }

private var _bh: ImageVector? = null
