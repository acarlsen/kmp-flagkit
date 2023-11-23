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

val FlagIcons.SA: ImageVector
    get() {
        if (_sa != null) {
            return _sa!!
        }
        _sa = Builder(name = "Sa", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF128C4B), 1.0f to Color(0xFF0B6C38), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,7.5964f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0078f)
                curveTo(13.0f, 7.7274f, 13.1928f, 7.5964f, 13.4532f, 7.7266f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 9.0f)
                lineTo(15.4953f, 9.0f)
                curveTo(15.774f, 9.0f, 16.0f, 9.214f, 16.0f, 9.5047f)
                lineTo(16.0f, 10.0f)
                curveTo(16.0f, 10.5523f, 15.5573f, 11.0f, 15.001f, 11.0f)
                lineTo(13.4954f, 11.0f)
                curveTo(13.2218f, 11.0f, 13.0f, 10.7681f, 13.0f, 10.5f)
                lineTo(13.0f, 10.0f)
                lineTo(6.5034f, 10.0f)
                curveTo(6.2254f, 10.0f, 5.8438f, 9.8438f, 5.6502f, 9.6502f)
                lineTo(5.0f, 9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.5f,4.0f), end = Offset(6.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 6.2523f)
                curveTo(5.0f, 6.113f, 5.0781f, 5.9219f, 5.1805f, 5.8195f)
                lineTo(5.3195f, 5.6805f)
                curveTo(5.4192f, 5.5808f, 5.4219f, 5.4219f, 5.3195f, 5.3195f)
                lineTo(5.1805f, 5.1805f)
                curveTo(5.0808f, 5.0808f, 5.0f, 4.893f, 5.0f, 4.7477f)
                lineTo(5.0f, 4.2523f)
                curveTo(5.0f, 4.113f, 5.107f, 4.0f, 5.2523f, 4.0f)
                lineTo(5.7477f, 4.0f)
                curveTo(5.887f, 4.0f, 6.0f, 4.107f, 6.0f, 4.2523f)
                lineTo(6.0f, 4.7477f)
                curveTo(6.0f, 4.887f, 6.0461f, 4.9077f, 6.116f, 4.7681f)
                lineTo(6.384f, 4.2319f)
                curveTo(6.4481f, 4.1038f, 6.6177f, 4.0f, 6.7477f, 4.0f)
                lineTo(7.7523f, 4.0f)
                curveTo(7.8891f, 4.0f, 8.0f, 4.116f, 8.0f, 4.25f)
                lineTo(8.0f, 4.25f)
                curveTo(8.0f, 4.3881f, 7.893f, 4.5f, 7.7477f, 4.5f)
                lineTo(7.2523f, 4.5f)
                curveTo(7.113f, 4.5f, 7.0f, 4.616f, 7.0f, 4.75f)
                lineTo(7.0f, 4.75f)
                curveTo(7.0f, 4.8881f, 7.107f, 5.0f, 7.2523f, 5.0f)
                lineTo(7.7477f, 5.0f)
                curveTo(7.887f, 5.0f, 8.0f, 5.1075f, 8.0f, 5.2452f)
                lineTo(8.0f, 6.7548f)
                curveTo(8.0f, 6.8902f, 7.893f, 7.0f, 7.7477f, 7.0f)
                lineTo(7.2523f, 7.0f)
                curveTo(7.113f, 7.0f, 7.0f, 6.893f, 7.0f, 6.7477f)
                lineTo(7.0f, 6.2523f)
                curveTo(7.0f, 6.113f, 7.116f, 6.0f, 7.25f, 6.0f)
                lineTo(7.25f, 6.0f)
                curveTo(7.3881f, 6.0f, 7.5f, 5.884f, 7.5f, 5.75f)
                lineTo(7.5f, 5.75f)
                curveTo(7.5f, 5.6119f, 7.393f, 5.5f, 7.2477f, 5.5f)
                lineTo(6.7523f, 5.5f)
                curveTo(6.613f, 5.5f, 6.5f, 5.6177f, 6.5f, 5.7477f)
                lineTo(6.5f, 6.7523f)
                curveTo(6.5f, 6.8891f, 6.384f, 7.0f, 6.25f, 7.0f)
                lineTo(6.25f, 7.0f)
                curveTo(6.1119f, 7.0f, 6.0f, 6.893f, 6.0f, 6.7477f)
                lineTo(6.0f, 6.2523f)
                curveTo(6.0f, 6.113f, 5.884f, 6.0f, 5.75f, 6.0f)
                lineTo(5.75f, 6.0f)
                curveTo(5.6119f, 6.0f, 5.5f, 6.107f, 5.5f, 6.2523f)
                lineTo(5.5f, 6.7477f)
                curveTo(5.5f, 6.887f, 5.384f, 7.0f, 5.25f, 7.0f)
                lineTo(5.25f, 7.0f)
                curveTo(5.1119f, 7.0f, 5.0f, 6.893f, 5.0f, 6.7477f)
                lineTo(5.0f, 6.2523f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(14.5f,4.0f), end = Offset(14.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 6.2523f)
                curveTo(13.0f, 6.113f, 13.0781f, 5.9219f, 13.1805f, 5.8195f)
                lineTo(13.3195f, 5.6805f)
                curveTo(13.4192f, 5.5808f, 13.4219f, 5.4219f, 13.3195f, 5.3195f)
                lineTo(13.1805f, 5.1805f)
                curveTo(13.0808f, 5.0808f, 13.0f, 4.893f, 13.0f, 4.7477f)
                lineTo(13.0f, 4.2523f)
                curveTo(13.0f, 4.113f, 13.107f, 4.0f, 13.2523f, 4.0f)
                lineTo(13.7477f, 4.0f)
                curveTo(13.887f, 4.0f, 14.0f, 4.107f, 14.0f, 4.2523f)
                lineTo(14.0f, 4.7477f)
                curveTo(14.0f, 4.887f, 14.0461f, 4.9077f, 14.116f, 4.7681f)
                lineTo(14.384f, 4.2319f)
                curveTo(14.4481f, 4.1038f, 14.6177f, 4.0f, 14.7477f, 4.0f)
                lineTo(15.7523f, 4.0f)
                curveTo(15.8891f, 4.0f, 16.0f, 4.116f, 16.0f, 4.25f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.3881f, 15.893f, 4.5f, 15.7477f, 4.5f)
                lineTo(15.2523f, 4.5f)
                curveTo(15.113f, 4.5f, 15.0f, 4.616f, 15.0f, 4.75f)
                lineTo(15.0f, 4.75f)
                curveTo(15.0f, 4.8881f, 15.107f, 5.0f, 15.2523f, 5.0f)
                lineTo(15.7477f, 5.0f)
                curveTo(15.887f, 5.0f, 16.0f, 5.1075f, 16.0f, 5.2452f)
                lineTo(16.0f, 6.7548f)
                curveTo(16.0f, 6.8902f, 15.893f, 7.0f, 15.7477f, 7.0f)
                lineTo(15.2523f, 7.0f)
                curveTo(15.113f, 7.0f, 15.0f, 6.893f, 15.0f, 6.7477f)
                lineTo(15.0f, 6.2523f)
                curveTo(15.0f, 6.113f, 15.116f, 6.0f, 15.25f, 6.0f)
                lineTo(15.25f, 6.0f)
                curveTo(15.3881f, 6.0f, 15.5f, 5.884f, 15.5f, 5.75f)
                lineTo(15.5f, 5.75f)
                curveTo(15.5f, 5.6119f, 15.393f, 5.5f, 15.2477f, 5.5f)
                lineTo(14.7523f, 5.5f)
                curveTo(14.613f, 5.5f, 14.5f, 5.6177f, 14.5f, 5.7477f)
                lineTo(14.5f, 6.7523f)
                curveTo(14.5f, 6.8891f, 14.384f, 7.0f, 14.25f, 7.0f)
                lineTo(14.25f, 7.0f)
                curveTo(14.1119f, 7.0f, 14.0f, 6.893f, 14.0f, 6.7477f)
                lineTo(14.0f, 6.2523f)
                curveTo(14.0f, 6.113f, 13.884f, 6.0f, 13.75f, 6.0f)
                lineTo(13.75f, 6.0f)
                curveTo(13.6119f, 6.0f, 13.5f, 6.107f, 13.5f, 6.2523f)
                lineTo(13.5f, 6.7477f)
                curveTo(13.5f, 6.887f, 13.384f, 7.0f, 13.25f, 7.0f)
                lineTo(13.25f, 7.0f)
                curveTo(13.1119f, 7.0f, 13.0f, 6.893f, 13.0f, 6.7477f)
                lineTo(13.0f, 6.2523f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(12.0f, 4.7477f)
                curveTo(12.0f, 4.887f, 11.9219f, 5.0781f, 11.8195f, 5.1805f)
                lineTo(11.6805f, 5.3195f)
                curveTo(11.5808f, 5.4192f, 11.5781f, 5.5781f, 11.6805f, 5.6805f)
                lineTo(11.8195f, 5.8195f)
                curveTo(11.9192f, 5.9192f, 12.0f, 6.107f, 12.0f, 6.2523f)
                lineTo(12.0f, 6.7477f)
                curveTo(12.0f, 6.887f, 11.893f, 7.0f, 11.7477f, 7.0f)
                lineTo(11.2523f, 7.0f)
                curveTo(11.113f, 7.0f, 11.0f, 6.893f, 11.0f, 6.7477f)
                lineTo(11.0f, 6.2523f)
                curveTo(11.0f, 6.113f, 10.9539f, 6.0923f, 10.884f, 6.2319f)
                lineTo(10.616f, 6.7681f)
                curveTo(10.5519f, 6.8962f, 10.3823f, 7.0f, 10.2523f, 7.0f)
                lineTo(9.2477f, 7.0f)
                curveTo(9.1109f, 7.0f, 9.0f, 6.884f, 9.0f, 6.75f)
                lineTo(9.0f, 6.75f)
                curveTo(9.0f, 6.6119f, 9.107f, 6.5f, 9.2523f, 6.5f)
                lineTo(9.7477f, 6.5f)
                curveTo(9.887f, 6.5f, 10.0f, 6.384f, 10.0f, 6.25f)
                lineTo(10.0f, 6.25f)
                curveTo(10.0f, 6.1119f, 9.893f, 6.0f, 9.7477f, 6.0f)
                lineTo(9.2523f, 6.0f)
                curveTo(9.113f, 6.0f, 9.0f, 5.8925f, 9.0f, 5.7548f)
                lineTo(9.0f, 4.2452f)
                curveTo(9.0f, 4.1098f, 9.107f, 4.0f, 9.2523f, 4.0f)
                lineTo(9.7477f, 4.0f)
                curveTo(9.887f, 4.0f, 10.0f, 4.107f, 10.0f, 4.2523f)
                lineTo(10.0f, 4.7477f)
                curveTo(10.0f, 4.887f, 9.884f, 5.0f, 9.75f, 5.0f)
                lineTo(9.75f, 5.0f)
                curveTo(9.6119f, 5.0f, 9.5f, 5.116f, 9.5f, 5.25f)
                lineTo(9.5f, 5.25f)
                curveTo(9.5f, 5.3881f, 9.607f, 5.5f, 9.7523f, 5.5f)
                lineTo(10.2477f, 5.5f)
                curveTo(10.387f, 5.5f, 10.5f, 5.3823f, 10.5f, 5.2523f)
                lineTo(10.5f, 4.2477f)
                curveTo(10.5f, 4.1109f, 10.616f, 4.0f, 10.75f, 4.0f)
                lineTo(10.75f, 4.0f)
                curveTo(10.8881f, 4.0f, 11.0f, 4.107f, 11.0f, 4.2523f)
                lineTo(11.0f, 4.7477f)
                curveTo(11.0f, 4.887f, 11.116f, 5.0f, 11.25f, 5.0f)
                lineTo(11.25f, 5.0f)
                curveTo(11.3881f, 5.0f, 11.5f, 4.893f, 11.5f, 4.7477f)
                lineTo(11.5f, 4.2523f)
                curveTo(11.5f, 4.113f, 11.616f, 4.0f, 11.75f, 4.0f)
                lineTo(11.75f, 4.0f)
                curveTo(11.8881f, 4.0f, 12.0f, 4.107f, 12.0f, 4.2523f)
                lineTo(12.0f, 4.7477f)
                lineTo(12.0f, 4.7477f)
                close()
            }
        }
        .build()
        return _sa!!
    }

private var _sa: ImageVector? = null
