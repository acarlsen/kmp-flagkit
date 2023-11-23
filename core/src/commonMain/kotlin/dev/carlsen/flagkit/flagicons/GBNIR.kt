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

val FlagIcons.GB_NIR: ImageVector
    get() {
        if (_gbNir != null) {
            return _gbNir!!
        }
        _gbNir = Builder(name = "GbNir", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 21.0f, viewportHeight = 15.0f).apply {
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
            path(fill = linearGradient(0.0f to Color(0xFFE82739), 1.0f to Color(0xFFCA1A2B), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.5165f, 9.2606f)
                lineToRelative(-1.0165f, 1.7394f)
                lineToRelative(-1.0165f, -1.7394f)
                lineToRelative(-2.0146f, -0.0106f)
                lineToRelative(0.9981f, -1.75f)
                lineToRelative(-0.9981f, -1.75f)
                lineToRelative(2.0146f, -0.0106f)
                lineToRelative(1.0165f, -1.7394f)
                lineToRelative(1.0165f, 1.7394f)
                lineToRelative(2.0146f, 0.0106f)
                lineToRelative(-0.9981f, 1.75f)
                lineToRelative(0.9981f, 1.75f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE6101E), 1.0f to Color(0xFFCA0814), start =
                    Offset(10.6008f,6.0708f), end = Offset(10.6008f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5506f, 7.0059f)
                curveTo(9.5227f, 6.7265f, 9.7086f, 6.4305f, 9.9746f, 6.3418f)
                lineTo(10.5254f, 6.1582f)
                curveTo(10.7875f, 6.0708f, 11.0f, 6.2213f, 11.0f, 6.5078f)
                lineTo(11.0f, 7.5f)
                curveTo(11.0f, 7.5f, 11.3211f, 6.4634f, 11.5f, 7.0f)
                curveTo(11.6789f, 7.5366f, 11.3721f, 8.5264f, 11.3721f, 8.5264f)
                curveTo(11.3047f, 8.788f, 11.0287f, 9.0f, 10.7422f, 9.0f)
                lineTo(10.2578f, 9.0f)
                curveTo(9.9774f, 9.0f, 9.7269f, 8.7693f, 9.6994f, 8.4941f)
                lineTo(9.5506f, 7.0059f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.4981f,2.9084f), end = Offset(10.4981f,4.101f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4992f, 2.9084f)
                curveTo(9.9886f, 2.9084f, 9.5334f, 3.2116f, 9.3316f, 3.6711f)
                lineTo(9.2311f, 3.9f)
                lineTo(9.6889f, 4.101f)
                lineTo(9.7894f, 3.8721f)
                curveTo(9.9121f, 3.5927f, 10.1888f, 3.4084f, 10.4992f, 3.4084f)
                curveTo(10.8075f, 3.4084f, 11.0826f, 3.5901f, 11.2066f, 3.8665f)
                lineTo(11.3089f, 4.0946f)
                lineTo(11.7651f, 3.89f)
                lineTo(11.6628f, 3.6619f)
                curveTo(11.4589f, 3.2073f, 11.0063f, 2.9084f, 10.4992f, 2.9084f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD148), 1.0f to Color(0xFFFFCB2F), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 3.75f)
                lineTo(10.0f, 4.0f)
                lineTo(10.5f, 3.5f)
                lineTo(11.0f, 4.0f)
                lineTo(12.0f, 3.75f)
                lineTo(11.5964f, 4.759f)
                curveTo(11.5432f, 4.8921f, 11.3925f, 5.0f, 11.2548f, 5.0f)
                lineTo(9.7452f, 5.0f)
                curveTo(9.6098f, 5.0f, 9.4608f, 4.9019f, 9.4036f, 4.759f)
                lineTo(9.0f, 3.75f)
                close()
                moveTo(10.5f, 3.0f)
                curveTo(10.2239f, 3.0f, 10.0f, 2.7761f, 10.0f, 2.5f)
                curveTo(10.0f, 2.2239f, 10.2239f, 2.0f, 10.5f, 2.0f)
                curveTo(10.7761f, 2.0f, 11.0f, 2.2239f, 11.0f, 2.5f)
                curveTo(11.0f, 2.7761f, 10.7761f, 3.0f, 10.5f, 3.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF5169E2)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 4.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFD34D43)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(11.5f, 4.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFD34D43)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.5f, 4.5f)
                    moveToRelative(-1.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                    arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                }
            }
        }
        .build()
        return _gbNir!!
    }

private var _gbNir: ImageVector? = null
