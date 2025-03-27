package model;

public class Produto {
    private int idProduto;
    private String nome;
    private Double preco;
    private int idFonercedor;


    public Produto (String nome, Double preco, int idFonercedor ) {
        this.nome = nome;
        this.preco = preco;
        this.idFonercedor = idFonercedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getIdFonercedor() {
        return idFonercedor;
    }

    public void setIdFonercedor(int idFonercedor) {
        this.idFonercedor = idFonercedor;
    }
}
