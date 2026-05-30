package IntroducaoPOO.exercicios.dominio.O2;

public class Produtos03 {
    private String nomeProduto;
    private double valorProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void aplicarDesconto(double desconto){
        double valorComDesconto = this.valorProduto - (valorProduto * desconto /100);
        System.out.println(valorComDesconto);;
    }

}
