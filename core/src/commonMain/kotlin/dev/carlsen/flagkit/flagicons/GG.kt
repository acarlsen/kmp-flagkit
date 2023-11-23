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

val FlagIcons.GG: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF33349), 1.0f to Color(0xFFE51D34), start =
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
            path(fill = linearGradient(0.0f to Color(0xFFFCE24C), 1.0f to Color(0xFFF9DC38), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 12.0f)
                lineTo(9.5f, 13.0f)
                lineTo(11.5f, 13.0f)
                lineTo(11.0f, 12.0f)
                lineTo(11.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(16.0f, 8.5f)
                lineTo(16.0f, 6.5f)
                lineTo(15.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 3.0f)
                lineTo(11.5f, 2.0f)
                lineTo(9.5f, 2.0f)
                lineTo(10.0f, 3.0f)
                lineTo(10.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(5.0f, 6.5f)
                lineTo(5.0f, 8.5f)
                lineTo(6.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
