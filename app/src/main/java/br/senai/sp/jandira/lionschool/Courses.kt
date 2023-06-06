package br.senai.sp.jandira.lionschool

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class Courses : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Students()
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun Students() {

    val context = LocalContext.current


    LionSchoolTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Card(
                        modifier= Modifier.height(200.dp),
                        backgroundColor = Color(245, 245, 245),
                        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                    ) {
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp, 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Icon(
                                modifier = Modifier
                                    .clickable{
                                        val backHome = Intent(context, MainActivity::class.java)
                                        context.startActivity(backHome)
                                    },
                                painter =painterResource(id = R.drawable.arrow_back_24),
                                contentDescription =stringResource(id = R.string.support)
                            )
                            Text(text = "REDES")
                        }
                    }
                    Column() {
                        
                    }
                }
            }
        }
    }
}