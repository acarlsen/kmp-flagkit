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

val FlagIcons.LS: ImageVector
    get() {
        if (_ls != null) {
            return _ls!!
        }
        _ls = Builder(name = "Ls", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0C33B8), 1.0f to Color(0xFF05279D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1DB158), 1.0f to Color(0xFF149447), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.50165f,6.2086f), end = Offset(10.50165f,9.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 7.5f)
                lineTo(10.3418f, 6.4746f)
                curveTo(10.4292f, 6.2125f, 10.5695f, 6.2086f, 10.6582f, 6.4746f)
                lineTo(11.0f, 7.5f)
                lineTo(11.861f, 8.7914f)
                curveTo(11.9377f, 8.9066f, 11.9176f, 9.0695f, 11.8063f, 9.1473f)
                curveTo(11.8063f, 9.1473f, 11.5f, 9.5f, 10.5f, 9.5f)
                curveTo(9.5f, 9.5f, 9.1937f, 9.1473f, 9.1937f, 9.1473f)
                curveTo(9.0867f, 9.066f, 9.0656f, 8.9016f, 9.139f, 8.7914f)
                lineTo(10.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF242424)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 7.5f)
                curveTo(9.9477f, 7.5f, 9.5f, 7.0523f, 9.5f, 6.5f)
                curveTo(9.5f, 5.9477f, 9.9477f, 5.5f, 10.5f, 5.5f)
                curveTo(11.0523f, 5.5f, 11.5f, 5.9477f, 11.5f, 6.5f)
                curveTo(11.5f, 7.0523f, 11.0523f, 7.5f, 10.5f, 7.5f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.7761f, 7.5f, 11.0f, 6.7761f, 11.0f, 6.5f)
                curveTo(11.0f, 6.2239f, 10.7761f, 6.0f, 10.5f, 6.0f)
                curveTo(10.2239f, 6.0f, 10.0f, 6.2239f, 10.0f, 6.5f)
                curveTo(10.0f, 6.7761f, 10.2239f, 7.5f, 10.5f, 7.5f)
                close()
            }
        }
        .build()
        return _ls!!
    }

private var _ls: ImageVector? = null
