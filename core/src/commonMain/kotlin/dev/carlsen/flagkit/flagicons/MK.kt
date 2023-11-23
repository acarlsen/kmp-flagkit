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

val FlagIcons.MK: ImageVector
    get() {
        if (_mk != null) {
            return _mk!!
        }
        _mk = Builder(name = "Mk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE81B26), 1.0f to Color(0xFFD00914), start =
                    Offset(10.496201f,-0.002f), end = Offset(10.496201f,14.998f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0038f, -0.002f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE94F), 1.0f to Color(0xFFFFE633), start =
                    Offset(10.4962f,4.998f), end = Offset(10.4962f,9.998f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.4962f, 7.498f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE94F), 1.0f to Color(0xFFFFE633), start =
                    Offset(10.496201f,-0.002f), end = Offset(10.496201f,14.998f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.9614f, 7.993f)
                lineTo(20.9962f, 8.998f)
                lineTo(20.9962f, 5.998f)
                lineTo(13.9614f, 7.0029f)
                curveTo(13.9843f, 7.1647f, 13.9962f, 7.3299f, 13.9962f, 7.498f)
                curveTo(13.9962f, 7.666f, 13.9843f, 7.8313f, 13.9614f, 7.993f)
                close()
                moveTo(7.0309f, 7.0029f)
                lineTo(-0.0038f, 5.998f)
                lineTo(-0.0038f, 8.998f)
                lineTo(7.0309f, 7.993f)
                curveTo(7.008f, 7.8313f, 6.9962f, 7.666f, 6.9962f, 7.498f)
                curveTo(6.9962f, 7.3299f, 7.008f, 7.1647f, 7.0309f, 7.0029f)
                close()
                moveTo(11.1827f, 4.0653f)
                lineTo(11.9962f, -0.002f)
                lineTo(8.9962f, -0.002f)
                lineTo(9.8096f, 4.0653f)
                curveTo(10.0316f, 4.0211f, 10.2612f, 3.998f, 10.4962f, 3.998f)
                curveTo(10.7311f, 3.998f, 10.9607f, 4.0211f, 11.1827f, 4.0653f)
                close()
                moveTo(9.8096f, 10.9307f)
                lineTo(8.9962f, 14.998f)
                lineTo(11.9962f, 14.998f)
                lineTo(11.1827f, 10.9307f)
                curveTo(10.9607f, 10.9748f, 10.7311f, 10.998f, 10.4962f, 10.998f)
                curveTo(10.2612f, 10.998f, 10.0316f, 10.9748f, 9.8096f, 10.9307f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFE94F), 1.0f to Color(0xFFFFE633), start =
                    Offset(10.49615f,-2.65f), end = Offset(10.49615f,17.646f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.6522f, 9.5385f)
                lineTo(-0.54f, 15.4165f)
                lineTo(1.4674f, 17.646f)
                lineTo(8.1697f, 10.1129f)
                curveTo(7.9769f, 9.9412f, 7.8032f, 9.7486f, 7.6522f, 9.5385f)
                close()
                moveTo(13.3401f, 5.4574f)
                lineTo(21.5323f, -0.4206f)
                lineTo(19.5249f, -2.65f)
                lineTo(12.8226f, 4.8831f)
                curveTo(13.0154f, 5.0547f, 13.1891f, 5.2474f, 13.3401f, 5.4574f)
                close()
                moveTo(12.8226f, 10.1129f)
                lineTo(19.5249f, 17.646f)
                lineTo(21.5323f, 15.4165f)
                lineTo(13.3401f, 9.5385f)
                curveTo(13.1891f, 9.7486f, 13.0154f, 9.9412f, 12.8226f, 10.1129f)
                close()
                moveTo(8.1697f, 4.8831f)
                lineTo(1.4674f, -2.65f)
                lineTo(-0.54f, -0.4206f)
                lineTo(7.6522f, 5.4574f)
                curveTo(7.8032f, 5.2474f, 7.9769f, 5.0547f, 8.1697f, 4.8831f)
                close()
            }
        }
        .build()
        return _mk!!
    }

private var _mk: ImageVector? = null
