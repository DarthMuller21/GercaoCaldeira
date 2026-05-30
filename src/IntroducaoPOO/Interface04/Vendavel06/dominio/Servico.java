package IntroducaoPOO.Interface04.Vendavel06.dominio;

public class Servico implements Vendavel {
    private double ValorServico;
    public int qtdeContradata;

    public double getValorServico() {
        return ValorServico;
    }

    public void setValorServico(double valorServico) {
        ValorServico = valorServico;
    }

    public int getQtdeContradata() {
        return qtdeContradata;
    }

    public void setQtdeContradata(int qtdeContradata) {
        this.qtdeContradata = qtdeContradata;
    }


    @Override
    public void calcularPreco() {
        double precoFinal = ValorServico;
        if (qtdeContradata < 20){
            precoFinal = precoFinal + (precoFinal*0.3);
            System.out.println("Voce contratou menos de 20 servicos isto tem uma taxa de 30% o valor ficou R$"+precoFinal);
        }else if (qtdeContradata>=20 && qtdeContradata <40){
            precoFinal = precoFinal + (precoFinal*0.2);
            System.out.println("Voce contratou menos de 40 servicos isto tem uma taxa de 20% o valor ficou R$"+precoFinal);
        } else if (qtdeContradata >=40 && qtdeContradata <60) {
            precoFinal = precoFinal + (precoFinal*0.1);
            System.out.println("Voce contratou menos de 60 servicos isto tem uma taxa de 10% o valor ficou R$"+precoFinal);
        }else {
            System.out.println("Voce contratou mais de 60 servicos com isso voce nao pagara taxas o preco final ficou R$"+precoFinal);
        }
    }
}
