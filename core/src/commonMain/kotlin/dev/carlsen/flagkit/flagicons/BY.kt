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

val FlagIcons.BY: ImageVector
    get() {
        if (_by != null) {
            return _by!!
        }
        _by = Builder(name = "By", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE54252), 1.0f to Color(0xFFC63442), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF5CBE6B), 1.0f to Color(0xFF4EA55B), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(1.5f,0.0f), end = Offset(1.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 12.75f)
                lineTo(3.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 2.25f)
                lineTo(2.5f, 3.0f)
                lineTo(3.0f, 3.75f)
                lineTo(3.0f, 5.25f)
                lineTo(2.5f, 6.0f)
                lineTo(3.0f, 6.75f)
                lineTo(3.0f, 8.25f)
                lineTo(2.5f, 9.0f)
                lineTo(3.0f, 9.75f)
                lineTo(3.0f, 11.25f)
                lineTo(2.5f, 12.0f)
                lineTo(3.0f, 12.75f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE54252), 1.0f to Color(0xFFC63442), start =
                    Offset(-0.5f,1.5f), end = Offset(-0.5f,13.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-1.5f, 3.0f)
                lineTo(-0.5f, 1.5f)
                lineTo(0.5f, 3.0f)
                lineTo(-0.5f, 4.5f)
                lineTo(-1.5f, 3.0f)
                close()
                moveTo(-1.5f, 6.0f)
                lineTo(-0.5f, 4.5f)
                lineTo(0.5f, 6.0f)
                lineTo(-0.5f, 7.5f)
                lineTo(-1.5f, 6.0f)
                close()
                moveTo(-1.5f, 9.0f)
                lineTo(-0.5f, 7.5f)
                lineTo(0.5f, 9.0f)
                lineTo(-0.5f, 10.5f)
                lineTo(-1.5f, 9.0f)
                close()
                moveTo(-1.5f, 12.0f)
                lineTo(-0.5f, 10.5f)
                lineTo(0.5f, 12.0f)
                lineTo(-0.5f, 13.5f)
                lineTo(-1.5f, 12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE54252), 1.0f to Color(0xFFC63442), start =
                    Offset(1.5f,0.0f), end = Offset(1.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.5f, 1.5f)
                lineTo(1.5f, 0.0f)
                lineTo(2.5f, 1.5f)
                lineTo(1.5f, 3.0f)
                lineTo(0.5f, 1.5f)
                close()
                moveTo(0.5f, 4.5f)
                lineTo(1.5f, 3.0f)
                lineTo(2.5f, 4.5f)
                lineTo(1.5f, 6.0f)
                lineTo(0.5f, 4.5f)
                close()
                moveTo(0.5f, 7.5f)
                lineTo(1.5f, 6.0f)
                lineTo(2.5f, 7.5f)
                lineTo(1.5f, 9.0f)
                lineTo(0.5f, 7.5f)
                close()
                moveTo(0.5f, 10.5f)
                lineTo(1.5f, 9.0f)
                lineTo(2.5f, 10.5f)
                lineTo(1.5f, 12.0f)
                lineTo(0.5f, 10.5f)
                close()
                moveTo(0.5f, 13.5f)
                lineTo(1.5f, 12.0f)
                lineTo(2.5f, 13.5f)
                lineTo(1.5f, 15.0f)
                lineTo(0.5f, 13.5f)
                close()
            }
        }
        .build()
        return _by!!
    }

private var _by: ImageVector? = null
