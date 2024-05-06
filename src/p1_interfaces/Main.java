package p1_interfaces;

public class Main {
    public static String aplicar(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        ManipuladorString manipulador;

        manipulador = new RemovedorDeEspacosExtras();
        System.out.println(manipulador.aplicar(" 123 456 789   1 "));

        manipulador = new InversorString();
        System.out.println(manipulador.aplicar("arroz"));

        manipulador = (str) -> aplicar(str);
        System.out.println(manipulador.aplicar("helton"));

        manipulador = Main::aplicar;
        System.out.println(manipulador.aplicar("everton"));

        manipulador = String::toUpperCase;
        System.out.println(manipulador.aplicar("julia"));
    }
}
