package br.senai.sp.jandira.lionschool

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class InfoStudent : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Graphic()
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {

}

@Preview(showBackground = true)
@Composable
fun Graphic() {

    val context = LocalContext.current

    LionSchoolTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Card(
                        modifier = Modifier.height(300.dp),
                        backgroundColor = Color(213, 243, 251),
                        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {

                            Icon(
                                modifier = Modifier
                                    .clickable {
                                        val backHome = Intent(context, MainActivity::class.java)
                                        context.startActivity(backHome)
                                    },
                                painter = painterResource(id = R.drawable.arrow_back_24),
                                contentDescription = stringResource(id = R.string.support)
                            )
                            Spacer(modifier = Modifier.height(50.dp))
                            Column() {
                                Row(modifier = Modifier,
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center) {
                                    Text(
                                        text = "JOSÉ MATHEUS DA SILVA MIRANDA",
                                        fontSize = 20.sp
                                    )
                                    Image(
                                        painter = painterResource(id = R.drawable.student2),
                                        contentDescription = stringResource(id = R.string.lion_school),
                                        modifier = Modifier
                                            .size(62.dp)
                                            .clip(shape = CircleShape)
                                    )
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}