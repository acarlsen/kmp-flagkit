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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.carlsen.flagkit.FlagIcons

val FlagIcons.NP: ImageVector
    get() {
        if (_np != null) {
            return _np!!
        }
        _np = Builder(name = "Np", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
                21.0f, viewportHeight = 15.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(6.8315f,0.0f), end = Offset(6.8315f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                lineTo(1.4953f, 0.0f)
                curveTo(1.774f, 0.0f, 2.1885f, 0.1257f, 2.4131f, 0.2754f)
                lineTo(13.1752f, 7.4501f)
                curveTo(13.6307f, 7.7538f, 13.547f, 8.0f, 13.003f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(13.2474f, 14.3415f)
                curveTo(13.663f, 14.7052f, 13.5501f, 15.0f, 12.9932f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 0.0f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFEE1B44), 1.0f to Color(0xFFDD153C),
                        0.0f to Color(0xFF0543A8), 1.0f to Color(0xFF003893), start =
                        Offset(6.8315f,0.0f), end = Offset(6.8315f,15.0f)), stroke =
                        SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(0.0f, 0.0f)
                    lineTo(1.4953f, 0.0f)
                    curveTo(1.774f, 0.0f, 2.1885f, 0.1257f, 2.4131f, 0.2754f)
                    lineTo(13.1752f, 7.4501f)
                    curveTo(13.6307f, 7.7538f, 13.547f, 8.0f, 13.003f, 8.0f)
                    lineTo(6.0f, 8.0f)
                    lineTo(13.2474f, 14.3415f)
                    curveTo(13.663f, 14.7052f, 13.5501f, 15.0f, 12.9932f, 15.0f)
                    lineTo(0.0f, 15.0f)
                    lineTo(0.0f, 0.0f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(3.9984498f,4.1142f), end = Offset(3.9984498f,12.8478f)),
                        stroke = SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.1383f, 5.8506f)
                    curveTo(5.4264f, 5.7716f, 5.692f, 5.6636f, 5.9269f, 5.5321f)
                    curveTo(5.6939f, 6.3784f, 4.9188f, 7.0f, 3.9984f, 7.0f)
                    curveTo(3.0781f, 7.0f, 2.303f, 6.3784f, 2.07f, 5.5321f)
                    curveTo(2.3055f, 5.664f, 2.572f, 5.7722f, 2.861f, 5.8512f)
                    lineTo(3.25f, 5.5f)
                    lineTo(2.6142f, 4.926f)
                    lineTo(3.4697f, 4.9697f)
                    lineTo(3.426f, 4.1142f)
                    lineTo(4.0f, 4.75f)
                    lineTo(4.574f, 4.1142f)
                    lineTo(4.5303f, 4.9697f)
                    lineTo(5.3858f, 4.926f)
                    lineTo(4.75f, 5.5f)
                    lineTo(5.1383f, 5.8506f)
                    lineTo(5.1383f, 5.8506f)
                    close()
                    moveTo(4.0f, 12.0f)
                    lineTo(3.2346f, 12.8478f)
                    lineTo(3.2929f, 11.7071f)
                    lineTo(2.1522f, 11.7654f)
                    lineTo(3.0f, 11.0f)
                    lineTo(2.1522f, 10.2346f)
                    lineTo(3.2929f, 10.2929f)
                    lineTo(3.2346f, 9.1522f)
                    lineTo(4.0f, 10.0f)
                    lineTo(4.7654f, 9.1522f)
                    lineTo(4.7071f, 10.2929f)
                    lineTo(5.8478f, 10.2346f)
                    lineTo(5.0f, 11.0f)
                    lineTo(5.8478f, 11.7654f)
                    lineTo(4.7071f, 11.7071f)
                    lineTo(4.7654f, 12.8478f)
                    lineTo(4.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _np!!
    }

private var _np: ImageVector? = null
