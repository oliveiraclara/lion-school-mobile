package br.senai.sp.jandira.lionschool

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.model.CoursesList
import br.senai.sp.jandira.lionschool.service.RetrofitFactory
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    var curso by remember {
        mutableStateOf(listOf<br.senai.sp.jandira.lionschool.model.Courses>())
    }

    val context = LocalContext.current


    LionSchoolTheme {
        Surface(Modifier.fillMaxSize()) {
            Column(
                Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    modifier = Modifier.padding(8.dp, 8.dp)
                        .clickable {
                            val openSupport = Intent(context, Support::class.java)
                            context.startActivity(openSupport)
                        },
                    painter = painterResource(id = R.drawable.support_24),
                    contentDescription = stringResource(id = R.string.support)
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.background),
                        contentDescription = stringResource(id = R.string.app_name)
                    )
                }
                Column(modifier = Modifier.padding(8.dp, 50.dp)) {
                    Text(
                        text = stringResource(id = R.string.lion_school),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = {
//                            // chamada para a API

                                val call = RetrofitFactory().getCourseService().getCourses()

                                call.enqueue(object : Callback<CoursesList> {
                                    override fun onResponse(
                                        call: Call<CoursesList>, response: Response<CoursesList>
                                    ) {
                                        curso = response.body()!!.curso
                                    }

                                    override fun onFailure(call: Call<CoursesList>, t: Throwable) {
                                        Log.i("ds2m", "onFailure: ${t.message}")
                                    }

                                })
                                val openSupport = Intent(context, Courses::class.java)
                                context.startActivity(openSupport)
                            },
                            modifier = Modifier
                                .width(187.dp)
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(Color(223, 251, 213)),
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "DS",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.arrow_forward_24),
                                    contentDescription = ""
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(
                            onClick = {
                                val openSupport = Intent(context, Courses::class.java)
                                context.startActivity(openSupport)
                            },
                            modifier = Modifier
                                .width(187.dp)
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(Color(223, 251, 213)),
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "RDS",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.arrow_forward_24),
                                    contentDescription = ""
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}




