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

val FlagIcons.FM: ImageVector
    get() {
        if (_fm != null) {
            return _fm!!
        }
        _fm = Builder(name = "Fm", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF95CEF5), 1.0f to Color(0xFF78B3DC), start =
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
                    Offset(10.5f,1.5f), end = Offset(10.5f,13.118f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 4.32f)
                lineTo(9.3244f, 5.118f)
                lineTo(9.7201f, 3.7534f)
                lineTo(8.5979f, 2.882f)
                lineTo(10.018f, 2.8366f)
                lineTo(10.5f, 1.5f)
                lineTo(10.982f, 2.8366f)
                lineTo(12.4021f, 2.882f)
                lineTo(11.2799f, 3.7534f)
                lineTo(11.6756f, 5.118f)
                lineTo(10.5f, 4.32f)
                close()
                moveTo(10.5f, 12.32f)
                lineTo(9.3244f, 13.118f)
                lineTo(9.7201f, 11.7534f)
                lineTo(8.5979f, 10.882f)
                lineTo(10.018f, 10.8366f)
                lineTo(10.5f, 9.5f)
                lineTo(10.982f, 10.8366f)
                lineTo(12.4021f, 10.882f)
                lineTo(11.2799f, 11.7534f)
                lineTo(11.6756f, 13.118f)
                lineTo(10.5f, 12.32f)
                close()
                moveTo(14.5f, 8.32f)
                lineTo(13.3244f, 9.118f)
                lineTo(13.7201f, 7.7534f)
                lineTo(12.5979f, 6.882f)
                lineTo(14.018f, 6.8366f)
                lineTo(14.5f, 5.5f)
                lineTo(14.982f, 6.8366f)
                lineTo(16.4021f, 6.882f)
                lineTo(15.2799f, 7.7534f)
                lineTo(15.6756f, 9.118f)
                lineTo(14.5f, 8.32f)
                close()
                moveTo(6.5f, 8.32f)
                lineTo(5.3244f, 9.118f)
                lineTo(5.7201f, 7.7534f)
                lineTo(4.5979f, 6.882f)
                lineTo(6.018f, 6.8366f)
                lineTo(6.5f, 5.5f)
                lineTo(6.982f, 6.8366f)
                lineTo(8.4021f, 6.882f)
                lineTo(7.2799f, 7.7534f)
                lineTo(7.6756f, 9.118f)
                lineTo(6.5f, 8.32f)
                close()
            }
        }
        .build()
        return _fm!!
    }

private var _fm: ImageVector? = null
