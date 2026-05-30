package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex03ContaBancaria.dominio;

public class ContaCorrente extends ContaBancaria{
    private double taxaMensal = 10;


    public void cobrarTarifaMensal () {
        saldo -= taxaMensal;
        System.out.println("O seu saldo atual é R$"+saldo);
    }



}
