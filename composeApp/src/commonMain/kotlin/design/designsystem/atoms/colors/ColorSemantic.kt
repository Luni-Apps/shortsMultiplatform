package design.designsystem.atoms.colors

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

data class AppColors(
    val surface: SurfaceColors,
    val border: BorderColors,
    val text: TextColors
) {
    data class SurfaceColors(
        val primary: Color,
        val primaryPressed: Color,
        val primaryExpressive: Brush,
        val primaryExpressivePressed: Color,
        val secondary: Color,
        val secondaryPressed: Color,
        val tertiary: Color,
        val tertiaryPressed: Color,
        val disabled: Color,
        val success: Color,
        val successPressed: Color,
        val danger: Color,
        val dangerPressed: Color,
        val error: Color,
        val errorPressed: Color,
        val backgroundPrimary: Color,
        val backgroundSecondary: Color,
        val premiumPrimary: Brush,
        val premiumPrimaryStart: Color,
        val premiumPrimaryEnd: Color,
        val premiumSecondary: Brush
    )

    data class BorderColors(
        val primary: Color,
        val primaryPressed: Color,
        val disabled: Color,
        val secondary: Color,
        val tertiary: Color,
        val success: Color,
        val danger: Color,
        val error: Color,
        val premium: Brush,
        val premiumStart: Color,
        val premiumEnd: Color
    )

    data class TextColors(
        val primary: Color,
        val secondary: Color,
        val tertiary: Color,
        val tertiaryPressed: Color,
        val disabled: Color,
        val success: Color,
        val danger: Color,
        val error: Color,
        val premiumPrimary: Brush,
        val premiumSecondary: Color
    )

    companion object {
        fun light() = AppColors(
            surface = SurfaceColors(
                primary = ColorPrimitives.Primitive.Brand.tint40,
                primaryPressed = ColorPrimitives.Primitive.Brand.tint30,
                primaryExpressive = Brush.verticalGradient(
                    colors = listOf(
                        ColorPrimitives.Primitive.Brand.tint40,
                        ColorPrimitives.Primitive.Brand.tint30
                    )
                ),
                primaryExpressivePressed = ColorPrimitives.Primitive.Brand.tint30,
                secondary = ColorPrimitives.Primitive.Brand.tint60,
                secondaryPressed = ColorPrimitives.Primitive.Brand.tint50,
                tertiary = ColorPrimitives.Primitive.White.opacity10,
                tertiaryPressed = ColorPrimitives.Primitive.White.opacity20,
                disabled = ColorPrimitives.Primitive.Neutral.tint50,
                success = ColorPrimitives.Primitive.Green.opacity20,
                successPressed = ColorPrimitives.Primitive.Green.opacity40,
                danger = ColorPrimitives.Primitive.Orange.opacity20,
                dangerPressed = ColorPrimitives.Primitive.Orange.opacity40,
                error = ColorPrimitives.Primitive.Red.opacity20,
                errorPressed = ColorPrimitives.Primitive.Red.opacity40,
                backgroundPrimary = ColorPrimitives.Primitive.Neutral.tint70,
                backgroundSecondary = ColorPrimitives.Primitive.Neutral.tint60,
                premiumPrimary = Brush.verticalGradient(
                    colors = listOf(
                        ColorPrimitives.Primitive.Yellow.tint50,
                        ColorPrimitives.Primitive.Yellow.tint20
                    )
                ),
                premiumSecondary = Brush.horizontalGradient(
                    colors = listOf(
                        ColorPrimitives.Primitive.Brown.tint50,
                        ColorPrimitives.Primitive.Brown.tint70
                    )
                ),
                premiumPrimaryStart = ColorPrimitives.Primitive.Yellow.tint50,
                premiumPrimaryEnd = ColorPrimitives.Primitive.Yellow.tint20
            ),
            border = BorderColors(
                primary = ColorPrimitives.Primitive.Brand.tint40,
                primaryPressed = ColorPrimitives.Primitive.Brand.tint30,
                disabled = ColorPrimitives.Primitive.Neutral.tint50,
                secondary = ColorPrimitives.Primitive.Neutral.tint60,
                tertiary = ColorPrimitives.Primitive.White.opacity100,
                success = ColorPrimitives.Primitive.Green.opacity100,
                danger = ColorPrimitives.Primitive.Orange.opacity100,
                error = ColorPrimitives.Primitive.Red.opacity100,
                premium = Brush.verticalGradient(
                    colors = listOf(
                        ColorPrimitives.Primitive.Yellow.tint20,
                        ColorPrimitives.Primitive.Yellow.tint50
                    )
                ),
                premiumStart = ColorPrimitives.Primitive.Yellow.tint20,
                premiumEnd = ColorPrimitives.Primitive.Yellow.tint50
            ),
            text = TextColors(
                primary = ColorPrimitives.Primitive.White.opacity100,
                secondary = ColorPrimitives.Primitive.Neutral.tint30,
                tertiary = ColorPrimitives.Primitive.Brand.tint40,
                tertiaryPressed = ColorPrimitives.Primitive.Brand.tint30,
                disabled = ColorPrimitives.Primitive.Neutral.tint40,
                success = ColorPrimitives.Primitive.Green.opacity100,
                danger = ColorPrimitives.Primitive.Orange.opacity100,
                error = ColorPrimitives.Primitive.Red.opacity100,
                premiumPrimary = Brush.horizontalGradient(
                    colors = listOf(
                        ColorPrimitives.Primitive.Yellow.tint20,
                        ColorPrimitives.Primitive.Yellow.tint50
                    )
                ),
                premiumSecondary = ColorPrimitives.Primitive.Brown.tint70
            )
        )

        fun dark() = light() // Dark mode not handled for now
    }
}

val LocalAppColors = staticCompositionLocalOf {
    AppColors.light()
}

fun Boolean.defaultColors() = if (this) AppColors.dark() else AppColors.light()