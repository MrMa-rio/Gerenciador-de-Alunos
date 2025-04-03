package br.com.myprojects.views

import br.com.myprojects.core.usecase.ClassRoom.ExamUsecase
import java.sql.Time

class GenericView {

    fun Menu () {
       while (true) {
           try {
               println("""
            [1] CRIAR PROFESSOR;
            [2] CRIAR ALUNO;
            [3] CRIA PROVA;
            [4] AVALIA PROVA;
            [5] DETALHES PROVA;
        """.trimIndent())
               print("-> ")
               handleChoice(readln())
               break
           } catch (e: Exception) {
               println(e.message)
               Thread.sleep(200)
           }
       }
    }

    private fun handleChoice(choose: String){
        when (choose) {
            "1" -> TeacherView().create()
            "2" -> StudentView().create()
            "3" -> ExamView().create()
            "4" -> ExamView().evaluation()
            "5" -> ExamView().detail()
            else -> throw Exception("ESCOLHA INVALIDA!")
        }
    }
}