package br.com.myprojects.views

import br.com.myprojects.core.usecase.exam.ExamUsecase
import br.com.myprojects.views.dto.ExamDTO

class ExamView() {
    private val examUsecase = ExamUsecase()
    fun create() {

        println("NOME COMPLETO: ");
        val nomeAluno: String = readln()
        println("CPF: ");
        val cpf: String = readln()
        println("NOTA: ");
        val nota: Double = readln().toDouble()
        println("MATERIA: ");
        val materia: String = readln()
        val dto = ExamDTO(
            nomeAluno,
            cpf,
            nota,
            materia
        )
        examUsecase.create(dto)
    }

    fun evaluation() {
        examUsecase.evaluation()
    }

    fun detail() {
        examUsecase.detail()
    }
}