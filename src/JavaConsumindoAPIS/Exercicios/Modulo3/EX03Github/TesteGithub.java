package JavaConsumindoAPIS.Exercicios.Modulo3.EX03Github;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Scanner;

public class TesteGithub {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu usario do Github");
        String usuario = scanner.nextLine().toLowerCase(Locale.ROOT);
        String endereco = "https://api.github.com/users/"+usuario;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .GET()
                    .build();
        try {
            HttpResponse<String> response = client.
                    send(request,HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            if (response.statusCode()== 404){
                throw new ErroConsultaGitHubException("Usario nao encontrado");
            }

            Gson gson = new Gson();
            GithubUserAPI githubUserAPI = gson.fromJson(json, GithubUserAPI.class);
            GithubUser usario = new GithubUser(githubUserAPI);
            System.out.println(usario.toString());

        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMensagem());
        }


    }
}
