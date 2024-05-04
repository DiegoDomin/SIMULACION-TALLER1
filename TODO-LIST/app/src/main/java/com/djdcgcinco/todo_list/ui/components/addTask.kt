package com.djdcgcinco.todo_list.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonAddTask(){
Column(horizontalAlignment = Alignment.CenterHorizontally) {


Button(onClick={},
    //personalizacion del boton
    colors = ButtonDefaults.buttonColors(
        containerColor = Color.Green,//cambia el color de adentro del boton
        contentColor = Color.Black,//cambia el color del texto del boton
        disabledContainerColor = Color.Gray,
        disabledContentColor = Color.LightGray,




    ),


    ){
Text(text="Agregar Tarea")
}
}

}


@Preview(showSystemUi = false)
@Composable
private fun ButtonAddTaskView(){
ButtonAddTask()
}