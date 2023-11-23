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

val FlagIcons.BF: ImageVector
    get() {
        if (_bf != null) {
            return _bf!!
        }
        _bf = Builder(name = "Bf", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF00B051), 1.0f to Color(0xFF009F49), start =
                    Offset(10.5f,8.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFA494B), 1.0f to Color(0xFFF02B2D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD216)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 9.17f)
                lineToRelative(-1.7634f, 1.2571f)
                lineToRelative(0.6506f, -2.0655f)
                lineToRelative(-1.7404f, -1.2886f)
                lineToRelative(2.1655f, -0.0195f)
                lineToRelative(0.6877f, -2.0535f)
                lineToRelative(0.6877f, 2.0535f)
                lineToRelative(2.1655f, 0.0195f)
                lineToRelative(-1.7404f, 1.2886f)
                lineToRelative(0.6506f, 2.0655f)
                close()
            }
        }
        .build()
        return _bf!!
    }

private var _bf: ImageVector? = null
