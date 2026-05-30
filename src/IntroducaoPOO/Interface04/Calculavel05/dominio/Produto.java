package IntroducaoPOO.Interface04.Calculavel05.dominio;

public class Produto implements Calculavel {
    private String nomeProduto;
    private double valorProduto;
    private double impostoProduto;


    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getImpostoProduto() {
        return impostoProduto;
    }

    public void setImpostoProduto(double impostoProduto) {
        this.impostoProduto = impostoProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorProduto + (valorProduto * getImpostoProduto() /100);
    }
}
