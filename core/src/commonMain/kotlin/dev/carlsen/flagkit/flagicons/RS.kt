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

val FlagIcons.RS: ImageVector
    get() {
        if (_rs != null) {
            return _rs!!
        }
        _rs = Builder(name = "Rs", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF17508F), 1.0f to Color(0xFF114175), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE1444D), 1.0f to Color(0xFFC53840), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
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
                    Offset(6.5f,5.0f), end = Offset(6.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.5f, 7.5f)
                curveTo(4.5f, 6.8262f, 4.8738f, 5.4846f, 4.8738f, 5.4846f)
                curveTo(4.9435f, 5.217f, 5.2158f, 5.0f, 5.4954f, 5.0f)
                lineTo(7.5046f, 5.0f)
                curveTo(7.7782f, 5.0f, 8.0574f, 5.2141f, 8.1262f, 5.4811f)
                curveTo(8.1262f, 5.4811f, 8.5f, 6.8101f, 8.5f, 7.5f)
                curveTo(8.5f, 8.145f, 8.1236f, 9.5195f, 8.1236f, 9.5195f)
                curveTo(8.0553f, 9.7849f, 7.8553f, 10.1742f, 7.6675f, 10.3724f)
                curveTo(7.6675f, 10.3724f, 7.25f, 11.0f, 6.5f, 11.0f)
                curveTo(5.75f, 11.0f, 5.3325f, 10.3724f, 5.3325f, 10.3724f)
                curveTo(5.1489f, 10.1667f, 4.9426f, 9.7828f, 4.8738f, 9.5126f)
                curveTo(4.8738f, 9.5126f, 4.5f, 8.161f, 4.5f, 7.5f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFFC43840)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.4219f, 4.7972f)
                    lineToRelative(-4.6247f, 5.7809f)
                    lineToRelative(0.7809f, 0.6247f)
                    lineToRelative(4.6247f, -5.7809f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFC43840)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(3.7972f, 5.4219f)
                    lineToRelative(4.6247f, 5.7809f)
                    lineToRelative(0.7809f, -0.6247f)
                    lineToRelative(-4.6247f, -5.7809f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.5f, 7.5f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD1A43A)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.0f, 4.0f)
                    lineTo(4.5f, 3.0f)
                    lineTo(5.5f, 3.5f)
                    lineTo(6.5f, 3.0f)
                    lineTo(7.5f, 3.5f)
                    lineTo(8.5f, 3.0f)
                    lineTo(8.0f, 4.0f)
                    lineTo(8.0f, 4.5f)
                    curveTo(8.0f, 4.7761f, 7.7842f, 5.0f, 7.5046f, 5.0f)
                    lineTo(5.4954f, 5.0f)
                    curveTo(5.2218f, 5.0f, 5.0f, 4.7681f, 5.0f, 4.5f)
                    lineTo(5.0f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _rs!!
    }

private var _rs: ImageVector? = null
