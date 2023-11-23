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

val FlagIcons.IM: ImageVector
    get() {
        if (_im != null) {
            return _im!!
        }
        _im = Builder(name = "Im", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE52D42), 1.0f to Color(0xFFCB1D31), start =
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
                    Offset(10.55645f,2.0889f), end = Offset(10.55645f,14.039f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.5f, 3.0f)
                lineTo(14.5f, 3.0f)
                lineTo(13.0f, 6.5f)
                lineTo(11.5f, 5.5f)
                curveTo(11.5f, 5.5f, 10.4111f, 2.9111f, 10.0f, 2.5f)
                curveTo(9.5889f, 2.0889f, 9.1722f, 2.4692f, 7.8705f, 2.8488f)
                curveTo(6.5688f, 3.2283f, 6.5183f, 3.6637f, 6.0092f, 3.6637f)
                curveTo(5.8031f, 3.6637f, 5.1477f, 2.9042f, 4.7822f, 2.6774f)
                curveTo(4.2445f, 2.3436f, 4.0507f, 2.5f, 4.1803f, 3.0f)
                curveTo(4.2363f, 3.2161f, 4.6633f, 3.4828f, 4.9338f, 3.8707f)
                curveTo(5.2892f, 4.3802f, 5.5f, 5.0f, 5.5f, 5.0f)
                curveTo(5.5f, 5.0f, 5.9875f, 4.5443f, 6.2499f, 4.4694f)
                curveTo(6.648f, 4.3556f, 7.0964f, 4.5508f, 7.6216f, 4.4694f)
                curveTo(8.2894f, 4.3658f, 9.0f, 4.0f, 9.0f, 4.0f)
                lineTo(9.1738f, 5.907f)
                curveTo(9.1738f, 5.907f, 6.7952f, 8.1174f, 7.0f, 9.0f)
                curveTo(7.2048f, 9.8826f, 9.4689f, 10.9664f, 10.0f, 11.7397f)
                curveTo(10.5311f, 12.5131f, 9.6843f, 12.8013f, 9.6843f, 13.1727f)
                curveTo(9.6843f, 13.5441f, 9.5961f, 14.039f, 10.0f, 13.8904f)
                curveTo(10.4039f, 13.7417f, 10.4528f, 13.0979f, 10.8234f, 12.5131f)
                curveTo(11.0783f, 12.1108f, 11.2835f, 11.8987f, 11.3187f, 11.7397f)
                curveTo(11.4052f, 11.3496f, 10.2911f, 10.3255f, 9.6843f, 9.5995f)
                curveTo(9.3953f, 9.2537f, 8.8127f, 8.7845f, 8.8127f, 8.7845f)
                lineTo(10.5311f, 7.5f)
                curveTo(10.5311f, 7.5f, 13.4972f, 8.7251f, 14.1663f, 8.3169f)
                curveTo(14.8353f, 7.9087f, 15.0f, 4.0f, 15.0f, 4.0f)
                lineTo(17.0622f, 3.5f)
                lineTo(16.5f, 3.0f)
                lineTo(16.5f, 3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF8DD4E), 1.0f to Color(0xFFF9DA38), start =
                    Offset(9.5f,2.5f), end = Offset(9.5f,11.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.5f, 11.5f)
                curveTo(11.2239f, 11.5f, 11.0f, 11.2761f, 11.0f, 11.0f)
                curveTo(11.0f, 10.7239f, 11.2239f, 10.5f, 11.5f, 10.5f)
                curveTo(11.7761f, 10.5f, 12.0f, 10.7239f, 12.0f, 11.0f)
                curveTo(12.0f, 11.2761f, 11.7761f, 11.5f, 11.5f, 11.5f)
                close()
                moveTo(13.5f, 3.5f)
                curveTo(13.2239f, 3.5f, 13.0f, 3.2761f, 13.0f, 3.0f)
                curveTo(13.0f, 2.7239f, 13.2239f, 2.5f, 13.5f, 2.5f)
                curveTo(13.7761f, 2.5f, 14.0f, 2.7239f, 14.0f, 3.0f)
                curveTo(14.0f, 3.2761f, 13.7761f, 3.5f, 13.5f, 3.5f)
                close()
                moveTo(13.5f, 7.5f)
                curveTo(13.2239f, 7.5f, 13.0f, 7.2761f, 13.0f, 7.0f)
                curveTo(13.0f, 6.7239f, 13.2239f, 6.5f, 13.5f, 6.5f)
                curveTo(13.7761f, 6.5f, 14.0f, 6.7239f, 14.0f, 7.0f)
                curveTo(14.0f, 7.2761f, 13.7761f, 7.5f, 13.5f, 7.5f)
                close()
                moveTo(7.5f, 9.5f)
                curveTo(7.2239f, 9.5f, 7.0f, 9.2761f, 7.0f, 9.0f)
                curveTo(7.0f, 8.7239f, 7.2239f, 8.5f, 7.5f, 8.5f)
                curveTo(7.7761f, 8.5f, 8.0f, 8.7239f, 8.0f, 9.0f)
                curveTo(8.0f, 9.2761f, 7.7761f, 9.5f, 7.5f, 9.5f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(9.2239f, 3.5f, 9.0f, 3.2761f, 9.0f, 3.0f)
                curveTo(9.0f, 2.7239f, 9.2239f, 2.5f, 9.5f, 2.5f)
                curveTo(9.7761f, 2.5f, 10.0f, 2.7239f, 10.0f, 3.0f)
                curveTo(10.0f, 3.2761f, 9.7761f, 3.5f, 9.5f, 3.5f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.2239f, 7.5f, 10.0f, 7.0523f, 10.0f, 6.5f)
                curveTo(10.0f, 5.9477f, 10.2239f, 5.5f, 10.5f, 5.5f)
                curveTo(10.7761f, 5.5f, 11.0f, 5.9477f, 11.0f, 6.5f)
                curveTo(11.0f, 7.0523f, 10.7761f, 7.5f, 10.5f, 7.5f)
                close()
                moveTo(5.5f, 5.5f)
                curveTo(5.2239f, 5.5f, 5.0f, 5.2761f, 5.0f, 5.0f)
                curveTo(5.0f, 4.7239f, 5.2239f, 4.5f, 5.5f, 4.5f)
                curveTo(5.7761f, 4.5f, 6.0f, 4.7239f, 6.0f, 5.0f)
                curveTo(6.0f, 5.2761f, 5.7761f, 5.5f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _im!!
    }

private var _im: ImageVector? = null
