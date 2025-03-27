package design.designsystem.atoms.cornerradius

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object AppCornerRadius {
    // Dimensions brutes
    val Fixed = FixedCornerRadius
    val Percent = PercentCornerRadius

    object FixedCornerRadius {
        val xSmall: Dp = 4.dp
        val small: Dp = 6.dp
        val medium: Dp = 8.dp
        val large: Dp = 12.dp
        val xLarge: Dp = 16.dp
        val x2Large: Dp = 18.dp
        val x4Large: Dp = 24.dp
        val x5Large: Dp = 28.dp
        val x6Large: Dp = 32.dp
    }

    object PercentCornerRadius {
        const val xSmall: Int = 2
        const val small: Int = 3
        const val medium: Int = 3
        const val large: Int = 5
        const val xLarge: Int = 7
        const val x2Large: Int = 8
        const val x4Large: Int = 10
        const val x5Large: Int = 12
        const val x6Large: Int = 13
    }
}


val LocalAppCornerRadius = staticCompositionLocalOf {
    AppCornerRadius
}

