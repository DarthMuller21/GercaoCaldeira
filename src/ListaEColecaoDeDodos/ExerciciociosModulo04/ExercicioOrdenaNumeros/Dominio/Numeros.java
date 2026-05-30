package ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioOrdenaNumeros.Dominio;

import org.jetbrains.annotations.NotNull;

public class Numeros implements Comparable<Numeros>{
    private int Numeros;

    public Numeros(int Numero1){
        this.Numeros = Numero1;
    }

    public int getNumeros() {
        return Numeros;
    }

    public void setNumeros(int numeros) {
        Numeros = numeros;
    }


    @Override
    public int compareTo(@NotNull Numeros o) {
        return Integer.compare(getNumeros(),o.getNumeros());
    }

    @Override
    public String toString() {
        return String.valueOf(Numeros);
    }
}
