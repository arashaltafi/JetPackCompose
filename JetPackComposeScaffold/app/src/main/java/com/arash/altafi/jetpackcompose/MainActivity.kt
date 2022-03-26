package com.arash.altafi.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arash.altafi.jetpackcompose.ui.theme.JetPackComposeTheme
import com.arash.altafi.jetpackcompose.ui.theme.Purple200
import com.arash.altafi.jetpackcompose.ui.theme.Teal200

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = { Text(text = "TopAppBar") },
                                backgroundColor = Purple200
                            ) } ,
//                        floatingActionButtonPosition = FabPosition.End ,
                        isFloatingActionButtonDocked = true,
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = { Toast.makeText( this, "test" , Toast.LENGTH_SHORT).show() }
                            ) {
                            Text(text = "fab")
                        } } ,
                        drawerContent = {
                            Text(text = "drawerContent 1")
                            Divider()
                            Text(text = "drawerContent 2")
                        },
                        content = { Text("BodyContent") },
                        bottomBar = {
                            BottomAppBar(
                                cutoutShape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
                                backgroundColor = Teal200
                        ) {
                            Text("BottomAppBar")
                        } }
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeTheme {

    }
}