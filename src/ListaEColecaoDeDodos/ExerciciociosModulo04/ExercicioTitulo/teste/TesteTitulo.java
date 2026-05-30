package ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioTitulo.teste;

import ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioTitulo.dominio.TituloDeles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteTitulo {
    static void main(String[] args) {

        var livro1 = new TituloDeles();
        livro1.setTitulo("O manifesto Comunista");

        var livro2 = new TituloDeles();
        livro2.setTitulo("O pobre de direita");

        List<TituloDeles> livros = new LinkedList<>();
        livros.add(livro1);
        livros.add(livro2);
        Collections.sort(livros);
        System.out.println(livros);

        //ex04
        ArrayList livrosArrayList = new ArrayList<>();

    }
}
