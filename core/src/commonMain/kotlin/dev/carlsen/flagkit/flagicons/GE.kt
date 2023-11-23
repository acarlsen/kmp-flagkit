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

val FlagIcons.GE: ImageVector
    get() {
        if (_ge != null) {
            return _ge!!
        }
        _ge = Builder(name = "Ge", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF2B37), 1.0f to Color(0xFFFD0D1B), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.2f, 2.7f)
                lineTo(16.0f, 1.5f)
                lineTo(17.0f, 1.5f)
                lineTo(16.8f, 2.7f)
                lineTo(18.0f, 2.5f)
                lineTo(18.0f, 3.5f)
                lineTo(16.8f, 3.3f)
                lineTo(17.0f, 4.5f)
                lineTo(16.0f, 4.5f)
                lineTo(16.2f, 3.3f)
                lineTo(15.0f, 3.5f)
                lineTo(15.0f, 2.5f)
                lineTo(16.2f, 2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.2f, 2.7f)
                lineTo(4.0f, 1.5f)
                lineTo(5.0f, 1.5f)
                lineTo(4.8f, 2.7f)
                lineTo(6.0f, 2.5f)
                lineTo(6.0f, 3.5f)
                lineTo(4.8f, 3.3f)
                lineTo(5.0f, 4.5f)
                lineTo(4.0f, 4.5f)
                lineTo(4.2f, 3.3f)
                lineTo(3.0f, 3.5f)
                lineTo(3.0f, 2.5f)
                lineTo(4.2f, 2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.2f, 11.7f)
                lineTo(4.0f, 10.5f)
                lineTo(5.0f, 10.5f)
                lineTo(4.8f, 11.7f)
                lineTo(6.0f, 11.5f)
                lineTo(6.0f, 12.5f)
                lineTo(4.8f, 12.3f)
                lineTo(5.0f, 13.5f)
                lineTo(4.0f, 13.5f)
                lineTo(4.2f, 12.3f)
                lineTo(3.0f, 12.5f)
                lineTo(3.0f, 11.5f)
                lineTo(4.2f, 11.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD0D1B)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.2f, 11.7f)
                lineTo(16.0f, 10.5f)
                lineTo(17.0f, 10.5f)
                lineTo(16.8f, 11.7f)
                lineTo(18.0f, 11.5f)
                lineTo(18.0f, 12.5f)
                lineTo(16.8f, 12.3f)
                lineTo(17.0f, 13.5f)
                lineTo(16.0f, 13.5f)
                lineTo(16.2f, 12.3f)
                lineTo(15.0f, 12.5f)
                lineTo(15.0f, 11.5f)
                lineTo(16.2f, 11.7f)
                close()
            }
        }
        .build()
        return _ge!!
    }

private var _ge: ImageVector? = null
