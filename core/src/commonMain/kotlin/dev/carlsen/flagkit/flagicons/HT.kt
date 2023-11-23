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

val FlagIcons.HT: ImageVector
    get() {
        if (_ht != null) {
            return _ht!!
        }
        _ht = Builder(name = "Ht", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF112EBC), 1.0f to Color(0xFF0620A0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE3264A), 1.0f to Color(0xFFD20F34), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.5f, 5.0f)
                lineTo(13.5f, 5.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 5.5f)
                lineTo(14.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 11.0f)
                lineTo(7.5f, 11.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 10.5f)
                lineTo(7.0f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 5.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFFAABCAE)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.0f, 10.0f)
                    lineTo(8.1053f, 9.4474f)
                    curveTo(8.5994f, 9.2003f, 9.4427f, 9.0f, 9.999f, 9.0f)
                    lineTo(11.001f, 9.0f)
                    curveTo(11.5528f, 9.0f, 12.4047f, 9.2024f, 12.8947f, 9.4474f)
                    lineTo(14.0f, 10.0f)
                    lineTo(14.0f, 11.0f)
                    lineTo(7.0f, 11.0f)
                    lineTo(7.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF366C14)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.25f, 10.1545f)
                    lineTo(7.25f, 10.75f)
                    lineTo(13.75f, 10.75f)
                    lineTo(13.75f, 10.1545f)
                    lineTo(12.7829f, 9.671f)
                    curveTo(12.3262f, 9.4426f, 11.5123f, 9.25f, 11.001f, 9.25f)
                    lineTo(9.999f, 9.25f)
                    curveTo(9.4831f, 9.25f, 8.678f, 9.4405f, 8.2171f, 9.671f)
                    lineTo(7.25f, 10.1545f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFD4B872)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 7.5f)
                    moveToRelative(-1.5f, 0.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                    arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFC28321)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 8.0059f)
                    curveTo(8.0f, 7.7265f, 8.1798f, 7.6438f, 8.3906f, 7.8125f)
                    lineTo(10.1094f, 9.1875f)
                    curveTo(10.3251f, 9.3601f, 10.6798f, 9.3562f, 10.8906f, 9.1875f)
                    lineTo(12.6094f, 7.8125f)
                    curveTo(12.8251f, 7.6399f, 13.0f, 7.7307f, 13.0f, 8.0059f)
                    lineTo(13.0f, 9.4941f)
                    curveTo(13.0f, 9.7735f, 12.7852f, 10.0f, 12.5023f, 10.0f)
                    lineTo(8.4977f, 10.0f)
                    curveTo(8.2228f, 10.0f, 8.0f, 9.7693f, 8.0f, 9.4941f)
                    lineTo(8.0f, 8.0059f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0D3488)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.25f, 8.0202f)
                    lineTo(8.25f, 9.4941f)
                    curveTo(8.25f, 9.6339f, 8.3636f, 9.75f, 8.4977f, 9.75f)
                    lineTo(12.5023f, 9.75f)
                    curveTo(12.6428f, 9.75f, 12.75f, 9.6398f, 12.75f, 9.4941f)
                    lineTo(12.75f, 8.0202f)
                    lineTo(11.0468f, 9.3827f)
                    curveTo(10.7432f, 9.6256f, 10.2588f, 9.6272f, 9.9532f, 9.3827f)
                    lineTo(8.25f, 8.0202f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF216C30)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.1721f, 6.1721f)
                    curveTo(9.077f, 6.077f, 9.1139f, 6.0f, 9.2558f, 6.0f)
                    lineTo(11.7442f, 6.0f)
                    curveTo(11.8855f, 6.0f, 11.9194f, 6.0806f, 11.8279f, 6.1721f)
                    lineTo(10.6721f, 7.3279f)
                    curveTo(10.577f, 7.423f, 10.4194f, 7.4194f, 10.3279f, 7.3279f)
                    lineTo(9.1721f, 6.1721f)
                    close()
                }
            }
        }
        .build()
        return _ht!!
    }

private var _ht: ImageVector? = null
