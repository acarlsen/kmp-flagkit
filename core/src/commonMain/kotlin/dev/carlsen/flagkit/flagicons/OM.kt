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

val FlagIcons.OM: ImageVector
    get() {
        if (_om != null) {
            return _om!!
        }
        _om = Builder(name = "Om", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF138E16), 1.0f to Color(0xFF0F7F12), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED2B35), 1.0f to Color(0xFFD91B25), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 15.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-7.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(3.4999003f,0.99999976f), end = Offset(3.4999003f,4.8019f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 3.5338f)
                lineToRelative(-0.8678f, 1.2681f)
                lineToRelative(0.4504f, -1.4691f)
                lineToRelative(-1.5325f, 0.1122f)
                lineToRelative(1.4294f, -0.5638f)
                lineToRelative(-1.0432f, -1.1282f)
                lineToRelative(1.332f, 0.766f)
                lineToRelative(0.2316f, -1.519f)
                lineToRelative(0.2316f, 1.519f)
                lineToRelative(1.332f, -0.766f)
                lineToRelative(-1.0432f, 1.1282f)
                lineToRelative(1.4294f, 0.5638f)
                lineToRelative(-1.5325f, -0.1122f)
                lineToRelative(0.4504f, 1.4691f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(14.0f,0.0f), end = Offset(14.0f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-14.0f)
                close()
            }
        }
        .build()
        return _om!!
    }

private var _om: ImageVector? = null
