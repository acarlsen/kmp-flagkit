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

val FlagIcons.TO: ImageVector
    get() {
        if (_to != null) {
            return _to!!
        }
        _to = Builder(name = "To", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFE20F1B), 1.0f to Color(0xFFC00711), start =
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
                    Offset(6.0f,0.0f), end = Offset(6.0f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDF101B), 1.0f to Color(0xFFC00711), start =
                    Offset(6.0f,1.0f), end = Offset(6.0f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(7.0f, 3.0f)
                lineTo(7.0f, 1.2578f)
                curveTo(7.0f, 1.1041f, 6.8902f, 1.0f, 6.7548f, 1.0f)
                lineTo(5.2452f, 1.0f)
                curveTo(5.1075f, 1.0f, 5.0f, 1.1154f, 5.0f, 1.2578f)
                lineTo(5.0f, 3.0f)
                lineTo(3.2578f, 3.0f)
                curveTo(3.1041f, 3.0f, 3.0f, 3.1098f, 3.0f, 3.2452f)
                lineTo(3.0f, 4.7548f)
                curveTo(3.0f, 4.8925f, 3.1154f, 5.0f, 3.2578f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 6.7422f)
                curveTo(5.0f, 6.8959f, 5.1098f, 7.0f, 5.2452f, 7.0f)
                lineTo(6.7548f, 7.0f)
                curveTo(6.8925f, 7.0f, 7.0f, 6.8846f, 7.0f, 6.7422f)
                lineTo(7.0f, 5.0f)
                lineTo(8.7422f, 5.0f)
                curveTo(8.8959f, 5.0f, 9.0f, 4.8902f, 9.0f, 4.7548f)
                lineTo(9.0f, 3.2452f)
                curveTo(9.0f, 3.1075f, 8.8846f, 3.0f, 8.7422f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _to!!
    }

private var _to: ImageVector? = null
