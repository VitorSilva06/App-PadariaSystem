package model;

public class ItemPedido {
    private int idItemPedido;
    private int quantidade;
    private double precoUnitario;
    private int idPedido;
    private int idProduto;

    public ItemPedido(int quantidade, double precoUnitario, int idPedido, int idProduto) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.idPedido = idPedido;
        this.idProduto = idProduto;

    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}
