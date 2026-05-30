package JavaConsumindoAPIS.Exercicios.Modulo3.Ex02Senha;
import JavaConsumindoAPIS.Exercicios.Modulo3.Ex02Senha.SenhaInvalidaException;
import java.util.Scanner;

public class TesteSenha {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senha = scanner.nextLine();



        try{
            ValidarSenha validarSenha = new ValidarSenha(senha);
            System.out.println("A sua senha é valida");
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMensagem());
        }

    }
}
