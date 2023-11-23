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

val FlagIcons.AZ: ImageVector
    get() {
        if (_az != null) {
            return _az!!
        }
        _az = Builder(name = "Az", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF24AAD5), 1.0f to Color(0xFF1899C2), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFED1845), 1.0f to Color(0xFFDE0C39), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF21BF75), 1.0f to Color(0xFF19AD68), start =
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
                    Offset(10.5f,6.0f), end = Offset(10.5f,9.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.3336f, 6.2527f)
                curveTo(11.3059f, 6.2509f, 11.2781f, 6.25f, 11.25f, 6.25f)
                curveTo(10.5596f, 6.25f, 10.0f, 6.8096f, 10.0f, 7.5f)
                curveTo(10.0f, 8.1904f, 10.5596f, 8.75f, 11.25f, 8.75f)
                curveTo(11.2781f, 8.75f, 11.3059f, 8.7491f, 11.3336f, 8.7473f)
                curveTo(11.0952f, 8.9069f, 10.8085f, 9.0f, 10.5f, 9.0f)
                curveTo(9.6716f, 9.0f, 9.0f, 8.3284f, 9.0f, 7.5f)
                curveTo(9.0f, 6.6716f, 9.6716f, 6.0f, 10.5f, 6.0f)
                curveTo(10.8085f, 6.0f, 11.0952f, 6.0931f, 11.3336f, 6.2527f)
                close()
                moveTo(11.5f, 8.0f)
                curveTo(11.2239f, 8.0f, 11.0f, 7.7761f, 11.0f, 7.5f)
                curveTo(11.0f, 7.2239f, 11.2239f, 7.0f, 11.5f, 7.0f)
                curveTo(11.7761f, 7.0f, 12.0f, 7.2239f, 12.0f, 7.5f)
                curveTo(12.0f, 7.7761f, 11.7761f, 8.0f, 11.5f, 8.0f)
                close()
            }
        }
        .build()
        return _az!!
    }

private var _az: ImageVector? = null
