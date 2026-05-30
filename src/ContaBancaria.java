import java.util.Scanner;
 class ContaBancaria {
     static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
         //Recebendo dados
         System.out.println("Digite o nome do titular da conta");
         String titularConta = leitura.nextLine();

         System.out.println("Informe o tipo da conta");
         String tipoConta = leitura.nextLine();

         System.out.println("Digite o saldo incial");
         double saldoIncial = leitura.nextInt();

         System.out.println("Dados inciais");
         System.out.println(titularConta);
         System.out.println(tipoConta);
         System.out.println(saldoIncial);
         System.out.println("*********************************************");

         double saldoAtual = saldoIncial;


         // Laço fonte
         while (true){
             // opcoes
             System.out.println("Operacoes");
             System.out.println("1 - Ver saldo conta");
             System.out.println("2 - Depositar Valor");
             System.out.println("3- Sacar Valor");
             System.out.println("4- sair");
             System.out.println("Digite a opcao desejada");
             int opcaoCliente = leitura.nextInt();

             //condicoes
             if (opcaoCliente == 1){
                 System.out.println("Seu saldo atual é R$"+ saldoAtual);
             } else if (opcaoCliente ==2 ) {
                 System.out.println("Qual valor voce quer depositar");
                 double valorHaDepositar = leitura.nextDouble();
                 saldoAtual = saldoAtual + valorHaDepositar;
                 System.out.println("Seu saldo atual é R$"+ saldoAtual);
             } else if (opcaoCliente == 3) {
                 System.out.println("Qual valor deseja sacar");
                 double valorSaque = leitura.nextDouble();
                 if (valorSaque > saldoAtual){
                     System.out.println("Saldo Indisponivel");
                 }
                 else{
                     saldoAtual = saldoAtual - valorSaque;
                     System.out.println("Seu saldo atual é R$"+saldoAtual);
                 }
             } else if (opcaoCliente ==4) {
                 break;
             }
             if (opcaoCliente != 1 && opcaoCliente != 2 && opcaoCliente != 3 && opcaoCliente != 4){
                 System.out.println("Opcao invalida tente de novo");
             }

         }




     }
}
