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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class Support : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Contacts()
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Contacts() {

    val context = LocalContext.current

    LionSchoolTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Card(backgroundColor = Color(223, 251, 213),
                    modifier = Modifier.height(200.dp)) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)) {
                        Icon(
                            modifier = Modifier
                                .clickable {
                                    val backHome = Intent(context, MainActivity::class.java)
                                    context.startActivity(backHome)
                                },
                            painter = painterResource(id = R.drawable.arrow_back_24),
                            contentDescription = stringResource(id = R.string.support)
                        )
                        Text(
                            text = "SUPPORT")
                    }
                    Column() {

                    }
                }
                Card(shape = RoundedCornerShape(20.dp, 20.dp),
                modifier= Modifier.fillMaxWidth().fillMaxSize()) {

                }
            }
        }
    }
}