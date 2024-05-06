package p1_interfaces;

public class InversorString implements ManipuladorString {

    public String aplicar(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
