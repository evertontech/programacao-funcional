package p2_interfaces;

import java.util.function.BiFunction;

public class Main {

    public static Double calcular(Double x, Double y) {
        return x - y;
    }

    public static void main(String[] args) {

        BiFunction<Double, Double, Double> operacao;

        operacao = (x, y) -> x + y;
        System.out.println(operacao.apply(5.5,55.5));

        operacao = (entrada1, entrada2) -> entrada2 != 0 ? entrada1 / entrada2 : null;
        System.out.println(operacao.apply(100.00, 55.00));

        operacao = (base, expoente) -> {
            double resultado = 1.0;
            for (int i = 0; i < expoente; ++i) {
                resultado = resultado * base;
            }
            return resultado;
        };

        System.out.println(operacao.apply(2.0, 3.0));

        operacao = Main::calcular;
        System.out.println(operacao.apply(10.0, 50.0));

    }
}
