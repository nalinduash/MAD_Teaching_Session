package com.example.kuppi.s2.complete.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.integration.compose.placeholder
import com.example.kuppi.R
import com.example.kuppi.s2.complete.models.Game

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun GameRow(game: Game){
    Row {
        GlideImage(
            model = game.thumbnail,
            contentDescription = game.title,
            loading = placeholder(R.drawable.ic_launcher_background),
            modifier = Modifier.width(100.dp).height(100.dp)
        )
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = game.title)
            Text(text = game.developer)
        }
    }
}