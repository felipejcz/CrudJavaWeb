
package model;

public class Produto {
    private int idProduto;
    private String descricao;
    private float preco;

    public Produto() {
    }

    public Produto(String descricao, float preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(int idProduto, String descricao, float preco) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
    }

    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
