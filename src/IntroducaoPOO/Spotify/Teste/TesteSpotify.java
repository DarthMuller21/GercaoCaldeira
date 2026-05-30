package IntroducaoPOO.Spotify.Teste;

import IntroducaoPOO.Spotify.Dominio.Audio;
import IntroducaoPOO.Spotify.Dominio.Musica;
import IntroducaoPOO.Spotify.Dominio.Podcast;

public class TesteSpotify {
    static void main(String[] args) {
        Audio audio = new Audio();

        System.out.println("Musica");
        Musica musica = new Musica();

        musica.setTitulo("Blue world");
        musica.setNomeArtista("Mac Miller");
        musica.reproduzir();

        musica.avalia(10);
        musica.avalia(2);
        musica.mediaAvaliacao();

        musica.setQtdeReproducao(1000);
        musica.valeHaPena();

        System.out.println("***************************");
        System.out.println("Podcast");
        Podcast podcast = new Podcast();
        podcast.setTitulo("3 irmaos");
        podcast.setConvidados("Jones Manuel");
        podcast.setQtdeEpisodios(13);
        podcast.valeHaPena();
        podcast.reproduzir();

    }
}
