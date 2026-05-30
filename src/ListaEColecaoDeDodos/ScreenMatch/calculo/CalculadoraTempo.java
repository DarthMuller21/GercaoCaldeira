package ListaEColecaoDeDodos.ScreenMatch.calculo;

import ListaEColecaoDeDodos.ScreenMatch.dominio.Titulo;

public class CalculadoraTempo {

    private int tempoTotal;

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}
