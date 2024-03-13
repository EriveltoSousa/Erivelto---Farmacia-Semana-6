import br.com.alura.famacia.service.ProdutoService;

public class Main3 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        produtoService.editarPreco("projeto", 900);
        System.out.println(produtoService.listar());
    }
}
