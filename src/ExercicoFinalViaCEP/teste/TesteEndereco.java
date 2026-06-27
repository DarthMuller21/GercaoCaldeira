package ExercicoFinalViaCEP.teste;

import ExercicoFinalViaCEP.dominio.Endereco;
import ExercicoFinalViaCEP.dominio.EnderecoViaCEP;
import ExercicoFinalViaCEP.dominio.ErroTamanhoCep;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteEndereco {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cep");
        String cep = scanner.nextLine();
        try {

            if (cep.length()!=8){
                throw new ErroTamanhoCep("Seu cep deve conter 8 digitos digite novamente");

            }
            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).GET().
                    build();

            HttpResponse<String> response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            System.out.println(json);

            Gson gson = new Gson();
            End
            enderecoViaCEP enderecoViaCEP = gson.fromJson(json, EnderecoViaCEP.class);
            System.out.println(enderecoViaCEP);
            Endereco meuEndereco = new Endereco(enderecoViaCEP);
            System.out.println("Complete seu endereco com o numero:");
            int numeroRua = scanner.nextInt();
            meuEndereco.getNumeroEndereco(numeroRua);

            System.out.println(meuEndereco);
        }catch (ErroTamanhoCep e){
            System.out.println(e.getMensagem());
        }
    }
}
