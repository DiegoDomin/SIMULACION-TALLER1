package com.djdcgcinco.todo_list.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.djdcgcinco.todo_list.ui.components.ButtonAddTask
import java.lang.reflect.Modifier

@Composable
fun todoMenuScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonAddTask()

    }
}

@Preview(showSystemUi = true)
@Composable
private fun todoMenuPreview() {
    todoMenuScreen()
}