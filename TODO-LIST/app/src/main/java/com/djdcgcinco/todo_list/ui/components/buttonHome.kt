package com.djdcgcinco.todo_list.ui.components

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.djdcgcinco.todo_list.ui.activities.homeActivity

@Composable
fun buttonHome(context: Context){

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {


        Text(text="¡¡Bienvenido a nuestra programa!!",modifier=Modifier.padding(bottom = 5.dp))

        Button(onClick={
                       //para que vaya a la siguiente pantalla
            val intent = Intent(context, homeActivity::class.java)
            intent.putExtra("indexItem", 0)
            context.startActivity(intent)
            (context as Activity)

        },
            //personalizacion del boton
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,//cambia el color de adentro del boton
                contentColor = Color.Black,//cambia el color del texto del boton
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray,




                ),


            ){
            Text(text="Ingresar al Todo-list")
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun buttonHomePreView(){
    buttonHome(LocalContext.current)
}