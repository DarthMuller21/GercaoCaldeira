package ListaEColecaoDeDodos.ExercicioPessoas.Teste;

import ListaEColecaoDeDodos.ExercicioPessoas.Dominio.Pessoas;

import java.util.ArrayList;

public class TestePessoas {
    static void main(String[] args) {
        var pessoa1 = new Pessoas();
        var pessoa2 = new Pessoas();
        var pessoa3 = new Pessoas();

        pessoa1.setNome("Maria");
        pessoa1.setIdade(20);
        pessoa2.setNome("Joao");
        pessoa2.setIdade(18);
        pessoa3.setNome("Arthur");
        pessoa3.setIdade(17);

        ArrayList<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println("Tamanho do arraysList "+pessoas.size());
        System.out.println("Primeira pessoa "+ pessoas.getFirst().getNome());
        System.out.println("ArrayList Completo "+ pessoas.toString());
    }
}
