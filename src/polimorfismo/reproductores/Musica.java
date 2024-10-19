package polimorfismo.reproductores;
import polimorfismo.Medio;

public class Musica extends Medio{

    private String titulo;
    private String artista;

    public Musica (String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;

    }

        public void reproducir() {
            
        System.out.println("Escuchando" + titulo +  " de " +artista);
    }
}
