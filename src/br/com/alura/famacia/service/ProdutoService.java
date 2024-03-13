package br.com.alura.famacia.service;

import br.com.alura.famacia.dao.ConnectionFactory;
import br.com.alura.famacia.dao.ProdutoDAO;

import java.sql.Connection;
import java.util.List;

public class ProdutoService {

    private static ConnectionFactory connection;

    public ProdutoService() {
        this.connection = new ConnectionFactory();
    }

    public static void cadastrar(Produto produto) {
        Connection conn = connection.recuperarconexao();
        new ProdutoDAO(conn).salvar(produto);
    }

    public List<Produto> listar() {
        Connection conn = connection.recuperarconexao();
        return new ProdutoDAO(conn).listar();
    }

    public void editarPreco(String nome, double valor) {
        Connection conn = connection.recuperarconexao();
        new ProdutoDAO(conn).editarPreco(valor, nome);

    }

    public void deletar(String nome) {
        Connection conn = connection.recuperarconexao();
        new ProdutoDAO(conn).deletar(nome);
    }
}
