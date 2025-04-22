package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.user.Account;
import br.com.fiap.model.user.Address;

import java.sql.*;
import java.time.LocalDate;
import java.util.Random;

public class AccountDao {

    int idGenerated = -1;
    private Connection connection;

    public AccountDao() throws SQLException {
        connection = ConnectionFactory.getConnection();
    }

    public void create(Account account) throws SQLException{
        try(PreparedStatement stm = connection.prepareStatement("INSERT INTO users (nome, dt_nascimento, renda, cpf, email, senha, id_address)VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            LocalDate dt_birth = account.getDt_birth(); //pegando valor da class account
            Date sqlDate = Date.valueOf(dt_birth); //convertendo localDate -> Date
            stm.setString(1, account.getName());
            stm.setDate(2, sqlDate);
            stm.setDouble(3, account.getRenda());
            stm.setString(4, account.getCpf());
            stm.setString(5, account.getEmail());
            stm.setString(6, account.getPassword());
            stm.setInt(7, account.getId_address());
            stm.executeUpdate();

        }
    }
}