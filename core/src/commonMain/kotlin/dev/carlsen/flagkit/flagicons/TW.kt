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

val FlagIcons.TW: ImageVector
    get() {
        if (_tw != null) {
            return _tw!!
        }
        _tw = Builder(name = "Tw", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFE3030), 1.0f to Color(0xFFFF0000), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,14.065085f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0909B6), 1.0f to Color(0xFF000096), start =
                    Offset(5.5f,0.0f), end = Offset(5.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-11.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.5f,1.6903003f), end = Offset(5.5f,6.3097f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.5f, 5.25f)
                lineToRelative(-0.9567f, 1.0597f)
                lineToRelative(0.0728f, -1.4258f)
                lineToRelative(-1.4258f, 0.0728f)
                lineToRelative(1.0597f, -0.9567f)
                lineToRelative(-1.0597f, -0.9567f)
                lineToRelative(1.4258f, 0.0728f)
                lineToRelative(-0.0728f, -1.4258f)
                lineToRelative(0.9567f, 1.0597f)
                lineToRelative(0.9567f, -1.0597f)
                lineToRelative(-0.0728f, 1.4258f)
                lineToRelative(1.4258f, -0.0728f)
                lineToRelative(-1.0597f, 0.9567f)
                lineToRelative(1.0597f, 0.9567f)
                lineToRelative(-1.4258f, -0.0728f)
                lineToRelative(0.0728f, 1.4258f)
                close()
            }
        }
        .build()
        return _tw!!
    }

private var _tw: ImageVector? = null
