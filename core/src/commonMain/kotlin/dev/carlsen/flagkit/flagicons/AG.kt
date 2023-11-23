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

val FlagIcons.AG: ImageVector
    get() {
        if (_ag != null) {
            return _ag!!
        }
        _ag = Builder(name = "Ag", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 6.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE2243B), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(-10.5f, 15.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFCF3C), 1.0f to Color(0xFFFECB2F),
                        start = Offset(10.5f,1.500001f), end = Offset(10.5f,10.157501f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 8.25f)
                    lineToRelative(-1.7221f, 1.9075f)
                    lineToRelative(0.1311f, -2.5665f)
                    lineToRelative(-2.5665f, 0.1311f)
                    lineToRelative(1.9075f, -1.7221f)
                    lineToRelative(-2.25f, -2.0f)
                    lineToRelative(2.909f, 0.5f)
                    lineToRelative(-0.409f, -3.0f)
                    lineToRelative(2.0f, 2.5f)
                    lineToRelative(2.0f, -2.5f)
                    lineToRelative(-0.409f, 3.0f)
                    lineToRelative(2.909f, -0.5f)
                    lineToRelative(-2.25f, 2.0f)
                    lineToRelative(1.9075f, 1.7221f)
                    lineToRelative(-2.5665f, -0.1311f)
                    lineToRelative(0.1311f, 2.5665f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF1984D8), 1.0f to Color(0xFF1175C4),
                        start = Offset(10.5f,6.0f), end = Offset(10.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 6.0f)
                    horizontalLineToRelative(21.0f)
                    verticalLineToRelative(4.0f)
                    horizontalLineToRelative(-21.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.0f)
                    horizontalLineToRelative(21.0f)
                    verticalLineToRelative(5.0f)
                    horizontalLineToRelative(-21.0f)
                    close()
                }
            }
        }
        .build()
        return _ag!!
    }

private var _ag: ImageVector? = null
