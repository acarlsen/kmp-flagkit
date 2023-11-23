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

val FlagIcons.MT: ImageVector
    get() {
        if (_mt != null) {
            return _mt!!
        }
        _mt = Builder(name = "Mt", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDE233C), 1.0f to Color(0xFFCD1931), start =
                    Offset(16.0f,0.0f), end = Offset(16.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.5f,0.0f), end = Offset(5.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCCCCCD)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                lineTo(4.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                lineTo(3.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF7B716A)),
                    strokeAlpha = 0.66f, strokeLineWidth = 0.5f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.25f, 2.75f)
                lineTo(5.25f, 2.75f)
                lineTo(5.25f, 4.25f)
                lineTo(4.25f, 4.25f)
                lineTo(4.25f, 5.25f)
                lineTo(2.75f, 5.25f)
                lineTo(2.75f, 4.25f)
                lineTo(1.75f, 4.25f)
                lineTo(1.75f, 2.75f)
                lineTo(2.75f, 2.75f)
                lineTo(2.75f, 1.75f)
                lineTo(4.25f, 1.75f)
                lineTo(4.25f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF7B716A)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 3.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _mt!!
    }

private var _mt: ImageVector? = null
