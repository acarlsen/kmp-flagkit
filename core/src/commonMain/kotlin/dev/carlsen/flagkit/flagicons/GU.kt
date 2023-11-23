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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.GU: ImageVector
    get() {
        if (_gu != null) {
            return _gu!!
        }
        _gu = Builder(name = "Gu", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFDE3149), 1.0f to Color(0xFFC2273D), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF053B94), 1.0f to Color(0xFF002E7A), start =
                    Offset(10.5f,1.0f), end = Offset(10.5f,14.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(1.75f, 1.0f)
                lineTo(19.25f, 1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 20.0f, 1.75f)
                lineTo(20.0f, 13.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 19.25f, 14.0f)
                lineTo(1.75f, 14.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 13.25f)
                lineTo(1.0f, 1.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.75f, 1.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFDE3149), 1.0f to Color(0xFFC2273D), start =
                    Offset(10.5f,3.0f), end = Offset(10.5f,12.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 12.0f, 13.5f, 9.9853f, 13.5f, 7.5f)
                curveTo(13.5f, 5.0147f, 10.5f, 3.0f, 10.5f, 3.0f)
                curveTo(10.5f, 3.0f, 7.5f, 5.0147f, 7.5f, 7.5f)
                curveTo(7.5f, 9.9853f, 10.5f, 12.0f, 10.5f, 12.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,3.5f), end = Offset(10.5f,11.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 11.5f)
                curveTo(10.5f, 11.5f, 13.0f, 9.5f, 13.0f, 7.5f)
                curveTo(13.0f, 5.5f, 10.5f, 3.5f, 10.5f, 3.5f)
                curveTo(10.5f, 3.5f, 8.0f, 5.5f, 8.0f, 7.5f)
                curveTo(8.0f, 9.5f, 10.5f, 11.5f, 10.5f, 11.5f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF81C1F3), 1.0f to Color(0xFF6AB1E9),
                        start = Offset(10.5f,3.0f), end = Offset(10.5f,8.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 3.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(5.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF27A07E), 1.0f to Color(0xFF1F9171),
                        start = Offset(10.499901f,5.0f), end = Offset(10.499901f,7.7135f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.5f, 7.1f)
                    lineToRelative(-0.8817f, 0.6135f)
                    lineToRelative(0.311f, -1.0281f)
                    lineToRelative(-0.856f, -0.6489f)
                    lineToRelative(1.0739f, -0.0219f)
                    lineToRelative(0.3527f, -1.0146f)
                    lineToRelative(0.3527f, 1.0146f)
                    lineToRelative(1.0739f, 0.0219f)
                    lineToRelative(-0.856f, 0.6489f)
                    lineToRelative(0.311f, 1.0281f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF1E8CE8), 1.0f to Color(0xFF107FDC),
                        start = Offset(10.5f,8.0f), end = Offset(10.5f,12.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 8.0f)
                    horizontalLineToRelative(5.0f)
                    verticalLineToRelative(4.0f)
                    horizontalLineToRelative(-5.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFF048), 1.0f to Color(0xFFFFEF36),
                        start = Offset(10.5f,9.0f), end = Offset(10.5f,12.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(8.0f, 9.0f)
                    curveTo(8.0f, 9.0f, 9.5904f, 10.5f, 10.0f, 10.5f)
                    curveTo(10.4882f, 10.5f, 10.4958f, 9.7767f, 11.0f, 9.5f)
                    curveTo(11.7941f, 9.0641f, 13.0f, 9.0f, 13.0f, 9.0f)
                    lineTo(13.0f, 12.0f)
                    lineTo(8.0f, 12.0f)
                    lineTo(8.0f, 9.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF8F5715), 1.0f to Color(0xFF7A480D),
                        start = Offset(10.97935f,6.2374f), end = Offset(10.97935f,9.7856f)), stroke
                        = SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap =
                        Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(10.2513f, 6.475f)
                    curveTo(10.2424f, 6.5627f, 10.2294f, 6.7117f, 10.2163f, 6.8981f)
                    curveTo(10.2004f, 7.1252f, 10.189f, 7.3492f, 10.184f, 7.5594f)
                    curveTo(10.1731f, 8.0259f, 10.1935f, 8.3711f, 10.2628f, 8.5791f)
                    curveTo(10.3499f, 8.8403f, 10.5469f, 9.0855f, 10.8197f, 9.3206f)
                    curveTo(11.0281f, 9.5003f, 11.2348f, 9.6374f, 11.3772f, 9.7177f)
                    curveTo(11.4974f, 9.7856f, 11.6499f, 9.7431f, 11.7177f, 9.6228f)
                    curveTo(11.7856f, 9.5026f, 11.7431f, 9.3501f, 11.6228f, 9.2823f)
                    curveTo(11.5067f, 9.2167f, 11.3255f, 9.0965f, 11.1462f, 8.9419f)
                    curveTo(10.9355f, 8.7603f, 10.7899f, 8.5791f, 10.7372f, 8.4209f)
                    curveTo(10.6926f, 8.2871f, 10.6743f, 7.9789f, 10.6839f, 7.5712f)
                    curveTo(10.6886f, 7.3694f, 10.6997f, 7.153f, 10.7151f, 6.9331f)
                    curveTo(10.7277f, 6.7522f, 10.7404f, 6.608f, 10.7487f, 6.525f)
                    curveTo(10.7626f, 6.3876f, 10.6624f, 6.2651f, 10.525f, 6.2513f)
                    curveTo(10.3876f, 6.2374f, 10.2651f, 6.3376f, 10.2513f, 6.475f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                        strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(9.0f, 7.5f)
                    lineToRelative(1.0f, 1.5f)
                    lineToRelative(-1.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _gu!!
    }

private var _gu: ImageVector? = null
