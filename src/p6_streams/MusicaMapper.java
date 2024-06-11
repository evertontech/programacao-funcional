package p6_streams;

import java.util.Locale;

public class MusicaMapper {
    private String titulo;
    private double duracaoEmMinutos;

    public MusicaMapper(Musica musica) {
        this.setTitulo(musica.getTitulo());
        int segundos = musica.getDuracaoEmSegundos();
        double minutos = segundosParaMinutos(segundos);
        this.setDuracaoEmMinutos(minutos);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        String minutos = String.format(Locale.US, "%.2f", this.duracaoEmMinutos);
        return Double.parseDouble(minutos);
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    private double segundosParaMinutos(int segundos) {
        return segundos / 60.0;
    }

    public String toString() {
        return "Música: " + this.getTitulo() + " - " + this.getDuracaoEmMinutos() + " minutos";
    }
}
