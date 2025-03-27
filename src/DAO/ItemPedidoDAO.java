package DAO;

import model.ItemPedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemPedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirItemPedido(ItemPedido itemPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement novoItemPedido = conn.prepareStatement("INSERT INTO itenspedidos" +
                    "(quantidade, precoUnitario, idPedido, idProduto) VALUES (?,?,?,?);")){

            novoItemPedido.setInt(1, itemPedido.getQuantidade());
            novoItemPedido.setDouble(2, itemPedido.getPrecoUnitario());
            novoItemPedido.setInt(3, itemPedido.getIdPedido());
            novoItemPedido.setInt(4, itemPedido.getIdProduto());

            int rowsAffected = novoItemPedido.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


    public boolean atualizarItemPedido(ItemPedido itemPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement itemPedidoAtualizado = conn.prepareStatement("UPDATE itenspedidos SET" +
                    " quantidade = ?, precoUnitario = ?, idPedido = ?, idProduto = ? WHERE idItemPedido = ?;")){

            itemPedidoAtualizado.setInt(1, itemPedido.getQuantidade());
            itemPedidoAtualizado.setDouble(2, itemPedido.getPrecoUnitario());
            itemPedidoAtualizado.setInt(3, itemPedido.getIdPedido());
            itemPedidoAtualizado.setInt(4, itemPedido.getIdProduto());
            itemPedidoAtualizado.setInt(5, itemPedido.getIdItemPedido());

            int rowsAffected = itemPedidoAtualizado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarItemPedido(ItemPedido itemPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement itemPedidoDeletado = conn.prepareStatement("DELETE FROM itenspedidos WHERE idItemPedido =?;")){

            itemPedidoDeletado.setInt(1, itemPedido.getIdItemPedido());

            int rowsAffected = itemPedidoDeletado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
