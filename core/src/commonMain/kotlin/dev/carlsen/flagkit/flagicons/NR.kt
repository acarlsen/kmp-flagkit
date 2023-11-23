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

val FlagIcons.NR: ImageVector
    get() {
        if (_nr != null) {
            return _nr!!
        }
        _nr = Builder(name = "Nr", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF0744A7), 1.0f to Color(0xFF00307D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFCC747), 1.0f to Color(0xFFFEC539), start =
                    Offset(10.5f,6.0f), end = Offset(10.5f,8.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 6.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(5.5f,8.6222f), end = Offset(5.5f,13.3776f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.5f, 12.25f)
                lineToRelative(-0.7725f, 1.1276f)
                lineToRelative(0.0378f, -1.3664f)
                lineToRelative(-1.2878f, 0.4582f)
                lineToRelative(0.8337f, -1.0832f)
                lineToRelative(-1.3112f, -0.3863f)
                lineToRelative(1.3112f, -0.3863f)
                lineToRelative(-0.8337f, -1.0832f)
                lineToRelative(1.2878f, 0.4582f)
                lineToRelative(-0.0378f, -1.3664f)
                lineToRelative(0.7725f, 1.1276f)
                lineToRelative(0.7725f, -1.1276f)
                lineToRelative(-0.0378f, 1.3664f)
                lineToRelative(1.2878f, -0.4582f)
                lineToRelative(-0.8337f, 1.0832f)
                lineToRelative(1.3112f, 0.3863f)
                lineToRelative(-1.3112f, 0.3863f)
                lineToRelative(0.8337f, 1.0832f)
                lineToRelative(-1.2878f, -0.4582f)
                lineToRelative(0.0378f, 1.3664f)
                close()
            }
        }
        .build()
        return _nr!!
    }

private var _nr: ImageVector? = null
