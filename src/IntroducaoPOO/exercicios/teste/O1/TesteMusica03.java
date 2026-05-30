package IntroducaoPOO.exercicios.teste.O1;

import IntroducaoPOO.exercicios.dominio.O1.Musica03;

public class TesteMusica03 {
    static void main(String[] args) {
        Musica03 musica = new Musica03();

        musica.titulo = "Amanhecer";
        musica.artista = "BK";

        musica.fichaTecnica();

        musica.SomaAvaliacao(8);
        musica.SomaAvaliacao(6);
        musica.SomaAvaliacao(7);
        System.out.println(musica.somaAvaliacao);

        System.out.println(musica.mediaAvalia());musica.mediaAvalia();
    }
}
