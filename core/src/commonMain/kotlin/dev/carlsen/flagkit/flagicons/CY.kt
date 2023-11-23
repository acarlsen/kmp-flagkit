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

val FlagIcons.CY: ImageVector
    get() {
        if (_cy != null) {
            return _cy!!
        }
        _cy = Builder(name = "Cy", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE7832C), 1.0f to Color(0xFFD7751F), start =
                    Offset(10.6887f,2.1014f), end = Offset(10.6887f,8.9005f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.5468f, 2.2266f)
                curveTo(15.7971f, 2.1014f, 15.8774f, 2.1839f, 15.7267f, 2.4099f)
                lineTo(15.2733f, 3.0901f)
                curveTo(15.1223f, 3.3165f, 14.8161f, 3.6226f, 14.5901f, 3.7733f)
                lineTo(13.9099f, 4.2267f)
                curveTo(13.6835f, 4.3777f, 13.3418f, 4.6582f, 13.1473f, 4.8527f)
                lineTo(13.3527f, 4.6473f)
                curveTo(13.1579f, 4.8421f, 13.1563f, 5.1563f, 13.3498f, 5.3498f)
                lineTo(13.6502f, 5.6502f)
                curveTo(13.8434f, 5.8434f, 13.8438f, 6.1563f, 13.6502f, 6.3498f)
                lineTo(13.3498f, 6.6502f)
                curveTo(13.1566f, 6.8434f, 12.8072f, 6.9036f, 12.5468f, 6.7734f)
                lineTo(12.4532f, 6.7266f)
                curveTo(12.2029f, 6.6014f, 11.9036f, 6.6928f, 11.7734f, 6.9532f)
                lineTo(11.7266f, 7.0468f)
                curveTo(11.6014f, 7.2971f, 11.2914f, 7.5695f, 11.0254f, 7.6582f)
                lineTo(10.4746f, 7.8418f)
                curveTo(10.2125f, 7.9292f, 9.7681f, 8.0f, 9.5f, 8.0f)
                lineTo(9.5f, 8.0f)
                curveTo(9.2239f, 8.0f, 8.9036f, 8.1928f, 8.7734f, 8.4532f)
                lineTo(8.7266f, 8.5468f)
                curveTo(8.6014f, 8.7971f, 8.3009f, 8.9005f, 8.0561f, 8.7781f)
                lineTo(6.9439f, 8.2219f)
                curveTo(6.6987f, 8.0994f, 6.3438f, 7.8438f, 6.1502f, 7.6502f)
                lineTo(5.8498f, 7.3498f)
                curveTo(5.6566f, 7.1566f, 5.5f, 6.7681f, 5.5f, 6.5f)
                lineTo(5.5f, 6.5f)
                curveTo(5.5f, 6.2239f, 5.7266f, 6.0f, 6.0f, 6.0f)
                lineTo(5.5f, 6.0f)
                curveTo(5.7761f, 6.0f, 6.1563f, 5.8438f, 6.3498f, 5.6502f)
                lineTo(6.6502f, 5.3498f)
                curveTo(6.8434f, 5.1566f, 7.2319f, 5.0f, 7.5f, 5.0f)
                lineTo(7.5f, 5.0f)
                curveTo(7.7761f, 5.0f, 8.0695f, 4.7914f, 8.1582f, 4.5254f)
                lineTo(8.3418f, 3.9746f)
                curveTo(8.4292f, 3.7125f, 8.7131f, 3.5426f, 8.982f, 3.5964f)
                lineTo(10.518f, 3.9036f)
                curveTo(10.7842f, 3.9568f, 11.214f, 3.9465f, 11.4841f, 3.879f)
                lineTo(12.5159f, 3.621f)
                curveTo(12.7832f, 3.5542f, 13.1928f, 3.4036f, 13.4532f, 3.2734f)
                lineTo(13.5468f, 3.2266f)
                curveTo(13.7971f, 3.1014f, 14.1928f, 2.9036f, 14.4532f, 2.7734f)
                lineTo(14.5468f, 2.7266f)
                curveTo(14.7971f, 2.6014f, 15.1928f, 2.4036f, 15.4532f, 2.2734f)
                lineTo(15.5468f, 2.2266f)
                close()
            }
            path(fill = SolidColor(Color(0xFF445128)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 11.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF445128)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.75f, strokeAlpha = 0.75f, strokeLineWidth = 1.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1581f, 11.4743f)
                curveTo(11.8961f, 11.5617f, 11.613f, 11.4201f, 11.5257f, 11.1581f)
                curveTo(11.4383f, 10.8961f, 11.5799f, 10.613f, 11.8419f, 10.5257f)
                curveTo(11.8949f, 10.508f, 11.9983f, 10.4686f, 12.1344f, 10.4081f)
                curveTo(12.3633f, 10.3064f, 12.592f, 10.1844f, 12.8026f, 10.044f)
                curveTo(13.1564f, 9.8081f, 13.4174f, 9.5471f, 13.5528f, 9.2764f)
                curveTo(13.6763f, 9.0294f, 13.9766f, 8.9293f, 14.2236f, 9.0528f)
                curveTo(14.4706f, 9.1763f, 14.5707f, 9.4766f, 14.4472f, 9.7236f)
                curveTo(14.2226f, 10.1729f, 13.8436f, 10.5519f, 13.3574f, 10.876f)
                curveTo(13.0955f, 11.0506f, 12.8179f, 11.1986f, 12.5406f, 11.3219f)
                curveTo(12.373f, 11.3964f, 12.2401f, 11.447f, 12.1581f, 11.4743f)
                close()
                moveTo(9.1581f, 10.5257f)
                curveTo(9.4201f, 10.613f, 9.5617f, 10.8961f, 9.4743f, 11.1581f)
                curveTo(9.387f, 11.4201f, 9.1039f, 11.5617f, 8.8419f, 11.4743f)
                curveTo(8.7599f, 11.447f, 8.627f, 11.3964f, 8.4594f, 11.3219f)
                curveTo(8.1821f, 11.1986f, 7.9045f, 11.0506f, 7.6427f, 10.876f)
                curveTo(7.1564f, 10.5519f, 6.7774f, 10.1729f, 6.5528f, 9.7236f)
                curveTo(6.4293f, 9.4766f, 6.5294f, 9.1763f, 6.7764f, 9.0528f)
                curveTo(7.0234f, 8.9293f, 7.3237f, 9.0294f, 7.4472f, 9.2764f)
                curveTo(7.5826f, 9.5471f, 7.8436f, 9.8081f, 8.1974f, 10.044f)
                curveTo(8.408f, 10.1844f, 8.6367f, 10.3064f, 8.8656f, 10.4081f)
                curveTo(9.0017f, 10.4686f, 9.1051f, 10.508f, 9.1581f, 10.5257f)
                close()
            }
        }
        .build()
        return _cy!!
    }

private var _cy: ImageVector? = null
