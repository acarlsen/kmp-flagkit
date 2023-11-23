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

val FlagIcons.AO: ImageVector
    get() {
        if (_ao != null) {
            return _ao!!
        }
        _ao = Builder(name = "Ao", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF323E), 1.0f to Color(0xFFFD0D1B), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDD2137), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF8D84B), 1.0f to Color(0xFFF9D536), start =
                    Offset(10.70515f,4.2072f), end = Offset(10.70515f,10.3422f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.6306f, 8.8547f)
                lineTo(9.2226f, 7.916f)
                curveTo(8.9929f, 7.7628f, 8.9308f, 7.4524f, 9.084f, 7.2227f)
                curveTo(9.2372f, 6.9929f, 9.5476f, 6.9308f, 9.7774f, 7.084f)
                lineTo(11.313f, 8.1078f)
                curveTo(11.3807f, 7.9789f, 11.4352f, 7.8406f, 11.4744f, 7.6941f)
                curveTo(11.7603f, 6.6272f, 11.1272f, 5.5305f, 10.0602f, 5.2446f)
                curveTo(9.7935f, 5.1732f, 9.6352f, 4.899f, 9.7067f, 4.6323f)
                curveTo(9.7781f, 4.3655f, 10.0523f, 4.2072f, 10.319f, 4.2787f)
                curveTo(11.9194f, 4.7075f, 12.8692f, 6.3525f, 12.4404f, 7.9529f)
                curveTo(12.3721f, 8.2076f, 12.2731f, 8.4458f, 12.1483f, 8.6646f)
                lineTo(12.7774f, 9.084f)
                curveTo(13.0071f, 9.2372f, 13.0692f, 9.5476f, 12.916f, 9.7774f)
                curveTo(12.7628f, 10.0071f, 12.4524f, 10.0692f, 12.2226f, 9.916f)
                lineTo(11.5105f, 9.4413f)
                curveTo(10.7833f, 10.072f, 9.766f, 10.3422f, 8.7661f, 10.0743f)
                curveTo(8.4994f, 10.0028f, 8.3411f, 9.7286f, 8.4126f, 9.4619f)
                curveTo(8.4841f, 9.1951f, 8.7582f, 9.0369f, 9.025f, 9.1083f)
                curveTo(9.5943f, 9.2609f, 10.1721f, 9.1517f, 10.6306f, 8.8547f)
                close()
                moveTo(9.5f, 6.5f)
                curveTo(9.2239f, 6.5f, 9.0f, 6.2761f, 9.0f, 6.0f)
                curveTo(9.0f, 5.7239f, 9.2239f, 5.5f, 9.5f, 5.5f)
                curveTo(9.7761f, 5.5f, 10.0f, 5.7239f, 10.0f, 6.0f)
                curveTo(10.0f, 6.2761f, 9.7761f, 6.5f, 9.5f, 6.5f)
                close()
            }
        }
        .build()
        return _ao!!
    }

private var _ao: ImageVector? = null
