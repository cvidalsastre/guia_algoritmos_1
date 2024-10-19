package polimorfismo;
import polimorfismo.Medio;
import polimorfismo.reproductores.*;
import java.util.ArrayList;
public class PruebaReproductor {

    public static void main (String[] args) {
         ArrayList<Medio> medios = new ArrayList<>();
         int n = 0;
         medios.add(new Libro("1984","Orwel"));
         medios.add(new Medio());
         medios.add(new Musica(" falopa y pasta base","el doc"));
         medios.add(new Pelicula("el joker", "no me acuerdo"));
         for (Medio medio : medios){
            n = n+1;
            System.out.println("Medio n°" + n);
            medio.reproducir();

         }
        
         
    }

}
