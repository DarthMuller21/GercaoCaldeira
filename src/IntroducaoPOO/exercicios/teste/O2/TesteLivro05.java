package IntroducaoPOO.exercicios.teste.O2;

import IntroducaoPOO.exercicios.dominio.O2.Livro05;

public class TesteLivro05 {
    static void main(String[] args) {
        Livro05 livro = new Livro05();
        livro.setAutor("Machado de Assis");
        livro.setTitulo("Memórias Póstumas de Brás Cubas");


        livro.exibirDetalhes();

    }
}
