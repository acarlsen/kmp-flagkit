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

val FlagIcons.HR: ImageVector
    get() {
        if (_hr != null) {
            return _hr!!
        }
        _hr = Builder(name = "Hr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF202D), 1.0f to Color(0xFFFD0D1B), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1895DB)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0f, 4.0f)
                lineTo(8.5f, 3.5f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(10.0f, 4.0f)
                lineTo(10.5f, 3.5f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(12.0f, 4.0f)
                lineTo(12.5f, 3.5f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF191F94)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 4.0f)
                lineTo(9.5f, 3.5f)
                lineTo(10.0f, 4.0f)
                lineTo(10.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(11.0f, 4.0f)
                lineTo(11.5f, 3.5f)
                lineTo(12.0f, 4.0f)
                lineTo(12.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 4.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2027AC), 1.0f to Color(0xFF191F94), start =
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
                    Offset(10.5f,5.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                lineTo(0.0f, 5.0f)
                lineTo(21.0f, 5.0f)
                lineTo(21.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(12.7266f, 10.5468f)
                curveTo(12.6014f, 10.7971f, 12.2734f, 11.0f, 12.0f, 11.0f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 11.0f)
                curveTo(8.7239f, 11.0f, 8.4036f, 10.8072f, 8.2734f, 10.5468f)
                lineTo(8.0f, 10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF212E), 1.0f to Color(0xFFFD0D1B), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(12.0f, 5.0f)
                lineTo(12.5f, 5.0f)
                lineTo(13.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(8.5f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(9.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 8.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(9.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                lineTo(10.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(8.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(12.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(11.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                lineTo(12.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 10.0f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 10.0f)
                close()
            }
        }
        .build()
        return _hr!!
    }

private var _hr: ImageVector? = null
