package IntroducaoPOO.Interface04.Tabuada03.dominio;

public class MultiplicacaoTabuada implements Tabuada{

    @Override
    public void mostrarTabuada(int numTabuada) {
        for (int i = 1; i < 11; i++) {
            System.out.println(numTabuada +" x "+i+" = "+numTabuada*i);
        }
    }
}
