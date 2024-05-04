package com.djdcgcinco.todo_list.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.djdcgcinco.todo_list.ui.screens.HomeScreen
import com.djdcgcinco.todo_list.ui.screens.todoMenuScreen
import com.djdcgcinco.todo_list.ui.theme.TodolistTheme

class homeActivity: ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
setContent{

    TodolistTheme{
//aca va las pantallas en donde se quiere navegar

    todoMenuScreen()

    }
             }


      }
}