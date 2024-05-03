package p1_interfaces;

public class Main {
    public static void main(String[] args) {

        ManipuladorDeString manipuladorDeString;

        manipuladorDeString = new InversorString();
        System.out.println(manipuladorDeString.aplicar("batatinha123"));

        manipuladorDeString = new ExcluirEspacosExtras();
        System.out.println(manipuladorDeString.aplicar(" Elon Musk "));

        manipuladorDeString = (str) -> {
            return str.toUpperCase();
        };

        System.out.println(manipuladorDeString.aplicar(" Elon Musk "));
    }
}
