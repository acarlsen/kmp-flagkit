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

val FlagIcons.GB_WLS: ImageVector
    get() {
        if (_gbWls != null) {
            return _gbWls!!
        }
        _gbWls = Builder(name = "GbWls", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 21.0f, viewportHeight = 15.0f).apply {
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
            path(fill = linearGradient(0.0f to Color(0xFF3ACC55), 1.0f to Color(0xFF28A940), start =
                    Offset(10.5f,7.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 7.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,7.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFE91C44), 1.0f to Color(0xFFD20F35), start =
                    Offset(10.23025f,1.8867f), end = Offset(10.23025f,12.0684f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.0663f, 11.3959f)
                lineTo(9.3025f, 11.1852f)
                lineTo(8.3452f, 10.7338f)
                lineTo(9.0f, 10.3668f)
                curveTo(9.0f, 10.3668f, 10.1035f, 11.2986f, 10.1035f, 11.0f)
                curveTo(10.1035f, 10.6791f, 11.1417f, 10.8195f, 11.1001f, 10.3668f)
                curveTo(11.0432f, 9.7475f, 9.9512f, 10.3214f, 9.7562f, 9.5472f)
                curveTo(9.6473f, 9.1148f, 9.3025f, 9.1699f, 9.3025f, 9.1699f)
                lineTo(8.2029f, 9.5472f)
                lineTo(7.6553f, 10.3668f)
                lineTo(7.3833f, 9.5472f)
                curveTo(7.3833f, 9.5472f, 6.7414f, 10.069f, 6.5278f, 10.3668f)
                curveTo(6.2996f, 10.6852f, 6.058f, 11.3959f, 6.058f, 11.3959f)
                lineTo(7.1796f, 11.8646f)
                lineTo(5.5439f, 11.5764f)
                lineTo(4.3505f, 11.8646f)
                lineTo(3.6178f, 12.0684f)
                lineTo(3.9396f, 11.7303f)
                lineTo(3.2833f, 11.3959f)
                lineTo(3.9396f, 11.0f)
                lineTo(3.6178f, 10.7338f)
                lineTo(5.0358f, 11.0f)
                curveTo(5.0358f, 11.0f, 5.554f, 10.9479f, 5.7499f, 10.7338f)
                curveTo(5.9969f, 10.4637f, 6.1909f, 9.5472f, 6.1909f, 9.5472f)
                lineTo(5.5439f, 9.1699f)
                lineTo(5.0358f, 10.0913f)
                curveTo(5.0358f, 10.0913f, 4.6852f, 9.2196f, 4.3505f, 8.7312f)
                curveTo(4.1011f, 8.3673f, 3.2833f, 7.5342f, 3.2833f, 7.5342f)
                lineTo(2.2288f, 8.0887f)
                lineTo(2.8168f, 6.9163f)
                curveTo(2.8168f, 6.9163f, 3.2833f, 6.5088f, 2.9869f, 6.0909f)
                curveTo(2.6906f, 5.6731f, 2.4417f, 4.7378f, 2.4417f, 4.7378f)
                curveTo(2.4417f, 4.7378f, 3.0596f, 5.8092f, 3.2833f, 5.7263f)
                curveTo(3.5998f, 5.6091f, 2.8888f, 4.6317f, 3.2833f, 4.4576f)
                curveTo(3.5672f, 4.3324f, 3.6178f, 5.5781f, 3.6178f, 5.5781f)
                lineTo(3.9396f, 4.9669f)
                lineTo(3.9396f, 5.7263f)
                curveTo(3.9396f, 5.7263f, 3.7527f, 6.6339f, 4.0703f, 7.1731f)
                curveTo(4.3879f, 7.7123f, 5.3309f, 8.0887f, 5.3309f, 8.0887f)
                curveTo(5.3309f, 8.0887f, 5.0856f, 7.5477f, 5.3309f, 6.5088f)
                curveTo(5.4969f, 5.8057f, 6.0875f, 4.606f, 6.3646f, 4.2216f)
                curveTo(6.5111f, 4.0185f, 5.1932f, 4.9669f, 5.1932f, 4.9669f)
                lineTo(5.1932f, 4.2216f)
                lineTo(3.9396f, 4.093f)
                lineTo(3.6178f, 4.4576f)
                lineTo(2.8168f, 3.1438f)
                lineTo(3.8135f, 3.645f)
                lineTo(5.3309f, 3.645f)
                lineTo(5.0358f, 3.2827f)
                lineTo(3.8135f, 3.2827f)
                curveTo(3.8135f, 3.2827f, 4.0703f, 2.7537f, 5.3309f, 2.7537f)
                lineTo(5.927f, 2.3486f)
                curveTo(5.927f, 2.3486f, 6.742f, 2.3719f, 7.2006f, 2.3893f)
                curveTo(7.6092f, 2.4049f, 8.3452f, 1.8867f, 8.3452f, 1.8867f)
                lineTo(8.5524f, 2.3893f)
                lineTo(8.0663f, 3.1438f)
                lineTo(8.5524f, 3.645f)
                lineTo(8.3452f, 3.9541f)
                lineTo(8.7017f, 4.4576f)
                lineTo(8.0663f, 4.4576f)
                lineTo(8.5524f, 5.2412f)
                lineTo(8.0663f, 4.9669f)
                lineTo(8.3452f, 5.7263f)
                lineTo(8.0663f, 6.5088f)
                lineTo(9.3025f, 6.0909f)
                curveTo(9.3025f, 6.0909f, 9.3025f, 4.9669f, 9.7562f, 4.4576f)
                curveTo(11.1418f, 3.0364f, 13.4012f, 1.8867f, 13.4012f, 1.8867f)
                curveTo(13.4012f, 1.8867f, 13.2816f, 2.9191f, 13.6158f, 3.0f)
                curveTo(14.1012f, 3.1175f, 16.2209f, 2.1495f, 16.2209f, 2.1495f)
                curveTo(16.2209f, 2.1495f, 14.9474f, 3.5204f, 15.2081f, 3.645f)
                curveTo(15.3486f, 3.7122f, 15.582f, 3.9541f, 15.582f, 3.9541f)
                curveTo(15.582f, 3.9541f, 14.4812f, 4.8539f, 14.2972f, 5.2412f)
                curveTo(14.1133f, 5.6285f, 14.5669f, 6.0909f, 14.5669f, 6.0909f)
                curveTo(14.5669f, 6.0909f, 13.6158f, 6.0909f, 13.142f, 6.5088f)
                curveTo(14.5669f, 6.5088f, 15.7325f, 7.1842f, 16.4224f, 6.6859f)
                curveTo(16.8847f, 6.352f, 14.7669f, 6.5604f, 15.0449f, 5.7263f)
                curveTo(15.1481f, 5.4168f, 15.4176f, 5.0585f, 16.0347f, 4.9669f)
                curveTo(16.6517f, 4.8754f, 16.8704f, 5.2412f, 16.8704f, 5.2412f)
                lineTo(17.2025f, 4.7378f)
                lineTo(16.2209f, 4.7378f)
                lineTo(18.0f, 3.0f)
                lineTo(18.2317f, 5.2412f)
                lineTo(17.6298f, 4.7378f)
                curveTo(17.6298f, 4.7378f, 17.36f, 5.5781f, 17.36f, 5.5781f)
                curveTo(18.0f, 7.5342f, 15.0449f, 7.95f, 15.0449f, 7.95f)
                lineTo(16.8704f, 9.1699f)
                lineTo(16.2209f, 9.3563f)
                lineTo(16.0347f, 11.1852f)
                lineTo(16.8704f, 11.8646f)
                lineTo(15.7719f, 11.5764f)
                lineTo(13.6158f, 12.0684f)
                lineTo(14.0448f, 11.3959f)
                lineTo(13.142f, 11.5764f)
                lineTo(13.745f, 11.0f)
                lineTo(13.142f, 10.7338f)
                lineTo(13.9128f, 10.5197f)
                lineTo(14.884f, 11.1852f)
                curveTo(14.884f, 11.1852f, 15.3644f, 10.5633f, 15.4176f, 10.2325f)
                curveTo(15.4724f, 9.8915f, 15.2081f, 9.1699f, 15.2081f, 9.1699f)
                curveTo(15.2081f, 9.1699f, 13.7774f, 9.1399f, 13.2727f, 9.0148f)
                curveTo(12.768f, 8.8897f, 12.4764f, 8.4928f, 12.4764f, 8.4928f)
                lineTo(11.9034f, 9.1699f)
                curveTo(11.9034f, 9.1699f, 13.9001f, 9.9181f, 13.4012f, 10.2325f)
                curveTo(13.2854f, 10.3056f, 12.7137f, 10.0913f, 12.7137f, 10.0913f)
                curveTo(12.7137f, 10.0913f, 11.7299f, 11.2418f, 11.1001f, 11.3959f)
                curveTo(10.8135f, 11.466f, 11.9034f, 11.8646f, 11.9034f, 11.8646f)
                curveTo(11.9034f, 11.8646f, 10.9728f, 11.7172f, 10.5f, 11.5764f)
                curveTo(10.0049f, 11.429f, 8.5524f, 11.8646f, 8.5524f, 11.8646f)
                lineTo(8.0663f, 11.3959f)
                close()
                moveTo(16.0865f, 6.0526f)
                curveTo(16.2246f, 6.0526f, 16.3365f, 5.9407f, 16.3365f, 5.8026f)
                curveTo(16.3365f, 5.6645f, 16.2246f, 5.5526f, 16.0865f, 5.5526f)
                curveTo(15.9485f, 5.5526f, 15.8365f, 5.6645f, 15.8365f, 5.8026f)
                curveTo(15.8365f, 5.9407f, 15.9485f, 6.0526f, 16.0865f, 6.0526f)
                close()
            }
        }
        .build()
        return _gbWls!!
    }

private var _gbWls: ImageVector? = null
