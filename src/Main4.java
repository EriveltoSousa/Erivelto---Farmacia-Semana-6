import br.com.alura.famacia.service.ProdutoService;

public class Main4 {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        produtoService.deletar("projeto");
        System.out.println(produtoService.listar());
    }

}
