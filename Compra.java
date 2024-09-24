import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private int idCompra;
    private Usuario usuarioComprador;
    private List<ItemCompra> itensComprados;
    private Date dataCompra;

    public Compra(int idCompra, Usuario usuarioComprador) {
        this.idCompra = idCompra;
        this.usuarioComprador = usuarioComprador;
        this.itensComprados = new ArrayList<>();
        this.dataCompra = new Date(); // Data atual
    }

    public void adicionarItem(ItemCompra item) {
        itensComprados.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCompra item : itensComprados) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Compra #" + idCompra);
        System.out.println("Data da Compra: " + dataCompra);
        System.out.println("Comprador: " + usuarioComprador.getNome());
        System.out.println("Itens Comprados:");
        for (ItemCompra item : itensComprados) {
            item.exibirDetalhes();
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
