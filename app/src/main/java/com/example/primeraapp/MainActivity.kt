package com.example.primeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeraapp.composables.ListaCompras
import com.example.primeraapp.ui.theme.PrimeraAppTheme
import androidx.compose.ui.unit.dp
import com.example.primeraapp.composables.CafeCounter
import com.example.primeraapp.composables.CafeCounter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAppTheme {
                ListaCompras()
                Scaffold(modifier = Modifier.padding(16.dp)) { innerPadding ->
                    CafeCounter()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    Button(onClick = {}){
        Icon(imageVector = Icons.Filled.Favorite, contentDescription = "")
        Text(text = "Hola $name")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAppTheme {
        Greeting("Android")
    }
}