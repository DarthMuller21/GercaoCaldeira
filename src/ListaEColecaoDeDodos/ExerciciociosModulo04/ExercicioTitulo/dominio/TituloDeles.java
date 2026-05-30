package ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioTitulo.dominio;

import org.jetbrains.annotations.NotNull;

public class TituloDeles implements Comparable<TituloDeles> {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(@NotNull TituloDeles o) {
        return this.getTitulo().compareTo(o.getTitulo()) ;
    }

    @Override
    public String toString() {
        return this.getTitulo();
    }
}
