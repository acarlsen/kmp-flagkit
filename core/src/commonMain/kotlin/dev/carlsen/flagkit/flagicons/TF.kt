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

val FlagIcons.TF: ImageVector
    get() {
        if (_tf != null) {
            return _tf!!
        }
        _tf = Builder(name = "Tf", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF073AB6), 1.0f to Color(0xFF002B93), start =
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
                    Offset(4.75f,0.0f), end = Offset(4.75f,7.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineTo(9.5f, 0.0f)
                lineTo(9.5f, 7.2505f)
                curveTo(9.5f, 7.3883f, 9.3933f, 7.5f, 9.2459f, 7.5f)
                lineTo(0.0f, 7.5f)
                lineTo(0.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF44653), 1.0f to Color(0xFFEE2A39), start =
                    Offset(7.5f,0.0f), end = Offset(7.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1035BB), 1.0f to Color(0xFF042396), start =
                    Offset(1.5f,0.0f), end = Offset(1.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.5f,0.0f), end = Offset(4.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(17.5f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 7.5f)
                lineTo(17.0f, 7.5f)
                lineTo(16.5f, 8.5f)
                lineTo(16.0f, 8.5f)
                lineTo(16.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                lineTo(13.5f, 7.0f)
                lineTo(13.0f, 6.0f)
                close()
                moveTo(17.0f, 8.5f)
                lineTo(18.0f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(17.0f, 8.5f)
                close()
                moveTo(14.0f, 8.5f)
                lineTo(15.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(14.0f, 8.5f)
                close()
                moveTo(15.5f, 11.5f)
                lineTo(14.5f, 10.0f)
                lineTo(16.5f, 10.0f)
                lineTo(15.5f, 11.5f)
                close()
                moveTo(18.5f, 8.0f)
                curveTo(18.2239f, 8.0f, 18.0f, 7.7761f, 18.0f, 7.5f)
                curveTo(18.0f, 7.2239f, 18.2239f, 7.0f, 18.5f, 7.0f)
                curveTo(18.7761f, 7.0f, 19.0f, 7.2239f, 19.0f, 7.5f)
                curveTo(19.0f, 7.7761f, 18.7761f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(12.5f, 8.0f)
                curveTo(12.2239f, 8.0f, 12.0f, 7.7761f, 12.0f, 7.5f)
                curveTo(12.0f, 7.2239f, 12.2239f, 7.0f, 12.5f, 7.0f)
                curveTo(12.7761f, 7.0f, 13.0f, 7.2239f, 13.0f, 7.5f)
                curveTo(13.0f, 7.7761f, 12.7761f, 8.0f, 12.5f, 8.0f)
                close()
                moveTo(13.5f, 12.0f)
                curveTo(13.2239f, 12.0f, 13.0f, 11.7761f, 13.0f, 11.5f)
                curveTo(13.0f, 11.2239f, 13.2239f, 11.0f, 13.5f, 11.0f)
                curveTo(13.7761f, 11.0f, 14.0f, 11.2239f, 14.0f, 11.5f)
                curveTo(14.0f, 11.7761f, 13.7761f, 12.0f, 13.5f, 12.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.2239f, 12.0f, 17.0f, 11.7761f, 17.0f, 11.5f)
                curveTo(17.0f, 11.2239f, 17.2239f, 11.0f, 17.5f, 11.0f)
                curveTo(17.7761f, 11.0f, 18.0f, 11.2239f, 18.0f, 11.5f)
                curveTo(18.0f, 11.7761f, 17.7761f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(15.5f, 13.0f)
                curveTo(15.2239f, 13.0f, 15.0f, 12.7761f, 15.0f, 12.5f)
                curveTo(15.0f, 12.2239f, 15.2239f, 12.0f, 15.5f, 12.0f)
                curveTo(15.7761f, 12.0f, 16.0f, 12.2239f, 16.0f, 12.5f)
                curveTo(16.0f, 12.7761f, 15.7761f, 13.0f, 15.5f, 13.0f)
                close()
            }
        }
        .build()
        return _tf!!
    }

private var _tf: ImageVector? = null
