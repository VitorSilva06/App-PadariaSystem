package DAO;

import model.Endereco;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirEnderco(Endereco endereco) {
        try(Connection conn = conexao.conectar();
            PreparedStatement novoEndereco = conn.prepareStatement("INSERT INTO endereco (cep,logradouro,bairro" +
                    "cidade,estado,numero,idCliente, idFornecedor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")){

            novoEndereco.setString(1, endereco.getCep());
            novoEndereco.setString(2, endereco.getLogradouro());
            novoEndereco.setString(3, endereco.getBairro());
            novoEndereco.setString(4, endereco.getCidade());
            novoEndereco.setString(5, endereco.getEstado());
            novoEndereco.setInt(6, endereco.getNumero());
            novoEndereco.setInt(7, endereco.getIdCliente());
            novoEndereco.setInt(8, endereco.getIdFornecedor());

            int rowsAffected = novoEndereco.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


    public boolean atulizarEndereco(Endereco endereco) {
        try(Connection conn = conexao.conectar();
            PreparedStatement enderecoAtualizado = conn.prepareStatement("UPDATE endereco SET " +
                    "cep = ?,logradouro = ?,bairro = ?,cidade = ?,estado = ?,numero = ?,idCliente = ?, idFornecedor = ?" +
                    "WHERE idEndereco = ?;")){

            enderecoAtualizado.setString(1, endereco.getCep());
            enderecoAtualizado.setString(2, endereco.getLogradouro());
            enderecoAtualizado.setString(3, endereco.getBairro());
            enderecoAtualizado.setString(4, endereco.getCidade());
            enderecoAtualizado.setString(5, endereco.getEstado());
            enderecoAtualizado.setInt(6, endereco.getNumero());
            enderecoAtualizado.setInt(7, endereco.getIdCliente());
            enderecoAtualizado.setInt(8, endereco.getIdFornecedor());
            enderecoAtualizado.setInt(9, endereco.getIdEndereco());

            int rowsAffected = enderecoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public boolean deletarEndereco(Endereco endereco) {
        try(Connection conn = conexao.conectar();
            PreparedStatement enderecoDeletado = conn.prepareStatement("DELETE FROM endereco" +
                    " WHERE idEndereco = ?;")){

            enderecoDeletado.setInt(1, endereco.getIdEndereco());

            int rowsAffected = enderecoDeletado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
