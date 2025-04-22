package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.user.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Addressdao {
    private Connection connection;

    public Addressdao() throws SQLException {
        connection = ConnectionFactory.getConnection();
    }

    public int save(Address address) throws SQLException {
        int idGenerated = -1;
        try {
            PreparedStatement stm = connection.prepareStatement(
                    "INSERT INTO address (cidade, rua, bairro, numero, complemento) VALUES (?, ?, ?, ?, ?)",
                    PreparedStatement.RETURN_GENERATED_KEYS
            );
            stm.setString(1, address.getCidade());
            stm.setString(2, address.getRua());
            stm.setString(3, address.getBairro());
            stm.setString(4, address.getNumero());
            stm.setString(5, address.getComplemento());
            stm.executeUpdate();

            try (ResultSet generatedKeys = stm.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }else{
                    throw new SQLException("Falha ao obter ID do endereco");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar endereço: " + e.getMessage(), e);
        }
    }

    private void CloseConnection() throws SQLException {
        connection.close();
    }
}