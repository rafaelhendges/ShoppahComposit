import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EcommerceApp {
    private int idCompra;
    private Usuario usuarioComprador;
    private List<ItemCompra> itensComprados;
    private LocalDate dataCompra;

    public EcommerceApp(int idCompra, Usuario usuarioComprador) {
        this.idCompra = idCompra;
        this.usuarioComprador = usuarioComprador;
        this.itensComprados = new ArrayList<>();
        this.dataCompra = LocalDate.now(); // Data atual
    }

    public void adicionarItem(ItemCompra item) {
        if (item != null) {
            itensComprados.add(item);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCompra item : itensComprados) {
            if (item != null) {
                total += item.getPreco();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Detalhes da Compra #").append(idCompra).append("\n");
        detalhes.append("Data da Compra: ").append(dataCompra).append("\n");
        detalhes.append("Comprador: ").append(usuarioComprador.getNome()).append("\n");
        detalhes.append("Itens Comprados:\n");
        for (ItemCompra item : itensComprados) {
            if (item != null) {
                detalhes.append(item.toString()).append("\n");
            }
        }
        detalhes.append("Total: R$").append(calcularTotal());
        return detalhes.toString();
    }
}