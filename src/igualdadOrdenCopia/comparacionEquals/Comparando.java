package igualdadOrdenCopia.comparacionEquals;
import igualdadOrdenCopia.comparacionEquals.MiClase;


public class Comparando {
     public static void main(String[] args) {
        MiClase objeto1 = new MiClase("A", "a");
        MiClase objeto2 = new MiClase("A", "a");
        
        // Comparación usando equals
        boolean sonIguales = objeto1.equals(objeto2);
        System.out.println("¿Son iguales? " + sonIguales);
        
        // Comparación de identidad
        boolean sonMismaReferencia = (objeto1 == objeto2);
        System.out.println("¿Son el mismo objeto? " + sonMismaReferencia);
    }
}
