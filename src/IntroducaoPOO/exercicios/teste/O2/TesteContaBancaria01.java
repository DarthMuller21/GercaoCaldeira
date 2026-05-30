package IntroducaoPOO.exercicios.teste.O2;

import IntroducaoPOO.exercicios.dominio.O2.ContaBancaria01;

public class TesteContaBancaria01 {
    static void main(String[] args) {
        ContaBancaria01 conta = new ContaBancaria01();
        //Add Valores com set
        conta.titularConta = "José";
        conta.setSaldo(1000);
        conta.setNumeroConta(126713);

        //Pegar valores com o get
        String nome = conta.titularConta;
        double saldo = conta.getSaldo();
        int numeroConta = conta.getNumeroConta();

        System.out.println(nome);
        System.out.println(saldo);
        System.out.println(numeroConta);

    }
}
