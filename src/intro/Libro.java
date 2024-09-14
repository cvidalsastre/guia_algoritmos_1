package intro;
import java.time.LocalDate;

public class Libro {
    public String titulo;
    public String autor;
    public Integer year;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = LocalDate.now().getYear();
    }

    public Libro(String titulo, String autor, Integer year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }



}
