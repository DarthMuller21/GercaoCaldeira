package JavaConsumindoAPIS.Exercicios.Modulo3.EX01_Div2Num;

import java.util.Scanner;

public class TesteDivisao {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        try{
            double resultado = num1 / num2;
            System.out.println("Resultado = "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro 0 não pode ser dividido");;
        }

    }
}
