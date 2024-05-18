package p4_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class App {
    public static void main(String[] args) {

        Supplier<List<Produto>> retornarListaDeProdutos = () -> Arrays.asList(
                new Produto("Band-Aid", 12.00, 0.25),
                new Produto("Spray", 107.00, 0.15),
                new Produto("Teste de gravidez", 55.00, 0.10),
                new Produto("Esparadrapo", 155.00, 0.25),
                new Produto("Fralda", 45.00, 0.25)
        );

        Function<Produto, Double> calcularPrecoFinal = (produto) -> produto.preco * produto.desconto;

        Predicate<Double> temFrete = (preco) -> preco > 50.00;

        UnaryOperator<Double> acrescerFrete = (preco) -> {
            if (temFrete.test(preco)) {
                preco += 9.90;
            }
            return preco;
        };

        UnaryOperator<Double> acrescerImposto = (preco) -> preco * 0.045;

        UnaryOperator<Double> arredondarPreco = (preco) -> Math.floor(preco);

        Consumer<Produto> imprimirProduto = (produto) -> {
            System.out.println(produto.nome + produto.preco + produto.desconto);
        };
    }
}
