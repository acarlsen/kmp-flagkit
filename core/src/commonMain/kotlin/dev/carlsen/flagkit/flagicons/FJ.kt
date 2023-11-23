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

val FlagIcons.FJ: ImageVector
    get() {
        if (_fj != null) {
            return _fj!!
        }
        _fj = Builder(name = "Fj", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF79CFF6), 1.0f to Color(0xFF68BFE6), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF042C90), 1.0f to Color(0xFF00247E), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(15.5f,4.0f), end = Offset(15.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 7.5f)
                lineTo(13.0f, 4.0f)
                lineTo(18.0f, 4.0f)
                lineTo(18.0f, 7.5f)
                curveTo(18.0f, 10.0f, 15.5f, 11.0f, 15.5f, 11.0f)
                curveTo(15.5f, 11.0f, 13.0f, 10.0f, 13.0f, 7.5f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF2A915C)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(14.0f, 6.5f)
                    curveTo(13.7239f, 6.5f, 13.5f, 6.2761f, 13.5f, 6.0f)
                    curveTo(13.5f, 5.7239f, 13.7239f, 5.5f, 14.0f, 5.5f)
                    curveTo(14.2761f, 5.5f, 14.5f, 5.7239f, 14.5f, 6.0f)
                    curveTo(14.5f, 6.2761f, 14.2761f, 6.5f, 14.0f, 6.5f)
                    close()
                    moveTo(17.0f, 6.5f)
                    curveTo(16.7239f, 6.5f, 16.5f, 6.2761f, 16.5f, 6.0f)
                    curveTo(16.5f, 5.7239f, 16.7239f, 5.5f, 17.0f, 5.5f)
                    curveTo(17.2761f, 5.5f, 17.5f, 5.7239f, 17.5f, 6.0f)
                    curveTo(17.5f, 6.2761f, 17.2761f, 6.5f, 17.0f, 6.5f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFEB1D43), 1.0f to Color(0xFFD21034),
                        start = Offset(15.5f,4.0f), end = Offset(15.5f,11.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(13.0f, 4.0f)
                    lineToRelative(5.0f, 0.0f)
                    lineToRelative(0.0f, 1.0f)
                    lineToRelative(-2.0f, 0.0f)
                    lineToRelative(0.0f, 2.0f)
                    lineToRelative(2.0f, 0.0f)
                    lineToRelative(0.0f, 1.0f)
                    lineToRelative(-2.0f, 0.0f)
                    lineToRelative(0.0f, 3.0f)
                    lineToRelative(-1.0f, 0.0f)
                    lineToRelative(0.0f, -3.0f)
                    lineToRelative(-2.0f, 0.0f)
                    lineToRelative(0.0f, -1.0f)
                    lineToRelative(2.0f, 0.0f)
                    lineToRelative(0.0f, -2.0f)
                    lineToRelative(-2.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.5f, 3.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(0.5f, 0.0f)
                    lineTo(4.0f, 2.5f)
                    lineTo(5.0f, 2.5f)
                    lineTo(9.0f, 0.0f)
                    lineTo(9.0f, 0.25f)
                    curveTo(9.0f, 0.3881f, 8.9135f, 0.5618f, 8.7915f, 0.6489f)
                    lineTo(5.5f, 3.0f)
                    lineTo(5.5f, 4.0f)
                    lineTo(8.8118f, 6.8387f)
                    curveTo(8.9158f, 6.9278f, 8.884f, 7.0f, 8.75f, 7.0f)
                    lineTo(8.75f, 7.0f)
                    curveTo(8.6119f, 7.0f, 8.4135f, 6.9382f, 8.2915f, 6.8511f)
                    lineTo(5.0f, 4.5f)
                    lineTo(4.0f, 4.5f)
                    lineTo(0.0f, 7.0f)
                    lineTo(0.0f, 6.5f)
                    lineTo(3.5f, 4.0f)
                    lineTo(3.5f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFFFFFF)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.25f, 3.115f)
                    lineTo(-0.6758f, -0.25f)
                    lineTo(0.5f, -0.25f)
                    lineTo(0.6453f, -0.2034f)
                    lineTo(4.0801f, 2.25f)
                    lineTo(4.9283f, 2.25f)
                    lineTo(9.25f, -0.4511f)
                    lineTo(9.25f, 0.25f)
                    curveTo(9.25f, 0.4717f, 9.1221f, 0.72f, 8.9369f, 0.8523f)
                    lineTo(5.75f, 3.1287f)
                    lineTo(5.75f, 3.885f)
                    lineTo(8.9745f, 6.6489f)
                    curveTo(9.257f, 6.891f, 9.1132f, 7.25f, 8.75f, 7.25f)
                    curveTo(8.5569f, 7.25f, 8.3082f, 7.1702f, 8.1462f, 7.0545f)
                    lineTo(4.9199f, 4.75f)
                    lineTo(4.0717f, 4.75f)
                    lineTo(-0.25f, 7.4511f)
                    lineTo(-0.25f, 6.3713f)
                    lineTo(3.25f, 3.8713f)
                    lineTo(3.25f, 3.115f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(4.75f,0.0f), end = Offset(4.75f,7.5f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 2.5f)
                    lineTo(0.0f, 4.5f)
                    lineTo(3.5f, 4.5f)
                    lineTo(3.5f, 7.0046f)
                    curveTo(3.5f, 7.2782f, 3.714f, 7.5f, 4.0047f, 7.5f)
                    lineTo(4.9953f, 7.5f)
                    curveTo(5.274f, 7.5f, 5.5f, 7.2842f, 5.5f, 7.0046f)
                    lineTo(5.5f, 4.5f)
                    lineTo(9.0095f, 4.5f)
                    curveTo(9.2804f, 4.5f, 9.5f, 4.286f, 9.5f, 3.9953f)
                    lineTo(9.5f, 3.0047f)
                    curveTo(9.5f, 2.726f, 9.2849f, 2.5f, 9.0095f, 2.5f)
                    lineTo(5.5f, 2.5f)
                    lineTo(5.5f, 0.0f)
                    lineTo(3.5f, 0.0f)
                    lineTo(3.5f, 2.5f)
                    lineTo(0.0f, 2.5f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931),
                        start = Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 3.0f)
                    lineToRelative(4.0f, 0.0f)
                    lineToRelative(0.0f, -0.5f)
                    lineToRelative(0.0f, -2.5f)
                    lineToRelative(1.0f, 0.0f)
                    lineToRelative(0.0f, 2.5f)
                    lineToRelative(0.0f, 0.5f)
                    lineToRelative(4.0f, 0.0f)
                    lineToRelative(0.0f, 1.0f)
                    lineToRelative(-4.0f, 0.0f)
                    lineToRelative(0.0f, 0.5f)
                    lineToRelative(0.0f, 2.5f)
                    lineToRelative(-1.0f, 0.0f)
                    lineToRelative(0.0f, -2.5f)
                    lineToRelative(0.0f, -0.5f)
                    lineToRelative(-4.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _fj!!
    }

private var _fj: ImageVector? = null
