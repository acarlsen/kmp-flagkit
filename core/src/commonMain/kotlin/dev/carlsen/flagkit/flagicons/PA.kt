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

val FlagIcons.PA: ImageVector
    get() {
        if (_pa != null) {
            return _pa!!
        }
        _pa = Builder(name = "Pa", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE52448), 1.0f to Color(0xFFD01739), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1367AE), 1.0f to Color(0xFF0A5492), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                lineTo(0.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(10.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(10.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1367AE), 1.0f to Color(0xFF0A5492), start =
                    Offset(5.0f,1.5000001f), end = Offset(5.0f,5.118f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 4.32f)
                lineToRelative(-1.1756f, 0.798f)
                lineToRelative(0.3957f, -1.3646f)
                lineToRelative(-1.1222f, -0.8714f)
                lineToRelative(1.4201f, -0.0454f)
                lineToRelative(0.482f, -1.3366f)
                lineToRelative(0.482f, 1.3366f)
                lineToRelative(1.4201f, 0.0454f)
                lineToRelative(-1.1222f, 0.8714f)
                lineToRelative(0.3957f, 1.3646f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE52448), 1.0f to Color(0xFFD01739), start =
                    Offset(15.500001f,9.0f), end = Offset(15.500001f,12.618f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.5f, 11.82f)
                lineToRelative(-1.1756f, 0.798f)
                lineToRelative(0.3957f, -1.3646f)
                lineToRelative(-1.1222f, -0.8714f)
                lineToRelative(1.4201f, -0.0454f)
                lineToRelative(0.482f, -1.3366f)
                lineToRelative(0.482f, 1.3366f)
                lineToRelative(1.4201f, 0.0454f)
                lineToRelative(-1.1222f, 0.8714f)
                lineToRelative(0.3957f, 1.3646f)
                close()
            }
        }
        .build()
        return _pa!!
    }

private var _pa: ImageVector? = null
