package polimorfismo.reproductores;
import polimorfismo.Medio;

public class Libro extends Medio {
    private String titulo;
    private String autor;

    public Libro (String titulo,String autor){
        this.titulo = titulo;    
        this.autor = autor;

    }
      public void reproducir() {
        System.out.println("Leyendo " + titulo + " de " + autor);
    }
}
