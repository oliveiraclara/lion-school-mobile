package br.senai.sp.jandira.lionschool.service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitFactory {

    private val URL_BASE = "https://backlion-school-production.up.railway.app/v1/lion-school/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getCourses(): CoursesService{
        return retrofitFactory.create(CoursesService::class.java)
    }
}