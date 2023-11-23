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

val FlagIcons.AW: ImageVector
    get() {
        if (_aw != null) {
            return _aw!!
        }
        _aw = Builder(name = "Aw", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF5098EA), 1.0f to Color(0xFF458BDB), start =
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
                    Offset(4.5f,1.399f), end = Offset(4.5f,7.601f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.803f, 4.9596f)
                curveTo(1.399f, 4.7864f, 1.399f, 4.2136f, 1.803f, 4.0404f)
                lineTo(3.3692f, 3.3692f)
                lineTo(4.0404f, 1.803f)
                curveTo(4.2136f, 1.399f, 4.7864f, 1.399f, 4.9596f, 1.803f)
                lineTo(5.6308f, 3.3692f)
                lineTo(7.197f, 4.0404f)
                curveTo(7.601f, 4.2136f, 7.601f, 4.7864f, 7.197f, 4.9596f)
                lineTo(5.6308f, 5.6308f)
                lineTo(4.9596f, 7.197f)
                curveTo(4.7864f, 7.601f, 4.2136f, 7.601f, 4.0404f, 7.197f)
                lineTo(3.3692f, 5.6308f)
                lineTo(1.803f, 4.9596f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE82045), 1.0f to Color(0xFFD01739), start =
                    Offset(4.5f,2.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.75f, 5.25f)
                lineToRelative(-1.75f, -0.75f)
                lineToRelative(1.75f, -0.75f)
                lineToRelative(0.75f, -1.75f)
                lineToRelative(0.75f, 1.75f)
                lineToRelative(1.75f, 0.75f)
                lineToRelative(-1.75f, 0.75f)
                lineToRelative(-0.75f, 1.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9D536)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9D536)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 9.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
        }
        .build()
        return _aw!!
    }

private var _aw: ImageVector? = null
