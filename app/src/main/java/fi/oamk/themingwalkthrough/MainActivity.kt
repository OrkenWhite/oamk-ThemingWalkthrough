package fi.oamk.themingwalkthrough

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fi.oamk.themingwalkthrough.ui.theme.ThemingWalkthroughTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingWalkthroughTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ThemingExample()
                }
            }
        }
    }
}

@Composable
fun ThemingExample() {
    var appModifier = Modifier.fillMaxWidth().padding(8.dp)
    var field1 by remember{mutableStateOf("")}
    var field2 by remember{mutableStateOf("")}
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(
            text = "Title",
            style = MaterialTheme.typography.h5,
            modifier = appModifier
        )
        OutlinedTextField(
            value = field1,
            onValueChange = {field1 = it},
            modifier = appModifier
        )
        OutlinedTextField(
            value = field2,
            onValueChange ={field2 = it},
            modifier = appModifier
        )
        Button({},modifier = appModifier){
            Text("Press me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThemingWalkthroughTheme {
        ThemingExample()
    }
}