package p1_interfaces;

public class InversorString implements ManipuladorDeString {
    public String aplicar(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
