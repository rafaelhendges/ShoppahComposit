import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private List<Produto> produtosFavoritos;

    public Usuario(int idUsuario, String nome, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.produtosFavoritos = new ArrayList<>();
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void adicionarFavorito(Produto produto) {
        produtosFavoritos.add(produto);
    }

    public void removerFavorito(Produto produto) {
        produtosFavoritos.remove(produto);
    }

    public void listarFavoritos() {
        System.out.println("Produtos Favoritos de " + nome + ":");
        for (Produto produto : produtosFavoritos) {
            System.out.println(produto.getNome());
        }
    }
}