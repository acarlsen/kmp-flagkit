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

val FlagIcons.CW: ImageVector
    get() {
        if (_cw != null) {
            return _cw!!
        }
        _cw = Builder(name = "Cw", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0543A8), 1.0f to Color(0xFF00307D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFCC747), 1.0f to Color(0xFFFEC539), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.5000005f,3.4998999f), end = Offset(6.5000005f,7.118f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.5f, 6.267f)
                lineToRelative(-1.1756f, 0.851f)
                lineToRelative(0.4461f, -1.381f)
                lineToRelative(-1.1726f, -0.8551f)
                lineToRelative(1.4513f, -0.0025f)
                lineToRelative(0.4508f, -1.3795f)
                lineToRelative(0.4508f, 1.3795f)
                lineToRelative(1.4513f, 0.0025f)
                lineToRelative(-1.1726f, 0.8551f)
                lineToRelative(0.4461f, 1.381f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(3.0f,1.5000002f), end = Offset(3.0f,4.2136f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 3.5753f)
                lineToRelative(-0.8817f, 0.6383f)
                lineToRelative(0.3346f, -1.0358f)
                lineToRelative(-0.8795f, -0.6413f)
                lineToRelative(1.0885f, -0.0019f)
                lineToRelative(0.3381f, -1.0346f)
                lineToRelative(0.3381f, 1.0346f)
                lineToRelative(1.0885f, 0.0019f)
                lineToRelative(-0.8795f, 0.6413f)
                lineToRelative(0.3346f, 1.0358f)
                close()
            }
        }
        .build()
        return _cw!!
    }

private var _cw: ImageVector? = null
