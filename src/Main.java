import br.com.alura.famacia.modelo.Produtos;
import br.com.alura.famacia.service.Produto;
import br.com.alura.famacia.service.ProdutoService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Projeto farmacia semana 6");

        Produto produto = new Produto("projet", "projeto", 100.20);
        ProdutoService produtoService = new ProdutoService();
        ProdutoService.cadastrar(produto);

    }
}