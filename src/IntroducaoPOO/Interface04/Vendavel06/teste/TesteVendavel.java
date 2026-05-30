package IntroducaoPOO.Interface04.Vendavel06.teste;


import IntroducaoPOO.Interface04.Vendavel06.dominio.Produto;
import IntroducaoPOO.Interface04.Vendavel06.dominio.Servico;

public class TesteVendavel {
    static void main(String[] args) {
        Produto produto = new Produto();

        produto.setValorIncial(100);
        produto.setQtdeComprada(10);
        produto.calcularPreco();
        System.out.println("------------------------------------");

        Servico servico = new Servico();
        servico.setValorServico(1000);
        servico.setQtdeContradata(45);
        servico.calcularPreco();
    }
}
