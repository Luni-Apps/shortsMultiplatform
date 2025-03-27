package design.designsystem.molecules.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import design.designsystem.AppTheme
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

data class AppVectorIconConfig(
    val vector: ImageVector,
    val size: DpSize,
    val tint: Color? = null,
) {
    @Composable
    operator fun invoke(modifier: Modifier = Modifier) = AppVectorIcon(
        modifier = modifier.size(size),
        config = this,
    )

    @Composable
    operator fun invoke(size: Dp) = AppVectorIcon(
        modifier = Modifier.size(size),
        config = this,
    )
}

@Composable
fun AppVectorIcon(modifier: Modifier = Modifier, config: AppVectorIconConfig, tint: Color? = null) {
    Icon(
        modifier = modifier,
        imageVector = config.vector ,
        contentDescription = null,
        tint = tint ?: config.tint ?: AppTheme.colors.text.primary
    )
}

data class AppIconConfig(
    val res: DrawableResource,
    val size: DpSize,
    val tint: Color? = null,
) {
    @Composable
    operator fun invoke(modifier: Modifier = Modifier) = AppIcon(
        modifier = modifier.size(size),
        config = this,
    )

    @Composable
    operator fun invoke(size: Dp) = AppIcon(
        modifier = Modifier.size(size),
        config = this,
    )

    @Composable
    operator fun invoke(
        modifier: Modifier = Modifier,
        key: String,
        tint: Color? = null,
        onClick: () -> Unit,
    ) = AppIcon(
        modifier = modifier
            .size(size)
            .clickable() { onClick() },
        config = this,
        tint = tint,
    )
}

@Composable
fun AppIcon(
    modifier: Modifier,
    config: AppIconConfig,
    tint: Color? = null,
) {
    Image(
        modifier = modifier.size(config.size),
        painter = painterResource(config.res),
        contentDescription = null,
        colorFilter = (tint ?: config.tint)?.let { ColorFilter.tint(it) },
    )
}



class OneSizeAppIconConfig(
    val Medium: AppIconConfig,
) {
    @Composable
    operator fun invoke() = Medium()
}


class ThreeSizeAppIconConfig(
    val Small: AppIconConfig,
    val Medium: AppIconConfig,
    val Big: AppIconConfig,
)

internal val defaultIconSmallSize = DpSize(16.dp, 16.dp)
internal val defaultIconMediumSize = DpSize(24.dp, 24.dp)
internal val defaultIconBigSize = DpSize(32.dp, 32.dp)