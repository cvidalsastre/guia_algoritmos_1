import intro.Persona;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.Rect;

import intro.Libro;
import intro.Rectangulo;

public class App {

    // Intro persona
    public static void main(String[] args) throws Exception {
        // Persona p = new Persona("Juan", 30);
        // p.saludar();

        // ArrayList<Persona> lista = new ArrayList<Persona>();
        // Scanner sc = new Scanner(System.in);
        // Persona.crearPersonaSaludar(args);

// Libro
        // Libro libro1 = new Libro("El precio del amor", "Cristian", 2021);
        // Libro libro2 = new Libro("El precio del amor", "Cristian");
        // System.out.println(libro1.year);
        // System.out.println(libro2.year);

        // Rectangulo
        Rectangulo r = new Rectangulo(10, 20);
        r.areaPerimetro();
        Rectangulo r2 = new Rectangulo(5, 5);   
        r2.areaPerimetro();
        r2.perimetro()


    }

}
