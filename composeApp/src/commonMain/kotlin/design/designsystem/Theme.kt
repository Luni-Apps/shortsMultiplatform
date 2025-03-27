package design.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import design.designsystem.atoms.colors.LocalAppColors
import design.designsystem.atoms.colors.defaultColors
import design.designsystem.atoms.cornerradius.LocalAppCornerRadius
import design.designsystem.atoms.spacings.LocalAppSpacings
import design.designsystem.atoms.types.LocalTypographies


object AppTheme {

    val colors
        @Composable
        get() = LocalAppColors.current

    val typography
        @Composable
        get() = LocalTypographies.current

    val spacings
        @Composable
        get() = LocalAppSpacings.current

    val corners
        @Composable
        get() = LocalAppCornerRadius.current
}
//
private val DarkColors = darkColorScheme()

private val LightColors = lightColorScheme()
//
@Composable
fun AppComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit,
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }
    CompositionLocalProvider(
        LocalAppColors provides darkTheme.defaultColors()
    ) {
        MaterialTheme(
            colorScheme = colors,
            content = content
        )
    }
}