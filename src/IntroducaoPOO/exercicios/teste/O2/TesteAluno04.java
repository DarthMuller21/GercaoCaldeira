package IntroducaoPOO.exercicios.teste.O2;

import IntroducaoPOO.exercicios.dominio.O2.Aluno04;

public class TesteAluno04 {
    static void main(String[] args) {
        Aluno04 aluno = new Aluno04();

        aluno.setNome("Moacir");
        aluno.setNota(10);
        double nota1 = aluno.getNota();
        aluno.setNota(5);
        double nota2 = aluno.getNota();
        String nota =aluno.getNome();


        aluno.calcularMedia();

    }
}
