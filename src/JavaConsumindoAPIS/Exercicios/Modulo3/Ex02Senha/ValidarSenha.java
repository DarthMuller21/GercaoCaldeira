package JavaConsumindoAPIS.Exercicios.Modulo3.Ex02Senha;

public class ValidarSenha {
    private String senha;

    public ValidarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Nao pode criar a senha por ter menos de 8 caracteres");
        }
    }
}
