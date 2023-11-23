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

val FlagIcons.MO: ImageVector
    get() {
        if (_mo != null) {
            return _mo!!
        }
        _mo = Builder(name = "Mo", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF079D7B), 1.0f to Color(0xFF01795E), start =
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
                    Offset(10.51435f,4.0f), end = Offset(10.51435f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.4518f, 8.9023f)
                curveTo(8.5949f, 8.9403f, 8.7363f, 8.9728f, 8.8749f, 9.0f)
                lineTo(6.5f, 9.0f)
                curveTo(6.6186f, 9.356f, 6.7782f, 9.6915f, 6.9729f, 10.0f)
                lineTo(14.0271f, 10.0f)
                lineTo(14.0271f, 10.0f)
                curveTo(14.2218f, 9.6915f, 14.3814f, 9.356f, 14.5f, 9.0f)
                lineTo(12.0927f, 9.0f)
                curveTo(12.2356f, 8.9734f, 12.3818f, 8.9411f, 12.5298f, 8.9029f)
                curveTo(12.0759f, 8.918f, 11.3359f, 9.0f, 10.5f, 9.0f)
                curveTo(9.6528f, 9.0f, 8.904f, 8.9157f, 8.4518f, 8.9023f)
                close()
                moveTo(8.0349f, 8.7768f)
                curveTo(6.9141f, 8.3985f, 6.146f, 7.7917f, 6.2668f, 7.3411f)
                curveTo(6.4015f, 6.8383f, 7.5918f, 6.7203f, 8.9255f, 7.0777f)
                curveTo(8.9955f, 7.0965f, 9.0646f, 7.1162f, 9.1325f, 7.1367f)
                curveTo(9.1023f, 6.9334f, 9.0862f, 6.72f, 9.0862f, 6.5f)
                curveTo(9.0862f, 5.1193f, 9.7192f, 4.0f, 10.5f, 4.0f)
                curveTo(11.2808f, 4.0f, 11.9138f, 5.1193f, 11.9138f, 6.5f)
                curveTo(11.9138f, 6.7189f, 11.8979f, 6.9312f, 11.868f, 7.1336f)
                curveTo(11.9447f, 7.11f, 12.0228f, 7.0875f, 12.1022f, 7.0662f)
                curveTo(13.4359f, 6.7089f, 14.6262f, 6.8268f, 14.761f, 7.3296f)
                curveTo(14.8827f, 7.784f, 14.1006f, 8.3972f, 12.9645f, 8.7749f)
                curveTo(12.7638f, 8.1796f, 11.7368f, 8.0f, 10.5f, 8.0f)
                curveTo(9.2619f, 8.0f, 8.234f, 8.18f, 8.0349f, 8.7768f)
                close()
                moveTo(13.1661f, 11.0f)
                curveTo(12.4376f, 11.6254f, 11.51f, 12.0f, 10.5f, 12.0f)
                curveTo(9.49f, 12.0f, 8.5624f, 11.6254f, 7.8339f, 11.0f)
                lineTo(13.1661f, 11.0f)
                lineTo(13.1661f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCD117)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 3.0f)
                curveTo(10.2239f, 3.0f, 10.0f, 2.7761f, 10.0f, 2.5f)
                curveTo(10.0f, 2.2239f, 10.2239f, 2.0f, 10.5f, 2.0f)
                curveTo(10.7761f, 2.0f, 11.0f, 2.2239f, 11.0f, 2.5f)
                curveTo(11.0f, 2.7761f, 10.7761f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(6.5f, 5.5f)
                curveTo(6.2239f, 5.5f, 6.0f, 5.2761f, 6.0f, 5.0f)
                curveTo(6.0f, 4.7239f, 6.2239f, 4.5f, 6.5f, 4.5f)
                curveTo(6.7761f, 4.5f, 7.0f, 4.7239f, 7.0f, 5.0f)
                curveTo(7.0f, 5.2761f, 6.7761f, 5.5f, 6.5f, 5.5f)
                close()
                moveTo(14.5f, 5.5f)
                curveTo(14.2239f, 5.5f, 14.0f, 5.2761f, 14.0f, 5.0f)
                curveTo(14.0f, 4.7239f, 14.2239f, 4.5f, 14.5f, 4.5f)
                curveTo(14.7761f, 4.5f, 15.0f, 4.7239f, 15.0f, 5.0f)
                curveTo(15.0f, 5.2761f, 14.7761f, 5.5f, 14.5f, 5.5f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(12.7239f, 4.0f, 12.5f, 3.7761f, 12.5f, 3.5f)
                curveTo(12.5f, 3.2239f, 12.7239f, 3.0f, 13.0f, 3.0f)
                curveTo(13.2761f, 3.0f, 13.5f, 3.2239f, 13.5f, 3.5f)
                curveTo(13.5f, 3.7761f, 13.2761f, 4.0f, 13.0f, 4.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(7.7239f, 4.0f, 7.5f, 3.7761f, 7.5f, 3.5f)
                curveTo(7.5f, 3.2239f, 7.7239f, 3.0f, 8.0f, 3.0f)
                curveTo(8.2761f, 3.0f, 8.5f, 3.2239f, 8.5f, 3.5f)
                curveTo(8.5f, 3.7761f, 8.2761f, 4.0f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _mo!!
    }

private var _mo: ImageVector? = null
