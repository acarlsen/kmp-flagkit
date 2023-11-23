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

val FlagIcons.AD: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF1537D1), 1.0f to Color(0xFF0522A5), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEA3058), 1.0f to Color(0xFFCE173E), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFCF3C), 1.0f to Color(0xFFFECB2F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFEDB1)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 6.5f)
                lineToRelative(1.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(-1.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD32E28)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.665f, 7.9595f)
                curveTo(9.6896f, 8.2548f, 9.9569f, 8.5f, 10.2524f, 8.5f)
                lineTo(10.7476f, 8.5f)
                curveTo(11.0422f, 8.5f, 11.3105f, 8.2528f, 11.335f, 7.9595f)
                lineTo(11.4566f, 6.5f)
                lineTo(9.5434f, 6.5f)
                lineTo(9.665f, 7.9595f)
                close()
                moveTo(9.0413f, 6.4954f)
                curveTo(9.0185f, 6.2218f, 9.2158f, 6.0f, 9.4954f, 6.0f)
                lineTo(11.5046f, 6.0f)
                curveTo(11.7782f, 6.0f, 11.982f, 6.2158f, 11.9587f, 6.4954f)
                lineTo(11.8332f, 8.001f)
                curveTo(11.7873f, 8.5528f, 11.3031f, 9.0f, 10.7476f, 9.0f)
                lineTo(10.2524f, 9.0f)
                curveTo(9.6988f, 9.0f, 9.2131f, 8.5573f, 9.1668f, 8.001f)
                lineTo(9.0413f, 6.4954f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD32E28)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5f, 7.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 0.5f)
                lineToRelative(-0.5f, 0.0f)
                lineToRelative(-1.0f, 0.0f)
                lineToRelative(-0.5f, 0.0f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
