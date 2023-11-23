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

val FlagIcons.EU: ImageVector
    get() {
        if (_eu != null) {
            return _eu!!
        }
        _eu = Builder(name = "Eu", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF043CAE), 1.0f to Color(0xFF00339A), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-21.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFD429), 1.0f to Color(0xFFFFCC00), start =
                    Offset(10.5f,1.7929f), end = Offset(10.5f,13.2071f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.5f, 3.0f)
                lineTo(9.7929f, 3.2071f)
                lineTo(10.0f, 2.5f)
                lineTo(9.7929f, 1.7929f)
                lineTo(10.5f, 2.0f)
                lineTo(11.2071f, 1.7929f)
                lineTo(11.0f, 2.5f)
                lineTo(11.2071f, 3.2071f)
                lineTo(10.5f, 3.0f)
                close()
                moveTo(10.5f, 13.0f)
                lineTo(9.7929f, 13.2071f)
                lineTo(10.0f, 12.5f)
                lineTo(9.7929f, 11.7929f)
                lineTo(10.5f, 12.0f)
                lineTo(11.2071f, 11.7929f)
                lineTo(11.0f, 12.5f)
                lineTo(11.2071f, 13.2071f)
                lineTo(10.5f, 13.0f)
                close()
                moveTo(15.5f, 8.0f)
                lineTo(14.7929f, 8.2071f)
                lineTo(15.0f, 7.5f)
                lineTo(14.7929f, 6.7929f)
                lineTo(15.5f, 7.0f)
                lineTo(16.2071f, 6.7929f)
                lineTo(16.0f, 7.5f)
                lineTo(16.2071f, 8.2071f)
                lineTo(15.5f, 8.0f)
                close()
                moveTo(5.5f, 8.0f)
                lineTo(4.7929f, 8.2071f)
                lineTo(5.0f, 7.5f)
                lineTo(4.7929f, 6.7929f)
                lineTo(5.5f, 7.0f)
                lineTo(6.2071f, 6.7929f)
                lineTo(6.0f, 7.5f)
                lineTo(6.2071f, 8.2071f)
                lineTo(5.5f, 8.0f)
                close()
                moveTo(14.8301f, 5.5f)
                lineTo(14.123f, 5.7071f)
                lineTo(14.3301f, 5.0f)
                lineTo(14.123f, 4.2929f)
                lineTo(14.8301f, 4.5f)
                lineTo(15.5372f, 4.2929f)
                lineTo(15.3301f, 5.0f)
                lineTo(15.5372f, 5.7071f)
                lineTo(14.8301f, 5.5f)
                close()
                moveTo(6.1699f, 10.5f)
                lineTo(5.4628f, 10.7071f)
                lineTo(5.6699f, 10.0f)
                lineTo(5.4628f, 9.2929f)
                lineTo(6.1699f, 9.5f)
                lineTo(6.877f, 9.2929f)
                lineTo(6.6699f, 10.0f)
                lineTo(6.877f, 10.7071f)
                lineTo(6.1699f, 10.5f)
                close()
                moveTo(13.0f, 3.6699f)
                lineTo(12.2929f, 3.877f)
                lineTo(12.5f, 3.1699f)
                lineTo(12.2929f, 2.4628f)
                lineTo(13.0f, 2.6699f)
                lineTo(13.7071f, 2.4628f)
                lineTo(13.5f, 3.1699f)
                lineTo(13.7071f, 3.877f)
                lineTo(13.0f, 3.6699f)
                close()
                moveTo(8.0f, 12.3301f)
                lineTo(7.2929f, 12.5372f)
                lineTo(7.5f, 11.8301f)
                lineTo(7.2929f, 11.123f)
                lineTo(8.0f, 11.3301f)
                lineTo(8.7071f, 11.123f)
                lineTo(8.5f, 11.8301f)
                lineTo(8.7071f, 12.5372f)
                lineTo(8.0f, 12.3301f)
                close()
                moveTo(14.8301f, 10.5f)
                lineTo(14.123f, 10.7071f)
                lineTo(14.3301f, 10.0f)
                lineTo(14.123f, 9.2929f)
                lineTo(14.8301f, 9.5f)
                lineTo(15.5372f, 9.2929f)
                lineTo(15.3301f, 10.0f)
                lineTo(15.5372f, 10.7071f)
                lineTo(14.8301f, 10.5f)
                close()
                moveTo(6.1699f, 5.5f)
                lineTo(5.4628f, 5.7071f)
                lineTo(5.6699f, 5.0f)
                lineTo(5.4628f, 4.2929f)
                lineTo(6.1699f, 4.5f)
                lineTo(6.877f, 4.2929f)
                lineTo(6.6699f, 5.0f)
                lineTo(6.877f, 5.7071f)
                lineTo(6.1699f, 5.5f)
                close()
                moveTo(13.0f, 12.3301f)
                lineTo(12.2929f, 12.5372f)
                lineTo(12.5f, 11.8301f)
                lineTo(12.2929f, 11.123f)
                lineTo(13.0f, 11.3301f)
                lineTo(13.7071f, 11.123f)
                lineTo(13.5f, 11.8301f)
                lineTo(13.7071f, 12.5372f)
                lineTo(13.0f, 12.3301f)
                close()
                moveTo(8.0f, 3.6699f)
                lineTo(7.2929f, 3.877f)
                lineTo(7.5f, 3.1699f)
                lineTo(7.2929f, 2.4628f)
                lineTo(8.0f, 2.6699f)
                lineTo(8.7071f, 2.4628f)
                lineTo(8.5f, 3.1699f)
                lineTo(8.7071f, 3.877f)
                lineTo(8.0f, 3.6699f)
                close()
            }
        }
        .build()
        return _eu!!
    }

private var _eu: ImageVector? = null
