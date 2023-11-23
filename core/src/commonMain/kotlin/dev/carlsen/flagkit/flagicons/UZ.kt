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

val FlagIcons.UZ: ImageVector
    get() {
        if (_uz != null) {
            return _uz!!
        }
        _uz = Builder(name = "Uz", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF04AAC8), 1.0f to Color(0xFF009AB6), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF23C840), 1.0f to Color(0xFF1EB639), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.0f,1.0f), end = Offset(6.0f,4.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.3336f, 1.2527f)
                curveTo(4.0952f, 1.0931f, 3.8085f, 1.0f, 3.5f, 1.0f)
                curveTo(2.6716f, 1.0f, 2.0f, 1.6716f, 2.0f, 2.5f)
                curveTo(2.0f, 3.3284f, 2.6716f, 4.0f, 3.5f, 4.0f)
                curveTo(3.8085f, 4.0f, 4.0952f, 3.9069f, 4.3336f, 3.7473f)
                curveTo(4.3059f, 3.7491f, 4.2781f, 3.75f, 4.25f, 3.75f)
                curveTo(3.5596f, 3.75f, 3.0f, 3.1904f, 3.0f, 2.5f)
                curveTo(3.0f, 1.8096f, 3.5596f, 1.25f, 4.25f, 1.25f)
                curveTo(4.2781f, 1.25f, 4.3059f, 1.2509f, 4.3336f, 1.2527f)
                close()
                moveTo(5.5f, 4.0f)
                curveTo(5.2239f, 4.0f, 5.0f, 3.7761f, 5.0f, 3.5f)
                curveTo(5.0f, 3.2239f, 5.2239f, 3.0f, 5.5f, 3.0f)
                curveTo(5.7761f, 3.0f, 6.0f, 3.2239f, 6.0f, 3.5f)
                curveTo(6.0f, 3.7761f, 5.7761f, 4.0f, 5.5f, 4.0f)
                close()
                moveTo(7.5f, 2.0f)
                curveTo(7.2239f, 2.0f, 7.0f, 1.7761f, 7.0f, 1.5f)
                curveTo(7.0f, 1.2239f, 7.2239f, 1.0f, 7.5f, 1.0f)
                curveTo(7.7761f, 1.0f, 8.0f, 1.2239f, 8.0f, 1.5f)
                curveTo(8.0f, 1.7761f, 7.7761f, 2.0f, 7.5f, 2.0f)
                close()
                moveTo(9.5f, 2.0f)
                curveTo(9.2239f, 2.0f, 9.0f, 1.7761f, 9.0f, 1.5f)
                curveTo(9.0f, 1.2239f, 9.2239f, 1.0f, 9.5f, 1.0f)
                curveTo(9.7761f, 1.0f, 10.0f, 1.2239f, 10.0f, 1.5f)
                curveTo(10.0f, 1.7761f, 9.7761f, 2.0f, 9.5f, 2.0f)
                close()
                moveTo(9.5f, 4.0f)
                curveTo(9.2239f, 4.0f, 9.0f, 3.7761f, 9.0f, 3.5f)
                curveTo(9.0f, 3.2239f, 9.2239f, 3.0f, 9.5f, 3.0f)
                curveTo(9.7761f, 3.0f, 10.0f, 3.2239f, 10.0f, 3.5f)
                curveTo(10.0f, 3.7761f, 9.7761f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(7.5f, 4.0f)
                curveTo(7.2239f, 4.0f, 7.0f, 3.7761f, 7.0f, 3.5f)
                curveTo(7.0f, 3.2239f, 7.2239f, 3.0f, 7.5f, 3.0f)
                curveTo(7.7761f, 3.0f, 8.0f, 3.2239f, 8.0f, 3.5f)
                curveTo(8.0f, 3.7761f, 7.7761f, 4.0f, 7.5f, 4.0f)
                close()
            }
        }
        .build()
        return _uz!!
    }

private var _uz: ImageVector? = null
