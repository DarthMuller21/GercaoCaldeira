package JavaConsumindoAPIS.ScreenMatch.Teste;


import JavaConsumindoAPIS.ScreenMatch.Execao.ErroConversaoDeAnoException;
import JavaConsumindoAPIS.ScreenMatch.Modelo.Titulo;
import JavaConsumindoAPIS.ScreenMatch.Modelo.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteComBusca {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String buscaFilme = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                setPrettyPrinting()
                .create();

        while (!buscaFilme.equalsIgnoreCase("sair")) {
            System.out.println("Digite o filme para busca: ");
            buscaFilme = leitura.nextLine();

                if (buscaFilme.equalsIgnoreCase("sair")) {
                break;
                }

            String endereco = "http://www.omdbapi.com/?t=" + buscaFilme.replace(" ", "+") + "&apikey=13368964";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .GET()
                        .build();


                HttpResponse<String> response = client.
                        send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                //Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
                TituloOMDB meuTituloOmdb = gson.fromJson(response.body(), TituloOMDB.class);
                System.out.println(meuTituloOmdb);
                //try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca");
            } catch (ErroConversaoDeAnoException e) {
                System.out.println(e.getMensagem());
                ;
            }

        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Progama finalizou corretamente");
    }
}
