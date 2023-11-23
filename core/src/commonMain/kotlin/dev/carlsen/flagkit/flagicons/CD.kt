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

val FlagIcons.CD: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = Builder(name = "Cd", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF158AFF), 1.0f to Color(0xFF007FFF), start =
                    Offset(10.503799f,0.0026f), end = Offset(10.503799f,15.0026f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0038f, 0.0026f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD216)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(24.2731f, 3.906f)
                lineToRelative(-25.8392f, 13.1657f)
                lineToRelative(-2.7239f, -5.346f)
                lineToRelative(25.8392f, -13.1657f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFCE1120), 1.0f to Color(0xFFE11B2B), start =
                    Offset(10.2674f,-0.73099995f), end = Offset(10.2674f,15.9987f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(24.095f, 2.833f)
                lineToRelative(-25.8392f, 13.1657f)
                lineToRelative(-1.816f, -3.564f)
                lineToRelative(25.8392f, -13.1657f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD216)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5038f, 4.4776f)
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
        return _cd!!
    }

private var _cd: ImageVector? = null
