package com.example.mywishlistapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeView() {
    Scaffold(
        topBar = {AppBarView(title = "Wishlist")}
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(it)){

        }
    }
}