import br.com.alura.famacia.service.ProdutoService;

public class main2 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        System.out.println(produtoService.listar());

    }
}
