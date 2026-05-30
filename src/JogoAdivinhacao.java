import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitorNumero = new Scanner(System.in);
        int vidas = 5;
        int qtdeTentadas =0;
        System.out.println(numeroAleatorio);

        while (vidas > qtdeTentadas){
            System.out.println("Digite um numero entre 1 e 100");
            int numDigitado = leitorNumero.nextInt();

            if (numDigitado > numeroAleatorio){
                System.out.println(numDigitado+" é maior que o numero aleatorio");
            } else if (numeroAleatorio > numDigitado) {
                System.out.println(numDigitado+" é menor que o numero aleatorio");
            }
            qtdeTentadas++;

            if (numDigitado == numeroAleatorio){
                System.out.println("Parabens voce usou " + qtdeTentadas+ " tentativas");
                break;
            }
        }
        System.out.println("\n");
        System.out.println("Voce perdeu o numero era : "+ numeroAleatorio);

    }
}
