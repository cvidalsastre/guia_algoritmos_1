package polimorfismo.reproductores;
import polimorfismo.Medio;
public class Pelicula extends Medio{
    private String nombre;
    private String director;

    public Pelicula (String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    } 
        public void reproducir() {
        System.out.println("Viendo " + nombre + " de " + director);
    }
}
