package com.example.primeraapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primeraapp.R


@Composable

fun PantallaReplica(){

    //Importar la imagen
    val image = painterResource(R.drawable.ironman)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Primera caja
        Box(
            modifier = Modifier.weight(1f).fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Create Profile",
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }

        //Segunda caja
        Box(
            modifier = Modifier.weight(1f).fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button (
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(175.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF73D2EA)
                    )

                ) {Text(text = "NIÑO",
                    fontSize = 25.sp)}
                Button(
                    onClick = { /*TODO*/ } ,
                    modifier = Modifier.width(175.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFC0CB)
                    )

                ) { Text(text = "NIÑA",
                    fontSize = 25.sp)}
            }
        }

        //Tercera caja
        Box(
            modifier = Modifier.weight(4f),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }

        //Cuarta caja
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center,

            ){
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Your Age",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "18",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF606064)
                    )
                    Text(
                        text = "20",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF606064)
                    )
                    Text(
                        text = "21",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "23+",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF606064)
                    )
                }
            }
        }

        //Quinta caja
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(250.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1AA7D7)
                )
            ) {Text(text = "Save",
                fontSize = 25.sp) }
        }
    }
}


@Preview
@Composable
fun PantallaReplicaPreview(){
    PantallaReplica()
}


