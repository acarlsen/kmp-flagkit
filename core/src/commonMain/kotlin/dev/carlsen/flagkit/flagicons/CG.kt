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

val FlagIcons.CG: ImageVector
    get() {
        if (_cg != null) {
            return _cg!!
        }
        _cg = Builder(name = "Cg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF33630), 1.0f to Color(0xFFDC241E), start =
                    Offset(13.001499f,-0.002699852f), end = Offset(13.001499f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0015f, 13.9973f)
                lineToRelative(15.0f, -14.0f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 15.0f)
                lineToRelative(-16.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF009643), 1.0f to Color(0xFF09C15B), start =
                    Offset(8.001499f,-0.002699852f), end = Offset(8.001499f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.0015f, 0.9973f)
                lineToRelative(-15.0f, 14.0f)
                lineToRelative(-1.0f, -0.0f)
                lineToRelative(-0.0f, -15.0f)
                lineToRelative(16.0f, -0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFCDF4A), 1.0f to Color(0xFFFCE154), start =
                    Offset(10.810901f,-5.0199995f), end = Offset(10.810901f,19.314201f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.6818f, -1.5467f)
                lineToRelative(-20.1451f, 20.8609f)
                lineToRelative(-3.5967f, -3.4733f)
                lineToRelative(20.1451f, -20.8609f)
                close()
            }
        }
        .build()
        return _cg!!
    }

private var _cg: ImageVector? = null
