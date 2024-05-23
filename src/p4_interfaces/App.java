package p4_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class App {
    public static void main(String[] args) {

        Supplier<List<Produto>> retornarListaDeProdutos = () -> Arrays.asList(
                new Produto("Caneta Esferográfica Premium", 15.75, 0.10),
                new Produto("Caderno Executivo de Couro", 69.99, 0.15),
                new Produto("Conjunto de Canetas Técnicas", 40.50, 0.20),
                new Produto("Lápis de Cor Profissional (36 cores)", 50.25, 0.15),
                new Produto("Kit de Pincéis Artísticos", 60.80, 0.10),
                new Produto("Calculadora Científica Avançada", 80.49, 0.10),
                new Produto("Maleta de Aquarela Profissional", 89.90, 0.10),
                new Produto("Mochila Térmica para Transporte de Material", 30.20, 0.05),
                new Produto("Quadro Branco Magnético", 20.15, 0.05),
                new Produto("Estojo de Canetas Brush Lettering", 10.75, 0.10)
        );

        Function<Produto, Double> calcularPrecoFinal = (produto) -> produto.preco * (1 - produto.desconto);

        Predicate<Double> temFrete = (preco) -> preco < 50.00;

        UnaryOperator<Double> acrescerFrete = (preco) -> {
            if (temFrete.test(preco)) {
                preco += 9.99;
            }
            return preco;
        };

        UnaryOperator<Double> acrescerImposto = (preco) -> preco + preco * 0.045;

        UnaryOperator<Double> arredondarPreco = (preco) -> {
            String resultado = String.format(Locale.US, "%.2f", preco);
            return Double.parseDouble(resultado);
        };

        BiConsumer<Produto, Double> imprimirProduto = (produto, novoPreco) -> {
            System.out.println(produto.nome + ": R$ " + novoPreco);
        };

        retornarListaDeProdutos.get().forEach(produto -> {
            Double precoFinal = calcularPrecoFinal
                    .andThen(acrescerFrete)
                    .andThen(acrescerImposto)
                    .andThen(arredondarPreco)
                    .apply(produto);

            imprimirProduto.accept(produto, precoFinal);
        });
    }
}
