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

val FlagIcons.BV: ImageVector
    get() {
        if (_bv != null) {
            return _bv!!
        }
        _bv = Builder(name = "Bv", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF14247), 1.0f to Color(0xFFED2F35), start =
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
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 9.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(12.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-12.0f, 0.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(-6.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0A3A85), 1.0f to Color(0xFF032A67), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(13.0f, 0.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(-13.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(-7.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bv!!
    }

private var _bv: ImageVector? = null
