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

val FlagIcons.MR: ImageVector
    get() {
        if (_mr != null) {
            return _mr!!
        }
        _mr = Builder(name = "Mr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF108B4D), 1.0f to Color(0xFF0A6135), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFC941), 1.0f to Color(0xFFFFC42E), start =
                    Offset(10.4156f,3.5f), end = Offset(10.4156f,11.0078f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.8602f, 5.8f)
                curveTo(14.8967f, 6.0306f, 14.9156f, 6.267f, 14.9156f, 6.5078f)
                curveTo(14.9156f, 8.9931f, 12.9009f, 11.0078f, 10.4156f, 11.0078f)
                curveTo(7.9303f, 11.0078f, 5.9156f, 8.9931f, 5.9156f, 6.5078f)
                curveTo(5.9156f, 6.267f, 5.9345f, 6.0306f, 5.9709f, 5.8f)
                curveTo(6.3104f, 7.949f, 8.1711f, 9.5922f, 10.4156f, 9.5922f)
                curveTo(12.66f, 9.5922f, 14.5207f, 7.949f, 14.8602f, 5.8f)
                lineTo(14.8602f, 5.8f)
                close()
                moveTo(10.5f, 6.4231f)
                lineTo(9.2639f, 7.3042f)
                lineTo(9.72f, 5.8564f)
                lineTo(8.5f, 4.9531f)
                lineTo(10.0179f, 4.9394f)
                lineTo(10.5f, 3.5f)
                lineTo(10.9821f, 4.9394f)
                lineTo(12.5f, 4.9531f)
                lineTo(11.28f, 5.8564f)
                lineTo(11.7361f, 7.3042f)
                lineTo(10.5f, 6.4231f)
                lineTo(10.5f, 6.4231f)
                close()
            }
        }
        .build()
        return _mr!!
    }

private var _mr: ImageVector? = null
