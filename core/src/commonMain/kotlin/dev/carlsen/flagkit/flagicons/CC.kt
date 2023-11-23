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

val FlagIcons.CC: ImageVector
    get() {
        if (_cc != null) {
            return _cc!!
        }
        _cc = Builder(name = "Cc", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF229716), 1.0f to Color(0xFF1C7E12), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(4.0f,2.0f), end = Offset(4.0f,6.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.0f, 6.0f)
                curveTo(2.8954f, 6.0f, 2.0f, 5.1046f, 2.0f, 4.0f)
                curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
                curveTo(5.1046f, 2.0f, 6.0f, 2.8954f, 6.0f, 4.0f)
                curveTo(6.0f, 5.1046f, 5.1046f, 6.0f, 4.0f, 6.0f)
                close()
                moveTo(4.0f, 4.0f)
                curveTo(4.2082f, 4.0f, 3.8399f, 5.0544f, 4.0f, 5.0f)
                curveTo(4.2646f, 4.91f, 5.0f, 3.672f, 5.0f, 3.5f)
                curveTo(5.0f, 3.2239f, 4.5523f, 3.0f, 4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.2239f, 3.0f, 3.5f)
                curveTo(3.0f, 3.7761f, 3.4477f, 4.0f, 4.0f, 4.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(16.0f,11.7929f), end = Offset(16.0f,13.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.0f, 13.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(16.0f,2.2929f), end = Offset(16.0f,3.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.0f, 3.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(19.0f,5.2929f), end = Offset(19.0f,6.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(19.0f, 6.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(14.0f,6.2929f), end = Offset(14.0f,7.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0f, 7.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(17.5f,8.1464f), end = Offset(17.5f,8.8536f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.5f, 8.75f)
                lineToRelative(-0.3536f, 0.1036f)
                lineToRelative(0.1036f, -0.3536f)
                lineToRelative(-0.1036f, -0.3536f)
                lineToRelative(0.3536f, 0.1036f)
                lineToRelative(0.3536f, -0.1036f)
                lineToRelative(-0.1036f, 0.3536f)
                lineToRelative(0.1036f, 0.3536f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE244), 1.0f to Color(0xFFFFDF32), start =
                    Offset(10.030701f,5.0f), end = Offset(10.030701f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0614f, 5.5474f)
                curveTo(11.6335f, 5.2049f, 11.0907f, 5.0f, 10.5f, 5.0f)
                curveTo(9.1193f, 5.0f, 8.0f, 6.1193f, 8.0f, 7.5f)
                curveTo(8.0f, 8.8807f, 9.1193f, 10.0f, 10.5f, 10.0f)
                curveTo(11.0907f, 10.0f, 11.6335f, 9.7951f, 12.0614f, 9.4526f)
                curveTo(11.8347f, 9.5371f, 11.5894f, 9.5833f, 11.3333f, 9.5833f)
                curveTo(10.1827f, 9.5833f, 9.25f, 8.6506f, 9.25f, 7.5f)
                curveTo(9.25f, 6.3494f, 10.1827f, 5.4167f, 11.3333f, 5.4167f)
                curveTo(11.5894f, 5.4167f, 11.8347f, 5.4629f, 12.0614f, 5.5474f)
                lineTo(12.0614f, 5.5474f)
                close()
            }
        }
        .build()
        return _cc!!
    }

private var _cc: ImageVector? = null
