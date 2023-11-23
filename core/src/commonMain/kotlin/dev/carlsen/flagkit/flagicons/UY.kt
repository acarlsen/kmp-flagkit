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

val FlagIcons.UY: ImageVector
    get() {
        if (_uy != null) {
            return _uy!!
        }
        _uy = Builder(name = "Uy", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0E4DC5), 1.0f to Color(0xFF073DA6), start =
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
                    Offset(10.5f,0.0f), end = Offset(10.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 2.0f)
                lineTo(10.0f, 2.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(10.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                lineTo(21.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(0.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(0.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(10.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFED443), 1.0f to Color(0xFFFCD036), start =
                    Offset(5.0f,2.1379f), end = Offset(5.0f,7.9875f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 6.991f)
                lineTo(4.3324f, 7.9875f)
                lineTo(4.1633f, 6.8f)
                lineTo(3.1295f, 7.4082f)
                lineTo(3.4924f, 6.265f)
                lineTo(2.2971f, 6.3643f)
                lineTo(3.1201f, 5.4918f)
                lineTo(2.0f, 5.0627f)
                lineTo(3.1201f, 4.6336f)
                lineTo(2.2971f, 3.761f)
                lineTo(3.4924f, 3.8604f)
                lineTo(3.1295f, 2.7172f)
                lineTo(4.1633f, 3.3253f)
                lineTo(4.3324f, 2.1379f)
                lineTo(5.0f, 3.1344f)
                lineTo(5.6676f, 2.1379f)
                lineTo(5.8367f, 3.3253f)
                lineTo(6.8705f, 2.7172f)
                lineTo(6.5076f, 3.8604f)
                lineTo(7.7029f, 3.761f)
                lineTo(6.88f, 4.6336f)
                lineTo(8.0f, 5.0627f)
                lineTo(6.88f, 5.4918f)
                lineTo(7.7029f, 6.3643f)
                lineTo(6.5076f, 6.265f)
                lineTo(6.8705f, 7.4082f)
                lineTo(5.8367f, 6.8f)
                lineTo(5.6676f, 7.9875f)
                lineTo(5.0f, 6.991f)
                close()
                moveTo(5.0f, 6.9718f)
                curveTo(6.0544f, 6.9718f, 6.9091f, 6.117f, 6.9091f, 5.0627f)
                curveTo(6.9091f, 4.0083f, 6.0544f, 3.1536f, 5.0f, 3.1536f)
                curveTo(3.9456f, 3.1536f, 3.0909f, 4.0083f, 3.0909f, 5.0627f)
                curveTo(3.0909f, 6.117f, 3.9456f, 6.9718f, 5.0f, 6.9718f)
                close()
                moveTo(5.0f, 6.5f)
                curveTo(4.1716f, 6.5f, 3.5f, 5.8284f, 3.5f, 5.0f)
                curveTo(3.5f, 4.1716f, 4.1716f, 3.5f, 5.0f, 3.5f)
                curveTo(5.8284f, 3.5f, 6.5f, 4.1716f, 6.5f, 5.0f)
                curveTo(6.5f, 5.8284f, 5.8284f, 6.5f, 5.0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC6A326)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.125f, 5.0f)
                curveTo(4.125f, 4.931f, 4.181f, 4.875f, 4.25f, 4.875f)
                curveTo(4.319f, 4.875f, 4.375f, 4.931f, 4.375f, 5.0f)
                curveTo(4.375f, 5.1062f, 4.4014f, 5.2083f, 4.4512f, 5.2993f)
                curveTo(4.5601f, 5.4985f, 4.7689f, 5.625f, 5.0f, 5.625f)
                curveTo(5.2431f, 5.625f, 5.4609f, 5.485f, 5.5641f, 5.2696f)
                curveTo(5.5833f, 5.2318f, 5.5833f, 5.2318f, 5.6024f, 5.1992f)
                curveTo(5.6092f, 5.1876f, 5.6092f, 5.1876f, 5.6158f, 5.1766f)
                curveTo(5.6635f, 5.0964f, 5.6783f, 5.0582f, 5.6783f, 5.0f)
                curveTo(5.6783f, 4.931f, 5.7342f, 4.875f, 5.8033f, 4.875f)
                curveTo(5.8723f, 4.875f, 5.9283f, 4.931f, 5.9283f, 5.0f)
                curveTo(5.9283f, 5.1142f, 5.8995f, 5.1888f, 5.8307f, 5.3044f)
                curveTo(5.8239f, 5.3157f, 5.8239f, 5.3157f, 5.8176f, 5.3264f)
                curveTo(5.8016f, 5.3538f, 5.8016f, 5.3538f, 5.7895f, 5.3776f)
                curveTo(5.6452f, 5.679f, 5.3402f, 5.875f, 5.0f, 5.875f)
                curveTo(4.6765f, 5.875f, 4.3841f, 5.6979f, 4.2318f, 5.4192f)
                curveTo(4.1621f, 5.2917f, 4.125f, 5.1484f, 4.125f, 5.0f)
                close()
                moveTo(5.5f, 4.75f)
                curveTo(5.3619f, 4.75f, 5.25f, 4.6381f, 5.25f, 4.5f)
                curveTo(5.25f, 4.3619f, 5.3619f, 4.25f, 5.5f, 4.25f)
                curveTo(5.6381f, 4.25f, 5.75f, 4.3619f, 5.75f, 4.5f)
                curveTo(5.75f, 4.6381f, 5.6381f, 4.75f, 5.5f, 4.75f)
                close()
                moveTo(4.5f, 4.75f)
                curveTo(4.3619f, 4.75f, 4.25f, 4.6381f, 4.25f, 4.5f)
                curveTo(4.25f, 4.3619f, 4.3619f, 4.25f, 4.5f, 4.25f)
                curveTo(4.6381f, 4.25f, 4.75f, 4.3619f, 4.75f, 4.5f)
                curveTo(4.75f, 4.6381f, 4.6381f, 4.75f, 4.5f, 4.75f)
                close()
            }
        }
        .build()
        return _uy!!
    }

private var _uy: ImageVector? = null
