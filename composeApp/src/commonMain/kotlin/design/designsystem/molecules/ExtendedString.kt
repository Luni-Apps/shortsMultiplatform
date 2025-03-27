package com.luni.android.shorts.designsystem.molecules

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import design.designsystem.AppTheme
import design.designsystem.molecules.icons.AppIconConfig
import design.designsystem.molecules.icons.AppVectorIconConfig


typealias ExtendedString = List<ExtendedStringType>

sealed class ExtendedStringType {
    data class Text(val text: String) : ExtendedStringType()

    data class AppIcons(val icon: AppIconConfig) :
        ExtendedStringType()

    data class VectorIcon(val icon: AppVectorIconConfig) :
        ExtendedStringType()

    data class Custom(val composable: @Composable () -> Unit) : ExtendedStringType()
}

@Composable
fun ExtendedStringView(
    modifier: Modifier = Modifier,
    text: ExtendedString,
    style: TextStyle,
) {
    ExtendedStringView(
        modifier = modifier,
        text = text,
        style = style
    ) {
        Text(
            modifier = Modifier.offset(y = 0.dp),
            text = it,
            style = style,
        )
    }
}


@Composable
private fun ExtendedStringView(
    modifier: Modifier,
    text: ExtendedString,
    spacing: Dp = AppTheme.spacings.xSmall,
    style: TextStyle,
    textSlot: @Composable (String) -> Unit,

    ) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        text.forEachIndexed { index, it ->
            when (it) {
                is ExtendedStringType.AppIcons -> it.icon.invoke()
                is ExtendedStringType.Text -> textSlot(it.text)
                is ExtendedStringType.VectorIcon -> it.icon.copy(tint = it.icon.tint?: style.color).invoke()
                is ExtendedStringType.Custom -> it.composable()
            }
            if (index < text.lastIndex)
                Spacer(modifier = Modifier.width(spacing))
        }
    }
}

// TODO DO A PREVIEW OF THIS