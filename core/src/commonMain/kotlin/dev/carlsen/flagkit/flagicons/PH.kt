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

val FlagIcons.PH: ImageVector
    get() {
        if (_ph != null) {
            return _ph!!
        }
        _ph = Builder(name = "Ph", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDD1C34), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0D4BC3), 1.0f to Color(0xFF073DA6), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.0f,0.0f), end = Offset(5.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineToRelative(10.0f, 7.5f)
                lineToRelative(-10.0f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFDD64D), 1.0f to Color(0xFFFCD036), start =
                    Offset(4.5f,2.0f), end = Offset(4.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.3991f, 8.495f)
                lineTo(2.5433f, 9.8097f)
                lineTo(2.8678f, 8.2749f)
                curveTo(2.8156f, 8.2322f, 2.7678f, 8.1844f, 2.7251f, 8.1322f)
                lineTo(1.1903f, 8.4567f)
                lineTo(2.505f, 7.6009f)
                curveTo(2.5017f, 7.5677f, 2.5f, 7.5341f, 2.5f, 7.5f)
                curveTo(2.5f, 7.4659f, 2.5017f, 7.4323f, 2.505f, 7.3991f)
                lineTo(1.1903f, 6.5433f)
                lineTo(2.7251f, 6.8678f)
                curveTo(2.7678f, 6.8156f, 2.8156f, 6.7678f, 2.8678f, 6.7251f)
                lineTo(2.5433f, 5.1903f)
                lineTo(3.3991f, 6.505f)
                curveTo(3.4323f, 6.5017f, 3.4659f, 6.5f, 3.5f, 6.5f)
                curveTo(3.5341f, 6.5f, 3.5677f, 6.5017f, 3.6009f, 6.505f)
                lineTo(4.4567f, 5.1903f)
                lineTo(4.1322f, 6.7251f)
                curveTo(4.1844f, 6.7678f, 4.2322f, 6.8156f, 4.2749f, 6.8678f)
                lineTo(5.8097f, 6.5433f)
                lineTo(4.495f, 7.3991f)
                curveTo(4.4983f, 7.4323f, 4.5f, 7.4659f, 4.5f, 7.5f)
                curveTo(4.5f, 7.5341f, 4.4983f, 7.5677f, 4.495f, 7.6009f)
                lineTo(5.8097f, 8.4567f)
                lineTo(4.2749f, 8.1322f)
                curveTo(4.2322f, 8.1844f, 4.1844f, 8.2322f, 4.1322f, 8.2749f)
                lineTo(4.4567f, 9.8097f)
                lineTo(3.6009f, 8.495f)
                curveTo(3.5677f, 8.4983f, 3.5341f, 8.5f, 3.5f, 8.5f)
                curveTo(3.4659f, 8.5f, 3.4323f, 8.4983f, 3.3991f, 8.495f)
                lineTo(3.3991f, 8.495f)
                close()
                moveTo(7.5f, 8.0f)
                curveTo(7.2239f, 8.0f, 7.0f, 7.7761f, 7.0f, 7.5f)
                curveTo(7.0f, 7.2239f, 7.2239f, 7.0f, 7.5f, 7.0f)
                curveTo(7.7761f, 7.0f, 8.0f, 7.2239f, 8.0f, 7.5f)
                curveTo(8.0f, 7.7761f, 7.7761f, 8.0f, 7.5f, 8.0f)
                close()
                moveTo(1.5f, 3.0f)
                curveTo(1.2239f, 3.0f, 1.0f, 2.7761f, 1.0f, 2.5f)
                curveTo(1.0f, 2.2239f, 1.2239f, 2.0f, 1.5f, 2.0f)
                curveTo(1.7761f, 2.0f, 2.0f, 2.2239f, 2.0f, 2.5f)
                curveTo(2.0f, 2.7761f, 1.7761f, 3.0f, 1.5f, 3.0f)
                close()
                moveTo(1.5f, 13.0f)
                curveTo(1.2239f, 13.0f, 1.0f, 12.7761f, 1.0f, 12.5f)
                curveTo(1.0f, 12.2239f, 1.2239f, 12.0f, 1.5f, 12.0f)
                curveTo(1.7761f, 12.0f, 2.0f, 12.2239f, 2.0f, 12.5f)
                curveTo(2.0f, 12.7761f, 1.7761f, 13.0f, 1.5f, 13.0f)
                close()
            }
        }
        .build()
        return _ph!!
    }

private var _ph: ImageVector? = null
