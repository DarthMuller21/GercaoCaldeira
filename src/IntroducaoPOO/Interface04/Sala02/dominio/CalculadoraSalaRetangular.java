package IntroducaoPOO.Interface04.Sala02.dominio;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double Altura, double Largura) {
        double area = Altura * Largura;
        System.out.println("A area é "+area);
    }

    @Override
    public void calcularPerimetro(double Altura, double Largura) {
        double perimetro =  (Altura *2) + (Largura *2);
        System.out.println("O perimetro é  "+ perimetro);
    }
}
