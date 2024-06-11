package p6_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static p6_streams.Genero.ROCK;

public class App {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Hey Jude", "The Beatles", 210, ROCK);
        Musica musica2 = new Musica("Imagine", "John Lennon", 180, Genero.POP);
        Musica musica3 = new Musica("Like a Rolling Stone", "Bob Dylan", 370, ROCK);
        Musica musica4 = new Musica("Blue Train", "John Coltrane", 220, Genero.JAZZ);
        Musica musica5 = new Musica("Clair de Lune", "Debussy", 240, Genero.CLASSICA);
        Musica musica6 = new Musica("Hotel California ", "Eagles", 390, ROCK);
        Musica musica7 = new Musica("Stairway to Heaven", "Led Zeppelin", 480, Genero.ROCK);
        Musica musica8 = new Musica("Purple Rain", "Prince", 500, Genero.POP);
        Musica musica9 = new Musica("Juicy", "The Notorious B.I.G.", 360, Genero.HIPHOP);
        Musica musica10 = new Musica("Let It Be", "The Beatles", 230, Genero.ROCK);


        List<Musica> listaDeMusica = new ArrayList<>();

        listaDeMusica.add(musica1);
        listaDeMusica.add(musica2);
        listaDeMusica.add(musica3);
        listaDeMusica.add(musica4);
        listaDeMusica.add(musica5);
        listaDeMusica.add(musica6);
        listaDeMusica.add(musica7);
        listaDeMusica.add(musica8);
        listaDeMusica.add(musica9);
        listaDeMusica.add(musica10);

        Comparator<MusicaMapper> comparator;

        Stream<Musica> listaDeMusicaStream = listaDeMusica.stream();

        listaDeMusicaStream
                .filter(s -> s.getDuracaoEmSegundos() > 250)
                .filter(s -> s.getGenero() == Genero.ROCK)
                .map(MusicaMapper::new)
                .filter(s -> s.getTitulo().split(" ").length > 2)
                .sorted(Comparator.comparing(MusicaMapper::getDuracaoEmMinutos).reversed())
                .forEach(System.out::println);
    }
}
