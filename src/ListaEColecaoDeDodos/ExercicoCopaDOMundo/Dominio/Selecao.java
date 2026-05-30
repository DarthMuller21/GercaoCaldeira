package ListaEColecaoDeDodos.ExercicoCopaDOMundo.Dominio;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Selecao implements Comparable<Selecao> {
    private String nomeSelecao;
    private int pontos;
    private int saldoDeGols;

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public Selecao(String nomeSelecao, int pontos, int saldoDeGols) {
        this.nomeSelecao = nomeSelecao;
        this.pontos = pontos;
        this.saldoDeGols = saldoDeGols;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    public void setSaldoDeGols(int saldoDeGols) {
        this.saldoDeGols = saldoDeGols;
    }

    @Override
    public int compareTo(Selecao outraSelecao) {
        if (this.pontos != outraSelecao.pontos) {
            return outraSelecao.pontos - this.pontos;
        }
        return outraSelecao.saldoDeGols - this.saldoDeGols;
    }

    @Override
    public String toString() {
        return this.getNomeSelecao() + ": " + this.getPontos();
    }


}
