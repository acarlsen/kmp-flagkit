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

val FlagIcons.SK: ImageVector
    get() {
        if (_sk != null) {
            return _sk!!
        }
        _sk = Builder(name = "Sk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0C47B7), 1.0f to Color(0xFF073DA4), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE53B35), 1.0f to Color(0xFFD32E28), start =
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
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(7.5f,2.0f), end = Offset(7.5f,13.1397f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2514f, 2.0f)
                lineTo(9.7486f, 2.0f)
                curveTo(10.8395f, 2.0f, 11.7458f, 2.8719f, 11.7878f, 3.9629f)
                lineTo(11.9607f, 8.4602f)
                curveTo(11.9938f, 9.3199f, 11.5459f, 10.3491f, 10.8913f, 10.9102f)
                lineTo(9.2968f, 12.2769f)
                curveTo(8.2903f, 13.1397f, 6.7081f, 13.1383f, 5.7032f, 12.2769f)
                lineTo(4.1087f, 10.9102f)
                curveTo(3.4569f, 10.3516f, 3.0062f, 9.3193f, 3.0393f, 8.4602f)
                lineTo(3.2122f, 3.9629f)
                curveTo(3.2542f, 2.8728f, 4.1596f, 2.0f, 5.2514f, 2.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF73744), 1.0f to Color(0xFFEC212F), start =
                    Offset(7.5f,3.0f), end = Offset(7.5f,12.0602f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(4.2115f, 4.0014f)
                curveTo(4.2328f, 3.4483f, 4.6968f, 3.0f, 5.2514f, 3.0f)
                lineTo(9.7486f, 3.0f)
                curveTo(10.3017f, 3.0f, 10.7672f, 3.4468f, 10.7885f, 4.0014f)
                lineTo(10.9615f, 8.4986f)
                curveTo(10.9828f, 9.0517f, 10.6644f, 9.7877f, 10.2406f, 10.151f)
                lineTo(8.646f, 11.5177f)
                curveTo(8.0131f, 12.0602f, 6.9836f, 12.0573f, 6.354f, 11.5177f)
                lineTo(4.7594f, 10.151f)
                curveTo(4.34f, 9.7914f, 4.0172f, 9.0532f, 4.0385f, 8.4986f)
                lineTo(4.2115f, 4.0014f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(7.5f,4.0f), end = Offset(7.5f,10.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(7.0f, 8.2452f)
                    curveTo(7.0f, 8.1098f, 6.8823f, 8.0f, 6.7523f, 8.0f)
                    lineTo(5.7477f, 8.0f)
                    curveTo(5.6109f, 8.0f, 5.5f, 7.893f, 5.5f, 7.7477f)
                    lineTo(5.5f, 7.2523f)
                    curveTo(5.5f, 7.113f, 5.6177f, 7.0f, 5.7477f, 7.0f)
                    lineTo(6.7523f, 7.0f)
                    curveTo(6.8891f, 7.0f, 7.0f, 6.893f, 7.0f, 6.7477f)
                    lineTo(7.0f, 6.2523f)
                    curveTo(7.0f, 6.113f, 6.893f, 6.0f, 6.7477f, 6.0f)
                    lineTo(6.2523f, 6.0f)
                    curveTo(6.113f, 6.0f, 6.0f, 5.893f, 6.0f, 5.7477f)
                    lineTo(6.0f, 5.2523f)
                    curveTo(6.0f, 5.113f, 6.107f, 5.0f, 6.2523f, 5.0f)
                    lineTo(6.7477f, 5.0f)
                    curveTo(6.887f, 5.0f, 7.0f, 4.893f, 7.0f, 4.7477f)
                    lineTo(7.0f, 4.2523f)
                    curveTo(7.0f, 4.113f, 7.107f, 4.0f, 7.2523f, 4.0f)
                    lineTo(7.7477f, 4.0f)
                    curveTo(7.887f, 4.0f, 8.0f, 4.107f, 8.0f, 4.2523f)
                    lineTo(8.0f, 4.7477f)
                    curveTo(8.0f, 4.887f, 8.107f, 5.0f, 8.2523f, 5.0f)
                    lineTo(8.7477f, 5.0f)
                    curveTo(8.887f, 5.0f, 9.0f, 5.107f, 9.0f, 5.2523f)
                    lineTo(9.0f, 5.7477f)
                    curveTo(9.0f, 5.887f, 8.893f, 6.0f, 8.7477f, 6.0f)
                    lineTo(8.2523f, 6.0f)
                    curveTo(8.113f, 6.0f, 8.0f, 6.107f, 8.0f, 6.2523f)
                    lineTo(8.0f, 6.7477f)
                    curveTo(8.0f, 6.887f, 8.1177f, 7.0f, 8.2477f, 7.0f)
                    lineTo(9.2523f, 7.0f)
                    curveTo(9.3891f, 7.0f, 9.5f, 7.107f, 9.5f, 7.2523f)
                    lineTo(9.5f, 7.7477f)
                    curveTo(9.5f, 7.887f, 9.3823f, 8.0f, 9.2523f, 8.0f)
                    lineTo(8.2477f, 8.0f)
                    curveTo(8.1109f, 8.0f, 8.0f, 8.1075f, 8.0f, 8.2452f)
                    lineTo(8.0f, 9.7548f)
                    curveTo(8.0f, 9.8902f, 7.893f, 10.0f, 7.7477f, 10.0f)
                    lineTo(7.2523f, 10.0f)
                    curveTo(7.113f, 10.0f, 7.0f, 9.8925f, 7.0f, 9.7548f)
                    lineTo(7.0f, 8.2452f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFF1251A1)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(6.5973f, 10.0691f)
                    curveTo(5.3816f, 10.2606f, 4.5f, 10.8288f, 4.5f, 11.5f)
                    curveTo(4.5f, 12.3284f, 5.8431f, 13.0f, 7.5f, 13.0f)
                    curveTo(9.1569f, 13.0f, 10.5f, 12.3284f, 10.5f, 11.5f)
                    curveTo(10.5f, 10.8288f, 9.6184f, 10.2606f, 8.4027f, 10.0691f)
                    curveTo(8.2417f, 9.7325f, 7.898f, 9.5f, 7.5f, 9.5f)
                    curveTo(7.102f, 9.5f, 6.7583f, 9.7325f, 6.5973f, 10.0691f)
                    close()
                }
            }
        }
        .build()
        return _sk!!
    }

private var _sk: ImageVector? = null
