package p2_interfaces;

public class Divisao implements Operacao{

    public Double calcular(Double entrada1, Double entrada2) {
        return entrada2 == 0 ? null : entrada1 / entrada2;
    }
}
