package br.senai.sp.jandira.lionschool.service
import br.senai.sp.jandira.lionschool.model.Courses
import br.senai.sp.jandira.lionschool.model.CoursesList
import br.senai.sp.jandira.lionschool.model.Student
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoursesService {

    @GET("cursos")
    fun getCourses(): Call<CoursesList>

    @GET("alunos/curso?sigla={sigla}")
    fun getAlunosCursos(@Query("sigla") sigla:String): Call<Student>


//    @GET("alunos?cursos={rds}")
//    fun getCourseRds(@Path("sigla") sigla: String): Call<Courses>
}