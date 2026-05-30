package IntroducaoPOO.exercicios.dominio.O2;

public class IdadePessoa02 {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade (int idade){
        if (idade >= 18){
            System.out.println(this.idade);
        }else {
            System.out.println("Sua idade n é permitida");
        }

    }
}


