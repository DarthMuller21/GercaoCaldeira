package JavaConsumindoAPIS.Exercicios.Modulo3.EX03Github;

public class GithubUser {
    private String nomeUsuario;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public GithubUser(GithubUserAPI githubUserAPI){
        this.nomeUsuario = githubUserAPI.login();
    }

    @Override
    public String toString() {
        return "Nome de usario: "+ this.nomeUsuario;
    }


}
