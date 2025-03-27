package DAO;

import model.Pedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirPedido(Pedido pedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement novoPedido = conn.prepareStatement("INSERT INTO pedidos (dataPedido,statusPedido,idCliente)" +
                    "VALUES (?,?,?)")){

            novoPedido.setString(1, pedido.getDataPedido());
            novoPedido.setString(2, pedido.getStatusPedido());
            novoPedido.setInt(3, pedido.getIdCliente());

            int rowsAffected = novoPedido.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarPedido(Pedido pedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement pedidoAtualizado = conn.prepareStatement("UPDATE pedidos SET " +
                    "dataPedido = ?,statusPedido = ?,idCliente = ?;")){

            pedidoAtualizado.setString(1, pedido.getDataPedido());
            pedidoAtualizado.setString(2, pedido.getStatusPedido());
            pedidoAtualizado.setInt(3, pedido.getIdCliente());

            int rowsAffected = pedidoAtualizado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarPedido(Pedido pedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement pedidoDeletado = conn.prepareStatement("DELETE FROM pedidos WHERE idPedido = ?;")){

            pedidoDeletado.setInt(1, pedido.getIdPedido());

            int rowsAffected = pedidoDeletado.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
