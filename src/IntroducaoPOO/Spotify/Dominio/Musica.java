package IntroducaoPOO.Spotify.Dominio;

public class Musica extends Audio implements MetodosAudio{
    private String nomeArtista;
    private String Produtora;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getProdutora() {
        return Produtora;
    }

    public void setProdutora(String produtora) {
        Produtora = produtora;
    }

    @Override
    public void reproduzir() {
            System.out.println("Esta tocando a musica "+this.Titulo);

    }

    @Override
    public void valeHaPena() {
        if (qtdeReproducao <100){
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
