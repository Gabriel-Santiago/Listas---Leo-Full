package vendavel;

public class Servico implements Vendavel{

    private double precoPorHora;
    private double horasDeTrabalho;

    public Servico(double precoPorHora, double horasDeTrabalho) {
        this.precoPorHora = precoPorHora;
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public double calcularPrecoTotal(int quantidade) {
        return precoPorHora * quantidade;
    }

    public void aplicarDesconto(double desconto) {
        if(desconto < 0 || desconto > 100)
            System.out.println("Valor de desconto impossível");
        else
            precoPorHora -= precoPorHora * (desconto / 100);
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(double horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "precoPorHora=" + precoPorHora +
                ", horasDeTrabalho=" + horasDeTrabalho +
                '}';
    }
}
