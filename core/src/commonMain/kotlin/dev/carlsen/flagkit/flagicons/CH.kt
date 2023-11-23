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

val FlagIcons.CH: ImageVector
    get() {
        if (_ch != null) {
            return _ch!!
        }
        _ch = Builder(name = "Ch", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF0000), 1.0f to Color(0xFFFF3131), start =
                    Offset(10.5f,15.0f), end = Offset(10.5f,4.592426E-16f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 9.0f)
                lineTo(6.2558f, 9.0f)
                curveTo(6.1145f, 9.0f, 6.0f, 8.8861f, 6.0f, 8.7442f)
                lineTo(6.0f, 6.2558f)
                curveTo(6.0f, 6.1145f, 6.1139f, 6.0f, 6.2558f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 3.2558f)
                curveTo(9.0f, 3.1145f, 9.1139f, 3.0f, 9.2558f, 3.0f)
                lineTo(11.7442f, 3.0f)
                curveTo(11.8855f, 3.0f, 12.0f, 3.1139f, 12.0f, 3.2558f)
                lineTo(12.0f, 6.0f)
                lineTo(14.7442f, 6.0f)
                curveTo(14.8855f, 6.0f, 15.0f, 6.1139f, 15.0f, 6.2558f)
                lineTo(15.0f, 8.7442f)
                curveTo(15.0f, 8.8855f, 14.8861f, 9.0f, 14.7442f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 11.7442f)
                curveTo(12.0f, 11.8855f, 11.8861f, 12.0f, 11.7442f, 12.0f)
                lineTo(9.2558f, 12.0f)
                curveTo(9.1145f, 12.0f, 9.0f, 11.8861f, 9.0f, 11.7442f)
                lineTo(9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _ch!!
    }

private var _ch: ImageVector? = null
