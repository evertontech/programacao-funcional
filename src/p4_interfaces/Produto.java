package p4_interfaces;

public class Produto {
    public String nome;
    public Double preco;
    public Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        return this.nome + " tem preço R$ " + this.preco + " e desconto de " + this.desconto;
    }
}
