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

val FlagIcons.CM: ImageVector
    get() {
        if (_cm != null) {
            return _cm!!
        }
        _cm = Builder(name = "Cm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFDC44), 1.0f to Color(0xFFFDD216), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF059170), 1.0f to Color(0xFF007B5E), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE21A30), 1.0f to Color(0xFFCE1126), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDC44), 1.0f to Color(0xFFFDD216), start =
                    Offset(17.5f,0.0f), end = Offset(17.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDC42), 1.0f to Color(0xFFFDD217), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,9.5225f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 8.475f)
                lineToRelative(-1.4695f, 1.0475f)
                lineToRelative(0.5422f, -1.7213f)
                lineToRelative(-1.4504f, -1.0738f)
                lineToRelative(1.8046f, -0.0162f)
                lineToRelative(0.5731f, -1.7112f)
                lineToRelative(0.5731f, 1.7112f)
                lineToRelative(1.8046f, 0.0162f)
                lineToRelative(-1.4504f, 1.0738f)
                lineToRelative(0.5422f, 1.7213f)
                close()
            }
        }
        .build()
        return _cm!!
    }

private var _cm: ImageVector? = null
