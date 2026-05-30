package JavaConsumindoAPIS.Exercicios.Modulo3.Ex02Senha;

public class SenhaInvalidaException extends Exception {
    private String mensagem;

    public SenhaInvalidaException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
