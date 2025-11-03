package com.example.kuppi.s2.complete.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kuppi.s2.complete.viewModels.GamesViewModel

@Composable
fun GameList(vm: GamesViewModel){
    Column {
        Button(onClick = { vm.getGames()}){
            Text(text = "Get Games")
        }
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(vm.games) { game ->
                GameRow(game = game)
            }
        }
    }
}