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

val FlagIcons.IR: ImageVector
    get() {
        if (_ir != null) {
            return _ir!!
        }
        _ir = Builder(name = "Ir", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF38BB56), 1.0f to Color(0xFF2B9F45), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,5.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDE1B27), 1.0f to Color(0xFFD80915), start =
                    Offset(10.5f,10.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,5.0f), end = Offset(10.5f,10.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    fillAlpha = 0.5f, strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.0f, 4.2523f)
                curveTo(1.0f, 4.113f, 1.107f, 4.0f, 1.2523f, 4.0f)
                lineTo(1.7477f, 4.0f)
                curveTo(1.887f, 4.0f, 2.0f, 4.107f, 2.0f, 4.2523f)
                lineTo(2.0f, 4.7477f)
                curveTo(2.0f, 4.887f, 1.893f, 5.0f, 1.7477f, 5.0f)
                lineTo(1.2523f, 5.0f)
                curveTo(1.113f, 5.0f, 1.0f, 4.893f, 1.0f, 4.7477f)
                lineTo(1.0f, 4.2523f)
                close()
                moveTo(3.0f, 4.2523f)
                curveTo(3.0f, 4.113f, 3.107f, 4.0f, 3.2523f, 4.0f)
                lineTo(3.7477f, 4.0f)
                curveTo(3.887f, 4.0f, 4.0f, 4.107f, 4.0f, 4.2523f)
                lineTo(4.0f, 4.7477f)
                curveTo(4.0f, 4.887f, 3.893f, 5.0f, 3.7477f, 5.0f)
                lineTo(3.2523f, 5.0f)
                curveTo(3.113f, 5.0f, 3.0f, 4.893f, 3.0f, 4.7477f)
                lineTo(3.0f, 4.2523f)
                close()
                moveTo(5.0f, 4.2523f)
                curveTo(5.0f, 4.113f, 5.107f, 4.0f, 5.2523f, 4.0f)
                lineTo(5.7477f, 4.0f)
                curveTo(5.887f, 4.0f, 6.0f, 4.107f, 6.0f, 4.2523f)
                lineTo(6.0f, 4.7477f)
                curveTo(6.0f, 4.887f, 5.893f, 5.0f, 5.7477f, 5.0f)
                lineTo(5.2523f, 5.0f)
                curveTo(5.113f, 5.0f, 5.0f, 4.893f, 5.0f, 4.7477f)
                lineTo(5.0f, 4.2523f)
                close()
                moveTo(7.0f, 4.2523f)
                curveTo(7.0f, 4.113f, 7.107f, 4.0f, 7.2523f, 4.0f)
                lineTo(7.7477f, 4.0f)
                curveTo(7.887f, 4.0f, 8.0f, 4.107f, 8.0f, 4.2523f)
                lineTo(8.0f, 4.7477f)
                curveTo(8.0f, 4.887f, 7.893f, 5.0f, 7.7477f, 5.0f)
                lineTo(7.2523f, 5.0f)
                curveTo(7.113f, 5.0f, 7.0f, 4.893f, 7.0f, 4.7477f)
                lineTo(7.0f, 4.2523f)
                close()
                moveTo(9.0f, 4.2523f)
                curveTo(9.0f, 4.113f, 9.107f, 4.0f, 9.2523f, 4.0f)
                lineTo(9.7477f, 4.0f)
                curveTo(9.887f, 4.0f, 10.0f, 4.107f, 10.0f, 4.2523f)
                lineTo(10.0f, 4.7477f)
                curveTo(10.0f, 4.887f, 9.893f, 5.0f, 9.7477f, 5.0f)
                lineTo(9.2523f, 5.0f)
                curveTo(9.113f, 5.0f, 9.0f, 4.893f, 9.0f, 4.7477f)
                lineTo(9.0f, 4.2523f)
                close()
                moveTo(11.0f, 4.2523f)
                curveTo(11.0f, 4.113f, 11.107f, 4.0f, 11.2523f, 4.0f)
                lineTo(11.7477f, 4.0f)
                curveTo(11.887f, 4.0f, 12.0f, 4.107f, 12.0f, 4.2523f)
                lineTo(12.0f, 4.7477f)
                curveTo(12.0f, 4.887f, 11.893f, 5.0f, 11.7477f, 5.0f)
                lineTo(11.2523f, 5.0f)
                curveTo(11.113f, 5.0f, 11.0f, 4.893f, 11.0f, 4.7477f)
                lineTo(11.0f, 4.2523f)
                close()
                moveTo(13.0f, 4.2523f)
                curveTo(13.0f, 4.113f, 13.107f, 4.0f, 13.2523f, 4.0f)
                lineTo(13.7477f, 4.0f)
                curveTo(13.887f, 4.0f, 14.0f, 4.107f, 14.0f, 4.2523f)
                lineTo(14.0f, 4.7477f)
                curveTo(14.0f, 4.887f, 13.893f, 5.0f, 13.7477f, 5.0f)
                lineTo(13.2523f, 5.0f)
                curveTo(13.113f, 5.0f, 13.0f, 4.893f, 13.0f, 4.7477f)
                lineTo(13.0f, 4.2523f)
                close()
                moveTo(15.0f, 4.2523f)
                curveTo(15.0f, 4.113f, 15.107f, 4.0f, 15.2523f, 4.0f)
                lineTo(15.7477f, 4.0f)
                curveTo(15.887f, 4.0f, 16.0f, 4.107f, 16.0f, 4.2523f)
                lineTo(16.0f, 4.7477f)
                curveTo(16.0f, 4.887f, 15.893f, 5.0f, 15.7477f, 5.0f)
                lineTo(15.2523f, 5.0f)
                curveTo(15.113f, 5.0f, 15.0f, 4.893f, 15.0f, 4.7477f)
                lineTo(15.0f, 4.2523f)
                close()
                moveTo(17.0f, 4.2523f)
                curveTo(17.0f, 4.113f, 17.107f, 4.0f, 17.2523f, 4.0f)
                lineTo(17.7477f, 4.0f)
                curveTo(17.887f, 4.0f, 18.0f, 4.107f, 18.0f, 4.2523f)
                lineTo(18.0f, 4.7477f)
                curveTo(18.0f, 4.887f, 17.893f, 5.0f, 17.7477f, 5.0f)
                lineTo(17.2523f, 5.0f)
                curveTo(17.113f, 5.0f, 17.0f, 4.893f, 17.0f, 4.7477f)
                lineTo(17.0f, 4.2523f)
                close()
                moveTo(19.0f, 4.2523f)
                curveTo(19.0f, 4.113f, 19.107f, 4.0f, 19.2523f, 4.0f)
                lineTo(19.7477f, 4.0f)
                curveTo(19.887f, 4.0f, 20.0f, 4.107f, 20.0f, 4.2523f)
                lineTo(20.0f, 4.7477f)
                curveTo(20.0f, 4.887f, 19.893f, 5.0f, 19.7477f, 5.0f)
                lineTo(19.2523f, 5.0f)
                curveTo(19.113f, 5.0f, 19.0f, 4.893f, 19.0f, 4.7477f)
                lineTo(19.0f, 4.2523f)
                close()
                moveTo(1.0f, 10.2523f)
                curveTo(1.0f, 10.113f, 1.107f, 10.0f, 1.2523f, 10.0f)
                lineTo(1.7477f, 10.0f)
                curveTo(1.887f, 10.0f, 2.0f, 10.107f, 2.0f, 10.2523f)
                lineTo(2.0f, 10.7477f)
                curveTo(2.0f, 10.887f, 1.893f, 11.0f, 1.7477f, 11.0f)
                lineTo(1.2523f, 11.0f)
                curveTo(1.113f, 11.0f, 1.0f, 10.893f, 1.0f, 10.7477f)
                lineTo(1.0f, 10.2523f)
                close()
                moveTo(3.0f, 10.2523f)
                curveTo(3.0f, 10.113f, 3.107f, 10.0f, 3.2523f, 10.0f)
                lineTo(3.7477f, 10.0f)
                curveTo(3.887f, 10.0f, 4.0f, 10.107f, 4.0f, 10.2523f)
                lineTo(4.0f, 10.7477f)
                curveTo(4.0f, 10.887f, 3.893f, 11.0f, 3.7477f, 11.0f)
                lineTo(3.2523f, 11.0f)
                curveTo(3.113f, 11.0f, 3.0f, 10.893f, 3.0f, 10.7477f)
                lineTo(3.0f, 10.2523f)
                close()
                moveTo(5.0f, 10.2523f)
                curveTo(5.0f, 10.113f, 5.107f, 10.0f, 5.2523f, 10.0f)
                lineTo(5.7477f, 10.0f)
                curveTo(5.887f, 10.0f, 6.0f, 10.107f, 6.0f, 10.2523f)
                lineTo(6.0f, 10.7477f)
                curveTo(6.0f, 10.887f, 5.893f, 11.0f, 5.7477f, 11.0f)
                lineTo(5.2523f, 11.0f)
                curveTo(5.113f, 11.0f, 5.0f, 10.893f, 5.0f, 10.7477f)
                lineTo(5.0f, 10.2523f)
                close()
                moveTo(7.0f, 10.2523f)
                curveTo(7.0f, 10.113f, 7.107f, 10.0f, 7.2523f, 10.0f)
                lineTo(7.7477f, 10.0f)
                curveTo(7.887f, 10.0f, 8.0f, 10.107f, 8.0f, 10.2523f)
                lineTo(8.0f, 10.7477f)
                curveTo(8.0f, 10.887f, 7.893f, 11.0f, 7.7477f, 11.0f)
                lineTo(7.2523f, 11.0f)
                curveTo(7.113f, 11.0f, 7.0f, 10.893f, 7.0f, 10.7477f)
                lineTo(7.0f, 10.2523f)
                close()
                moveTo(9.0f, 10.2523f)
                curveTo(9.0f, 10.113f, 9.107f, 10.0f, 9.2523f, 10.0f)
                lineTo(9.7477f, 10.0f)
                curveTo(9.887f, 10.0f, 10.0f, 10.107f, 10.0f, 10.2523f)
                lineTo(10.0f, 10.7477f)
                curveTo(10.0f, 10.887f, 9.893f, 11.0f, 9.7477f, 11.0f)
                lineTo(9.2523f, 11.0f)
                curveTo(9.113f, 11.0f, 9.0f, 10.893f, 9.0f, 10.7477f)
                lineTo(9.0f, 10.2523f)
                close()
                moveTo(11.0f, 10.2523f)
                curveTo(11.0f, 10.113f, 11.107f, 10.0f, 11.2523f, 10.0f)
                lineTo(11.7477f, 10.0f)
                curveTo(11.887f, 10.0f, 12.0f, 10.107f, 12.0f, 10.2523f)
                lineTo(12.0f, 10.7477f)
                curveTo(12.0f, 10.887f, 11.893f, 11.0f, 11.7477f, 11.0f)
                lineTo(11.2523f, 11.0f)
                curveTo(11.113f, 11.0f, 11.0f, 10.893f, 11.0f, 10.7477f)
                lineTo(11.0f, 10.2523f)
                close()
                moveTo(13.0f, 10.2523f)
                curveTo(13.0f, 10.113f, 13.107f, 10.0f, 13.2523f, 10.0f)
                lineTo(13.7477f, 10.0f)
                curveTo(13.887f, 10.0f, 14.0f, 10.107f, 14.0f, 10.2523f)
                lineTo(14.0f, 10.7477f)
                curveTo(14.0f, 10.887f, 13.893f, 11.0f, 13.7477f, 11.0f)
                lineTo(13.2523f, 11.0f)
                curveTo(13.113f, 11.0f, 13.0f, 10.893f, 13.0f, 10.7477f)
                lineTo(13.0f, 10.2523f)
                close()
                moveTo(15.0f, 10.2523f)
                curveTo(15.0f, 10.113f, 15.107f, 10.0f, 15.2523f, 10.0f)
                lineTo(15.7477f, 10.0f)
                curveTo(15.887f, 10.0f, 16.0f, 10.107f, 16.0f, 10.2523f)
                lineTo(16.0f, 10.7477f)
                curveTo(16.0f, 10.887f, 15.893f, 11.0f, 15.7477f, 11.0f)
                lineTo(15.2523f, 11.0f)
                curveTo(15.113f, 11.0f, 15.0f, 10.893f, 15.0f, 10.7477f)
                lineTo(15.0f, 10.2523f)
                close()
                moveTo(17.0f, 10.2523f)
                curveTo(17.0f, 10.113f, 17.107f, 10.0f, 17.2523f, 10.0f)
                lineTo(17.7477f, 10.0f)
                curveTo(17.887f, 10.0f, 18.0f, 10.107f, 18.0f, 10.2523f)
                lineTo(18.0f, 10.7477f)
                curveTo(18.0f, 10.887f, 17.893f, 11.0f, 17.7477f, 11.0f)
                lineTo(17.2523f, 11.0f)
                curveTo(17.113f, 11.0f, 17.0f, 10.893f, 17.0f, 10.7477f)
                lineTo(17.0f, 10.2523f)
                close()
                moveTo(19.0f, 10.2523f)
                curveTo(19.0f, 10.113f, 19.107f, 10.0f, 19.2523f, 10.0f)
                lineTo(19.7477f, 10.0f)
                curveTo(19.887f, 10.0f, 20.0f, 10.107f, 20.0f, 10.2523f)
                lineTo(20.0f, 10.7477f)
                curveTo(20.0f, 10.887f, 19.893f, 11.0f, 19.7477f, 11.0f)
                lineTo(19.2523f, 11.0f)
                curveTo(19.113f, 11.0f, 19.0f, 10.893f, 19.0f, 10.7477f)
                lineTo(19.0f, 10.2523f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFD80915)),
                    strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.5913f, 6.6416f)
                curveTo(9.3741f, 6.8713f, 9.25f, 7.1754f, 9.25f, 7.5f)
                curveTo(9.25f, 8.1904f, 9.8096f, 8.75f, 10.5f, 8.75f)
                curveTo(11.1904f, 8.75f, 11.75f, 8.1904f, 11.75f, 7.5f)
                curveTo(11.75f, 7.1822f, 11.631f, 6.8838f, 11.4218f, 6.6557f)
                lineTo(9.5913f, 6.6416f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD80915)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 7.0f)
                lineTo(10.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 7.5f)
                lineTo(11.0f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 9.0f)
                lineTo(10.5f, 9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 8.5f)
                lineTo(10.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 7.0f)
                close()
            }
        }
        .build()
        return _ir!!
    }

private var _ir: ImageVector? = null
