package pedido;

public class PedidoSimples implements Pedido{

    private double precoDosItens;
    private double freteFixo = 5.40;
    private double desconto;

    public PedidoSimples(double precoDosItens, double freteFixo, double desconto) {
        this.precoDosItens = precoDosItens;
        this.freteFixo = freteFixo;
        this.desconto = desconto;
    }

    @Override
    public int obterId() {
        return 0;
    }

    @Override
    public void obterCliente() {}

    @Override
    public void obterDataPedido() {}

    @Override
    public void obterItens() {}

    @Override
    public double calcularValorTotal() {
        if(desconto < 0 || desconto > 100)
            return 0;
        else
            return precoDosItens -= precoDosItens * (desconto / 100) + freteFixo;
    }

    @Override
    public void aplicarDesconto(double desconto) {}

    public double getPrecoDosItens() {
        return precoDosItens;
    }

    public void setPrecoDosItens(double precoDosItens) {
        this.precoDosItens = precoDosItens;
    }

    public double getFreteFixo() {
        return freteFixo;
    }

    public void setFreteFixo(double freteFixo) {
        this.freteFixo = freteFixo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "PedidoSimples{" +
                "precoDosItens=" + precoDosItens +
                ", freteFixo=" + freteFixo +
                ", desconto=" + desconto +
                '}';
    }
}
