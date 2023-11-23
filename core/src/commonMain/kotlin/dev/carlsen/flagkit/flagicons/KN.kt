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

val FlagIcons.KN: ImageVector
    get() {
        if (_kn != null) {
            return _kn!!
        }
        _kn = Builder(name = "Kn", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1EC160), 1.0f to Color(0xFF169E4D), start =
                    Offset(10.501301f,0.0f), end = Offset(10.501301f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0013f, 10.0f)
                lineToRelative(21.0f, -10.0f)
                lineToRelative(-21.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDF2A40), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.501301f,5.0f), end = Offset(10.501301f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0013f, 15.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD956), 1.0f to Color(0xFFFCD036), start =
                    Offset(10.501349f,-0.14936742f), end = Offset(10.501349f,14.957084f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.5893f, 19.0001f)
                lineToRelative(24.5934f, -15.3677f)
                lineToRelative(-4.7693f, -7.6324f)
                lineToRelative(-24.5934f, 15.3677f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.501299f,-2.3038988f), end = Offset(10.501299f,17.304f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.4706f, 17.304f)
                lineToRelative(24.5934f, -15.3677f)
                lineToRelative(-2.6496f, -4.2402f)
                lineToRelative(-24.5934f, 15.3677f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(14.6686f,3.2500002f), end = Offset(14.6686f,6.9711003f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.2334f, 5.8481f)
                lineToRelative(-0.7091f, 1.123f)
                lineToRelative(-0.4601f, -1.2459f)
                lineToRelative(-1.2872f, -0.3273f)
                lineToRelative(1.0427f, -0.8226f)
                lineToRelative(-0.0865f, -1.3253f)
                lineToRelative(1.1045f, 0.7375f)
                lineToRelative(1.2337f, -0.4918f)
                lineToRelative(-0.3601f, 1.2784f)
                lineToRelative(0.8489f, 1.0214f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.668599f,8.099999f), end = Offset(6.668599f,11.8211f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.2334f, 10.6981f)
                lineToRelative(-0.7091f, 1.123f)
                lineToRelative(-0.4601f, -1.2459f)
                lineToRelative(-1.2872f, -0.3273f)
                lineToRelative(1.0427f, -0.8226f)
                lineToRelative(-0.0865f, -1.3253f)
                lineToRelative(1.1045f, 0.7375f)
                lineToRelative(1.2337f, -0.4918f)
                lineToRelative(-0.3601f, 1.2784f)
                lineToRelative(0.8489f, 1.0214f)
                close()
            }
        }
        .build()
        return _kn!!
    }

private var _kn: ImageVector? = null
