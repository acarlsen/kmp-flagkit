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

val FlagIcons.DZ: ImageVector
    get() {
        if (_dz != null) {
            return _dz!!
        }
        _dz = Builder(name = "Dz", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF048345), 1.0f to Color(0xFF04753E), start =
                    Offset(5.5f,0.0f), end = Offset(5.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(16.0f,0.0f), end = Offset(16.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE81B42), 1.0f to Color(0xFFD20F34), start =
                    Offset(12.999899f,5.4999003f), end = Offset(12.999899f,9.118f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 8.28f)
                lineToRelative(-1.1756f, 0.838f)
                lineToRelative(0.4337f, -1.377f)
                lineToRelative(-1.1603f, -0.8591f)
                lineToRelative(1.4436f, -0.013f)
                lineToRelative(0.4585f, -1.369f)
                lineToRelative(0.4585f, 1.369f)
                lineToRelative(1.4436f, 0.013f)
                lineToRelative(-1.1603f, 0.8591f)
                lineToRelative(0.4337f, 1.377f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE81B42), 1.0f to Color(0xFFD20F34), start =
                    Offset(9.63f,3.0f), end = Offset(9.63f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.26f, 4.214f)
                curveTo(12.4889f, 3.461f, 11.4527f, 3.0f, 10.3132f, 3.0f)
                curveTo(7.9311f, 3.0f, 6.0f, 5.0147f, 6.0f, 7.5f)
                curveTo(6.0f, 9.9853f, 7.9311f, 12.0f, 10.3132f, 12.0f)
                curveTo(11.4527f, 12.0f, 12.4889f, 11.539f, 13.26f, 10.786f)
                curveTo(12.7282f, 11.0392f, 12.1266f, 11.1818f, 11.4895f, 11.1818f)
                curveTo(9.3239f, 11.1818f, 7.5684f, 9.5334f, 7.5684f, 7.5f)
                curveTo(7.5684f, 5.4666f, 9.3239f, 3.8182f, 11.4895f, 3.8182f)
                curveTo(12.1266f, 3.8182f, 12.7282f, 3.9608f, 13.26f, 4.214f)
                lineTo(13.26f, 4.214f)
                close()
            }
        }
        .build()
        return _dz!!
    }

private var _dz: ImageVector? = null
