package p6_streams;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoEmSegundos;
    private Genero genero;

    public Musica(String titulo, String artista, int duracaoEmSegundos, Genero genero) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setDuracaoEmSegundos(duracaoEmSegundos);
        this.setGenero(genero);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista(String artista) {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoEmSegundos() {
        return this.duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
