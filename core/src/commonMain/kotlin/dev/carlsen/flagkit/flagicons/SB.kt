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

val FlagIcons.SB: ImageVector
    get() {
        if (_sb != null) {
            return _sb!!
        }
        _sb = Builder(name = "Sb", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(7.42f,3.56f), end = Offset(7.42f,6.56f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.92f, 5.8123f)
                curveTo(5.92f, 5.673f, 5.9981f, 5.4819f, 6.1005f, 5.3795f)
                lineTo(6.2395f, 5.2405f)
                curveTo(6.3392f, 5.1408f, 6.3419f, 4.9819f, 6.2395f, 4.8795f)
                lineTo(6.1005f, 4.7405f)
                curveTo(6.0008f, 4.6408f, 5.92f, 4.453f, 5.92f, 4.3077f)
                lineTo(5.92f, 3.8123f)
                curveTo(5.92f, 3.673f, 6.027f, 3.56f, 6.1723f, 3.56f)
                lineTo(6.6677f, 3.56f)
                curveTo(6.807f, 3.56f, 6.92f, 3.667f, 6.92f, 3.8123f)
                lineTo(6.92f, 4.3077f)
                curveTo(6.92f, 4.447f, 6.9661f, 4.4677f, 7.036f, 4.3281f)
                lineTo(7.304f, 3.7919f)
                curveTo(7.3681f, 3.6638f, 7.5377f, 3.56f, 7.6677f, 3.56f)
                lineTo(8.6723f, 3.56f)
                curveTo(8.8091f, 3.56f, 8.92f, 3.676f, 8.92f, 3.81f)
                lineTo(8.92f, 3.81f)
                curveTo(8.92f, 3.9481f, 8.813f, 4.06f, 8.6677f, 4.06f)
                lineTo(8.1723f, 4.06f)
                curveTo(8.033f, 4.06f, 7.92f, 4.176f, 7.92f, 4.31f)
                lineTo(7.92f, 4.31f)
                curveTo(7.92f, 4.4481f, 8.027f, 4.56f, 8.1723f, 4.56f)
                lineTo(8.6677f, 4.56f)
                curveTo(8.807f, 4.56f, 8.92f, 4.6675f, 8.92f, 4.8052f)
                lineTo(8.92f, 6.3148f)
                curveTo(8.92f, 6.4502f, 8.813f, 6.56f, 8.6677f, 6.56f)
                lineTo(8.1723f, 6.56f)
                curveTo(8.033f, 6.56f, 7.92f, 6.453f, 7.92f, 6.3077f)
                lineTo(7.92f, 5.8123f)
                curveTo(7.92f, 5.673f, 8.036f, 5.56f, 8.17f, 5.56f)
                lineTo(8.17f, 5.56f)
                curveTo(8.3081f, 5.56f, 8.42f, 5.444f, 8.42f, 5.31f)
                lineTo(8.42f, 5.31f)
                curveTo(8.42f, 5.1719f, 8.313f, 5.06f, 8.1677f, 5.06f)
                lineTo(7.6723f, 5.06f)
                curveTo(7.533f, 5.06f, 7.42f, 5.1777f, 7.42f, 5.3077f)
                lineTo(7.42f, 6.3123f)
                curveTo(7.42f, 6.4491f, 7.304f, 6.56f, 7.17f, 6.56f)
                lineTo(7.17f, 6.56f)
                curveTo(7.0319f, 6.56f, 6.92f, 6.453f, 6.92f, 6.3077f)
                lineTo(6.92f, 5.8123f)
                curveTo(6.92f, 5.673f, 6.804f, 5.56f, 6.67f, 5.56f)
                lineTo(6.67f, 5.56f)
                curveTo(6.5319f, 5.56f, 6.42f, 5.667f, 6.42f, 5.8123f)
                lineTo(6.42f, 6.3077f)
                curveTo(6.42f, 6.447f, 6.304f, 6.56f, 6.17f, 6.56f)
                lineTo(6.17f, 6.56f)
                curveTo(6.0319f, 6.56f, 5.92f, 6.453f, 5.92f, 6.3077f)
                lineTo(5.92f, 5.8123f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1DBE4F), 1.0f to Color(0xFF159B3F), start =
                    Offset(10.5002f,-0.0027f), end = Offset(10.5002f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0E-4f, -0.0027f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0660D4), 1.0f to Color(0xFF0051BB), start =
                    Offset(10.5002f,-0.0027f), end = Offset(10.5002f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.0E-4f, -0.0027f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(-21.0f, 15.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2C7442), 1.0f to Color(0xFF225B34), start =
                    Offset(10.5002f,-0.0027f), end = Offset(10.5002f,14.9973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(21.0002f, -0.0027f)
                lineToRelative(-21.0f, 15.0f)
                lineToRelative(21.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD646), 1.0f to Color(0xFFFED02F), start =
                    Offset(10.5002f,6.4973f), end = Offset(10.5002f,8.4973f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-3.9998f, 6.4973f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-29.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.2502f, 2.8723f)
                lineTo(1.5155f, 3.2586f)
                lineTo(1.6558f, 2.4405f)
                lineTo(1.0614f, 1.8611f)
                lineTo(1.8829f, 1.7417f)
                lineTo(2.2502f, 0.9973f)
                lineTo(2.6176f, 1.7417f)
                lineTo(3.4391f, 1.8611f)
                lineTo(2.8446f, 2.4405f)
                lineTo(2.985f, 3.2586f)
                lineTo(2.2502f, 2.8723f)
                close()
                moveTo(7.2502f, 2.8723f)
                lineTo(6.5155f, 3.2586f)
                lineTo(6.6558f, 2.4405f)
                lineTo(6.0614f, 1.8611f)
                lineTo(6.8829f, 1.7417f)
                lineTo(7.2502f, 0.9973f)
                lineTo(7.6176f, 1.7417f)
                lineTo(8.4391f, 1.8611f)
                lineTo(7.8446f, 2.4405f)
                lineTo(7.985f, 3.2586f)
                lineTo(7.2502f, 2.8723f)
                close()
                moveTo(7.2502f, 5.8723f)
                lineTo(6.5155f, 6.2586f)
                lineTo(6.6558f, 5.4405f)
                lineTo(6.0614f, 4.8611f)
                lineTo(6.8829f, 4.7417f)
                lineTo(7.2502f, 3.9973f)
                lineTo(7.6176f, 4.7417f)
                lineTo(8.4391f, 4.8611f)
                lineTo(7.8446f, 5.4405f)
                lineTo(7.985f, 6.2586f)
                lineTo(7.2502f, 5.8723f)
                close()
                moveTo(2.2502f, 5.8723f)
                lineTo(1.5155f, 6.2586f)
                lineTo(1.6558f, 5.4405f)
                lineTo(1.0614f, 4.8611f)
                lineTo(1.8829f, 4.7417f)
                lineTo(2.2502f, 3.9973f)
                lineTo(2.6176f, 4.7417f)
                lineTo(3.4391f, 4.8611f)
                lineTo(2.8446f, 5.4405f)
                lineTo(2.985f, 6.2586f)
                lineTo(2.2502f, 5.8723f)
                close()
                moveTo(4.7502f, 4.3723f)
                lineTo(4.0155f, 4.7586f)
                lineTo(4.1558f, 3.9405f)
                lineTo(3.5614f, 3.3611f)
                lineTo(4.3829f, 3.2417f)
                lineTo(4.7502f, 2.4973f)
                lineTo(5.1176f, 3.2417f)
                lineTo(5.9391f, 3.3611f)
                lineTo(5.3446f, 3.9405f)
                lineTo(5.485f, 4.7586f)
                lineTo(4.7502f, 4.3723f)
                close()
            }
        }
        .build()
        return _sb!!
    }

private var _sb: ImageVector? = null
