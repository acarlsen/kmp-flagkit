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

val FlagIcons.UG: ImageVector
    get() {
        if (_ug != null) {
            return _ug!!
        }
        _ug = Builder(name = "Ug", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,2.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED1623), 1.0f to Color(0xFFD70915), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFEE044), 1.0f to Color(0xFFFCDB32), start =
                    Offset(10.5f,2.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 2.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED1623), 1.0f to Color(0xFFD70915), start =
                    Offset(10.5f,13.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 13.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFEE044), 1.0f to Color(0xFFFCDB32), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.76545f,4.683f), end = Offset(10.76545f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.6805f, 5.6805f)
                curveTo(9.5808f, 5.5808f, 9.5781f, 5.4219f, 9.6805f, 5.3195f)
                lineTo(9.8195f, 5.1805f)
                curveTo(9.9192f, 5.0808f, 10.0725f, 4.9092f, 10.158f, 4.8176f)
                lineTo(10.2801f, 4.7192f)
                curveTo(10.4016f, 4.7362f, 10.5972f, 4.683f, 10.7223f, 4.7073f)
                lineTo(10.841f, 4.7992f)
                curveTo(10.9288f, 4.9101f, 10.9539f, 5.0923f, 10.884f, 5.2319f)
                lineTo(10.616f, 5.7681f)
                curveTo(10.5519f, 5.8962f, 10.5f, 6.116f, 10.5f, 6.25f)
                lineTo(10.5f, 6.25f)
                curveTo(10.5f, 6.3881f, 10.5923f, 6.5461f, 10.7319f, 6.616f)
                lineTo(11.2681f, 6.884f)
                curveTo(11.3962f, 6.9481f, 11.5785f, 7.0785f, 11.6742f, 7.1742f)
                lineTo(12.3258f, 7.8258f)
                curveTo(12.422f, 7.922f, 12.4539f, 8.0923f, 12.384f, 8.2319f)
                lineTo(12.116f, 8.7681f)
                curveTo(12.0519f, 8.8962f, 11.9219f, 8.9219f, 11.8195f, 8.8195f)
                lineTo(11.6805f, 8.6805f)
                curveTo(11.5808f, 8.5808f, 11.4219f, 8.5781f, 11.3195f, 8.6805f)
                lineTo(11.1805f, 8.8195f)
                curveTo(11.0808f, 8.9192f, 11.0f, 9.116f, 11.0f, 9.25f)
                lineTo(11.0f, 9.25f)
                curveTo(11.0f, 9.3881f, 11.0781f, 9.5781f, 11.1805f, 9.6805f)
                lineTo(11.3195f, 9.8195f)
                curveTo(11.4192f, 9.9192f, 11.3823f, 10.0f, 11.2523f, 10.0f)
                lineTo(10.2477f, 10.0f)
                curveTo(10.1109f, 10.0f, 10.0781f, 9.9219f, 10.1805f, 9.8195f)
                lineTo(10.3195f, 9.6805f)
                curveTo(10.4192f, 9.5808f, 10.5f, 9.384f, 10.5f, 9.25f)
                lineTo(10.5f, 9.25f)
                curveTo(10.5f, 9.1119f, 10.384f, 9.0f, 10.25f, 9.0f)
                lineTo(10.25f, 9.0f)
                curveTo(10.1119f, 9.0f, 9.9219f, 9.0781f, 9.8195f, 9.1805f)
                lineTo(9.6805f, 9.3195f)
                curveTo(9.5808f, 9.4192f, 9.4219f, 9.4219f, 9.3195f, 9.3195f)
                lineTo(9.1805f, 9.1805f)
                curveTo(9.0808f, 9.0808f, 9.0781f, 8.9219f, 9.1805f, 8.8195f)
                lineTo(9.3195f, 8.6805f)
                curveTo(9.4192f, 8.5808f, 9.607f, 8.5f, 9.7523f, 8.5f)
                lineTo(10.2477f, 8.5f)
                curveTo(10.387f, 8.5f, 10.4194f, 8.4194f, 10.3279f, 8.3279f)
                lineTo(9.1721f, 7.1721f)
                curveTo(9.077f, 7.077f, 9.0785f, 6.9215f, 9.1742f, 6.8258f)
                lineTo(9.8258f, 6.1742f)
                curveTo(9.922f, 6.078f, 9.9219f, 5.9219f, 9.8195f, 5.8195f)
                lineTo(9.6805f, 5.6805f)
                close()
            }
        }
        .build()
        return _ug!!
    }

private var _ug: ImageVector? = null
