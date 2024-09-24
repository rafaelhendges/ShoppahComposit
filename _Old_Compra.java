import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _Old_Compra {
    private int idCompra;
    private Usuario usuarioComprador;
    private List<_Old_Produto> produtosComprados;
    private Date dataCompra;

    public _Old_Compra(int idCompra, Usuario usuarioComprador) {
        this.idCompra = idCompra;
        this.usuarioComprador = usuarioComprador;
        this.produtosComprados = new ArrayList<>();
        this.dataCompra = new Date(); // Data atual
    }

    public void adicionarProduto(_Old_Produto produto) {
        produtosComprados.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (_Old_Produto produto : produtosComprados) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Compra #" + idCompra);
        System.out.println("Data da Compra: " + dataCompra);
        System.out.println("Comprador: " + usuarioComprador.getNome());
        System.out.println("Produtos Comprados:");
        for (_Old_Produto produto : produtosComprados) {
            System.out.println(produto.getNome());
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}