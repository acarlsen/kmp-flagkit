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

val FlagIcons.PK: ImageVector
    get() {
        if (_pk != null) {
            return _pk!!
        }
        _pk = Builder(name = "Pk", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0A632F), 1.0f to Color(0xFF05411E), start =
                    Offset(10.5f,-0.0018f), end = Offset(10.5f,14.9982f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, -0.0018f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(3.0f,-0.0018f), end = Offset(3.0f,14.9982f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, -0.0018f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.7526f, 8.0611f)
                curveTo(17.6563f, 8.999f, 17.2565f, 9.9003f, 16.5499f, 10.607f)
                curveTo(14.8655f, 12.2914f, 12.0753f, 12.2323f, 10.318f, 10.4749f)
                curveTo(8.5606f, 8.7175f, 8.5015f, 5.9274f, 10.1859f, 4.243f)
                curveTo(10.8926f, 3.5363f, 11.7938f, 3.1366f, 12.7318f, 3.0403f)
                curveTo(12.4364f, 3.2144f, 12.1567f, 3.4293f, 11.9014f, 3.6846f)
                curveTo(10.3702f, 5.2159f, 10.2944f, 7.6229f, 11.7322f, 9.0607f)
                curveTo(13.17f, 10.4985f, 15.577f, 10.4227f, 17.1083f, 8.8915f)
                curveTo(17.3636f, 8.6361f, 17.5785f, 8.3565f, 17.7526f, 8.0611f)
                lineTo(17.7526f, 8.0611f)
                close()
                moveTo(15.8193f, 6.0767f)
                lineTo(15.5807f, 7.5005f)
                lineTo(14.9137f, 6.2202f)
                lineTo(13.4857f, 6.4332f)
                lineTo(14.4974f, 5.4031f)
                lineTo(13.8535f, 4.1109f)
                lineTo(15.1457f, 4.7548f)
                lineTo(16.1757f, 3.7432f)
                lineTo(15.9628f, 5.171f)
                lineTo(17.2432f, 5.8381f)
                lineTo(15.8193f, 6.0767f)
                lineTo(15.8193f, 6.0767f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(13.12705f,3.0403f), end = Offset(13.12705f,12.2914f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(17.7526f, 8.0611f)
                curveTo(17.6563f, 8.999f, 17.2565f, 9.9003f, 16.5499f, 10.607f)
                curveTo(14.8655f, 12.2914f, 12.0753f, 12.2323f, 10.318f, 10.4749f)
                curveTo(8.5606f, 8.7175f, 8.5015f, 5.9274f, 10.1859f, 4.243f)
                curveTo(10.8926f, 3.5363f, 11.7938f, 3.1366f, 12.7318f, 3.0403f)
                curveTo(12.4364f, 3.2144f, 12.1567f, 3.4293f, 11.9014f, 3.6846f)
                curveTo(10.3702f, 5.2159f, 10.2944f, 7.6229f, 11.7322f, 9.0607f)
                curveTo(13.17f, 10.4985f, 15.577f, 10.4227f, 17.1083f, 8.8915f)
                curveTo(17.3636f, 8.6361f, 17.5785f, 8.3565f, 17.7526f, 8.0611f)
                lineTo(17.7526f, 8.0611f)
                close()
                moveTo(15.8193f, 6.0767f)
                lineTo(15.5807f, 7.5005f)
                lineTo(14.9137f, 6.2202f)
                lineTo(13.4857f, 6.4332f)
                lineTo(14.4974f, 5.4031f)
                lineTo(13.8535f, 4.1109f)
                lineTo(15.1457f, 4.7548f)
                lineTo(16.1757f, 3.7432f)
                lineTo(15.9628f, 5.171f)
                lineTo(17.2432f, 5.8381f)
                lineTo(15.8193f, 6.0767f)
                lineTo(15.8193f, 6.0767f)
                close()
            }
        }
        .build()
        return _pk!!
    }

private var _pk: ImageVector? = null
