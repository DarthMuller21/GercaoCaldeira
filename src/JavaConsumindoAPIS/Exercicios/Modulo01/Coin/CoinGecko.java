package JavaConsumindoAPIS.Exercicios.Modulo01.Coin;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a criptoMoeda que deseja ver o valor");
        String moeda = leitura.nextLine();
        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids="+ moeda + "&x_cg_demo_api_key=CG-x4Gc27GtYxAG7PtDLqJ2eV8Q";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();
        HttpResponse<String> response = client.
                send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        System.out.println("************************" +
                "Gson");

        Gson gson = new Gson();
        CriptoApi criptoApi = gson.fromJson(response.body(),CriptoApi.class);



    }
}
