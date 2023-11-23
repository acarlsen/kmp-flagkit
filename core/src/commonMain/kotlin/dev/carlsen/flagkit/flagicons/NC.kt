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

val FlagIcons.NC: ImageVector
    get() {
        if (_nc != null) {
            return _nc!!
        }
        _nc = Builder(name = "Nc", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF094CC7), 1.0f to Color(0xFF003CAB), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2AAD55), 1.0f to Color(0xFF219447), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF65D55), 1.0f to Color(0xFFE9443C), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFAE749), 1.0f to Color(0xFFFBE533), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-3.5f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,4.6359f), end = Offset(10.5f,10.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0918f, 6.2112f)
                curveTo(10.034f, 6.2928f, 10.0f, 6.3924f, 10.0f, 6.5f)
                curveTo(10.0f, 6.7761f, 10.2239f, 7.0f, 10.5f, 7.0f)
                curveTo(10.7761f, 7.0f, 11.0f, 6.7761f, 11.0f, 6.5f)
                curveTo(11.0f, 6.2602f, 10.8312f, 6.0599f, 10.606f, 6.0113f)
                curveTo(10.6538f, 5.9869f, 10.7019f, 5.9608f, 10.75f, 5.933f)
                curveTo(11.3479f, 5.5878f, 11.7206f, 5.1141f, 11.5825f, 4.875f)
                curveTo(11.4445f, 4.6359f, 10.8479f, 4.7218f, 10.25f, 5.067f)
                curveTo(9.6521f, 5.4122f, 9.2794f, 5.8859f, 9.4175f, 6.125f)
                curveTo(9.5029f, 6.2729f, 9.7637f, 6.2965f, 10.0918f, 6.2112f)
                lineTo(10.0918f, 6.2112f)
                close()
                moveTo(10.5f, 10.5f)
                curveTo(9.6716f, 10.5f, 9.5f, 9.7761f, 9.5f, 9.5f)
                curveTo(9.5f, 9.2239f, 9.6716f, 9.0f, 10.5f, 9.0f)
                curveTo(11.3284f, 9.0f, 11.5f, 9.2239f, 11.5f, 9.5f)
                curveTo(11.5f, 9.7761f, 11.3284f, 10.5f, 10.5f, 10.5f)
                close()
                moveTo(10.5f, 9.0f)
                curveTo(10.2239f, 9.0f, 10.0f, 8.7761f, 10.0f, 8.5f)
                curveTo(10.0f, 8.2239f, 10.2239f, 8.0f, 10.5f, 8.0f)
                curveTo(10.7761f, 8.0f, 11.0f, 8.2239f, 11.0f, 8.5f)
                curveTo(11.0f, 8.7761f, 10.7761f, 9.0f, 10.5f, 9.0f)
                close()
                moveTo(10.5f, 8.0f)
                curveTo(10.2239f, 8.0f, 10.0f, 7.7761f, 10.0f, 7.5f)
                curveTo(10.0f, 7.2239f, 10.2239f, 7.0f, 10.5f, 7.0f)
                curveTo(10.7761f, 7.0f, 11.0f, 7.2239f, 11.0f, 7.5f)
                curveTo(11.0f, 7.7761f, 10.7761f, 8.0f, 10.5f, 8.0f)
                close()
            }
        }
        .build()
        return _nc!!
    }

private var _nc: ImageVector? = null
