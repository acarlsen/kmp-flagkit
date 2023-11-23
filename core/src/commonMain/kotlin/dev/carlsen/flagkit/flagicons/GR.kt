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

val FlagIcons.GR: ImageVector
    get() {
        if (_gr != null) {
            return _gr!!
        }
        _gr = Builder(name = "Gr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1C6DC1), 1.0f to Color(0xFF1660AD), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                lineTo(4.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(6.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(10.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 0.0f)
                close()
                moveTo(10.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 2.0f)
                lineTo(10.0f, 2.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(10.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                lineTo(21.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(0.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _gr!!
    }

private var _gr: ImageVector? = null
