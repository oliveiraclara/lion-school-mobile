package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    LionSchoolTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Card(modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color(245, 245, 245)) {
                    Column() {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back_24),
                            contentDescription = stringResource(id = R.string.support)
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            text = stringResource(id = R.string.support), textAlign = TextAlign.Center)
                    }
                }
                Card(modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                backgroundColor = Color(255, 254, 254)) {
                    Column(modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly) {
                        Column() {
                            Row() {
                                Icon(
                                    painter = painterResource(id = R.drawable.phone_24),
                                    contentDescription = stringResource(id = R.string.phone)
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(text = stringResource(id = R.string.phone))
                            }
                            Row() {
                                Icon(
                                    painter = painterResource(id = R.drawable.email_24),
                                    contentDescription = stringResource(id = R.string.email)
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(text = stringResource(id = R.string.email))
                            }
                            Row() {
                                Icon(
                                    painter = painterResource(id = R.drawable.location_24),
                                    contentDescription = stringResource(id = R.string.address)
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(text = stringResource(id = R.string.address))
                            }
                        }
                        Column() {
                            Text(text = stringResource(id = R.string.social_media))
                            Row() {
                                Icon(
                                    painter = painterResource(id = R.drawable.location_24),
                                    contentDescription = stringResource(id = R.string.address)
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.location_24),
                                    contentDescription = stringResource(id = R.string.address)
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.location_24),
                                    contentDescription = stringResource(id = R.string.address)
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.location_24),
                                    contentDescription = stringResource(id = R.string.address)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}