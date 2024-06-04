package geometria;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    public double calcularArea(double altura, double largura) {
        return (altura * largura);
    }

    public double calcularPerimetro(double altura, double largura) {
        return ((2 * altura) + (2 * largura));
    }
}
