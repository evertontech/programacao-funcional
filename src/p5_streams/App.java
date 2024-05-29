package p5_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> comprimentoMaisUm = s -> s.length() + 1;

        Predicate<String> isMaiorQueOito = s -> comprimentoMaisUm.apply(s) >= 8;

        Predicate<String> isCaractereDiferente = s -> s.charAt(0) != s.charAt(s.length() - 1);

        UnaryOperator<String> converteString = s -> s.toUpperCase() + "!";

        Predicate<String> isVogal = s -> s.substring(0, 1).matches("(?i)[aeiou]");

        Consumer<String> imprimeString = s -> System.out.println("Fruta: " + s);

        List<String> listaDeFrutas = Arrays.asList("laranja", "banana", "abacaxi", "uva", "kiwi", "melancia", "acerola",
                "morango", "ameixa", "jabuticaba", "umbu-cajá");

        Stream<String> listaDeFrutasStream = listaDeFrutas.stream();

        listaDeFrutasStream
                .filter(isMaiorQueOito)
                .filter(isCaractereDiferente)
                .map(converteString)
                .filter(isVogal)
                .forEach(imprimeString);
    }
}
