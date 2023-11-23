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

val FlagIcons.JE: ImageVector
    get() {
        if (_je != null) {
            return _je!!
        }
        _je = Builder(name = "Je", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFEF273F), 1.0f to Color(0xFFDB1C33), start =
                    Offset(10.50025f,-1.44f), end = Offset(10.50025f,16.4347f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5002f, 6.2911f)
                lineTo(-0.9616f, -1.44f)
                lineTo(-2.08f, 0.2181f)
                lineTo(8.7119f, 7.4973f)
                lineTo(-2.08f, 14.7766f)
                lineTo(-0.9616f, 16.4347f)
                lineTo(10.5002f, 8.7036f)
                lineTo(21.9621f, 16.4347f)
                lineTo(23.0805f, 14.7766f)
                lineTo(12.2885f, 7.4973f)
                lineTo(23.0805f, 0.2181f)
                lineTo(21.9621f, -1.44f)
                lineTo(10.5002f, 6.2911f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF22A41), 1.0f to Color(0xFFE51D34), start =
                    Offset(10.5002f,1.9973f), end = Offset(10.5002f,5.3416f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0002f, 2.502f)
                curveTo(9.0002f, 2.2233f, 9.216f, 1.9973f, 9.4956f, 1.9973f)
                lineTo(11.5048f, 1.9973f)
                curveTo(11.7784f, 1.9973f, 12.0002f, 2.2114f, 12.0002f, 2.502f)
                lineTo(12.0002f, 3.4927f)
                curveTo(12.0002f, 3.7714f, 11.8397f, 4.1579f, 11.6523f, 4.3452f)
                lineTo(10.8481f, 5.1494f)
                curveTo(10.656f, 5.3416f, 10.3397f, 5.3368f, 10.1523f, 5.1494f)
                lineTo(9.3481f, 4.3452f)
                curveTo(9.156f, 4.1531f, 9.0002f, 3.7833f, 9.0002f, 3.4927f)
                lineTo(9.0002f, 2.502f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFADF46), 1.0f to Color(0xFFF9DC38), start =
                    Offset(10.5002f,0.9973f), end = Offset(10.5002f,3.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5002f, 3.9973f)
                curveTo(10.2241f, 3.9973f, 10.0002f, 3.7735f, 10.0002f, 3.4973f)
                curveTo(10.0002f, 3.2212f, 10.2241f, 2.9973f, 10.5002f, 2.9973f)
                curveTo(10.7764f, 2.9973f, 11.0002f, 3.2212f, 11.0002f, 3.4973f)
                curveTo(11.0002f, 3.7735f, 10.7764f, 3.9973f, 10.5002f, 3.9973f)
                close()
                moveTo(10.5002f, 1.9973f)
                curveTo(9.6718f, 1.9973f, 9.0002f, 1.7735f, 9.0002f, 1.4973f)
                curveTo(9.0002f, 1.2212f, 9.6718f, 0.9973f, 10.5002f, 0.9973f)
                curveTo(11.3287f, 0.9973f, 12.0002f, 1.2212f, 12.0002f, 1.4973f)
                curveTo(12.0002f, 1.7735f, 11.3287f, 1.9973f, 10.5002f, 1.9973f)
                close()
            }
        }
        .build()
        return _je!!
    }

private var _je: ImageVector? = null
