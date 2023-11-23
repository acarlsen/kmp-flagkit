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

val FlagIcons.MN: ImageVector
    get() {
        if (_mn != null) {
            return _mn!!
        }
        _mn = Builder(name = "Mn", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF146BBC), 1.0f to Color(0xFF0B5396), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE43642), 1.0f to Color(0xFFC32A34), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE43642), 1.0f to Color(0xFFC32A34), start =
                    Offset(17.5f,0.0f), end = Offset(17.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF8D246), 1.0f to Color(0xFFF9CE2F), start =
                    Offset(3.5f,7.5f), end = Offset(3.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 12.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(3.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(3.5f, 12.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(3.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(3.5f, 10.0f)
                lineTo(3.0f, 9.0f)
                close()
                moveTo(3.0f, 8.0f)
                lineTo(3.5f, 7.5f)
                lineTo(4.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                close()
                moveTo(3.5f, 9.0f)
                curveTo(3.2239f, 9.0f, 3.0f, 8.7761f, 3.0f, 8.5f)
                curveTo(3.0f, 8.2239f, 3.2239f, 8.0f, 3.5f, 8.0f)
                curveTo(3.7761f, 8.0f, 4.0f, 8.2239f, 4.0f, 8.5f)
                curveTo(4.0f, 8.7761f, 3.7761f, 9.0f, 3.5f, 9.0f)
                close()
                moveTo(3.5f, 11.0f)
                curveTo(3.2239f, 11.0f, 3.0f, 10.7761f, 3.0f, 10.5f)
                curveTo(3.0f, 10.2239f, 3.2239f, 10.0f, 3.5f, 10.0f)
                curveTo(3.7761f, 10.0f, 4.0f, 10.2239f, 4.0f, 10.5f)
                curveTo(4.0f, 10.7761f, 3.7761f, 11.0f, 3.5f, 11.0f)
                close()
            }
        }
        .build()
        return _mn!!
    }

private var _mn: ImageVector? = null
