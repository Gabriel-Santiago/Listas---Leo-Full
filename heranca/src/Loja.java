import pedido.Pedido;
import pedido.PedidoExpress;
import pedido.PedidoSimples;

import java.util.List;

public class Loja {

    private List<Produto> produtos;
    private List<Pedido> pedidos;
    private int id;

    public Loja(List<Produto> produtos, List<Pedido> pedidos, int id) {
        this.produtos = produtos;
        this.pedidos = pedidos;
        this.id = id;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public void criarPedido(Cliente cliente, List<ItemPedido> itens){

    }

    public List<Pedido> listarPedidos(){
        return pedidos;
    }

    public Pedido obterPedidoPorId(int idPedido){
        return pedidos.stream()
                .filter(pedido -> pedido.obterId() == idPedido)
                .findFirst()
                .orElse(null);
    }

    public double calcularFaturamentoTotal(){
        return pedidos.stream()
                .mapToDouble(Pedido::calcularValorTotal)
                .sum();
    }
}
