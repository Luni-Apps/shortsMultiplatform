package design.designsystem.molecules.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import design.designsystem.AppComposeTheme
import com.luni.android.shorts.designsystem.molecules.ExtendedStringType
import design.designsystem.molecules.buttons.AppButton
import design.designsystem.molecules.buttons.ButtonStyles
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun AppButtonPreview() {
//    AppComposeTheme {
        LazyColumn(
            modifier = Modifier
                .statusBarsPadding()
                .background(Color(0x1AFFFFFF))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            item {
                AppButton(
                    style = ButtonStyles.Large.primary(),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("Large Primary")),
                )
            }
            item {
                AppButton(
                    style = ButtonStyles.Large.primary(),
                    isEnabled = false,
                    text = listOf(ExtendedStringType.Text("Large Primary Disabled")),
                )
            }
            item {
                AppButton(
                    style = ButtonStyles.Large.secondary(),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("Large Secondary")),
                )
            }
            item {
                AppButton(
                    style = ButtonStyles.Large.secondary(),
                    isEnabled = false,
                    text = listOf(ExtendedStringType.Text("Large Secondary disabled")),
                )
            }

            item {
                AppButton(
                    style = ButtonStyles.Large.tertiary(),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("Large Tertiary disabled")),
                )
            }

            item {
                AppButton(
                    style = ButtonStyles.Large.ghost(),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("Large Ghost")),
                )
            }

            item {
                AppButton(
                    style = ButtonStyles.Large.expressive(),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("Large expressive")),
                )
            }

            item {
                AppButton(
                    style = ButtonStyles.Large.expressive().copy(compat = true),
                    isEnabled = true,
                    text = listOf(ExtendedStringType.Text("compat expressive")),
                )
            }

            item {
                AppButton(
                    style = ButtonStyles.Large.expressive(),
                    isEnabled = false,
                    text = listOf(ExtendedStringType.Text("Large expressive disabled")),
                )
            }


        }
//    }
}