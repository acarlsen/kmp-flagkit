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

val FlagIcons.CA: ImageVector
    get() {
        if (_ca != null) {
            return _ca!!
        }
        _ca = Builder(name = "Ca", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFF3131), 1.0f to Color(0xFFFF0000), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF3131), 1.0f to Color(0xFFFF0000), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFF3131), 1.0f to Color(0xFFFF0000), start =
                    Offset(10.5f,4.0f), end = Offset(10.5f,11.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.6742f, 7.3258f)
                lineTo(12.3258f, 6.6742f)
                curveTo(12.4215f, 6.5785f, 12.5808f, 6.5808f, 12.6805f, 6.6805f)
                lineTo(13.0f, 7.0f)
                lineTo(14.0f, 6.5f)
                lineTo(13.5f, 7.5f)
                lineTo(13.8195f, 7.8195f)
                curveTo(13.9219f, 7.9219f, 13.923f, 8.077f, 13.8279f, 8.1721f)
                lineTo(12.5f, 9.5f)
                lineTo(11.0f, 9.5f)
                lineTo(10.75f, 11.0f)
                lineTo(10.25f, 11.0f)
                lineTo(10.0f, 9.5f)
                lineTo(8.5f, 9.5f)
                lineTo(7.1721f, 8.1721f)
                curveTo(7.0806f, 8.0806f, 7.0808f, 7.9192f, 7.1805f, 7.8195f)
                lineTo(7.5f, 7.5f)
                lineTo(7.0f, 6.5f)
                lineTo(8.0f, 7.0f)
                lineTo(8.3195f, 6.6805f)
                curveTo(8.4219f, 6.5781f, 8.578f, 6.578f, 8.6742f, 6.6742f)
                lineTo(9.3258f, 7.3258f)
                curveTo(9.4215f, 7.4215f, 9.4777f, 7.3886f, 9.4502f, 7.2512f)
                lineTo(9.0f, 5.0f)
                lineTo(10.0f, 5.5f)
                lineTo(10.5f, 4.0f)
                lineTo(11.0f, 5.5f)
                lineTo(12.0f, 5.0f)
                lineTo(11.5498f, 7.2512f)
                curveTo(11.5215f, 7.3926f, 11.578f, 7.422f, 11.6742f, 7.3258f)
                close()
            }
        }
        .build()
        return _ca!!
    }

private var _ca: ImageVector? = null
