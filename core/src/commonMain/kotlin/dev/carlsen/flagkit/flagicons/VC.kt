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

val FlagIcons.VC: ImageVector
    get() {
        if (_vc != null) {
            return _vc!!
        }
        _vc = Builder(name = "Vc", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF08C47A), 1.0f to Color(0xFF009F60), start =
                    Offset(15.5f,0.0f), end = Offset(15.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0C87E1), 1.0f to Color(0xFF0073C7), start =
                    Offset(3.5f,0.0f), end = Offset(3.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD147), 1.0f to Color(0xFFFECA2F), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF00C778), 1.0f to Color(0xFF009F60), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,13.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(11.0f, 6.0f)
                lineTo(12.5f, 3.0f)
                lineTo(14.0f, 6.0f)
                lineTo(12.5f, 9.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(8.5f, 3.0f)
                lineTo(10.0f, 6.0f)
                lineTo(8.5f, 9.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(10.5f, 7.0f)
                lineTo(12.0f, 10.0f)
                lineTo(10.5f, 13.0f)
                lineTo(9.0f, 10.0f)
                close()
            }
        }
        .build()
        return _vc!!
    }

private var _vc: ImageVector? = null
