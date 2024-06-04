package calculavel;

public class ProdutoFisico implements Calculavel{

    private double precoBase;
    private double custoDeEnvio;
    private double taxaDeImposto;

    public ProdutoFisico(double precoBase, double custoDeEnvio, double taxaDeImposto) {
        this.precoBase = precoBase;
        this.custoDeEnvio = custoDeEnvio;
        this.taxaDeImposto = taxaDeImposto;
    }

    public double calcularPrecoFinal() {
        return ((precoBase * (1 + (taxaDeImposto / 100))) + custoDeEnvio);
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getCustoDeEnvio() {
        return custoDeEnvio;
    }

    public void setCustoDeEnvio(double custoDeEnvio) {
        this.custoDeEnvio = custoDeEnvio;
    }

    public double getTaxaDeImposto() {
        return taxaDeImposto;
    }

    public void setTaxaDeImposto(double taxaDeImposto) {
        this.taxaDeImposto = taxaDeImposto;
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "precoBase=" + precoBase +
                ", custoDeEnvio=" + custoDeEnvio +
                ", taxaDeImposto=" + taxaDeImposto +
                '}';
    }
}
