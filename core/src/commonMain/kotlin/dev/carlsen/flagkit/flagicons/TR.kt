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

val FlagIcons.TR: ImageVector
    get() {
        if (_tr != null) {
            return _tr!!
        }
        _tr = Builder(name = "Tr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE92434), 1.0f to Color(0xFFE11324), start =
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
                    Offset(10.37055f,3.0f), end = Offset(10.37055f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0521f, 4.7369f)
                curveTo(12.4166f, 4.2751f, 11.6177f, 4.0f, 10.75f, 4.0f)
                curveTo(8.6789f, 4.0f, 7.0f, 5.567f, 7.0f, 7.5f)
                curveTo(7.0f, 9.433f, 8.6789f, 11.0f, 10.75f, 11.0f)
                curveTo(11.6177f, 11.0f, 12.4166f, 10.7249f, 13.0521f, 10.2631f)
                curveTo(12.2286f, 11.3201f, 10.9437f, 12.0f, 9.5f, 12.0f)
                curveTo(7.0147f, 12.0f, 5.0f, 9.9853f, 5.0f, 7.5f)
                curveTo(5.0f, 5.0147f, 7.0147f, 3.0f, 9.5f, 3.0f)
                curveTo(10.9437f, 3.0f, 12.2286f, 3.6799f, 13.0521f, 4.7369f)
                close()
                moveTo(14.2656f, 8.0763f)
                lineTo(13.347f, 9.19f)
                lineTo(13.4096f, 7.7477f)
                lineTo(12.0665f, 7.2182f)
                lineTo(13.4576f, 6.832f)
                lineTo(13.5461f, 5.391f)
                lineTo(14.3433f, 6.5947f)
                lineTo(15.7411f, 6.2336f)
                lineTo(14.8427f, 7.3637f)
                lineTo(15.6181f, 8.5815f)
                lineTo(14.2656f, 8.0763f)
                close()
            }
        }
        .build()
        return _tr!!
    }

private var _tr: ImageVector? = null
