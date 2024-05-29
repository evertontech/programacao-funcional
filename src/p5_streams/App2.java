package p5_streams;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {

        Stream.of("laranja", "banana", "abacaxi", "uva", "kiwi", "melancia", "acerola",
                        "morango", "ameixa", "jabuticaba", "umbu-cajá")
                .filter(s -> s.length() + 1 >= 8)
                .filter(s -> s.charAt(0) != s.charAt(s.length() - 1))
                .map(s -> s.toUpperCase() + "!")
                .filter(s -> s.substring(0, 1).matches("(?i)[aeiou]"))
                .forEach(s -> System.out.println("Fruta: " + s));
    }
}
