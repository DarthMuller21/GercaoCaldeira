package IntroducaoPOO.exercicios.teste.O2;

import IntroducaoPOO.exercicios.dominio.O2.IdadePessoa02;

public class TesteIdade02 {
    static void main(String[] args) {

        IdadePessoa02 pessoa = new IdadePessoa02();

        pessoa.setIdade(18);
        pessoa.setNome("Mauricio");
        String nomePessoa = pessoa.getNome();
        int idadePessoa = pessoa.getIdade();

        pessoa.verificaIdade(idadePessoa);

    }
}
