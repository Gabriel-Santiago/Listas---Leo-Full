package pedido;

public class PedidoExpress implements Pedido{

    private double precoDosItens;
    private double freteExpresso;
    private double desconto;

    public PedidoExpress(double precoDosItens, double freteExpresso, double desconto) {
        this.precoDosItens = precoDosItens;
        this.freteExpresso = freteExpresso;
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
            return precoDosItens -= precoDosItens * (desconto / 100) + freteExpresso;
    }

    @Override
    public void aplicarDesconto(double desconto) {}

    public double getPrecoDosItens() {
        return precoDosItens;
    }

    public void setPrecoDosItens(double precoDosItens) {
        this.precoDosItens = precoDosItens;
    }

    public double getFreteExpresso() {
        return freteExpresso;
    }

    public void setFreteExpresso(double freteExpresso) {
        this.freteExpresso = freteExpresso;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "PedidoExpress{" +
                "precoDosItens=" + precoDosItens +
                ", freteExpresso=" + freteExpresso +
                ", desconto=" + desconto +
                '}';
    }
}
