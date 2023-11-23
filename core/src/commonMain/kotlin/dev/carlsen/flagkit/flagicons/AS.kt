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

val FlagIcons.AS: ImageVector
    get() {
        if (_as != null) {
            return _as!!
        }
        _as = Builder(name = "As", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF071585), 1.0f to Color(0xFF000B64), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFD32636), 1.0f to Color(0xFFBA1827), start =
                    Offset(11.0f,-0.5f), end = Offset(11.0f,15.5f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.5f)
                lineToRelative(-22.0f, -8.0f)
                lineToRelative(22.0f, -8.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(11.9631f,0.9277f), end = Offset(11.9631f,14.0723f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 0.9277f)
                lineToRelative(-18.0738f, 6.5723f)
                lineToRelative(18.0738f, 6.5723f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFAB5423), 1.0f to Color(0xFF5A3719), start =
                    Offset(16.5275f,3.0f), end = Offset(15.771488f,7.9022217f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(16.0f, 7.0385f)
                curveTo(15.8816f, 6.92f, 15.1942f, 7.1942f, 15.1942f, 7.1942f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 6.0f, 13.9384f, 5.337f, 14.5f, 5.0f)
                curveTo(14.9247f, 4.7452f, 15.7205f, 4.8398f, 16.499f, 4.5f)
                curveTo(17.746f, 3.9558f, 19.0f, 3.0f, 19.0f, 3.0f)
                lineTo(18.198f, 5.2056f)
                curveTo(18.198f, 5.2056f, 19.1166f, 5.6792f, 19.0f, 6.0f)
                curveTo(18.9662f, 6.093f, 18.0694f, 6.3846f, 18.0f, 6.5f)
                curveTo(17.8681f, 6.7193f, 18.524f, 6.7858f, 18.3198f, 7.0385f)
                curveTo(17.7328f, 7.765f, 17.0f, 8.5f, 17.0f, 8.5f)
                lineTo(16.0f, 8.0f)
                curveTo(16.0f, 8.0f, 16.1501f, 7.1886f, 16.0f, 7.0385f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFC322)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.5f, 7.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFFFC322)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 9.0f)
                lineTo(17.5f, 9.0f)
                curveTo(17.7761f, 9.0f, 18.0f, 8.7761f, 18.0f, 8.5f)
                curveTo(18.0f, 8.2239f, 17.7761f, 8.0f, 17.5f, 8.0f)
                lineTo(12.5f, 8.0f)
                curveTo(12.2239f, 8.0f, 12.0f, 8.2239f, 12.0f, 8.5f)
                curveTo(12.0f, 8.7761f, 12.2239f, 9.0f, 12.5f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFC322)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.197f, 10.4596f)
                lineTo(17.697f, 8.9596f)
                curveTo(17.9508f, 8.8508f, 18.0683f, 8.5569f, 17.9596f, 8.303f)
                curveTo(17.8508f, 8.0492f, 17.5569f, 7.9316f, 17.303f, 8.0404f)
                lineTo(13.803f, 9.5404f)
                curveTo(13.5492f, 9.6492f, 13.4317f, 9.9431f, 13.5404f, 10.197f)
                curveTo(13.6492f, 10.4508f, 13.9431f, 10.5683f, 14.197f, 10.4596f)
                close()
            }
        }
        .build()
        return _as!!
    }

private var _as: ImageVector? = null
