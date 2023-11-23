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

val FlagIcons.MV: ImageVector
    get() {
        if (_mv != null) {
            return _mv!!
        }
        _mv = Builder(name = "Mv", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF32249), 1.0f to Color(0xFFD01739), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF15A04F), 1.0f to Color(0xFF0F7E3D), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 3.0f)
                lineTo(17.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.0f, 3.5f)
                lineTo(18.0f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.5f, 12.0f)
                lineTo(3.5f, 12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 11.5f)
                lineTo(3.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.125f,4.0f), end = Offset(10.125f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.25f, 4.0805f)
                curveTo(12.0084f, 4.0278f, 11.7574f, 4.0f, 11.5f, 4.0f)
                curveTo(9.567f, 4.0f, 8.0f, 5.567f, 8.0f, 7.5f)
                curveTo(8.0f, 9.433f, 9.567f, 11.0f, 11.5f, 11.0f)
                curveTo(11.7574f, 11.0f, 12.0084f, 10.9722f, 12.25f, 10.9195f)
                curveTo(10.6774f, 10.5761f, 9.5f, 9.1756f, 9.5f, 7.5f)
                curveTo(9.5f, 5.8244f, 10.6774f, 4.4239f, 12.25f, 4.0805f)
                close()
            }
        }
        .build()
        return _mv!!
    }

private var _mv: ImageVector? = null
