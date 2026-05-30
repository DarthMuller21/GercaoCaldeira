package IntroducaoPOO.Spotify.Dominio;

public class Podcast extends Audio implements MetodosAudio{

    private String CanalPodcast;
    private String Convidados = "Sem convidados";
    private int qtdeEpisodios;

    public String getConvidados() {
        return Convidados;
    }

    public void setConvidados(String convidados) {
        Convidados = convidados;
    }

    public String getCanalPodcast() {
        return CanalPodcast;
    }

    public void setCanalPodcast(String canalPodcast) {
        CanalPodcast = canalPodcast;
    }

    public int getQtdeEpisodios() {
        return qtdeEpisodios;
    }

    public void setQtdeEpisodios(int qtdeEpisodios) {
        this.qtdeEpisodios = qtdeEpisodios;
    }

    @Override
    public void reproduzir() {
        System.out.println("Voce esta escutando o podcast "+this.Titulo+" Com o convidado "+this.Convidados);
    }

    @Override
    public void valeHaPena() {
        if (qtdeEpisodios <10){
            System.out.println("Seu podcast n tem reproduzoes suficientes");
        }else {
            if (this.mediaAvaliacao >=8){
                System.out.println("A media é maior q 8 super recomendo");
            } else if (mediaAvaliacao <8 && mediaAvaliacao>=5) {
                System.out.println("Sua media é maior q 5 mas n q 8, mas recomendo para a proxima vez");
            }else {
                System.out.println("Este podcast é horrivel nao recomendo");
            }
        }
    }
}
