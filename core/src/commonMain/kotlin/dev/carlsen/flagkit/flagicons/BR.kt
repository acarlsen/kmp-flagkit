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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.BR: ImageVector
    get() {
        if (_br != null) {
            return _br!!
        }
        _br = Builder(name = "Br", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF05AB41), 1.0f to Color(0xFF019C39), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD216)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.4215f, 7.7727f)
                curveTo(2.1887f, 7.6221f, 2.1935f, 7.3748f, 2.4215f, 7.2273f)
                lineTo(10.0785f, 2.2727f)
                curveTo(10.3113f, 2.1221f, 10.6935f, 2.1252f, 10.9215f, 2.2727f)
                lineTo(18.5785f, 7.2273f)
                curveTo(18.8113f, 7.3779f, 18.8065f, 7.6252f, 18.5785f, 7.7727f)
                lineTo(10.9215f, 12.7273f)
                curveTo(10.6887f, 12.8779f, 10.3065f, 12.8748f, 10.0785f, 12.7273f)
                lineTo(2.4215f, 7.7727f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF053087), 1.0f to Color(0xFF012877), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.8996f, 6.9738f)
                    curveTo(7.1649f, 6.7589f, 8.3625f, 6.9338f, 10.4342f, 7.4864f)
                    curveTo(11.9084f, 7.8797f, 13.6071f, 8.7479f, 13.9958f, 9.2279f)
                    lineTo(14.3104f, 9.6164f)
                    lineTo(15.0876f, 8.9871f)
                    lineTo(14.7729f, 8.5985f)
                    curveTo(14.2229f, 7.9193f, 12.3518f, 6.963f, 10.6919f, 6.5202f)
                    curveTo(8.106f, 5.8304f, 6.9339f, 5.6593f, 6.2703f, 6.1966f)
                    lineTo(5.8817f, 6.5113f)
                    lineTo(6.511f, 7.2884f)
                    lineTo(6.8996f, 6.9738f)
                    close()
                }
            }
        }
        .build()
        return _br!!
    }

private var _br: ImageVector? = null
