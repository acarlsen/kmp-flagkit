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

val FlagIcons.PG: ImageVector
    get() {
        if (_pg != null) {
            return _pg!!
        }
        _pg = Builder(name = "Pg", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE8283F), 1.0f to Color(0xFFCC162C), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(0.0f, 15.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.0f,11.2929f), end = Offset(5.0f,12.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 12.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.0f,5.2929f), end = Offset(5.0f,6.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 6.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(2.5f,7.7929f), end = Offset(2.5f,9.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.5f, 9.0f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(7.0f,7.2929f), end = Offset(7.0f,8.7071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 8.5f)
                lineToRelative(-0.7071f, 0.2071f)
                lineToRelative(0.2071f, -0.7071f)
                lineToRelative(-0.2071f, -0.7071f)
                lineToRelative(0.7071f, 0.2071f)
                lineToRelative(0.7071f, -0.2071f)
                lineToRelative(-0.2071f, 0.7071f)
                lineToRelative(0.2071f, 0.7071f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD84E), 1.0f to Color(0xFFFCD036), start =
                    Offset(14.8314495f,1.9664f), end = Offset(14.8314495f,7.8228f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(14.1459f, 6.9492f)
                curveTo(14.0262f, 6.8773f, 13.9292f, 6.7081f, 13.9292f, 6.5728f)
                lineTo(13.9292f, 5.6512f)
                curveTo(13.9292f, 5.5152f, 13.8313f, 5.4375f, 13.6832f, 5.4869f)
                lineTo(13.1145f, 5.6765f)
                curveTo(12.9786f, 5.7217f, 12.7706f, 5.7258f, 12.6225f, 5.6765f)
                lineTo(12.0539f, 5.4869f)
                curveTo(11.918f, 5.4416f, 11.9029f, 5.3479f, 12.0246f, 5.2748f)
                lineTo(13.3589f, 4.4743f)
                curveTo(13.4786f, 4.4025f, 13.543f, 4.2464f, 13.4936f, 4.0982f)
                lineTo(13.3041f, 3.5296f)
                curveTo(13.2588f, 3.3937f, 13.3199f, 3.3162f, 13.4681f, 3.3656f)
                lineTo(14.0367f, 3.5551f)
                curveTo(14.1726f, 3.6004f, 14.3397f, 3.5421f, 14.4128f, 3.4204f)
                lineTo(15.2133f, 2.0861f)
                curveTo(15.2852f, 1.9664f, 15.376f, 1.9673f, 15.4254f, 2.1154f)
                lineTo(15.6149f, 2.684f)
                curveTo(15.6602f, 2.8199f, 15.6643f, 3.0279f, 15.6149f, 3.176f)
                lineTo(15.4254f, 3.7447f)
                curveTo(15.3801f, 3.8806f, 15.4544f, 3.9907f, 15.5897f, 3.9907f)
                lineTo(16.5113f, 3.9907f)
                curveTo(16.6473f, 3.9907f, 16.8146f, 4.0857f, 16.8877f, 4.2075f)
                lineTo(17.6882f, 5.5417f)
                curveTo(17.76f, 5.6614f, 17.7023f, 5.7817f, 17.5725f, 5.8076f)
                lineTo(16.2963f, 6.0629f)
                curveTo(16.1605f, 6.09f, 16.0273f, 6.228f, 16.0013f, 6.3578f)
                lineTo(15.7461f, 7.634f)
                curveTo(15.7189f, 7.7697f, 15.6019f, 7.8228f, 15.4802f, 7.7497f)
                lineTo(14.1459f, 6.9492f)
                lineTo(14.1459f, 6.9492f)
                close()
            }
        }
        .build()
        return _pg!!
    }

private var _pg: ImageVector? = null
