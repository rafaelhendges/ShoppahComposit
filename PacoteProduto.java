import java.util.ArrayList;
import java.util.List;

public class PacoteProduto implements ItemCompra {
    private List<ItemCompra> itens = new ArrayList<>();
    private String nomePacote;

    public PacoteProduto(String nomePacote) {
        this.nomePacote = nomePacote;
    }

    public void adicionarItem(ItemCompra item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemCompra item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pacote: " + nomePacote);
        for (ItemCompra item : itens) {
            item.exibirDetalhes();
        }
    }
}