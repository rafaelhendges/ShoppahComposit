//Para implementar o padrão Composite no sistema do shoppah, o objetivo 
//será tratar tanto produtos simples quanto pacotes de produtos de maneira uniforme. 
//O padrão Composite permite que objetos individuais e composições de objetos sejam manipulados da mesma forma.

public interface ItemCompra {
    double getPreco();

    void exibirDetalhes();
}