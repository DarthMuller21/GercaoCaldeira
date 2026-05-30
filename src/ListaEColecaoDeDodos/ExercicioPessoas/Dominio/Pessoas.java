package ListaEColecaoDeDodos.ExercicioPessoas.Dominio;

public class Pessoas {
    public String nome;
    private int Idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome() +", "+ "Idade: "+getIdade();
    }
}
