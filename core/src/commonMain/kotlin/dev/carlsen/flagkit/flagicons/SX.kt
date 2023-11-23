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

val FlagIcons.SX: ImageVector
    get() {
        if (_sx != null) {
            return _sx!!
        }
        _sx = Builder(name = "Sx", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0740AA), 1.0f to Color(0xFF012F85), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF02C33), 1.0f to Color(0xFFD82027), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.0f,0.0f), end = Offset(5.0f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineToRelative(10.0f, 7.5f)
                lineToRelative(-10.0f, 7.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE72C33), 1.0f to Color(0xFFD82027), start =
                    Offset(3.5f,4.5f), end = Offset(3.5f,9.0989f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.5f, 7.0f)
                lineTo(1.5f, 5.5061f)
                curveTo(1.5f, 4.9516f, 1.9383f, 4.5f, 2.4954f, 4.5f)
                lineTo(4.5046f, 4.5f)
                curveTo(5.0558f, 4.5f, 5.5f, 4.9573f, 5.5f, 5.5061f)
                lineTo(5.5f, 7.0f)
                curveTo(5.5f, 7.8446f, 5.1157f, 8.4466f, 4.4965f, 8.7975f)
                curveTo(4.1387f, 9.0003f, 3.7891f, 9.0818f, 3.4667f, 9.0989f)
                curveTo(3.2109f, 9.0818f, 2.8613f, 9.0003f, 2.5035f, 8.7975f)
                curveTo(1.8843f, 8.4466f, 1.5f, 7.8446f, 1.5f, 7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF78C1F0), 1.0f to Color(0xFF67B1E0), start =
                    Offset(3.5f,5.0f), end = Offset(3.5f,8.6f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 5.5061f)
                curveTo(2.0f, 5.2266f, 2.2158f, 5.0f, 2.4954f, 5.0f)
                lineTo(4.5046f, 5.0f)
                curveTo(4.7782f, 5.0f, 5.0f, 5.2321f, 5.0f, 5.5061f)
                lineTo(5.0f, 7.0f)
                curveTo(5.0f, 8.5f, 3.5f, 8.6f, 3.5f, 8.6f)
                curveTo(3.5f, 8.6f, 2.0f, 8.5f, 2.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 6.5f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-1.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9D835)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0013f, 9.368f)
                curveTo(1.6069f, 10.066f, 2.5612f, 10.5f, 3.5f, 10.5f)
                curveTo(4.448f, 10.5f, 5.4153f, 10.0519f, 6.021f, 9.3384f)
                curveTo(6.1997f, 9.1279f, 6.1739f, 8.8123f, 5.9634f, 8.6336f)
                curveTo(5.7529f, 8.4549f, 5.4374f, 8.4807f, 5.2587f, 8.6912f)
                curveTo(4.8429f, 9.1811f, 4.1543f, 9.5f, 3.5f, 9.5f)
                curveTo(2.8505f, 9.5f, 2.172f, 9.1914f, 1.7566f, 8.7126f)
                curveTo(1.5756f, 8.5041f, 1.2598f, 8.4817f, 1.0512f, 8.6627f)
                curveTo(0.8427f, 8.8437f, 0.8203f, 9.1594f, 1.0013f, 9.368f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF7E14B), 1.0f to Color(0xFFF7DF3E), start =
                    Offset(3.5f,3.5f), end = Offset(3.5f,5.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5f, 4.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _sx!!
    }

private var _sx: ImageVector? = null
