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

val FlagIcons.ME: ImageVector
    get() {
        if (_me != null) {
            return _me!!
        }
        _me = Builder(name = "Me", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE6BE53), 1.0f to Color(0xFFD3AD46), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE01826), 1.0f to Color(0xFFC30A17), start =
                    Offset(10.5f,1.0f), end = Offset(10.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.75f, 1.0f)
                lineTo(19.25f, 1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 20.0f, 1.75f)
                lineTo(20.0f, 13.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 19.25f, 14.0f)
                lineTo(1.75f, 14.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 13.25f)
                lineTo(1.0f, 1.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 1.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE6BE53), 1.0f to Color(0xFFD3AD46), start =
                    Offset(10.5f,2.5695f), end = Offset(10.5f,12.8777f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.1473f, 5.1473f)
                curveTo(10.3421f, 5.3421f, 10.6582f, 5.3418f, 10.8527f, 5.1473f)
                lineTo(10.6473f, 5.3527f)
                lineTo(11.6502f, 4.3498f)
                curveTo(11.8434f, 4.1566f, 12.1928f, 4.0964f, 12.4532f, 4.2266f)
                lineTo(12.5468f, 4.2734f)
                curveTo(12.7971f, 4.3986f, 12.8418f, 4.6582f, 12.6473f, 4.8527f)
                lineTo(12.8527f, 4.6473f)
                lineTo(11.8498f, 5.6502f)
                curveTo(11.6566f, 5.8434f, 11.5964f, 6.1928f, 11.7266f, 6.4532f)
                lineTo(11.7734f, 6.5468f)
                curveTo(11.8986f, 6.7971f, 12.0f, 7.2266f, 12.0f, 7.5f)
                lineTo(12.0f, 7.0f)
                curveTo(12.0f, 7.2761f, 12.1928f, 7.4036f, 12.4532f, 7.2734f)
                lineTo(12.5468f, 7.2266f)
                curveTo(12.7971f, 7.1014f, 12.8418f, 6.8418f, 12.6473f, 6.6473f)
                lineTo(12.8527f, 6.8527f)
                curveTo(12.6579f, 6.6579f, 12.6582f, 6.3418f, 12.8527f, 6.1473f)
                lineTo(12.6473f, 6.3527f)
                curveTo(12.8421f, 6.1579f, 13.0964f, 5.8072f, 13.2266f, 5.5468f)
                lineTo(13.2734f, 5.4532f)
                curveTo(13.3986f, 5.2029f, 13.5535f, 4.786f, 13.621f, 4.5159f)
                lineTo(13.879f, 3.4841f)
                curveTo(13.9458f, 3.2168f, 14.1384f, 3.1846f, 14.3035f, 3.4047f)
                lineTo(15.1965f, 4.5953f)
                curveTo(15.3641f, 4.8188f, 15.5f, 5.214f, 15.5f, 5.5047f)
                lineTo(15.5f, 6.4953f)
                curveTo(15.5f, 6.774f, 15.4036f, 7.1928f, 15.2734f, 7.4532f)
                lineTo(15.2266f, 7.5468f)
                curveTo(15.1014f, 7.7971f, 14.8438f, 8.1563f, 14.6502f, 8.3498f)
                lineTo(14.3498f, 8.6502f)
                curveTo(14.1566f, 8.8434f, 13.8072f, 9.0964f, 13.5468f, 9.2266f)
                lineTo(13.4532f, 9.2734f)
                curveTo(13.2029f, 9.3986f, 12.7681f, 9.5f, 12.5f, 9.5f)
                curveTo(12.2239f, 9.5f, 12.1928f, 9.5964f, 12.4532f, 9.7266f)
                lineTo(12.5468f, 9.7734f)
                curveTo(12.7971f, 9.8986f, 13.1582f, 10.1582f, 13.3527f, 10.3527f)
                lineTo(13.1473f, 10.1473f)
                curveTo(13.3421f, 10.3421f, 13.6582f, 10.3418f, 13.8527f, 10.1473f)
                lineTo(13.6473f, 10.3527f)
                curveTo(13.8421f, 10.1579f, 14.1582f, 10.1582f, 14.3527f, 10.3527f)
                lineTo(14.1473f, 10.1473f)
                curveTo(14.3421f, 10.3421f, 14.4036f, 10.6928f, 14.2734f, 10.9532f)
                lineTo(14.2266f, 11.0468f)
                curveTo(14.1014f, 11.2971f, 13.7681f, 11.5f, 13.5f, 11.5f)
                curveTo(13.2239f, 11.5f, 12.8072f, 11.4036f, 12.5468f, 11.2734f)
                lineTo(12.4532f, 11.2266f)
                curveTo(12.2029f, 11.1014f, 11.9036f, 10.8072f, 11.7734f, 10.5468f)
                lineTo(11.7266f, 10.4532f)
                curveTo(11.6014f, 10.2029f, 11.3418f, 10.1582f, 11.1473f, 10.3527f)
                lineTo(11.3527f, 10.1473f)
                curveTo(11.1579f, 10.3421f, 11.1226f, 10.6839f, 11.2733f, 10.9099f)
                lineTo(11.7267f, 11.5901f)
                curveTo(11.8777f, 11.8165f, 11.8161f, 12.1226f, 11.5901f, 12.2733f)
                lineTo(10.9099f, 12.7267f)
                curveTo(10.6835f, 12.8777f, 10.3161f, 12.8774f, 10.0901f, 12.7267f)
                lineTo(9.4099f, 12.2733f)
                curveTo(9.1835f, 12.1223f, 9.1226f, 11.8161f, 9.2733f, 11.5901f)
                lineTo(9.7267f, 10.9099f)
                curveTo(9.8777f, 10.6835f, 9.8418f, 10.3418f, 9.6473f, 10.1473f)
                lineTo(9.8527f, 10.3527f)
                curveTo(9.6579f, 10.1579f, 9.4036f, 10.1928f, 9.2734f, 10.4532f)
                lineTo(9.2266f, 10.5468f)
                curveTo(9.1014f, 10.7971f, 8.8072f, 11.0964f, 8.5468f, 11.2266f)
                lineTo(8.4532f, 11.2734f)
                curveTo(8.2029f, 11.3986f, 7.7681f, 11.5f, 7.5f, 11.5f)
                curveTo(7.2239f, 11.5f, 6.9036f, 11.3072f, 6.7734f, 11.0468f)
                lineTo(6.7266f, 10.9532f)
                curveTo(6.6014f, 10.7029f, 6.6582f, 10.3418f, 6.8527f, 10.1473f)
                lineTo(6.6473f, 10.3527f)
                curveTo(6.8421f, 10.1579f, 7.1582f, 10.1582f, 7.3527f, 10.3527f)
                lineTo(7.1473f, 10.1473f)
                curveTo(7.3421f, 10.3421f, 7.6582f, 10.3418f, 7.8527f, 10.1473f)
                lineTo(7.6473f, 10.3527f)
                curveTo(7.8421f, 10.1579f, 8.1928f, 9.9036f, 8.4532f, 9.7734f)
                lineTo(8.5468f, 9.7266f)
                curveTo(8.7971f, 9.6014f, 8.7681f, 9.5f, 8.5f, 9.5f)
                curveTo(8.2239f, 9.5f, 7.8072f, 9.4036f, 7.5468f, 9.2734f)
                lineTo(7.4532f, 9.2266f)
                curveTo(7.2029f, 9.1014f, 6.8438f, 8.8438f, 6.6502f, 8.6502f)
                lineTo(6.3498f, 8.3498f)
                curveTo(6.1566f, 8.1566f, 5.9036f, 7.8072f, 5.7734f, 7.5468f)
                lineTo(5.7266f, 7.4532f)
                curveTo(5.6014f, 7.2029f, 5.5f, 6.786f, 5.5f, 6.4953f)
                lineTo(5.5f, 5.5047f)
                curveTo(5.5f, 5.226f, 5.6384f, 4.8154f, 5.8035f, 4.5953f)
                lineTo(6.6965f, 3.4047f)
                curveTo(6.8641f, 3.1812f, 7.0535f, 3.214f, 7.121f, 3.4841f)
                lineTo(7.379f, 4.5159f)
                curveTo(7.4458f, 4.7832f, 7.5964f, 5.1928f, 7.7266f, 5.4532f)
                lineTo(7.7734f, 5.5468f)
                curveTo(7.8986f, 5.7971f, 8.1582f, 6.1582f, 8.3527f, 6.3527f)
                lineTo(8.1473f, 6.1473f)
                curveTo(8.3421f, 6.3421f, 8.3418f, 6.6582f, 8.1473f, 6.8527f)
                lineTo(8.3527f, 6.6473f)
                curveTo(8.1579f, 6.8421f, 8.1928f, 7.0964f, 8.4532f, 7.2266f)
                lineTo(8.5468f, 7.2734f)
                curveTo(8.7971f, 7.3986f, 9.0f, 7.2734f, 9.0f, 7.0f)
                lineTo(9.0f, 7.5f)
                curveTo(9.0f, 7.2239f, 9.0964f, 6.8072f, 9.2266f, 6.5468f)
                lineTo(9.2734f, 6.4532f)
                curveTo(9.3986f, 6.2029f, 9.3438f, 5.8438f, 9.1502f, 5.6502f)
                lineTo(8.1473f, 4.6473f)
                lineTo(8.3527f, 4.8527f)
                curveTo(8.1579f, 4.6579f, 8.1928f, 4.4036f, 8.4532f, 4.2734f)
                lineTo(8.5468f, 4.2266f)
                curveTo(8.7971f, 4.1014f, 9.1563f, 4.1563f, 9.3498f, 4.3498f)
                lineTo(10.3527f, 5.3527f)
                lineTo(10.1473f, 5.1473f)
                close()
                moveTo(9.3498f, 3.3498f)
                curveTo(9.1566f, 3.1566f, 9.2086f, 2.9305f, 9.4746f, 2.8418f)
                lineTo(10.0254f, 2.6582f)
                curveTo(10.2875f, 2.5708f, 10.7086f, 2.5695f, 10.9746f, 2.6582f)
                lineTo(11.5254f, 2.8418f)
                curveTo(11.7875f, 2.9292f, 11.8438f, 3.1563f, 11.6502f, 3.3498f)
                lineTo(11.3498f, 3.6502f)
                curveTo(11.1566f, 3.8434f, 10.7681f, 4.0f, 10.5f, 4.0f)
                curveTo(10.2239f, 4.0f, 9.8438f, 3.8438f, 9.6502f, 3.6502f)
                lineTo(9.3498f, 3.3498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF215F90)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 9.0057f)
                curveTo(9.5f, 9.2787f, 9.576f, 9.2914f, 9.6846f, 9.0254f)
                curveTo(9.6846f, 9.0254f, 10.0f, 8.0f, 10.5f, 8.0f)
                curveTo(11.0f, 8.0f, 11.3225f, 9.0418f, 11.3225f, 9.0418f)
                curveTo(11.4205f, 9.2949f, 11.5f, 9.2782f, 11.5f, 8.9946f)
                lineTo(11.5f, 8.5f)
                curveTo(11.5f, 7.6716f, 11.0523f, 7.0f, 10.5f, 7.0f)
                curveTo(9.9477f, 7.0f, 9.5f, 7.6716f, 9.5f, 8.5f)
                lineTo(9.5f, 9.0057f)
                close()
            }
        }
        .build()
        return _me!!
    }

private var _me: ImageVector? = null
