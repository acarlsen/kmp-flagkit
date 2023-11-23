package dev.carlsen.flagkit.flagicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.PM: ImageVector
    get() {
        if (_pm != null) {
            return _pm!!
        }
        _pm = Builder(name = "Pm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF138E16), 1.0f to Color(0xFF0F7F12), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF26A7DC), 1.0f to Color(0xFF1B94C6), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 15.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(14.0f, 0.0f)
                lineToRelative(0.0f, -15.0f)
                lineToRelative(-14.0f, 0.0f)
                lineToRelative(-7.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFBCD3F), 1.0f to Color(0xFFFFCE2F), start =
                    Offset(14.0f,2.937f), end = Offset(14.0f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.3255f, 6.4287f)
                curveTo(18.353f, 6.1763f, 19.0f, 6.1092f, 19.0f, 7.0f)
                curveTo(19.0f, 8.6569f, 16.7614f, 10.0f, 14.0f, 10.0f)
                curveTo(11.2386f, 10.0f, 9.0f, 8.6569f, 9.0f, 7.0f)
                curveTo(9.0f, 6.1092f, 9.647f, 6.1763f, 10.6745f, 6.4287f)
                curveTo(10.6093f, 6.2512f, 10.5548f, 6.063f, 10.513f, 5.8665f)
                curveTo(10.2259f, 4.516f, 10.6501f, 3.2815f, 11.4604f, 3.1093f)
                curveTo(12.2708f, 2.937f, 13.1604f, 3.8922f, 13.4474f, 5.2428f)
                curveTo(13.5828f, 5.8794f, 13.56f, 6.4902f, 13.4133f, 6.9762f)
                curveTo(13.6058f, 6.9914f, 13.8015f, 7.0f, 14.0f, 7.0f)
                curveTo(14.1985f, 7.0f, 14.3942f, 6.9914f, 14.5867f, 6.9762f)
                curveTo(14.44f, 6.4902f, 14.4172f, 5.8794f, 14.5526f, 5.2428f)
                curveTo(14.8396f, 3.8922f, 15.7292f, 2.937f, 16.5396f, 3.1093f)
                curveTo(17.3499f, 3.2815f, 17.7741f, 4.516f, 17.487f, 5.8665f)
                curveTo(17.4452f, 6.063f, 17.3907f, 6.2512f, 17.3255f, 6.4287f)
                lineTo(17.3255f, 6.4287f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(14.0f,10.9293f), end = Offset(14.0f,13.0176f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.7764f, 12.9472f)
                curveTo(15.9172f, 13.0176f, 16.0828f, 13.0176f, 16.2236f, 12.9472f)
                lineTo(18.2236f, 11.9472f)
                curveTo(18.4706f, 11.8237f, 18.5707f, 11.5234f, 18.4472f, 11.2764f)
                curveTo(18.3237f, 11.0294f, 18.0234f, 10.9293f, 17.7764f, 11.0528f)
                lineTo(16.0f, 11.941f)
                lineTo(14.2236f, 11.0528f)
                curveTo(14.0828f, 10.9824f, 13.9172f, 10.9824f, 13.7764f, 11.0528f)
                lineTo(12.0f, 11.941f)
                lineTo(10.2236f, 11.0528f)
                curveTo(9.9766f, 10.9293f, 9.6763f, 11.0294f, 9.5528f, 11.2764f)
                curveTo(9.4293f, 11.5234f, 9.5294f, 11.8237f, 9.7764f, 11.9472f)
                lineTo(11.7764f, 12.9472f)
                curveTo(11.9172f, 13.0176f, 12.0828f, 13.0176f, 12.2236f, 12.9472f)
                lineTo(14.0f, 12.059f)
                lineTo(15.7764f, 12.9472f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF03633), 1.0f to Color(0xFFD82A28), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF2AA854), 1.0f to Color(0xFF219447),
                        start = Offset(5.82223f,0.24694273f), end = Offset(1.40882f,4.513734f)),
                        stroke = SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.5f, 1.7929f)
                    lineTo(0.6716f, -1.0355f)
                    lineTo(-0.0355f, -0.3284f)
                    lineTo(2.7929f, 2.5f)
                    lineTo(-0.0355f, 5.3284f)
                    lineTo(0.6716f, 6.0355f)
                    lineTo(3.5f, 3.2071f)
                    lineTo(6.3284f, 6.0355f)
                    lineTo(7.0355f, 5.3284f)
                    lineTo(4.2071f, 2.5f)
                    lineTo(7.0355f, -0.3284f)
                    lineTo(6.3284f, -1.0355f)
                    lineTo(3.5f, 1.7929f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(3.5f,-1.0f), end = Offset(3.5f,6.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(4.0f, 2.0f)
                    lineTo(4.0f, -1.0f)
                    lineTo(3.0f, -1.0f)
                    lineTo(3.0f, 2.0f)
                    lineTo(0.0f, 2.0f)
                    lineTo(0.0f, 3.0f)
                    lineTo(3.0f, 3.0f)
                    lineTo(3.0f, 6.0f)
                    lineTo(4.0f, 6.0f)
                    lineTo(4.0f, 3.0f)
                    lineTo(7.0f, 3.0f)
                    lineTo(7.0f, 2.0f)
                    lineTo(4.0f, 2.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(3.5f,5.0f), end = Offset(3.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 5.0f)
                    horizontalLineToRelative(7.0f)
                    verticalLineToRelative(5.0f)
                    horizontalLineToRelative(-7.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D),
                        start = Offset(3.5f,6.0f), end = Offset(3.5f,9.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(1.5f, 7.0f)
                    curveTo(1.2239f, 7.0f, 1.0f, 6.7761f, 1.0f, 6.5f)
                    curveTo(1.0f, 6.2239f, 1.2239f, 6.0f, 1.5f, 6.0f)
                    curveTo(1.7761f, 6.0f, 2.0f, 6.2239f, 2.0f, 6.5f)
                    curveTo(2.0f, 6.7761f, 1.7761f, 7.0f, 1.5f, 7.0f)
                    close()
                    moveTo(3.5f, 7.0f)
                    curveTo(3.2239f, 7.0f, 3.0f, 6.7761f, 3.0f, 6.5f)
                    curveTo(3.0f, 6.2239f, 3.2239f, 6.0f, 3.5f, 6.0f)
                    curveTo(3.7761f, 6.0f, 4.0f, 6.2239f, 4.0f, 6.5f)
                    curveTo(4.0f, 6.7761f, 3.7761f, 7.0f, 3.5f, 7.0f)
                    close()
                    moveTo(5.5f, 7.0f)
                    curveTo(5.2239f, 7.0f, 5.0f, 6.7761f, 5.0f, 6.5f)
                    curveTo(5.0f, 6.2239f, 5.2239f, 6.0f, 5.5f, 6.0f)
                    curveTo(5.7761f, 6.0f, 6.0f, 6.2239f, 6.0f, 6.5f)
                    curveTo(6.0f, 6.7761f, 5.7761f, 7.0f, 5.5f, 7.0f)
                    close()
                    moveTo(4.5f, 9.0f)
                    curveTo(4.2239f, 9.0f, 4.0f, 8.7761f, 4.0f, 8.5f)
                    curveTo(4.0f, 8.2239f, 4.2239f, 8.0f, 4.5f, 8.0f)
                    curveTo(4.7761f, 8.0f, 5.0f, 8.2239f, 5.0f, 8.5f)
                    curveTo(5.0f, 8.7761f, 4.7761f, 9.0f, 4.5f, 9.0f)
                    close()
                    moveTo(2.5f, 9.0f)
                    curveTo(2.2239f, 9.0f, 2.0f, 8.7761f, 2.0f, 8.5f)
                    curveTo(2.0f, 8.2239f, 2.2239f, 8.0f, 2.5f, 8.0f)
                    curveTo(2.7761f, 8.0f, 3.0f, 8.2239f, 3.0f, 8.5f)
                    curveTo(3.0f, 8.7761f, 2.7761f, 9.0f, 2.5f, 9.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFD7181D), 1.0f to Color(0xFFC60E13),
                        start = Offset(3.5f,10.0f), end = Offset(3.5f,15.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.0f)
                    horizontalLineToRelative(7.0f)
                    verticalLineToRelative(5.0f)
                    horizontalLineToRelative(-7.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFBCD3F), 1.0f to Color(0xFFFECB2F),
                        start = Offset(3.5f,11.0f), end = Offset(3.5f,14.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(3.5f, 12.0f)
                    curveTo(2.1193f, 12.0f, 1.0f, 11.7761f, 1.0f, 11.5f)
                    curveTo(1.0f, 11.2239f, 2.1193f, 11.0f, 3.5f, 11.0f)
                    curveTo(4.8807f, 11.0f, 6.0f, 11.2239f, 6.0f, 11.5f)
                    curveTo(6.0f, 11.7761f, 4.8807f, 12.0f, 3.5f, 12.0f)
                    close()
                    moveTo(3.5f, 14.0f)
                    curveTo(2.1193f, 14.0f, 1.0f, 13.7761f, 1.0f, 13.5f)
                    curveTo(1.0f, 13.2239f, 2.1193f, 13.0f, 3.5f, 13.0f)
                    curveTo(4.8807f, 13.0f, 6.0f, 13.2239f, 6.0f, 13.5f)
                    curveTo(6.0f, 13.7761f, 4.8807f, 14.0f, 3.5f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _pm!!
    }

private var _pm: ImageVector? = null
