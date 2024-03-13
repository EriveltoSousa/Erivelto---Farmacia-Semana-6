package br.com.alura.famacia.dao;

import br.com.alura.famacia.service.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection conn;

    public ProdutoDAO (Connection connection){
        this.conn = connection;

    }

    public void salvar (Produto produto) {
        String sql = "INSERT INTO produtos (preco, nome, fabricante)" +
                "VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setDouble(1, produto.getPreço());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getFabricante());
            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Produto> listar(){
        PreparedStatement ps;
        ResultSet resultSet;
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT * FROM produtos";
        try {
            ps = conn.prepareStatement(sql);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                double preco = resultSet.getDouble(2);
                String nome = resultSet.getNString(3);
                String fabricante = resultSet.getNString(4);

                produtos.add(new Produto(nome, fabricante, preco));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }


    public void editarPreco( double valor, String nome) {
        PreparedStatement ps;
        String sql = "UPDATE SET preco = ? WHERE nome = ?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, valor);
            ps.setString(2, nome);

            ps.execute();
            ps.close();
            conn.close();
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletar(String nome){
        String sql = "DELETE FROM produtos WHERE nome =?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome);

            ps.execute();
            ps.close();
            conn.close();
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
