package br.senai.sp.jandira.lionschool.model

data class Student(

    val curso: List<Courses>,
    val foto: String,
    val matricula: String,
    val nome: String,
    val sexo: String,
    val status: String,
)
