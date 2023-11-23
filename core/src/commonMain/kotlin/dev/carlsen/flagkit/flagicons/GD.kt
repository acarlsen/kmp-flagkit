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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.GD: ImageVector
    get() {
        if (_gd != null) {
            return _gd!!
        }
        _gd = Builder(name = "Gd", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE42235), 1.0f to Color(0xFFCE1225), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF079B77), 1.0f to Color(0xFF007B5D), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-17.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFD938), 1.0f to Color(0xFFFDD117),
                        start = Offset(4.117f,5.7969f), end = Offset(4.117f,8.4701f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.2949f, 7.5989f)
                    curveTo(3.578f, 8.052f, 3.9845f, 8.351f, 4.3631f, 8.4278f)
                    curveTo(4.5715f, 8.4701f, 4.1899f, 7.5142f, 4.3562f, 7.4102f)
                    curveTo(4.4981f, 7.3216f, 5.1808f, 8.1165f, 5.2406f, 7.9506f)
                    curveTo(5.3781f, 7.5691f, 5.297f, 7.0287f, 4.991f, 6.539f)
                    curveTo(4.552f, 5.8365f, 4.5348f, 6.3002f, 3.348f, 5.7969f)
                    curveTo(3.4721f, 6.5166f, 2.8559f, 6.8963f, 3.2949f, 7.5989f)
                    lineTo(3.2949f, 7.5989f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFD93B), 1.0f to Color(0xFFFDD117),
                        start = Offset(10.5f,2.0f), end = Offset(10.5f,13.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(2.0f, 2.0f)
                    lineTo(19.0f, 2.0f)
                    lineTo(10.5f, 7.5f)
                    lineTo(2.0f, 2.0f)
                    close()
                    moveTo(2.0f, 13.0f)
                    lineTo(10.5f, 7.5f)
                    lineTo(19.0f, 13.0f)
                    lineTo(2.0f, 13.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFE21C30), 1.0f to Color(0xFFCE1225),
                        start = Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-2.5f, 0.0f)
                    arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                    arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFD938), 1.0f to Color(0xFFFDD117),
                        start = Offset(10.5f,5.4999003f), end = Offset(10.5f,9.118f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 8.2713f)
                    lineToRelative(-1.1756f, 0.8467f)
                    lineToRelative(0.442f, -1.3797f)
                    lineToRelative(-1.1686f, -0.8564f)
                    lineToRelative(1.4488f, -0.006f)
                    lineToRelative(0.4534f, -1.376f)
                    lineToRelative(0.4534f, 1.376f)
                    lineToRelative(1.4488f, 0.006f)
                    lineToRelative(-1.1686f, 0.8564f)
                    lineToRelative(0.442f, 1.3797f)
                    close()
                }
            }
        }
        .build()
        return _gd!!
    }

private var _gd: ImageVector? = null
