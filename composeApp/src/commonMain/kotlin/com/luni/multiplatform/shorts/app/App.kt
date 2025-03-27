package com.luni.multiplatform.shorts.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import design.designsystem.molecules.buttons.AppButton
import design.designsystem.molecules.buttons.ButtonStyles
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import shortcomposemultiplatform.composeapp.generated.resources.Res
import shortcomposemultiplatform.composeapp.generated.resources.compose_multiplatform
import shortcomposemultiplatform.composeapp.generated.resources.ic_coins_pack_large

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(Res.drawable.ic_coins_pack_large),
                contentDescription =  null)
            
            AppButton(style = ButtonStyles.Large.expressive(),
                onClick = { showContent = !showContent },
                text = "Design ce bouton !")
        }
    }
}