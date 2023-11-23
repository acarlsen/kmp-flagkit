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

val FlagIcons.AF: ImageVector
    get() {
        if (_af != null) {
            return _af!!
        }
        _af = Builder(name = "Af", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1AB11F), 1.0f to Color(0xFF149818), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDC0D18), 1.0f to Color(0xFFBE0711), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.75f, strokeAlpha = 0.75f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(8.0f, 7.9014f, 8.4815f, 8.7196f, 9.2468f, 9.1636f)
                curveTo(9.4856f, 9.3022f, 9.7916f, 9.2209f, 9.9302f, 8.982f)
                curveTo(10.0688f, 8.7432f, 9.9875f, 8.4372f, 9.7486f, 8.2986f)
                curveTo(9.2887f, 8.0317f, 9.0f, 7.5413f, 9.0f, 7.0f)
                curveTo(9.0f, 6.7239f, 8.7761f, 6.5f, 8.5f, 6.5f)
                curveTo(8.2239f, 6.5f, 8.0f, 6.7239f, 8.0f, 7.0f)
                close()
                moveTo(11.8455f, 9.1073f)
                curveTo(12.5588f, 8.6511f, 13.0f, 7.8629f, 13.0f, 7.0f)
                curveTo(13.0f, 6.7239f, 12.7761f, 6.5f, 12.5f, 6.5f)
                curveTo(12.2239f, 6.5f, 12.0f, 6.7239f, 12.0f, 7.0f)
                curveTo(12.0f, 7.5183f, 11.7356f, 7.9906f, 11.3067f, 8.2649f)
                curveTo(11.0741f, 8.4137f, 11.0061f, 8.7229f, 11.1549f, 8.9555f)
                curveTo(11.3037f, 9.1881f, 11.6129f, 9.2561f, 11.8455f, 9.1073f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 6.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _af!!
    }

private var _af: ImageVector? = null
