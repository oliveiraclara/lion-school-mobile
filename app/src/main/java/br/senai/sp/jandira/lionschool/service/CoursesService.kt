package br.senai.sp.jandira.lionschool.service
import br.senai.sp.jandira.lionschool.model.Courses
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CoursesService {

    @GET("cursos")
    fun getCourses(): Call<Courses>

    @GET("alunos?cursos={sigla}")
    fun getCourse(@Path("sigla") sigla: String): Call<Courses>

//    @GET("alunos?cursos={rds}")
//    fun getCourseRds(@Path("sigla") sigla: String): Call<Courses>
}