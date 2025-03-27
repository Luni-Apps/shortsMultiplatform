package design.designsystem.atoms.spacings

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object AppSpacings {
    val xSmall: Dp = 4.dp
    val small: Dp = 8.dp
    val normal: Dp = 12.dp
    val medium: Dp = 16.dp
    val large: Dp = 24.dp
    val xLarge: Dp = 32.dp
    val x2Large: Dp = 40.dp
}

// CompositionLocal pour accéder aux spacings
val LocalAppSpacings = staticCompositionLocalOf {
    AppSpacings
}

