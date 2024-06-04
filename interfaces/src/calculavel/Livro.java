package calculavel;

public class Livro implements Calculavel{

    private double precoBase;
    private double desconto;

    public Livro(double precoBase, double desconto) {
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    public double calcularPrecoFinal() {
        return (precoBase * (1 - (desconto / 100)));
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "precoBase=" + precoBase +
                ", desconto=" + desconto +
                '}';
    }
}
