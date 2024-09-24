public class Produto implements ItemCompra {
    private int idProduto;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(int idProduto, String nome, String descricao, double preco, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("ID: " + idProduto);
        System.out.println("Produto: " + nome + " - Preço: R$" + preco);
        System.out.println("Descricao: " + descricao + " - Quantidade: " + quantidade);
    }

    public String getNome() {
        return nome;
    }
}