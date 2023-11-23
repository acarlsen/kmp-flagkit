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

val FlagIcons.MQ: ImageVector
    get() {
        if (_mq != null) {
            return _mq!!
        }
        _mq = Builder(name = "Mq", defaultWidth = 21.0.dp, defaultHeight = 15.0.dp, viewportWidth =
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
            path(fill = linearGradient(0.0f to Color(0xFF345CB3), 1.0f to Color(0xFF23448D), start =
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
                    Offset(16.30785f,1.0975f), end = Offset(16.30785f,5.0434f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9173f, 1.6029f)
                curveTo(16.0691f, 1.5978f, 16.2347f, 1.5989f, 16.3877f, 1.6107f)
                curveTo(16.5938f, 1.6265f, 16.7395f, 1.672f, 16.7284f, 1.6294f)
                curveTo(16.7109f, 1.5624f, 16.7225f, 1.5453f, 16.6994f, 1.5622f)
                curveTo(16.6483f, 1.5996f, 16.7243f, 1.5551f, 16.4206f, 1.7289f)
                curveTo(15.9786f, 1.9818f, 15.7873f, 2.1739f, 15.8842f, 2.5201f)
                curveTo(15.9692f, 2.8235f, 16.1942f, 2.9075f, 16.7227f, 2.9903f)
                curveTo(16.7579f, 2.9958f, 16.7579f, 2.9958f, 16.7925f, 3.0012f)
                curveTo(17.004f, 3.0339f, 17.0985f, 3.0539f, 17.1619f, 3.082f)
                curveTo(17.1762f, 3.0883f, 17.1488f, 3.0447f, 17.1568f, 3.0176f)
                curveTo(17.1498f, 3.0411f, 17.0095f, 3.0961f, 16.6564f, 3.1656f)
                curveTo(16.5705f, 3.1824f, 16.5705f, 3.1824f, 16.4813f, 3.2003f)
                curveTo(15.8009f, 3.3391f, 15.4619f, 3.5203f, 15.4112f, 3.9906f)
                curveTo(15.3556f, 4.5063f, 15.89f, 4.8651f, 16.5611f, 4.9534f)
                curveTo(17.246f, 5.0434f, 17.8413f, 4.8172f, 17.9022f, 4.2609f)
                curveTo(17.9409f, 3.9074f, 17.6953f, 3.6956f, 17.3062f, 3.6177f)
                curveTo(17.0423f, 3.565f, 16.6948f, 3.5656f, 16.2782f, 3.607f)
                curveTo(16.0447f, 3.6302f, 15.7975f, 3.6656f, 15.5445f, 3.7099f)
                curveTo(15.2625f, 3.7593f, 15.031f, 3.8087f, 14.8918f, 3.8421f)
                curveTo(14.7575f, 3.8743f, 14.6748f, 4.0092f, 14.7069f, 4.1435f)
                curveTo(14.7391f, 4.2777f, 14.8741f, 4.3605f, 15.0083f, 4.3283f)
                curveTo(15.1382f, 4.2972f, 15.36f, 4.2498f, 15.6307f, 4.2024f)
                curveTo(15.8723f, 4.1601f, 16.1076f, 4.1264f, 16.3276f, 4.1045f)
                curveTo(16.6992f, 4.0676f, 17.0033f, 4.0671f, 17.2081f, 4.108f)
                curveTo(17.3748f, 4.1414f, 17.4091f, 4.1709f, 17.4052f, 4.2066f)
                curveTo(17.3843f, 4.3967f, 17.0704f, 4.516f, 16.6263f, 4.4576f)
                curveTo(16.1902f, 4.4003f, 15.8915f, 4.1998f, 15.9083f, 4.0442f)
                curveTo(15.9255f, 3.8846f, 16.109f, 3.7865f, 16.5812f, 3.6902f)
                curveTo(16.6665f, 3.6731f, 16.6665f, 3.6731f, 16.753f, 3.6562f)
                curveTo(17.3347f, 3.5416f, 17.5474f, 3.4584f, 17.6361f, 3.1601f)
                curveTo(17.7087f, 2.9161f, 17.588f, 2.7239f, 17.3645f, 2.6248f)
                curveTo(17.2446f, 2.5717f, 17.1291f, 2.5473f, 16.8691f, 2.5071f)
                curveTo(16.8344f, 2.5017f, 16.8344f, 2.5017f, 16.8001f, 2.4964f)
                curveTo(16.499f, 2.4491f, 16.3701f, 2.4011f, 16.3657f, 2.3854f)
                curveTo(16.3615f, 2.3701f, 16.4339f, 2.2973f, 16.6689f, 2.1629f)
                curveTo(16.7501f, 2.1169f, 16.7971f, 2.0903f, 16.8329f, 2.0693f)
                curveTo(16.8984f, 2.0311f, 16.9493f, 1.9989f, 16.9944f, 1.9659f)
                curveTo(17.1671f, 1.8397f, 17.2629f, 1.698f, 17.2123f, 1.5035f)
                curveTo(17.1411f, 1.2302f, 16.8727f, 1.1464f, 16.4259f, 1.1121f)
                curveTo(16.2516f, 1.0988f, 16.069f, 1.0975f, 15.9003f, 1.1032f)
                curveTo(15.8406f, 1.1056f, 15.8406f, 1.1056f, 15.8251f, 1.1065f)
                curveTo(15.6873f, 1.1145f, 15.582f, 1.2327f, 15.59f, 1.3705f)
                curveTo(15.598f, 1.5084f, 15.7162f, 1.6136f, 15.854f, 1.6056f)
                curveTo(15.8642f, 1.605f, 15.8642f, 1.605f, 15.9173f, 1.6029f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.70785f,1.0975f), end = Offset(4.70785f,5.0434f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.3173f, 1.6029f)
                curveTo(4.4691f, 1.5978f, 4.6347f, 1.5989f, 4.7877f, 1.6107f)
                curveTo(4.9938f, 1.6265f, 5.1395f, 1.672f, 5.1284f, 1.6294f)
                curveTo(5.1109f, 1.5624f, 5.1225f, 1.5453f, 5.0994f, 1.5622f)
                curveTo(5.0483f, 1.5996f, 5.1243f, 1.5551f, 4.8206f, 1.7289f)
                curveTo(4.3786f, 1.9818f, 4.1873f, 2.1739f, 4.2842f, 2.5201f)
                curveTo(4.3692f, 2.8235f, 4.5942f, 2.9075f, 5.1227f, 2.9903f)
                curveTo(5.1579f, 2.9958f, 5.1579f, 2.9958f, 5.1925f, 3.0012f)
                curveTo(5.404f, 3.0339f, 5.4985f, 3.0539f, 5.5619f, 3.082f)
                curveTo(5.5762f, 3.0883f, 5.5488f, 3.0447f, 5.5568f, 3.0176f)
                curveTo(5.5498f, 3.0411f, 5.4095f, 3.0961f, 5.0564f, 3.1656f)
                curveTo(4.9705f, 3.1824f, 4.9705f, 3.1824f, 4.8813f, 3.2003f)
                curveTo(4.2009f, 3.3391f, 3.8619f, 3.5203f, 3.8112f, 3.9906f)
                curveTo(3.7556f, 4.5063f, 4.29f, 4.8651f, 4.9611f, 4.9534f)
                curveTo(5.646f, 5.0434f, 6.2413f, 4.8172f, 6.3022f, 4.2609f)
                curveTo(6.3409f, 3.9074f, 6.0953f, 3.6956f, 5.7062f, 3.6177f)
                curveTo(5.4423f, 3.565f, 5.0948f, 3.5656f, 4.6782f, 3.607f)
                curveTo(4.4447f, 3.6302f, 4.1975f, 3.6656f, 3.9445f, 3.7099f)
                curveTo(3.6625f, 3.7593f, 3.431f, 3.8087f, 3.2918f, 3.8421f)
                curveTo(3.1575f, 3.8743f, 3.0748f, 4.0092f, 3.1069f, 4.1435f)
                curveTo(3.1391f, 4.2777f, 3.2741f, 4.3605f, 3.4083f, 4.3283f)
                curveTo(3.5382f, 4.2972f, 3.76f, 4.2498f, 4.0307f, 4.2024f)
                curveTo(4.2723f, 4.1601f, 4.5076f, 4.1264f, 4.7276f, 4.1045f)
                curveTo(5.0992f, 4.0676f, 5.4033f, 4.0671f, 5.6081f, 4.108f)
                curveTo(5.7748f, 4.1414f, 5.8091f, 4.1709f, 5.8052f, 4.2066f)
                curveTo(5.7843f, 4.3967f, 5.4704f, 4.516f, 5.0263f, 4.4576f)
                curveTo(4.5902f, 4.4003f, 4.2915f, 4.1998f, 4.3083f, 4.0442f)
                curveTo(4.3255f, 3.8846f, 4.509f, 3.7865f, 4.9812f, 3.6902f)
                curveTo(5.0665f, 3.6731f, 5.0665f, 3.6731f, 5.153f, 3.6562f)
                curveTo(5.7347f, 3.5416f, 5.9474f, 3.4584f, 6.0361f, 3.1601f)
                curveTo(6.1087f, 2.9161f, 5.988f, 2.7239f, 5.7645f, 2.6248f)
                curveTo(5.6446f, 2.5717f, 5.5291f, 2.5473f, 5.2691f, 2.5071f)
                curveTo(5.2344f, 2.5017f, 5.2344f, 2.5017f, 5.2001f, 2.4964f)
                curveTo(4.899f, 2.4491f, 4.7701f, 2.4011f, 4.7657f, 2.3854f)
                curveTo(4.7615f, 2.3701f, 4.8339f, 2.2973f, 5.0689f, 2.1629f)
                curveTo(5.1501f, 2.1169f, 5.1971f, 2.0903f, 5.2329f, 2.0693f)
                curveTo(5.2984f, 2.0311f, 5.3493f, 1.9989f, 5.3944f, 1.9659f)
                curveTo(5.5671f, 1.8397f, 5.6629f, 1.698f, 5.6123f, 1.5035f)
                curveTo(5.5412f, 1.2302f, 5.2727f, 1.1464f, 4.8259f, 1.1121f)
                curveTo(4.6516f, 1.0988f, 4.469f, 1.0975f, 4.3003f, 1.1032f)
                curveTo(4.2406f, 1.1056f, 4.2406f, 1.1056f, 4.2251f, 1.1065f)
                curveTo(4.0873f, 1.1145f, 3.982f, 1.2327f, 3.99f, 1.3705f)
                curveTo(3.998f, 1.5084f, 4.1162f, 1.6136f, 4.254f, 1.6056f)
                curveTo(4.2642f, 1.605f, 4.2642f, 1.605f, 4.3173f, 1.6029f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(16.30785f,10.0975f), end = Offset(16.30785f,14.0434f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9173f, 10.603f)
                curveTo(16.0691f, 10.5978f, 16.2347f, 10.5989f, 16.3877f, 10.6107f)
                curveTo(16.5938f, 10.6265f, 16.7395f, 10.672f, 16.7284f, 10.6294f)
                curveTo(16.7109f, 10.5624f, 16.7225f, 10.5453f, 16.6994f, 10.5622f)
                curveTo(16.6483f, 10.5996f, 16.7243f, 10.5551f, 16.4206f, 10.7289f)
                curveTo(15.9786f, 10.9818f, 15.7873f, 11.1739f, 15.8842f, 11.5201f)
                curveTo(15.9692f, 11.8235f, 16.1942f, 11.9075f, 16.7227f, 11.9903f)
                curveTo(16.7579f, 11.9958f, 16.7579f, 11.9958f, 16.7925f, 12.0012f)
                curveTo(17.004f, 12.0339f, 17.0985f, 12.0539f, 17.1619f, 12.082f)
                curveTo(17.1762f, 12.0883f, 17.1488f, 12.0447f, 17.1568f, 12.0176f)
                curveTo(17.1498f, 12.0411f, 17.0095f, 12.0961f, 16.6564f, 12.1656f)
                curveTo(16.5705f, 12.1824f, 16.5705f, 12.1824f, 16.4813f, 12.2003f)
                curveTo(15.8009f, 12.3391f, 15.4619f, 12.5203f, 15.4112f, 12.9906f)
                curveTo(15.3556f, 13.5063f, 15.89f, 13.8651f, 16.5611f, 13.9534f)
                curveTo(17.246f, 14.0434f, 17.8413f, 13.8172f, 17.9022f, 13.2609f)
                curveTo(17.9409f, 12.9074f, 17.6953f, 12.6956f, 17.3062f, 12.6177f)
                curveTo(17.0423f, 12.565f, 16.6948f, 12.5656f, 16.2782f, 12.607f)
                curveTo(16.0447f, 12.6302f, 15.7975f, 12.6656f, 15.5445f, 12.7099f)
                curveTo(15.2625f, 12.7593f, 15.031f, 12.8087f, 14.8918f, 12.8421f)
                curveTo(14.7575f, 12.8743f, 14.6748f, 13.0092f, 14.7069f, 13.1435f)
                curveTo(14.7391f, 13.2777f, 14.8741f, 13.3605f, 15.0083f, 13.3283f)
                curveTo(15.1382f, 13.2972f, 15.36f, 13.2498f, 15.6307f, 13.2024f)
                curveTo(15.8723f, 13.1601f, 16.1076f, 13.1264f, 16.3276f, 13.1045f)
                curveTo(16.6992f, 13.0676f, 17.0033f, 13.0671f, 17.2081f, 13.108f)
                curveTo(17.3748f, 13.1414f, 17.4091f, 13.1709f, 17.4052f, 13.2066f)
                curveTo(17.3843f, 13.3967f, 17.0704f, 13.516f, 16.6263f, 13.4576f)
                curveTo(16.1902f, 13.4003f, 15.8915f, 13.1998f, 15.9083f, 13.0442f)
                curveTo(15.9255f, 12.8846f, 16.109f, 12.7865f, 16.5812f, 12.6902f)
                curveTo(16.6665f, 12.6731f, 16.6665f, 12.6731f, 16.753f, 12.6562f)
                curveTo(17.3347f, 12.5416f, 17.5474f, 12.4584f, 17.6361f, 12.1601f)
                curveTo(17.7087f, 11.9161f, 17.588f, 11.7239f, 17.3645f, 11.6248f)
                curveTo(17.2446f, 11.5717f, 17.1291f, 11.5473f, 16.8691f, 11.5071f)
                curveTo(16.8344f, 11.5017f, 16.8344f, 11.5017f, 16.8001f, 11.4964f)
                curveTo(16.499f, 11.4491f, 16.3701f, 11.4011f, 16.3657f, 11.3854f)
                curveTo(16.3615f, 11.3701f, 16.4339f, 11.2973f, 16.6689f, 11.1629f)
                curveTo(16.7501f, 11.1169f, 16.7971f, 11.0903f, 16.8329f, 11.0693f)
                curveTo(16.8984f, 11.0311f, 16.9493f, 10.9989f, 16.9944f, 10.9659f)
                curveTo(17.1671f, 10.8397f, 17.2629f, 10.698f, 17.2123f, 10.5035f)
                curveTo(17.1411f, 10.2302f, 16.8727f, 10.1464f, 16.4259f, 10.1121f)
                curveTo(16.2516f, 10.0988f, 16.069f, 10.0975f, 15.9003f, 10.1032f)
                curveTo(15.8406f, 10.1056f, 15.8406f, 10.1056f, 15.8251f, 10.1065f)
                curveTo(15.6873f, 10.1145f, 15.582f, 10.2327f, 15.59f, 10.3705f)
                curveTo(15.598f, 10.5084f, 15.7162f, 10.6136f, 15.854f, 10.6056f)
                curveTo(15.8642f, 10.605f, 15.8642f, 10.605f, 15.9173f, 10.603f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(4.70785f,10.0975f), end = Offset(4.70785f,14.0434f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.3173f, 10.603f)
                curveTo(4.4691f, 10.5978f, 4.6347f, 10.5989f, 4.7877f, 10.6107f)
                curveTo(4.9938f, 10.6265f, 5.1395f, 10.672f, 5.1284f, 10.6294f)
                curveTo(5.1109f, 10.5624f, 5.1225f, 10.5453f, 5.0994f, 10.5622f)
                curveTo(5.0483f, 10.5996f, 5.1243f, 10.5551f, 4.8206f, 10.7289f)
                curveTo(4.3786f, 10.9818f, 4.1873f, 11.1739f, 4.2842f, 11.5201f)
                curveTo(4.3692f, 11.8235f, 4.5942f, 11.9075f, 5.1227f, 11.9903f)
                curveTo(5.1579f, 11.9958f, 5.1579f, 11.9958f, 5.1925f, 12.0012f)
                curveTo(5.404f, 12.0339f, 5.4985f, 12.0539f, 5.5619f, 12.082f)
                curveTo(5.5762f, 12.0883f, 5.5488f, 12.0447f, 5.5568f, 12.0176f)
                curveTo(5.5498f, 12.0411f, 5.4095f, 12.0961f, 5.0564f, 12.1656f)
                curveTo(4.9705f, 12.1824f, 4.9705f, 12.1824f, 4.8813f, 12.2003f)
                curveTo(4.2009f, 12.3391f, 3.8619f, 12.5203f, 3.8112f, 12.9906f)
                curveTo(3.7556f, 13.5063f, 4.29f, 13.8651f, 4.9611f, 13.9534f)
                curveTo(5.646f, 14.0434f, 6.2413f, 13.8172f, 6.3022f, 13.2609f)
                curveTo(6.3409f, 12.9074f, 6.0953f, 12.6956f, 5.7062f, 12.6177f)
                curveTo(5.4423f, 12.565f, 5.0948f, 12.5656f, 4.6782f, 12.607f)
                curveTo(4.4447f, 12.6302f, 4.1975f, 12.6656f, 3.9445f, 12.7099f)
                curveTo(3.6625f, 12.7593f, 3.431f, 12.8087f, 3.2918f, 12.8421f)
                curveTo(3.1575f, 12.8743f, 3.0748f, 13.0092f, 3.1069f, 13.1435f)
                curveTo(3.1391f, 13.2777f, 3.2741f, 13.3605f, 3.4083f, 13.3283f)
                curveTo(3.5382f, 13.2972f, 3.76f, 13.2498f, 4.0307f, 13.2024f)
                curveTo(4.2723f, 13.1601f, 4.5076f, 13.1264f, 4.7276f, 13.1045f)
                curveTo(5.0992f, 13.0676f, 5.4033f, 13.0671f, 5.6081f, 13.108f)
                curveTo(5.7748f, 13.1414f, 5.8091f, 13.1709f, 5.8052f, 13.2066f)
                curveTo(5.7843f, 13.3967f, 5.4704f, 13.516f, 5.0263f, 13.4576f)
                curveTo(4.5902f, 13.4003f, 4.2915f, 13.1998f, 4.3083f, 13.0442f)
                curveTo(4.3255f, 12.8846f, 4.509f, 12.7865f, 4.9812f, 12.6902f)
                curveTo(5.0665f, 12.6731f, 5.0665f, 12.6731f, 5.153f, 12.6562f)
                curveTo(5.7347f, 12.5416f, 5.9474f, 12.4584f, 6.0361f, 12.1601f)
                curveTo(6.1087f, 11.9161f, 5.988f, 11.7239f, 5.7645f, 11.6248f)
                curveTo(5.6446f, 11.5717f, 5.5291f, 11.5473f, 5.2691f, 11.5071f)
                curveTo(5.2344f, 11.5017f, 5.2344f, 11.5017f, 5.2001f, 11.4964f)
                curveTo(4.899f, 11.4491f, 4.7701f, 11.4011f, 4.7657f, 11.3854f)
                curveTo(4.7615f, 11.3701f, 4.8339f, 11.2973f, 5.0689f, 11.1629f)
                curveTo(5.1501f, 11.1169f, 5.1971f, 11.0903f, 5.2329f, 11.0693f)
                curveTo(5.2984f, 11.0311f, 5.3493f, 10.9989f, 5.3944f, 10.9659f)
                curveTo(5.5671f, 10.8397f, 5.6629f, 10.698f, 5.6123f, 10.5035f)
                curveTo(5.5412f, 10.2302f, 5.2727f, 10.1464f, 4.8259f, 10.1121f)
                curveTo(4.6516f, 10.0988f, 4.469f, 10.0975f, 4.3003f, 10.1032f)
                curveTo(4.2406f, 10.1056f, 4.2406f, 10.1056f, 4.2251f, 10.1065f)
                curveTo(4.0873f, 10.1145f, 3.982f, 10.2327f, 3.99f, 10.3705f)
                curveTo(3.998f, 10.5084f, 4.1162f, 10.6136f, 4.254f, 10.6056f)
                curveTo(4.2642f, 10.605f, 4.2642f, 10.605f, 4.3173f, 10.603f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0), start =
                    Offset(10.5f,0.0f), end = Offset(10.5f,15.0f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 1.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
        }
        .build()
        return _mq!!
    }

private var _mq: ImageVector? = null
