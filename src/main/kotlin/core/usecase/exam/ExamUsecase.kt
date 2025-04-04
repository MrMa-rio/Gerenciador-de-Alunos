package br.com.myprojects.core.usecase.exam

import br.com.myprojects.models.Exam
import br.com.myprojects.views.dto.ExamDTO
import java.util.*
import kotlin.collections.ArrayList

class ExamUsecase {

    private val examList: ArrayList<Exam> = ArrayList()

    fun create(dto: ExamDTO) {
        examList.add(
            Exam(
                UUID.randomUUID().toString(),
                dto.nomeAluno,
                dto.cpf,
                dto.nota,
                dto.materia
            )
        )
    }

    fun evaluation() {

    }

    fun detailExamsByCpf(cpf: String) {
        for (exam in examList) {
            if (exam.cpf == cpf) {
                println("Nome: ${exam.nomeAluno}")
                println("CPF: ${exam.cpf}")
                println("Nota: ${exam.nota}")
                println("Materia: ${exam.materia}")
            }
        }
    }

    fun detailExamsById(id: String) {
        for (exam in examList) {
            if (exam.idExam == id) {
                println("Nome: ${exam.nomeAluno}")
                println("CPF: ${exam.cpf}")
                println("Nota: ${exam.nota}")
                println("Materia: ${exam.materia}")
            }
        }

    }
}