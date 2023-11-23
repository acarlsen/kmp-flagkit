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

val FlagIcons.BI: ImageVector
    get() {
        if (_bi != null) {
            return _bi!!
        }
        _bi = Builder(name = "Bi", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE4233B), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5002f,-0.0027f), end = Offset(10.5002f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0E-4f, -0.0027f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF34CD4E), 1.0f to Color(0xFF2AB441), start =
                    Offset(4.42f,-0.0027f), end = Offset(4.42f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.08f, -0.0027f)
                lineToRelative(9.0f, 7.5f)
                lineToRelative(-9.0f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF34CD4E), 1.0f to Color(0xFF2AB441), start =
                    Offset(16.5f,-0.0027f), end = Offset(16.5f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.0f, -0.0027f)
                lineToRelative(-9.0f, 7.5f)
                lineToRelative(9.0f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.50025f,-1.44f), end = Offset(10.50025f,16.4347f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.2787f, 4.7926f)
                lineTo(-0.9616f, -1.44f)
                lineTo(-2.08f, 0.2181f)
                lineTo(7.1596f, 6.4502f)
                curveTo(7.056f, 6.7809f, 7.0002f, 7.1326f, 7.0002f, 7.4973f)
                curveTo(7.0002f, 7.8621f, 7.056f, 8.2138f, 7.1596f, 8.5444f)
                lineTo(-2.08f, 14.7766f)
                lineTo(-0.9616f, 16.4347f)
                lineTo(8.2787f, 10.202f)
                curveTo(8.883f, 10.699f, 9.6568f, 10.9973f, 10.5002f, 10.9973f)
                curveTo(11.3437f, 10.9973f, 12.1175f, 10.699f, 12.7218f, 10.202f)
                lineTo(21.9621f, 16.4347f)
                lineTo(23.0805f, 14.7766f)
                lineTo(13.8409f, 8.5444f)
                curveTo(13.9444f, 8.2138f, 14.0002f, 7.8621f, 14.0002f, 7.4973f)
                curveTo(14.0002f, 7.1326f, 13.9444f, 6.7809f, 13.8409f, 6.4502f)
                lineTo(23.0805f, 0.2181f)
                lineTo(21.9621f, -1.44f)
                lineTo(12.7218f, 4.7926f)
                curveTo(12.1175f, 4.2957f, 11.3437f, 3.9973f, 10.5002f, 3.9973f)
                curveTo(9.6568f, 3.9973f, 8.883f, 4.2957f, 8.2787f, 4.7926f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDF2239), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5002f,5.2902f), end = Offset(10.5002f,9.2044f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5002f, 6.4973f)
                lineTo(9.7931f, 6.7044f)
                lineTo(10.0002f, 5.9973f)
                lineTo(9.7931f, 5.2902f)
                lineTo(10.5002f, 5.4973f)
                lineTo(11.2073f, 5.2902f)
                lineTo(11.0002f, 5.9973f)
                lineTo(11.2073f, 6.7044f)
                lineTo(10.5002f, 6.4973f)
                close()
                moveTo(9.0002f, 8.9973f)
                lineTo(8.2931f, 9.2044f)
                lineTo(8.5002f, 8.4973f)
                lineTo(8.2931f, 7.7902f)
                lineTo(9.0002f, 7.9973f)
                lineTo(9.7073f, 7.7902f)
                lineTo(9.5002f, 8.4973f)
                lineTo(9.7073f, 9.2044f)
                lineTo(9.0002f, 8.9973f)
                close()
                moveTo(12.0002f, 8.9973f)
                lineTo(11.2931f, 9.2044f)
                lineTo(11.5002f, 8.4973f)
                lineTo(11.2931f, 7.7902f)
                lineTo(12.0002f, 7.9973f)
                lineTo(12.7073f, 7.7902f)
                lineTo(12.5002f, 8.4973f)
                lineTo(12.7073f, 9.2044f)
                lineTo(12.0002f, 8.9973f)
                close()
            }
        }
        .build()
        return _bi!!
    }

private var _bi: ImageVector? = null
