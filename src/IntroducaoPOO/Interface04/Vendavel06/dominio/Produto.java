package IntroducaoPOO.Interface04.Vendavel06.dominio;

public class Produto implements Vendavel {
    private double valorIncial;
    public int qtdeComprada;

    public double getValorIncial() {
        return valorIncial;
    }

    public void setValorIncial(double valorIncial) {
        this.valorIncial = valorIncial;
    }

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        this.qtdeComprada = qtdeComprada;
    }

    @Override
    public void calcularPreco() {
        double precoFinal = this.valorIncial;
        if (qtdeComprada >=20 && qtdeComprada <40){
            precoFinal = precoFinal -(precoFinal *0.1);
            System.out.println("Voce comprou mais de 20 itens, Por isso ganhou 10% de desconto"+"\n"+"Sua compra deu R$"+precoFinal);
        } else if (qtdeComprada >= 40 && qtdeComprada <60) {
            precoFinal = precoFinal - (precoFinal*0.2);
            System.out.println("Voce comprou mais de 40 itens, Por isso ganhou 20% de desconto"+"\n"+"Sua compra deu R$"+precoFinal);
        } else if (qtdeComprada >=60) {
            precoFinal = precoFinal - (precoFinal*0.3);
            System.out.println("Voce comprou mais de 60 itens, Por isso ganhou 30% de desconto"+"\n"+"Sua compra deu R$"+precoFinal);
        }else {
            System.out.println("Sua compra foi menor de 20 itens não ganhou desconto"+"\n"+"Sua compra deu R$"+precoFinal);
        }
    }
}
