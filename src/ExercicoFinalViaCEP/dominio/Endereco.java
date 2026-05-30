package ExercicoFinalViaCEP.dominio;

public class Endereco{
    private int numeroEndereco;
    private String nomeRua;
    private String estado;
    private String bairro;

    public Endereco(EnderecoViaCEP enderecoViaCEP) {
        this.nomeRua = enderecoViaCEP.logradouro();
        this.estado = enderecoViaCEP.estado();
        this.bairro = enderecoViaCEP.bairro();
    }

    public int getNumeroEndereco(int numero) {
        return this.numeroEndereco = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numeroEndereco=" + numeroEndereco +
                ", nomeRua='" + nomeRua + '\'' +
                ", estado='" + estado + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
