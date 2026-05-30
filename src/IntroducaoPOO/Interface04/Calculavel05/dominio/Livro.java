package IntroducaoPOO.Interface04.Calculavel05.dominio;

public class Livro implements Calculavel {
    private String nomeLivro;
    private double valorLivro;
    private double descontoLivro;

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    public double getDescontoLivro() {
        return descontoLivro;
    }

    public void setDescontoLivro(double descontoLivro) {
        this.descontoLivro = descontoLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorLivro - (valorLivro *getDescontoLivro() / 100);
    }
}
