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

val FlagIcons.TN: ImageVector
    get() {
        if (_tn != null) {
            return _tn!!
        }
        _tn = Builder(name = "Tn", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
                    Offset(10.5f,3.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.8584f, 4.2734f)
                curveTo(11.4407f, 4.0973f, 10.9817f, 4.0f, 10.5f, 4.0f)
                curveTo(8.567f, 4.0f, 7.0f, 5.567f, 7.0f, 7.5f)
                curveTo(7.0f, 9.433f, 8.567f, 11.0f, 10.5f, 11.0f)
                curveTo(10.9817f, 11.0f, 11.4407f, 10.9027f, 11.8584f, 10.7266f)
                curveTo(10.2481f, 10.5332f, 9.0f, 9.1624f, 9.0f, 7.5f)
                curveTo(9.0f, 5.8376f, 10.2481f, 4.4668f, 11.8584f, 4.2734f)
                lineTo(11.8584f, 4.2734f)
                close()
                moveTo(10.5f, 12.0f)
                curveTo(8.0147f, 12.0f, 6.0f, 9.9853f, 6.0f, 7.5f)
                curveTo(6.0f, 5.0147f, 8.0147f, 3.0f, 10.5f, 3.0f)
                curveTo(12.9853f, 3.0f, 15.0f, 5.0147f, 15.0f, 7.5f)
                curveTo(15.0f, 9.9853f, 12.9853f, 12.0f, 10.5f, 12.0f)
                close()
                moveTo(12.2656f, 8.3776f)
                lineTo(13.6181f, 8.8828f)
                lineTo(12.8427f, 7.665f)
                lineTo(13.7411f, 6.5349f)
                lineTo(12.3433f, 6.896f)
                lineTo(11.5461f, 5.6923f)
                lineTo(11.4576f, 7.1333f)
                lineTo(10.0665f, 7.5195f)
                lineTo(11.4096f, 8.049f)
                lineTo(11.347f, 9.4913f)
                lineTo(12.2656f, 8.3776f)
                close()
            }
        }
        .build()
        return _tn!!
    }

private var _tn: ImageVector? = null
