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

val FlagIcons.NA: ImageVector
    get() {
        if (_na != null) {
            return _na!!
        }
        _na = Builder(name = "Na", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 10.0039f)
                lineToRelative(21.0f, -10.0f)
                lineToRelative(-21.0f, 0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF0C4799), 1.0f to Color(0xFF05387E), start =
                    Offset(10.501499f,0.0038995743f), end = Offset(10.501499f,10.0039f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 10.0039f)
                lineToRelative(21.0f, -10.0f)
                lineToRelative(-21.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5015f, 4.5039f)
                lineToRelative(-0.7654f, 0.8478f)
                lineToRelative(0.0583f, -1.1407f)
                lineToRelative(-1.1407f, 0.0583f)
                lineToRelative(0.8478f, -0.7654f)
                lineToRelative(-0.8478f, -0.7654f)
                lineToRelative(1.1407f, 0.0583f)
                lineToRelative(-0.0583f, -1.1407f)
                lineToRelative(0.7654f, 0.8478f)
                lineToRelative(0.7654f, -0.8478f)
                lineToRelative(-0.0583f, 1.1407f)
                lineToRelative(1.1407f, -0.0583f)
                lineToRelative(-0.8478f, 0.7654f)
                lineToRelative(0.8478f, 0.7654f)
                lineToRelative(-1.1407f, -0.0583f)
                lineToRelative(0.0583f, 1.1407f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD243), 1.0f to Color(0xFFFFCD2F), start =
                    Offset(3.5015001f,1.6561f), end = Offset(3.5015001f,5.3517f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.5015f, 4.5039f)
                lineToRelative(-0.7654f, 0.8478f)
                lineToRelative(0.0583f, -1.1407f)
                lineToRelative(-1.1407f, 0.0583f)
                lineToRelative(0.8478f, -0.7654f)
                lineToRelative(-0.8478f, -0.7654f)
                lineToRelative(1.1407f, 0.0583f)
                lineToRelative(-0.0583f, -1.1407f)
                lineToRelative(0.7654f, 0.8478f)
                lineToRelative(0.7654f, -0.8478f)
                lineToRelative(-0.0583f, 1.1407f)
                lineToRelative(1.1407f, -0.0583f)
                lineToRelative(-0.8478f, 0.7654f)
                lineToRelative(0.8478f, 0.7654f)
                lineToRelative(-1.1407f, -0.0583f)
                lineToRelative(0.0583f, 1.1407f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 15.0039f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1BAC55), 1.0f to Color(0xFF149447), start =
                    Offset(10.501499f,5.0038996f), end = Offset(10.501499f,15.0039f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0015f, 15.0039f)
                lineToRelative(21.0f, 0.0f)
                lineToRelative(0.0f, -10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.3133f, 17.004f)
                lineToRelative(20.3162f, -12.695f)
                lineToRelative(-3.9398f, -6.305f)
                lineToRelative(-20.3163f, 12.695f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.50145f,-1.9959998f), end = Offset(10.50145f,17.004f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(2.3133f, 17.004f)
                lineToRelative(20.3162f, -12.695f)
                lineToRelative(-3.9398f, -6.305f)
                lineToRelative(-20.3163f, 12.695f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE52347), 1.0f to Color(0xFFD01739), start =
                    Offset(10.5015f,-2.3000002f), end = Offset(10.5015f,17.3079f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.4704f, 17.3079f)
                lineToRelative(24.5934f, -15.3677f)
                lineToRelative(-2.6496f, -4.2402f)
                lineToRelative(-24.5934f, 15.3677f)
                close()
            }
        }
        .build()
        return _na!!
    }

private var _na: ImageVector? = null
