package ApiJava.Exercicios.Modulo2.ExercicioPessoa.TestePessoa;

import ApiJava.Exercicios.Modulo2.ExercicioPessoa.dominio.Pessoa;
import ApiJava.Exercicios.Modulo2.ExercicioPessoa.dominio.PessoaJson;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class TestePessoa {
    static void main(String[] args) {
        String json = """
                {
                    "nome" : "Joao",
                    "idade" : 30,
                    "cidade" : "Porto Alegre"
                }
                """;

        Gson gson = new Gson();
        PessoaJson pessoajson = gson.fromJson(json, PessoaJson.class);
        Pessoa pessoa = new Pessoa(pessoajson);
        System.out.println(pessoa);
    }
}
