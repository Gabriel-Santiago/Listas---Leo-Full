package pedido;

public interface Pedido {
    int obterId();
    void obterCliente();
    void obterDataPedido();
    void obterItens();
    double calcularValorTotal();
    void aplicarDesconto(double desconto);
}
