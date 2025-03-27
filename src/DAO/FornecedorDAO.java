package DAO;

import model.Fornecedor;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FornecedorDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirFornecedor(Fornecedor fornecedor) {
        try (Connection conn =  conexao.conectar();
            PreparedStatement novoFornecedor = conn.prepareStatement("INSERT INTO fornecedor " +
                 "(nome, cnpj, telefone, email) VALUES (?,?,?,?);")){

            novoFornecedor.setString(1, fornecedor.getNome());
            novoFornecedor.setString(2, fornecedor.getCnpj());
            novoFornecedor.setString(3, fornecedor.getTelefone());
            novoFornecedor.setString(4, fornecedor.getEmail());

            int rowsAffected = novoFornecedor.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        try(Connection conn = conexao.conectar();
            PreparedStatement fornecedorAtualizado = conn.prepareStatement("UPDATE fornecedor SET" +
                    " nome = ?, cnpj = ?, telefone = ?, email = ? WHERE idFornecedor = ?")){

            fornecedorAtualizado.setString(1, fornecedor.getNome());
            fornecedorAtualizado.setString(2, fornecedor.getCnpj());
            fornecedorAtualizado.setString(3, fornecedor.getTelefone());
            fornecedorAtualizado.setString(4, fornecedor.getEmail());

            int rowsAffected = fornecedorAtualizado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarFornecedor(int idFornecedor) {
        try(Connection conn = conexao.conectar();
            PreparedStatement fornecedorDeletado = conn.prepareStatement("DELETE FROM fornecedor" +
                    "WHERE idFornecedor = ?;")){

            fornecedorDeletado.setInt(1, idFornecedor);

            int rowsAffected = fornecedorDeletado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
