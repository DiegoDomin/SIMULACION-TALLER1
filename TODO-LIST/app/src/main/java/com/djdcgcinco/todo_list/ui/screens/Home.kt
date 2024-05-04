package com.djdcgcinco.todo_list.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.djdcgcinco.todo_list.ui.components.buttonHome


@Composable
fun HomeScreen(context : Context) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        buttonHome(context)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(LocalContext.current)
}