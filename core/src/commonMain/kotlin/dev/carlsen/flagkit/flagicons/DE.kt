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

val FlagIcons.DE: ImageVector
    get() {
        if (_de != null) {
            return _de!!
        }
        _de = Builder(name = "De", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF262626), 1.0f to Color(0xFF0D0D0D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF01515), 1.0f to Color(0xFFDE0000), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD521), 1.0f to Color(0xFFFFCF00), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
        }
        .build()
        return _de!!
    }

private var _de: ImageVector? = null
