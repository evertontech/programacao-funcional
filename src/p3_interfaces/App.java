package p3_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {

    public static void imprimirNome(String str) {
        System.out.println("Olá, meu nome é: " + str);
    }

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Everton", "Helton", "Maria", "Elon M", "Luciano Hang");

        System.out.println("1 - Iteração comum (for com contador) e impressão usando System.out.println()");
        for (int i = 0; i < nomes.size(); ++i) {
            System.out.println("Nome: " + nomes.get(i));
        }

        System.out.println("2 - Iteração comum (for com contador) e impressão usando imprimirNome()");
        for (int i = 0; i < nomes.size(); ++i) {
            imprimirNome(nomes.get(i));
        }

        System.out.println("3 - Iteração usando enhanced for do Java e impressão usando System.out.println()");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("4 - Iteração usando enhanced for do Java e impressão usando imprimirNome()");
        for (String nome : nomes) {
            imprimirNome(nome);
        }

        System.out.println("5 - Método forEach do objeto lista com expressão lambda (Consumer) e impressão usando " +
                "System.out.println()");
        Consumer<String> imprimirNomeConsumer = (str) -> System.out.println("Olá retorne esse nome: " + str);
        nomes.forEach(imprimirNomeConsumer);
        nomes.forEach((str) -> System.out.println("Olá retorne esse nome: " + str));

        System.out.println("6 - Método forEach do objeto lista com expressão lambda (Consumer) e impressão usando " +
                "imprimirNome()");
        Consumer<String> imprimirMetodoConsumer = (str) -> imprimirNome(str);
        nomes.forEach(imprimirMetodoConsumer);

        System.out.println("7 - Método forEach do objeto lista com referência de método e impressão usando " +
                "System.out.println()");
        nomes.forEach(System.out::println);

        System.out.println("8 - Método forEach do objeto lista com referência de método e impressão usando " +
                "imprimirNome()");
        nomes.forEach(App::imprimirNome);
    }
}
