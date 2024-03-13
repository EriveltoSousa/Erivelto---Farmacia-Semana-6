package br.com.alura.famacia.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarconexao() {
        try {
            return createDataSource().getConnection();

        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private HikariDataSource createDataSource() {
       HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/projeto_farmacia-senac");
        config.setUsername("root");
        config.setPassword("root");
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
