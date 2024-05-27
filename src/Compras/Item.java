package Compras;

public class Item {
    public String Nome;
    public double Preco;
    public int Quantidade;

    public Item(String nome, Double preco, int quantidade) {
        Nome = nome;
        Preco = preco;
        Quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    @Override
    public String toString() {
         return "Nome: " + Nome + ", Preco: " + Preco + ", Quantidade: " + Quantidade;
    }

}
