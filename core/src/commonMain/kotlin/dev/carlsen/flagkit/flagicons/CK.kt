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

val FlagIcons.CK: ImageVector
    get() {
        if (_ck != null) {
            return _ck!!
        }
        _ck = Builder(name = "Ck", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0A17A7), 1.0f to Color(0xFF030E88), start =
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
                    Offset(4.1238503f,-0.9021f), end = Offset(4.1238503f,7.9021f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.23f)
                lineTo(-1.3516f, -0.5f)
                lineTo(0.6602f, -0.5f)
                lineTo(4.1602f, 2.0f)
                lineTo(4.8566f, 2.0f)
                lineTo(9.5f, -0.9021f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.5525f, 9.3331f, 0.8765f, 9.0822f, 1.0558f)
                lineTo(6.0f, 3.2573f)
                lineTo(6.0f, 3.77f)
                lineTo(9.1372f, 6.4591f)
                curveTo(9.5993f, 6.8552f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.5048f, 7.5f, 8.2053f, 7.4039f, 8.0009f, 7.258f)
                lineTo(4.8398f, 5.0f)
                lineTo(4.1434f, 5.0f)
                lineTo(-0.5f, 7.9021f)
                lineTo(-0.5f, 6.2427f)
                lineTo(3.0f, 3.7427f)
                lineTo(3.0f, 3.23f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 3.0f)
                lineTo(-0.0f, 0.0f)
                lineTo(0.5f, 0.0f)
                lineTo(4.0f, 2.5f)
                lineTo(5.0f, 2.5f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 0.25f)
                curveTo(9.0f, 0.3881f, 8.9135f, 0.5618f, 8.7915f, 0.6489f)
                lineTo(5.5f, 3.0f)
                lineTo(5.5f, 4.0f)
                lineTo(8.8118f, 6.8387f)
                curveTo(8.9158f, 6.9278f, 8.884f, 7.0f, 8.75f, 7.0f)
                lineTo(8.75f, 7.0f)
                curveTo(8.6119f, 7.0f, 8.4135f, 6.9382f, 8.2915f, 6.8511f)
                lineTo(5.0f, 4.5f)
                lineTo(4.0f, 4.5f)
                lineTo(-0.0f, 7.0f)
                lineTo(-0.0f, 6.5f)
                lineTo(3.5f, 4.0f)
                lineTo(3.5f, 3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.75f,0.0f), end = Offset(4.75f,7.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0f, 2.5f)
                lineTo(-0.0f, 4.5f)
                lineTo(3.5f, 4.5f)
                lineTo(3.5f, 7.0046f)
                curveTo(3.5f, 7.2782f, 3.714f, 7.5f, 4.0047f, 7.5f)
                lineTo(4.9953f, 7.5f)
                curveTo(5.274f, 7.5f, 5.5f, 7.2842f, 5.5f, 7.0046f)
                lineTo(5.5f, 4.5f)
                lineTo(9.0095f, 4.5f)
                curveTo(9.2804f, 4.5f, 9.5f, 4.286f, 9.5f, 3.9953f)
                lineTo(9.5f, 3.0047f)
                curveTo(9.5f, 2.726f, 9.2849f, 2.5f, 9.0095f, 2.5f)
                lineTo(5.5f, 2.5f)
                lineTo(5.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                lineTo(3.5f, 2.5f)
                lineTo(-0.0f, 2.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDB1E36), 1.0f to Color(0xFFD51931), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0f, 3.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(0.0f, -0.5f)
                lineToRelative(-4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.5f, 5.0f)
                curveTo(15.2239f, 5.0f, 15.0f, 4.7761f, 15.0f, 4.5f)
                curveTo(15.0f, 4.2239f, 15.2239f, 4.0f, 15.5f, 4.0f)
                curveTo(15.7761f, 4.0f, 16.0f, 4.2239f, 16.0f, 4.5f)
                curveTo(16.0f, 4.7761f, 15.7761f, 5.0f, 15.5f, 5.0f)
                close()
                moveTo(15.5f, 11.0f)
                curveTo(15.2239f, 11.0f, 15.0f, 10.7761f, 15.0f, 10.5f)
                curveTo(15.0f, 10.2239f, 15.2239f, 10.0f, 15.5f, 10.0f)
                curveTo(15.7761f, 10.0f, 16.0f, 10.2239f, 16.0f, 10.5f)
                curveTo(16.0f, 10.7761f, 15.7761f, 11.0f, 15.5f, 11.0f)
                close()
                moveTo(13.0f, 7.5f)
                curveTo(13.0f, 7.7761f, 12.7761f, 8.0f, 12.5f, 8.0f)
                curveTo(12.2239f, 8.0f, 12.0f, 7.7761f, 12.0f, 7.5f)
                curveTo(12.0f, 7.2239f, 12.2239f, 7.0f, 12.5f, 7.0f)
                curveTo(12.7761f, 7.0f, 13.0f, 7.2239f, 13.0f, 7.5f)
                close()
                moveTo(19.0f, 7.5f)
                curveTo(19.0f, 7.7761f, 18.7761f, 8.0f, 18.5f, 8.0f)
                curveTo(18.2239f, 8.0f, 18.0f, 7.7761f, 18.0f, 7.5f)
                curveTo(18.0f, 7.2239f, 18.2239f, 7.0f, 18.5f, 7.0f)
                curveTo(18.7761f, 7.0f, 19.0f, 7.2239f, 19.0f, 7.5f)
                close()
                moveTo(13.7322f, 9.2678f)
                curveTo(13.9275f, 9.463f, 13.9275f, 9.7796f, 13.7322f, 9.9749f)
                curveTo(13.537f, 10.1701f, 13.2204f, 10.1701f, 13.0251f, 9.9749f)
                curveTo(12.8299f, 9.7796f, 12.8299f, 9.463f, 13.0251f, 9.2678f)
                curveTo(13.2204f, 9.0725f, 13.537f, 9.0725f, 13.7322f, 9.2678f)
                close()
                moveTo(17.9749f, 5.0251f)
                curveTo(18.1701f, 5.2204f, 18.1701f, 5.537f, 17.9749f, 5.7322f)
                curveTo(17.7796f, 5.9275f, 17.463f, 5.9275f, 17.2678f, 5.7322f)
                curveTo(17.0725f, 5.537f, 17.0725f, 5.2204f, 17.2678f, 5.0251f)
                curveTo(17.463f, 4.8299f, 17.7796f, 4.8299f, 17.9749f, 5.0251f)
                close()
                moveTo(17.2678f, 9.2678f)
                curveTo(17.463f, 9.0725f, 17.7796f, 9.0725f, 17.9749f, 9.2678f)
                curveTo(18.1701f, 9.463f, 18.1701f, 9.7796f, 17.9749f, 9.9749f)
                curveTo(17.7796f, 10.1701f, 17.463f, 10.1701f, 17.2678f, 9.9749f)
                curveTo(17.0725f, 9.7796f, 17.0725f, 9.463f, 17.2678f, 9.2678f)
                close()
                moveTo(13.0251f, 5.0251f)
                curveTo(13.2204f, 4.8299f, 13.537f, 4.8299f, 13.7322f, 5.0251f)
                curveTo(13.9275f, 5.2204f, 13.9275f, 5.537f, 13.7322f, 5.7322f)
                curveTo(13.537f, 5.9275f, 13.2204f, 5.9275f, 13.0251f, 5.7322f)
                curveTo(12.8299f, 5.537f, 12.8299f, 5.2204f, 13.0251f, 5.0251f)
                close()
            }
        }
        .build()
        return _ck!!
    }

private var _ck: ImageVector? = null
