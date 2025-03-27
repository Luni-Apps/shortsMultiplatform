package design.designsystem.molecules.buttons

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import design.designsystem.AppTheme
import com.luni.android.shorts.designsystem.molecules.ExtendedString
import com.luni.android.shorts.designsystem.molecules.ExtendedStringType
import com.luni.android.shorts.designsystem.molecules.ExtendedStringView

data class AppButtonStyle(
    val titleColor: Color,
    val titleColorDisabled: Color,
    val titleColorPressed: Color,
    val titleFont: TextStyle,
    val background: Background,
    val backgroundColorPressed: Color,
    val backgroundColorDisabled: Color,
    val borderColor: Color? = null,
    val borderColorDisabled: Color? = null,
    val borderColorPressed: Color? = null,
    val innerShadow: InnerShadowStyle? = null,
    val cornerRadius: Dp,
    val height: Dp,
    val horizontalPadding: Dp,
    val compat: Boolean = false
) {
    sealed class Background {
        data class Solid(val color: Color) : Background()
        data class Gradient(val brush: Brush) : Background()
    }

    data class InnerShadowStyle(
        val color: Color,
        val blur: Dp,
        val offsetX: Dp,
        val offsetY: Dp
    )
}


@Composable
fun AppButton(
    style: AppButtonStyle,
    text: String,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    onClick: () -> Unit = {}
) {
    AppButton(
        style = style,
        text = listOf(ExtendedStringType.Text(text)),
        modifier = modifier,
        isEnabled = isEnabled,
        onClick = onClick
    )
}

@Composable
fun AppButton(
    style: AppButtonStyle,
    text: ExtendedString,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    onClick: () -> Unit = {}
) {
    var isPressed by remember { mutableStateOf(false) }
    val alphaLoading by animateFloatAsState(targetValue = if (isLoading) 1f else 0f, label = "")
    val background = when {
        !isEnabled -> AppButtonStyle.Background.Solid(style.backgroundColorDisabled)
        isPressed -> AppButtonStyle.Background.Solid(style.backgroundColorPressed)
        else -> style.background
    }

    val titleColor  by animateColorAsState(
        targetValue = when {
        !isEnabled -> style.titleColorDisabled
        isPressed -> style.titleColorPressed
        else -> style.titleColor
    }, label = "")

    val borderColor  by animateColorAsState(
        targetValue = when {
        !isEnabled -> style.borderColorDisabled
        isPressed -> style.borderColorPressed
        else -> style.borderColor
    } ?: Color.Transparent, label = "")

//        val shadowModifier = if (style.innerShadow != null && isEnabled) {
//        Modifier.innerShadow(
//            shape = RoundedCornerShape(style.cornerRadius),
//            color = style.innerShadow.color,
//            blur = style.innerShadow.blur,
//            offsetX = style.innerShadow.offsetX,
//            offsetY = style.innerShadow.offsetY
//        )
//    } else Modifier

    Box(
        modifier = modifier
            .height(style.height)
            .then(if (style.compat) Modifier else Modifier.fillMaxWidth())
            .background(
                background = background,
                shape = RoundedCornerShape(style.cornerRadius)
            )
            .border(
                border = BorderStroke(1.dp, borderColor),
                shape = RoundedCornerShape(style.cornerRadius)
            )
//            .then(shadowModifier)
            .padding(horizontal = style.horizontalPadding)
            .pointerInput(isEnabled) {
                detectTapGestures(
                    onPress = {
                        if (isEnabled) {
                            isPressed = true
                            tryAwaitRelease()
                            isPressed = false
                        }
                    },
                    onTap = {
                        if (isEnabled) {
                            onClick()
                        }
                    }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier.alpha(alphaLoading),
            color = titleColor,
            strokeWidth = 2.dp
        )
        ExtendedStringView(
            modifier = Modifier.alpha(1 - alphaLoading),
            text = text,
            style = style.titleFont.copy(
                color = titleColor
            )
        )
    }
}

internal fun Modifier.background(background: AppButtonStyle.Background, shape: Shape) = this.then(
    when (background) {
        is AppButtonStyle.Background.Solid -> background(background.color, shape = shape)
        is AppButtonStyle.Background.Gradient -> background(brush = background.brush, shape = shape)
    }
)
object ButtonStyles {

    object Large {
        @Composable
        fun primary() = AppButtonStyle(
            titleColor = AppTheme.colors.text.primary,
            titleColorDisabled = AppTheme.colors.text.disabled,
            titleColorPressed = AppTheme.colors.text.primary,
            titleFont = AppTheme.typography.body.emphasized,
            background = AppButtonStyle.Background.Solid(AppTheme.colors.surface.primary),
            backgroundColorPressed = AppTheme.colors.surface.primaryPressed,
            backgroundColorDisabled = AppTheme.colors.surface.disabled,
            cornerRadius = AppTheme.corners.Fixed.x5Large,
            height = 56.dp,
            horizontalPadding = AppTheme.spacings.large,
        )

        @Composable
        fun secondary() = AppButtonStyle(
            titleColor = AppTheme.colors.text.primary,
            titleColorDisabled = AppTheme.colors.text.disabled,
            titleColorPressed = AppTheme.colors.text.primary,
            titleFont = AppTheme.typography.body.emphasized,
            background = AppButtonStyle.Background.Solid(AppTheme.colors.surface.secondary),
            backgroundColorPressed = AppTheme.colors.surface.secondaryPressed,
            backgroundColorDisabled = AppTheme.colors.surface.disabled,
            cornerRadius = AppTheme.corners.Fixed.x5Large,
            height = 56.dp,
            horizontalPadding = AppTheme.spacings.large
        )

        @Composable
        fun tertiary() = AppButtonStyle(
            titleColor = AppTheme.colors.text.primary,
            titleColorDisabled = AppTheme.colors.text.disabled,
            titleColorPressed = AppTheme.colors.text.tertiaryPressed,
            titleFont = AppTheme.typography.body.emphasized,
            background = AppButtonStyle.Background.Solid(Color.Transparent),
            backgroundColorPressed = AppTheme.colors.surface.tertiaryPressed,
            backgroundColorDisabled = Color.Transparent,
            borderColor = AppTheme.colors.border.tertiary,
            borderColorDisabled = Color.Transparent,
            borderColorPressed = AppTheme.colors.border.tertiary,
            cornerRadius = AppTheme.corners.Fixed.x5Large,
            height = 56.dp,
            horizontalPadding = AppTheme.spacings.large
        )

        @Composable
        fun ghost() = AppButtonStyle(
            titleColor = AppTheme.colors.text.tertiary,
            titleColorDisabled = AppTheme.colors.text.disabled,
            titleColorPressed = AppTheme.colors.text.tertiaryPressed,
            titleFont = AppTheme.typography.body.emphasized,
            background = AppButtonStyle.Background.Solid(Color.Transparent),
            backgroundColorPressed = Color.Transparent,
            backgroundColorDisabled = Color.Transparent,
            cornerRadius = AppTheme.corners.Fixed.x5Large,
            height = 56.dp,
            horizontalPadding = AppTheme.spacings.large
        )

        @Composable
        fun expressive() = AppButtonStyle(
            titleColor = AppTheme.colors.text.primary,
            titleColorDisabled = AppTheme.colors.text.disabled,
            titleColorPressed = AppTheme.colors.text.primary,
            titleFont = AppTheme.typography.body.emphasized,

            background = AppButtonStyle.Background.Gradient(AppTheme.colors.surface.primaryExpressive),
            backgroundColorPressed = AppTheme.colors.surface.primaryExpressivePressed,
            backgroundColorDisabled = AppTheme.colors.surface.disabled,
            innerShadow = AppButtonStyle.InnerShadowStyle(
                color = AppTheme.colors.border.primary,
                blur = 2.dp,
                offsetX = 0.dp,
                offsetY = (-2).dp
            ),
            cornerRadius = AppTheme.corners.Fixed.x5Large,
            height = 56.dp,
            horizontalPadding = AppTheme.spacings.large
        )
    }

    object Medium {
        @Composable
        fun primary() = Large.primary().copy(height = 48.dp)

        @Composable
        fun secondary() = Large.secondary().copy(height = 48.dp)

        @Composable
        fun tertiary() = Large.tertiary().copy(height = 48.dp)

        @Composable
        fun ghost() = Large.ghost().copy(height = 48.dp)

        @Composable
        fun expressive() = Large.expressive().copy(height = 48.dp)
    }

    object Small {
        @Composable
        fun primary() = Large.primary().copy(height = 40.dp)

        @Composable
        fun secondary() = Large.secondary().copy(height = 40.dp)

        @Composable
        fun tertiary() = Large.tertiary().copy(height = 40.dp)

        @Composable
        fun ghost() = Large.ghost().copy(height = 40.dp)

        @Composable
        fun expressive() = Large.expressive().copy(height = 40.dp)
    }
}
