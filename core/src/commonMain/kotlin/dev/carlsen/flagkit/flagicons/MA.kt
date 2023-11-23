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

val FlagIcons.MA: ImageVector
    get() {
        if (_ma != null) {
            return _ma!!
        }
        _ma = Builder(name = "Ma", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE33B44), 1.0f to Color(0xFFC02A32), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0A6135)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 9.255f)
                lineTo(7.855f, 11.1406f)
                lineTo(8.8309f, 8.0423f)
                lineTo(6.2202f, 6.1094f)
                lineTo(9.4684f, 6.0802f)
                lineTo(10.5f, 3.0f)
                lineTo(11.5316f, 6.0802f)
                lineTo(14.7798f, 6.1094f)
                lineTo(12.1691f, 8.0423f)
                lineTo(13.145f, 11.1406f)
                lineTo(10.5f, 9.255f)
                close()
                moveTo(10.5f, 8.0269f)
                lineTo(11.2941f, 8.593f)
                lineTo(11.0011f, 7.6628f)
                lineTo(11.7849f, 7.0825f)
                lineTo(10.8097f, 7.0737f)
                lineTo(10.5f, 6.1489f)
                lineTo(10.1903f, 7.0737f)
                lineTo(9.2151f, 7.0825f)
                lineTo(9.9989f, 7.6628f)
                lineTo(9.7059f, 8.593f)
                lineTo(10.5f, 8.0269f)
                close()
            }
        }
        .build()
        return _ma!!
    }

private var _ma: ImageVector? = null
