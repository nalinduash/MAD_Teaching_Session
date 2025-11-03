package com.example.kuppi.s2.complete

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kuppi.s2.complete.ui.GameList
import com.example.kuppi.s2.complete.viewModels.GamesViewModel

@Preview
@Composable
fun s2ScreenFuncFull(){
    val vm = GamesViewModel()
    GameList(vm = vm)
}

