package br.com.myprojects.models

import br.com.myprojects.views.dto.ExamDTO

class Exam(idExam:String ,nomeAluno: String, cpf: String, nota: Double, materia: String) {

    var idExam: String = idExam
    var nomeAluno: String = nomeAluno
    var cpf: String = cpf
    var nota: Double = nota
    var materia: String = materia

     fun toDTO(): ExamDTO {
        return ExamDTO(
            idExam,
            nomeAluno,
            cpf,
            nota,
            materia
        )
    }
}