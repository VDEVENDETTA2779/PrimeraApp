

package com.example.primeraapp.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.primeraapp.data.Articulo
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaCompras(){
    val articulos = remember { mutableStateListOf<Articulo>() }
    var mostrarDialogo by remember { mutableStateOf(false) }
    var textoTemporal by remember { mutableStateOf("") }

    if (mostrarDialogo){
        AlertDialog(
            onDismissRequest = {mostrarDialogo = false },
            title = { Text("agregar articulo") },
            text = {
                TextField(
                    value = textoTemporal,
                    onValueChange = {textoTemporal= it}
                )
            },
            confirmButton = {
                Button(onClick = {
                    articulos.add(Articulo(nombre = textoTemporal))
                    mostrarDialogo = false
                    textoTemporal =""
                }) {
                    Text("aceptar")
                }
            }

        )
    }
    Scaffold(
        topBar = {
            TopAppBar(title = {Text("mi lista de compras")})
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {mostrarDialogo = true}){
                Icon(Icons.Default.Add, contentDescription = "agregar articulos")
            }
        }
    ) {padding ->
        LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = padding ) {
            items(count = articulos.size){articulo->
                TarjetaElemento(articulos[articulo])

            }
        }
    }

}
