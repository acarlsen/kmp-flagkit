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

val FlagIcons.AL: ImageVector
    get() {
        if (_al != null) {
            return _al!!
        }
        _al = Builder(name = "Al", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFEE343C), 1.0f to Color(0xFFE2222A), start =
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
                    Offset(10.5002f,3.1223f), end = Offset(10.5002f,12.2914f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.3479f, 3.3479f)
                lineTo(10.1521f, 4.1521f)
                curveTo(10.3395f, 4.3395f, 10.6558f, 4.3442f, 10.8479f, 4.1521f)
                lineTo(11.6521f, 3.3479f)
                curveTo(11.8395f, 3.1605f, 12.1835f, 3.1223f, 12.4099f, 3.2733f)
                lineTo(13.5f, 4.0f)
                lineTo(11.952f, 4.774f)
                curveTo(11.7034f, 4.8983f, 11.5f, 5.2239f, 11.5f, 5.5f)
                curveTo(11.5f, 5.7681f, 11.7239f, 6.0f, 12.0f, 6.0f)
                curveTo(12.2681f, 6.0f, 12.6987f, 5.9006f, 12.9439f, 5.7781f)
                lineTo(14.0561f, 5.2219f)
                curveTo(14.3009f, 5.0995f, 14.6566f, 5.1566f, 14.8498f, 5.3498f)
                lineTo(15.1502f, 5.6502f)
                curveTo(15.3438f, 5.8438f, 15.3013f, 6.0994f, 15.0561f, 6.2219f)
                lineTo(13.9439f, 6.7781f)
                curveTo(13.6991f, 6.9005f, 13.6835f, 7.1223f, 13.9099f, 7.2733f)
                lineTo(14.5901f, 7.7267f)
                curveTo(14.8161f, 7.8774f, 14.7842f, 8.0432f, 14.518f, 8.0964f)
                lineTo(12.982f, 8.4036f)
                curveTo(12.7131f, 8.4574f, 12.6812f, 8.6359f, 12.9047f, 8.8035f)
                lineTo(14.0953f, 9.6965f)
                curveTo(14.3154f, 9.8616f, 14.2761f, 10.0f, 14.0f, 10.0f)
                curveTo(13.7319f, 10.0f, 13.2832f, 9.9458f, 13.0159f, 9.879f)
                lineTo(11.9841f, 9.621f)
                curveTo(11.714f, 9.5535f, 11.6223f, 9.6835f, 11.7733f, 9.9099f)
                lineTo(12.2267f, 10.5901f)
                curveTo(12.3774f, 10.8161f, 12.2726f, 11.0f, 11.9922f, 11.0f)
                lineTo(11.5078f, 11.0f)
                curveTo(11.2213f, 11.0f, 10.9292f, 11.2125f, 10.8418f, 11.4746f)
                lineTo(10.6582f, 12.0254f)
                curveTo(10.5695f, 12.2914f, 10.4292f, 12.2875f, 10.3418f, 12.0254f)
                lineTo(10.1582f, 11.4746f)
                curveTo(10.0695f, 11.2086f, 9.7726f, 11.0f, 9.4922f, 11.0f)
                lineTo(9.0078f, 11.0f)
                curveTo(8.7213f, 11.0f, 8.6223f, 10.8165f, 8.7733f, 10.5901f)
                lineTo(9.2267f, 9.9099f)
                curveTo(9.3774f, 9.6839f, 9.2832f, 9.5542f, 9.0159f, 9.621f)
                lineTo(7.9841f, 9.879f)
                curveTo(7.714f, 9.9465f, 7.2761f, 10.0f, 7.0f, 10.0f)
                curveTo(6.7319f, 10.0f, 6.6812f, 9.8641f, 6.9047f, 9.6965f)
                lineTo(8.0953f, 8.8035f)
                curveTo(8.3154f, 8.6384f, 8.2842f, 8.4568f, 8.018f, 8.4036f)
                lineTo(6.482f, 8.0964f)
                curveTo(6.2131f, 8.0426f, 6.1835f, 7.8777f, 6.4099f, 7.7267f)
                lineTo(7.0901f, 7.2733f)
                curveTo(7.3161f, 7.1226f, 7.3013f, 6.9006f, 7.0561f, 6.7781f)
                lineTo(5.9439f, 6.2219f)
                curveTo(5.6991f, 6.0995f, 5.6566f, 5.8434f, 5.8498f, 5.6502f)
                lineTo(6.1502f, 5.3498f)
                curveTo(6.3438f, 5.1563f, 6.6987f, 5.0994f, 6.9439f, 5.2219f)
                lineTo(8.0561f, 5.7781f)
                curveTo(8.3009f, 5.9005f, 8.7239f, 6.0f, 9.0f, 6.0f)
                curveTo(9.2681f, 6.0f, 9.5f, 5.7761f, 9.5f, 5.5f)
                curveTo(9.5f, 5.2319f, 9.3013f, 4.9006f, 9.0561f, 4.7781f)
                lineTo(7.9439f, 4.2219f)
                curveTo(7.6991f, 4.0995f, 7.6835f, 3.8777f, 7.9099f, 3.7267f)
                lineTo(8.5901f, 3.2733f)
                curveTo(8.8161f, 3.1226f, 9.1558f, 3.1558f, 9.3479f, 3.3479f)
                close()
            }
        }
        .build()
        return _al!!
    }

private var _al: ImageVector? = null
