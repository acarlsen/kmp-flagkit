package dev.carlsen.flagkit.flagicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.DO: ImageVector
    get() {
        if (_do != null) {
            return _do!!
        }
        _do = Builder(name = "Do", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF083D7A), 1.0f to Color(0xFF032F61), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF083D7A), 1.0f to Color(0xFF032F61), start =
                    Offset(16.5f,9.0f), end = Offset(16.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDF1E35), 1.0f to Color(0xFFCC162C), start =
                    Offset(4.5f,9.0f), end = Offset(4.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDF1E35), 1.0f to Color(0xFFCC162C), start =
                    Offset(16.5f,0.0f), end = Offset(16.5f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
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
            path(fill = SolidColor(Color(0xFFC93127)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.2f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.4393f, 6.4393f)
                curveTo(8.8536f, 7.0251f, 8.8536f, 7.9749f, 9.4393f, 8.5607f)
                curveTo(10.0251f, 9.1464f, 10.9749f, 9.1464f, 11.5607f, 8.5607f)
                lineTo(11.5607f, 8.5607f)
                curveTo(12.1464f, 7.9749f, 12.1464f, 7.0251f, 11.5607f, 6.4393f)
            }
            path(fill = SolidColor(Color(0xFF042F60)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF0F6D1A)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5607f, 8.5607f)
                curveTo(10.9749f, 9.1464f, 10.0251f, 9.1464f, 9.4393f, 8.5607f)
                curveTo(8.8536f, 7.9749f, 8.8536f, 7.0251f, 9.4393f, 6.4393f)
                lineTo(9.7929f, 6.7929f)
                curveTo(9.4024f, 7.1834f, 9.4024f, 7.8166f, 9.7929f, 8.2071f)
                curveTo(10.1834f, 8.5976f, 10.8166f, 8.5976f, 11.2071f, 8.2071f)
                curveTo(11.5976f, 7.8166f, 11.5976f, 7.1834f, 11.2071f, 6.7929f)
                lineTo(11.5607f, 6.4393f)
                curveTo(12.1464f, 7.0251f, 12.1464f, 7.9749f, 11.5607f, 8.5607f)
                close()
                moveTo(11.5607f, 8.5607f)
                curveTo(10.9749f, 9.1464f, 10.0251f, 9.1464f, 9.4393f, 8.5607f)
                curveTo(8.8536f, 7.9749f, 8.8536f, 7.0251f, 9.4393f, 6.4393f)
                lineTo(9.7929f, 6.7929f)
                curveTo(9.4024f, 7.1834f, 9.4024f, 7.8166f, 9.7929f, 8.2071f)
                curveTo(10.1834f, 8.5976f, 10.8166f, 8.5976f, 11.2071f, 8.2071f)
                curveTo(11.5976f, 7.8166f, 11.5976f, 7.1834f, 11.2071f, 6.7929f)
                lineTo(11.5607f, 6.4393f)
                curveTo(12.1464f, 7.0251f, 12.1464f, 7.9749f, 11.5607f, 8.5607f)
                close()
            }
        }
        .build()
        return _do!!
    }

private var _do: ImageVector? = null
