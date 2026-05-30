package ExercicoFinalViaCEP.dominio;

public class ErroTamanhoCep extends RuntimeException {
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public ErroTamanhoCep(String mensagem){
        this.mensagem = mensagem;


    }
}
