package com.example.musicplayer.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    val songs = listOf("Song One", "Song Two", "Song Three")

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Music") }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(12.dp)
        ) {
            items(songs) { song ->
                SongItem(song)
            }
        }
    }
}

@Composable
fun SongItem(name: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = name, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
