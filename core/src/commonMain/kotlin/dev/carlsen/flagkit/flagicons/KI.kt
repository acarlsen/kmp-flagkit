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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.KI: ImageVector
    get() {
        if (_ki != null) {
            return _ki!!
        }
        _ki = Builder(name = "Ki", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE62B3F), 1.0f to Color(0xFFCA1A2C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036), start =
                    Offset(10.5f,6.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 8.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036), start =
                    Offset(10.5f,3.1379f), end = Offset(10.5f,13.8621f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 12.0352f)
                lineTo(9.2761f, 13.8621f)
                lineTo(8.9661f, 11.6851f)
                lineTo(7.0708f, 12.8001f)
                lineTo(7.7361f, 10.7042f)
                lineTo(5.5447f, 10.8864f)
                lineTo(7.0534f, 9.2867f)
                lineTo(5.0f, 8.5f)
                lineTo(7.0534f, 7.7133f)
                lineTo(5.5447f, 6.1136f)
                lineTo(7.7361f, 6.2958f)
                lineTo(7.0708f, 4.1999f)
                lineTo(8.9661f, 5.3149f)
                lineTo(9.2761f, 3.1379f)
                lineTo(10.5f, 4.9648f)
                lineTo(11.7239f, 3.1379f)
                lineTo(12.0339f, 5.3149f)
                lineTo(13.9292f, 4.1999f)
                lineTo(13.2639f, 6.2958f)
                lineTo(15.4553f, 6.1136f)
                lineTo(13.9466f, 7.7133f)
                lineTo(16.0f, 8.5f)
                lineTo(13.9466f, 9.2867f)
                lineTo(15.4553f, 10.8864f)
                lineTo(13.2639f, 10.7042f)
                lineTo(13.9292f, 12.8001f)
                lineTo(12.0339f, 11.6851f)
                lineTo(11.7239f, 13.8621f)
                lineTo(10.5f, 12.0352f)
                close()
                moveTo(10.5f, 12.0f)
                curveTo(12.433f, 12.0f, 14.0f, 10.433f, 14.0f, 8.5f)
                curveTo(14.0f, 6.567f, 12.433f, 5.0f, 10.5f, 5.0f)
                curveTo(8.567f, 5.0f, 7.0f, 6.567f, 7.0f, 8.5f)
                curveTo(7.0f, 10.433f, 8.567f, 12.0f, 10.5f, 12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDA57), 1.0f to Color(0xFFFCD036), start =
                    Offset(11.0139f,1.0f), end = Offset(11.0139f,3.174f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.86f, 2.4026f)
                lineTo(8.8132f, 2.1688f)
                lineTo(9.795f, 2.0052f)
                curveTo(9.795f, 2.0052f, 8.4765f, 1.6936f, 8.0418f, 1.5377f)
                curveTo(7.4171f, 1.3136f, 7.5041f, 1.1403f, 7.5041f, 1.1403f)
                curveTo(7.5041f, 1.1403f, 9.289f, 1.4909f, 10.1691f, 1.4909f)
                curveTo(10.3565f, 1.4909f, 10.7301f, 1.9584f, 10.7301f, 1.9584f)
                curveTo(10.7301f, 1.9584f, 11.3788f, 1.303f, 11.6886f, 1.2805f)
                curveTo(13.0955f, 1.1784f, 14.6107f, 1.0f, 14.6107f, 1.0f)
                curveTo(14.6107f, 1.0f, 14.1718f, 1.2942f, 13.9094f, 1.374f)
                curveTo(13.1978f, 1.5903f, 11.6886f, 1.8883f, 11.6886f, 1.8883f)
                lineTo(11.4782f, 2.2156f)
                lineTo(12.9743f, 2.2156f)
                lineTo(12.3431f, 2.4026f)
                lineTo(12.6704f, 2.7065f)
                curveTo(12.6704f, 2.7065f, 12.3271f, 2.529f, 11.8756f, 2.613f)
                curveTo(11.5655f, 2.6707f, 11.2035f, 2.878f, 10.8704f, 2.9636f)
                curveTo(10.0522f, 3.174f, 9.5613f, 2.4026f, 9.5613f, 2.4026f)
                lineTo(8.86f, 2.4026f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0752A2), 1.0f to Color(0xFF034285), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.3218f, 12.9334f)
                lineTo(23.7962f, 13.0915f)
                lineTo(23.4799f, 14.0402f)
                lineTo(23.0056f, 13.8821f)
                curveTo(22.8977f, 13.8461f, 22.8977f, 13.8461f, 22.5368f, 13.7258f)
                lineTo(20.4743f, 13.0383f)
                curveTo(20.3203f, 12.987f, 20.0057f, 12.9875f, 19.8531f, 13.0383f)
                lineTo(17.7906f, 13.7258f)
                curveTo(17.4308f, 13.8457f, 16.8943f, 13.845f, 16.5368f, 13.7258f)
                lineTo(14.4743f, 13.0383f)
                curveTo(14.3203f, 12.987f, 14.0057f, 12.9875f, 13.8531f, 13.0383f)
                lineTo(11.7906f, 13.7258f)
                curveTo(11.4308f, 13.8457f, 10.8943f, 13.845f, 10.5368f, 13.7258f)
                lineTo(8.4743f, 13.0383f)
                curveTo(8.3203f, 12.987f, 8.0057f, 12.9875f, 7.8531f, 13.0383f)
                lineTo(5.7906f, 13.7258f)
                curveTo(5.4308f, 13.8457f, 4.8943f, 13.845f, 4.5368f, 13.7258f)
                lineTo(2.4743f, 13.0383f)
                curveTo(2.3203f, 12.987f, 2.0057f, 12.9875f, 1.8531f, 13.0383f)
                lineTo(-0.2094f, 13.7258f)
                lineTo(-0.6838f, 13.8839f)
                lineTo(-1.0f, 12.9353f)
                lineTo(-0.5257f, 12.7771f)
                lineTo(1.5368f, 12.0896f)
                curveTo(1.8943f, 11.9705f, 2.4308f, 11.9697f, 2.7906f, 12.0896f)
                lineTo(4.8531f, 12.7771f)
                curveTo(5.0057f, 12.828f, 5.3203f, 12.8285f, 5.4743f, 12.7771f)
                lineTo(7.5368f, 12.0896f)
                curveTo(7.8943f, 11.9705f, 8.4308f, 11.9697f, 8.7906f, 12.0896f)
                lineTo(10.8531f, 12.7771f)
                curveTo(11.0057f, 12.828f, 11.3203f, 12.8285f, 11.4743f, 12.7771f)
                lineTo(13.5368f, 12.0896f)
                curveTo(13.8943f, 11.9705f, 14.4308f, 11.9697f, 14.7906f, 12.0896f)
                lineTo(16.8531f, 12.7771f)
                curveTo(17.0057f, 12.828f, 17.3203f, 12.8285f, 17.4743f, 12.7771f)
                lineTo(19.5368f, 12.0896f)
                curveTo(19.8943f, 11.9705f, 20.4308f, 11.9697f, 20.7906f, 12.0896f)
                lineTo(22.8531f, 12.7771f)
                curveTo(23.2139f, 12.8974f, 23.2139f, 12.8974f, 23.3218f, 12.9334f)
                close()
                moveTo(23.3218f, 10.4334f)
                lineTo(23.7962f, 10.5915f)
                lineTo(23.4799f, 11.5402f)
                lineTo(23.0056f, 11.3821f)
                curveTo(22.8977f, 11.3461f, 22.8977f, 11.3461f, 22.5368f, 11.2258f)
                lineTo(20.4743f, 10.5383f)
                curveTo(20.3203f, 10.487f, 20.0057f, 10.4875f, 19.8531f, 10.5383f)
                lineTo(17.7906f, 11.2258f)
                curveTo(17.4308f, 11.3457f, 16.8943f, 11.345f, 16.5368f, 11.2258f)
                lineTo(14.4743f, 10.5383f)
                curveTo(14.3203f, 10.487f, 14.0057f, 10.4875f, 13.8531f, 10.5383f)
                lineTo(11.7906f, 11.2258f)
                curveTo(11.4308f, 11.3457f, 10.8943f, 11.345f, 10.5368f, 11.2258f)
                lineTo(8.4743f, 10.5383f)
                curveTo(8.3203f, 10.487f, 8.0057f, 10.4875f, 7.8531f, 10.5383f)
                lineTo(5.7906f, 11.2258f)
                curveTo(5.4308f, 11.3457f, 4.8943f, 11.345f, 4.5368f, 11.2258f)
                lineTo(2.4743f, 10.5383f)
                curveTo(2.3203f, 10.487f, 2.0057f, 10.4875f, 1.8531f, 10.5383f)
                lineTo(-0.2094f, 11.2258f)
                lineTo(-0.6838f, 11.3839f)
                lineTo(-1.0f, 10.4353f)
                lineTo(-0.5257f, 10.2771f)
                lineTo(1.5368f, 9.5896f)
                curveTo(1.8943f, 9.4705f, 2.4308f, 9.4697f, 2.7906f, 9.5896f)
                lineTo(4.8531f, 10.2771f)
                curveTo(5.0057f, 10.328f, 5.3203f, 10.3285f, 5.4743f, 10.2771f)
                lineTo(7.5368f, 9.5896f)
                curveTo(7.8943f, 9.4705f, 8.4308f, 9.4697f, 8.7906f, 9.5896f)
                lineTo(10.8531f, 10.2771f)
                curveTo(11.0057f, 10.328f, 11.3203f, 10.3285f, 11.4743f, 10.2771f)
                lineTo(13.5368f, 9.5896f)
                curveTo(13.8943f, 9.4705f, 14.4308f, 9.4697f, 14.7906f, 9.5896f)
                lineTo(16.8531f, 10.2771f)
                curveTo(17.0057f, 10.328f, 17.3203f, 10.3285f, 17.4743f, 10.2771f)
                lineTo(19.5368f, 9.5896f)
                curveTo(19.8943f, 9.4705f, 20.4308f, 9.4697f, 20.7906f, 9.5896f)
                lineTo(22.8531f, 10.2771f)
                curveTo(23.2139f, 10.3974f, 23.2139f, 10.3974f, 23.3218f, 10.4334f)
                close()
                moveTo(23.3218f, 7.9334f)
                lineTo(23.7962f, 8.0915f)
                lineTo(23.4799f, 9.0402f)
                lineTo(23.0056f, 8.8821f)
                curveTo(22.8977f, 8.8461f, 22.8977f, 8.8461f, 22.5368f, 8.7258f)
                lineTo(20.4743f, 8.0383f)
                curveTo(20.3203f, 7.987f, 20.0057f, 7.9875f, 19.8531f, 8.0383f)
                lineTo(17.7906f, 8.7258f)
                curveTo(17.4308f, 8.8457f, 16.8943f, 8.845f, 16.5368f, 8.7258f)
                lineTo(14.4743f, 8.0383f)
                curveTo(14.3203f, 7.987f, 14.0057f, 7.9875f, 13.8531f, 8.0383f)
                lineTo(11.7906f, 8.7258f)
                curveTo(11.4308f, 8.8457f, 10.8943f, 8.845f, 10.5368f, 8.7258f)
                lineTo(8.4743f, 8.0383f)
                curveTo(8.3203f, 7.987f, 8.0057f, 7.9875f, 7.8531f, 8.0383f)
                lineTo(5.7906f, 8.7258f)
                curveTo(5.4308f, 8.8457f, 4.8943f, 8.845f, 4.5368f, 8.7258f)
                lineTo(2.4743f, 8.0383f)
                curveTo(2.3203f, 7.987f, 2.0057f, 7.9875f, 1.8531f, 8.0383f)
                lineTo(-0.2094f, 8.7258f)
                lineTo(-0.6838f, 8.8839f)
                lineTo(-1.0f, 7.9353f)
                lineTo(-0.5257f, 7.7771f)
                lineTo(1.5368f, 7.0896f)
                curveTo(1.8943f, 6.9705f, 2.4308f, 6.9697f, 2.7906f, 7.0896f)
                lineTo(4.8531f, 7.7771f)
                curveTo(5.0057f, 7.828f, 5.3203f, 7.8285f, 5.4743f, 7.7771f)
                lineTo(7.5368f, 7.0896f)
                curveTo(7.8943f, 6.9705f, 8.4308f, 6.9697f, 8.7906f, 7.0896f)
                lineTo(10.8531f, 7.7771f)
                curveTo(11.0057f, 7.828f, 11.3203f, 7.8285f, 11.4743f, 7.7771f)
                lineTo(13.5368f, 7.0896f)
                curveTo(13.8943f, 6.9705f, 14.4308f, 6.9697f, 14.7906f, 7.0896f)
                lineTo(16.8531f, 7.7771f)
                curveTo(17.0057f, 7.828f, 17.3203f, 7.8285f, 17.4743f, 7.7771f)
                lineTo(19.5368f, 7.0896f)
                curveTo(19.8943f, 6.9705f, 20.4308f, 6.9697f, 20.7906f, 7.0896f)
                lineTo(22.8531f, 7.7771f)
                lineTo(23.3218f, 7.9334f)
                close()
            }
        }
        .build()
        return _ki!!
    }

private var _ki: ImageVector? = null
