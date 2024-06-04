package moeda;

public class ConversorMoeda implements ConversaoFinanceira{
    private static final double TAXA_CAMBIO = 5.14;

    public double converterDolarParaReal(double valorDolar){
        return (valorDolar * TAXA_CAMBIO);
    }
}
