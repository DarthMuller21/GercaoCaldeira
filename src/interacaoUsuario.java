import java.util.Scanner;
public class interacaoUsuario {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("QUal ano lancamento");
        int anoFilme = leitura.nextInt();
        System.out.println(anoFilme);

        System.out.println("Digite a avaliaca");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);

    }

}
