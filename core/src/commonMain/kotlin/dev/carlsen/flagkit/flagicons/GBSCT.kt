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

val FlagIcons.GB_SCT: ImageVector
    get() {
        if (_gbSct != null) {
            return _gbSct!!
        }
        _gbSct = Builder(name = "GbSct", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp,
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
            path(fill = linearGradient(0.0f to Color(0xFF1479D0), 1.0f to Color(0xFF0A68BA), start =
                    Offset(10.5002f,-0.0027f), end = Offset(10.5002f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0E-4f, -0.0027f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
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
        }
        .build()
        return _gbSct!!
    }

private var _gbSct: ImageVector? = null
