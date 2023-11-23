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

val FlagIcons.TM: ImageVector
    get() {
        if (_tm != null) {
            return _tm!!
        }
        _tm = Builder(name = "Tm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF30C375), 1.0f to Color(0xFF28AE67), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDE414F), 1.0f to Color(0xFFCA3745), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 2.0f)
                arcToRelative(1.5f, 1.0f, 0.0f, true, false, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.0f, 0.0f, true, false, -3.0f, 0.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.5f, 2.0f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 1.0f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.5f, 2.0f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 13.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, 3.0f, 0.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, -3.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.5f, 13.0f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 12.0f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.5f, 13.0f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(1.0f)
                    horizontalLineToRelative(-1.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 8.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, 3.0f, 0.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, -3.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.5f, 8.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 10.5f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, 3.0f, 0.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, -3.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFBAF29)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 5.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, 3.0f, 0.0f)
                    arcToRelative(1.5f, 1.0f, 0.0f, true, false, -3.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFDD404F)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.5f, 5.0f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.0f, 4.0f)
                    horizontalLineToRelative(1.0f)
                    verticalLineToRelative(2.0f)
                    horizontalLineToRelative(-1.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF28AE67)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(5.0f, 4.0f)
                    horizontalLineToRelative(1.0f)
                    verticalLineToRelative(2.0f)
                    horizontalLineToRelative(-1.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(10.0f,1.9395f), end = Offset(10.0f,6.0605f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(11.117f, 3.1786f)
                    curveTo(10.9395f, 3.3902f, 10.9671f, 3.7055f, 11.1786f, 3.883f)
                    curveTo(11.3902f, 4.0605f, 11.7055f, 4.0329f, 11.883f, 3.8214f)
                    curveTo(12.0605f, 3.6099f, 12.0329f, 3.2945f, 11.8214f, 3.117f)
                    curveTo(11.6099f, 2.9395f, 11.2945f, 2.9671f, 11.117f, 3.1786f)
                    close()
                    moveTo(9.8214f, 5.117f)
                    curveTo(9.6099f, 4.9395f, 9.2945f, 4.9671f, 9.117f, 5.1786f)
                    curveTo(8.9395f, 5.3902f, 8.9671f, 5.7055f, 9.1786f, 5.883f)
                    curveTo(9.3902f, 6.0605f, 9.7055f, 6.0329f, 9.883f, 5.8214f)
                    curveTo(10.0605f, 5.6099f, 10.0329f, 5.2945f, 9.8214f, 5.117f)
                    lineTo(9.8214f, 5.117f)
                    close()
                    moveTo(8.8214f, 4.117f)
                    curveTo(8.6099f, 3.9395f, 8.2945f, 3.9671f, 8.117f, 4.1786f)
                    curveTo(7.9395f, 4.3902f, 7.9671f, 4.7055f, 8.1786f, 4.883f)
                    curveTo(8.3902f, 5.0605f, 8.7055f, 5.0329f, 8.883f, 4.8214f)
                    curveTo(9.0605f, 4.6099f, 9.0329f, 4.2945f, 8.8214f, 4.117f)
                    lineTo(8.8214f, 4.117f)
                    close()
                    moveTo(10.8214f, 2.117f)
                    curveTo(10.6099f, 1.9395f, 10.2945f, 1.9671f, 10.117f, 2.1786f)
                    curveTo(9.9395f, 2.3902f, 9.9671f, 2.7055f, 10.1786f, 2.883f)
                    curveTo(10.3902f, 3.0605f, 10.7055f, 3.0329f, 10.883f, 2.8214f)
                    curveTo(11.0605f, 2.6099f, 11.0329f, 2.2945f, 10.8214f, 2.117f)
                    lineTo(10.8214f, 2.117f)
                    close()
                    moveTo(10.3214f, 3.617f)
                    curveTo(10.1099f, 3.4395f, 9.7945f, 3.4671f, 9.617f, 3.6786f)
                    curveTo(9.4395f, 3.8902f, 9.4671f, 4.2055f, 9.6786f, 4.383f)
                    curveTo(9.8902f, 4.5605f, 10.2055f, 4.5329f, 10.383f, 4.3214f)
                    curveTo(10.5605f, 4.1099f, 10.5329f, 3.7945f, 10.3214f, 3.617f)
                    lineTo(10.3214f, 3.617f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(11.3897f,2.4621f), end = Offset(11.3897f,8.2789f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.1071f, 7.0879f)
                    curveTo(11.916f, 8.2789f, 9.985f, 8.2789f, 8.7939f, 7.0879f)
                    curveTo(8.6785f, 6.9725f, 8.5743f, 6.8501f, 8.4813f, 6.7222f)
                    curveTo(9.6739f, 7.5893f, 11.353f, 7.4851f, 12.4287f, 6.4095f)
                    curveTo(13.5043f, 5.3339f, 13.6085f, 3.6547f, 12.7414f, 2.4621f)
                    curveTo(12.8693f, 2.5551f, 12.9917f, 2.6594f, 13.1071f, 2.7748f)
                    curveTo(14.2981f, 3.9658f, 14.2981f, 5.8969f, 13.1071f, 7.0879f)
                    close()
                }
            }
        }
        .build()
        return _tm!!
    }

private var _tm: ImageVector? = null
