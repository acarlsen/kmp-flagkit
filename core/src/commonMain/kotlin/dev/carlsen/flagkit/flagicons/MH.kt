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

val FlagIcons.MH: ImageVector
    get() {
        if (_mh != null) {
            return _mh!!
        }
        _mh = Builder(name = "Mh", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF064DAE), 1.0f to Color(0xFF003D91), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF18D36), 1.0f to Color(0xFFDB761E), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-21.0f, 11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.0f, 8.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-21.0f, 11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.5f,2.0f), end = Offset(4.5f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.8388f, 4.3717f)
                lineTo(4.5f, 2.0f)
                lineTo(4.1612f, 4.3717f)
                lineTo(3.25f, 3.3349f)
                lineTo(3.7178f, 4.7178f)
                lineTo(2.3349f, 4.25f)
                lineTo(3.3717f, 5.1612f)
                lineTo(1.0f, 5.5f)
                lineTo(3.3717f, 5.8388f)
                lineTo(2.3349f, 6.75f)
                lineTo(3.7178f, 6.2822f)
                lineTo(3.25f, 7.6651f)
                lineTo(4.1612f, 6.6283f)
                lineTo(4.5f, 9.0f)
                lineTo(4.8388f, 6.6283f)
                lineTo(5.75f, 7.6651f)
                lineTo(5.2822f, 6.2822f)
                lineTo(6.6651f, 6.75f)
                lineTo(5.6283f, 5.8388f)
                lineTo(8.0f, 5.5f)
                lineTo(5.6283f, 5.1612f)
                lineTo(6.6651f, 4.25f)
                lineTo(5.2822f, 4.7178f)
                lineTo(5.75f, 3.3349f)
                lineTo(4.8388f, 4.3717f)
                close()
            }
        }
        .build()
        return _mh!!
    }

private var _mh: ImageVector? = null
