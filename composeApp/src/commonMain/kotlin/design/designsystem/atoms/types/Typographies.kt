package design.designsystem.atoms.types

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

expect val defaultFontFamily : FontFamily

data class TypographyStyle(
    val regular: TextStyle,
    val emphasized: TextStyle
)

data class TypographyGroup(
    val largeTitle: TypographyStyle,
    val title1: TypographyStyle,
    val title2: TypographyStyle,
    val title3: TypographyStyle
)

data class CaptionGroup(
    val caption1: TypographyStyle,
    val caption2: TypographyStyle
)

data class AppTypographies(
    val title: TypographyGroup = titleDefault,
    val body: TypographyStyle = defaultBody,
    val callout: TypographyStyle = defaultCallout,
    val caption: CaptionGroup = defaultCaption
)


internal val titleDefault = TypographyGroup(
    largeTitle = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 34.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp
        )
    ),
    title1 = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 28.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
    ),
    title2 = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 22.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
    ),
    title3 = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
    )
)

internal val defaultBody = TypographyStyle(
    regular = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp
    ),
    emphasized = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp
    )
)

internal val defaultCallout = TypographyStyle(
    regular = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    emphasized = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    )
)

internal val defaultCaption = CaptionGroup(
    caption1 = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )
    ),
    caption2 = TypographyStyle(
        regular = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp
        ),
        emphasized = TextStyle(
            fontFamily = defaultFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 11.sp
        )
    )
)

val LocalTypographies = staticCompositionLocalOf {
    AppTypographies()
}
