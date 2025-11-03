package com.example.kuppi.s1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.kuppi.ui.theme.Purple80

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun s1ScreenFunc(){
    Text(
        text = "Hello guys",
        modifier = Modifier.padding(20.dp)
    )

    Text(
        text = "My name is Nalindu",
        modifier = Modifier.padding(30.dp),
        color = Purple80
    )

    Button(
        onClick = {}
    ) {
        Text(text = "Hello")
    }

}

// Text, Buttons, Images
// Modifiers
// Column, Row
// Box
// Preview
// Themes, darktheme in MainActivity