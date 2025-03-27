package DAO;

import model.Produto;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirProduto(Produto produto) {
        try(Connection conn = conexao.conectar();
            PreparedStatement novoProduto = conn.prepareStatement("INSERT INTO produtos" +
                    " (nome = ?,preco = ?, idFonercedor = ?) VALUES (?,?,?);")){

            novoProduto.setString(1, produto.getNome());
            novoProduto.setDouble(2, produto.getPreco());
            novoProduto.setInt(3, produto.getIdFonercedor());

            int rowsAffected = novoProduto.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarProduto(Produto produto) {
        try(Connection conn = conexao.conectar();
            PreparedStatement produtoAtualizado = conn.prepareStatement("UPDATE produtos SET" +
                    " nome = ?,preco = ?, idFonercedor = ? WHERE idProduto = ?;")){

            produtoAtualizado.setString(1, produto.getNome());
            produtoAtualizado.setDouble(2, produto.getPreco());
            produtoAtualizado.setInt(3, produto.getIdFonercedor());
            produtoAtualizado.setInt(4, produto.getIdProduto());

            int rowsAffected = produtoAtualizado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarProduto(int idProduto) {
        try(Connection conn = conexao.conectar();
            PreparedStatement produtoDeletado = conn.prepareStatement("DELETE FROM " +
                    " produtos WHERE idProduto = ?;")){

            produtoDeletado.setInt(1, idProduto);
            int rowsAffected = produtoDeletado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
