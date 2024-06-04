package vendavel;

public class Produto implements Vendavel{

    private double precoUnitario;
    private int quantidadeEmEstoque;

    public Produto(double precoUnitario, int quantidadeEmEstoque) {
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double calcularPrecoTotal(int quantidade) {
        if(quantidade > quantidadeEmEstoque)
            return 0.0;
        else
            return quantidade * precoUnitario;
    }

    public void aplicarDesconto(double desconto) {
        if(desconto < 0 || desconto > 100)
            System.out.println("Valor de desconto impossível");
        else
            precoUnitario -= precoUnitario * (desconto / 100);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "precoUnitario=" + precoUnitario +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
