package design.designsystem.molecules.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

public val Icons.Outlined.Videocam: ImageVector
    get() {
        if (_videocam != null) {
            return _videocam!!
        }
        _videocam = materialIcon(name = "Outlined.Videocam") {
            materialPath {
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(10.0f)
                moveToRelative(1.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        return _videocam!!
    }

private var _videocam: ImageVector? = null
