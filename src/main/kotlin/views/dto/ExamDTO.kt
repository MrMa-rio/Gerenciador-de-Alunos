package br.com.myprojects.views.dto

data class ExamDTO(
    val idExam: String,
    val nomeAluno: String,
    val cpf: String,
    val nota: Double,
    val materia: String
)
