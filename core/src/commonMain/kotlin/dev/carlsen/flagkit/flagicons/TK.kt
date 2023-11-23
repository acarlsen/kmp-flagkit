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

val FlagIcons.TK: ImageVector
    get() {
        if (_tk != null) {
            return _tk!!
        }
        _tk = Builder(name = "Tk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0637C5), 1.0f to Color(0xFF002CAA), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFDD33F), 1.0f to Color(0xFFFED02F), start =
                    Offset(11.0f,2.0f), end = Offset(11.0f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(11.5f, 6.0f)
                curveTo(14.5f, 4.0f, 18.0f, 2.0f, 18.0f, 2.0f)
                curveTo(18.0f, 2.0f, 16.3573f, 5.0734f, 16.5f, 6.5f)
                curveTo(16.6907f, 8.4068f, 19.0f, 11.0f, 19.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 11.0f, 8.5f, 8.0f, 11.5f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 2.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 5.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0f, 5.5f)
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
        return _tk!!
    }

private var _tk: ImageVector? = null
