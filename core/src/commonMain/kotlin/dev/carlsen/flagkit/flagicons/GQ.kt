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

val FlagIcons.GQ: ImageVector
    get() {
        if (_gq != null) {
            return _gq!!
        }
        _gq = Builder(name = "Gq", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFEC3938), 1.0f to Color(0xFFE12524), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF51B422), 1.0f to Color(0xFF429919), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF159940)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0656f, 8.9317f)
                curveTo(10.1619f, 8.8313f, 10.2407f, 8.6352f, 10.2414f, 8.5067f)
                lineTo(10.2486f, 7.2433f)
                curveTo(10.2494f, 7.1089f, 10.1328f, 7.0f, 9.9961f, 7.0f)
                lineTo(9.7539f, 7.0f)
                curveTo(9.6137f, 7.0f, 9.5785f, 6.9215f, 9.6742f, 6.8258f)
                lineTo(10.3258f, 6.1742f)
                curveTo(10.422f, 6.078f, 10.5785f, 6.0785f, 10.6742f, 6.1742f)
                lineTo(11.3258f, 6.8258f)
                curveTo(11.422f, 6.922f, 11.3828f, 7.0f, 11.2461f, 7.0f)
                lineTo(11.0039f, 7.0f)
                curveTo(10.8637f, 7.0f, 10.75f, 7.1148f, 10.75f, 7.2433f)
                lineTo(10.75f, 8.5067f)
                curveTo(10.75f, 8.6411f, 10.8291f, 8.8291f, 10.9209f, 8.9209f)
                lineTo(10.8291f, 8.8291f)
                curveTo(10.9235f, 8.9235f, 10.893f, 9.0f, 10.7477f, 9.0f)
                lineTo(10.2523f, 9.0f)
                curveTo(10.113f, 9.0f, 10.0759f, 8.9209f, 10.1744f, 8.8183f)
                lineTo(10.0656f, 8.9317f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF258DE7), 1.0f to Color(0xFF1276CC), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineToRelative(7.0f, 7.5f)
                lineToRelative(-7.0f, 7.5f)
                close()
            }
        }
        .build()
        return _gq!!
    }

private var _gq: ImageVector? = null
