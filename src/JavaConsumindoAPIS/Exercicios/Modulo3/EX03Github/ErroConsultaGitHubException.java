package JavaConsumindoAPIS.Exercicios.Modulo3.EX03Github;

public class ErroConsultaGitHubException extends RuntimeException {
    private String mensagem;
    public ErroConsultaGitHubException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
