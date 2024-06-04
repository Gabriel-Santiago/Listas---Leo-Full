import pedido.Pedido;

public class Main {
    public static void main(String[] args) {

        Produto produto;
        Cliente cliente;
        Loja loja = null;
        Pedido pedido;

        Produto produtoOne = new Produto("Celular", "Todo mundo tem", 1890.72);
        Produto produtoTwo = new Produto("Tablet", "Todo mundo tem", 1800);
        Produto produtoThree = new Produto("Notebook", "Todo mundo tem", 2700);
        
        loja.adicionarProduto(produtoOne);
    }
}