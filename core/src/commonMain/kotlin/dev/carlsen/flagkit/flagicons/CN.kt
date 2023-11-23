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

val FlagIcons.CN: ImageVector
    get() {
        if (_cn != null) {
            return _cn!!
        }
        _cn = Builder(name = "Cn", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFF1361D), 1.0f to Color(0xFFDF2910), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDC42), 1.0f to Color(0xFFFDD217), start =
                    Offset(8.781711f,1.1963917f), end = Offset(9.63879f,9.241009f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.1294f, 4.483f)
                lineTo(9.5f, 4.866f)
                lineTo(9.517f, 4.1294f)
                lineTo(9.134f, 3.5f)
                lineTo(9.8706f, 3.517f)
                lineTo(10.5f, 3.134f)
                lineTo(10.483f, 3.8706f)
                lineTo(10.866f, 4.5f)
                lineTo(10.1294f, 4.483f)
                close()
                moveTo(8.2808f, 2.4494f)
                lineTo(7.5545f, 2.3256f)
                lineTo(8.0506f, 1.7808f)
                lineTo(8.1744f, 1.0545f)
                lineTo(8.7192f, 1.5506f)
                lineTo(9.4455f, 1.6744f)
                lineTo(8.9494f, 2.2192f)
                lineTo(8.8256f, 2.9455f)
                lineTo(8.2808f, 2.4494f)
                close()
                moveTo(8.6462f, 8.9782f)
                lineTo(8.0305f, 9.3829f)
                lineTo(8.0218f, 8.6462f)
                lineTo(7.6171f, 8.0305f)
                lineTo(8.3538f, 8.0218f)
                lineTo(8.9695f, 7.6171f)
                lineTo(8.9782f, 8.3538f)
                lineTo(9.3829f, 8.9695f)
                lineTo(8.6462f, 8.9782f)
                close()
                moveTo(9.9132f, 6.9924f)
                lineTo(9.1808f, 7.0736f)
                lineTo(9.5076f, 6.4132f)
                lineTo(9.4264f, 5.6808f)
                lineTo(10.0868f, 6.0076f)
                lineTo(10.8192f, 5.9264f)
                lineTo(10.4924f, 6.5868f)
                lineTo(10.5736f, 7.3192f)
                lineTo(9.9132f, 6.9924f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFDC42), 1.0f to Color(0xFFFDD217), start =
                    Offset(4.9999995f,2.0000002f), end = Offset(4.9999995f,7.4271f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0f, 6.17f)
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
        return _cn!!
    }

private var _cn: ImageVector? = null
