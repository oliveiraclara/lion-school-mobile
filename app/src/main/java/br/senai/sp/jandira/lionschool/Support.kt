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
            Column(modifier = Modifier.fillMaxWidth()){
                Column(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Card(
                        backgroundColor =Color(223, 251, 213),
                        shape =RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
                    ){
                        Icon(
                            modifier = Modifier
                                .clickable{
                                    val backHome = Intent(context, MainActivity::class.java)
                                    context.startActivity(backHome)
                                },
                            painter =painterResource(id = R.drawable.arrow_back_24),
                            contentDescription =stringResource(id = R.string.support)
                        )
                        Spacer(modifier = Modifier.height(200.dp))

                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                            Text(
                                text =stringResource(id = R.string.support),
                                fontWeight = FontWeight.Bold,
                                fontSize = 44.sp,

                                )
                        }
                    }
                    Spacer(modifier = Modifier.height(80.dp))
                    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally,){
                        Row(){
                            Icon(
                                painter =painterResource(id = R.drawable.phone_24),
                                contentDescription = ""
                            )
                            Text(text =stringResource(id = R.string.phone))
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(){
                            Icon(
                                painter =painterResource(id = R.drawable.email_24),
                                contentDescription = ""
                            )
                            Text(text =stringResource(id = R.string.email))
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(){
                            Icon(
                                painter =painterResource(id = R.drawable.location_24),
                                contentDescription = ""
                            )
                            Text(text =stringResource(id = R.string.address))
                        }
                    }


                }
                Spacer(modifier = Modifier.height(200.dp))
                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text =stringResource(id = R.string.social_media),
                        fontWeight = FontWeight.Bold,
                        fontSize = 34.sp,
                    )
                    Row(
                        modifier = Modifier.padding(40.dp),
                    ){
//                        Icon(
//                            modifier = Modifier.size(35.dp),
//                            painter =painterResource(id = R.drawable.youtube),
//                            contentDescription = "",
//
//                            )
//                        Icon(
//                            modifier = Modifier.size(35.dp),
//                            painter =painterResource(id = R.drawable.instagram),
//                            contentDescription = ""
//                        )
//                        Icon(
//                            modifier = Modifier.size(35.dp),
//                            painter =painterResource(id = R.drawable.twitter),
//                            contentDescription = ""
//                        )
//                        Icon(
//                            modifier = Modifier.size(35.dp),
//                            painter =painterResource(id = R.drawable.facebook),
//                            contentDescription = ""
//                        )
                    }
                }
            }
        }
        }
    }
