package com.example.kuppi.s2.minimal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.integration.compose.placeholder
import com.example.kuppi.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://www.freetogame.com/api/"

// --- Data Layer ---

data class Game(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val developer: String
)

interface ApiService {
    @GET("games")
    suspend fun getGames(): List<Game>

    companion object {
        private var apiService: ApiService? = null
        fun getInstance(): ApiService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}


// --- UI Layer ---

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

@Preview(showBackground = true)
@Composable
fun s2ScreenFuncMinimal() {
    var games by remember { mutableStateOf<List<Game>>(emptyList()) }
    var error by remember { mutableStateOf("") }

    // Fetch data when the composable is first launched
    LaunchedEffect(Unit) {
        try {
            games = ApiService.getInstance().getGames()
        } catch (e: Exception) {
            error = e.message.toString()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (error.isNotEmpty()) {
            Text(text = "Error: $error", color = Color.Red)
        } else if (games.isEmpty()) {
            Text(text = "Loading games...")
        } else {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(games) { game ->
                    GameRow(game)
                }
            }
        }
    }
}


