package funcional.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Ordenacion {

    // Método genérico para ordenar una lista con un Comparator
    public static <T> void ordenarConComparator(List<T> lista, Comparator<T> comparador) {
        Collections.sort(lista, comparador);
    }

    public static void main(String[] args) {
        // Ejemplo 1: Ordenar una lista de enteros de menor a mayor
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));
        ordenarConComparator(numeros, Integer::compareTo);
        System.out.println("Números ordenados de menor a mayor: " + numeros);  // [1, 3, 5, 8, 9]

        // Ejemplo 2: Ordenar una lista de cadenas alfabéticamente
        List<String> cadenas = new ArrayList<>(Arrays.asList("hola", "mundo", "java", "programación"));
        ordenarConComparator(cadenas, String::compareTo);
        System.out.println("Cadenas ordenadas alfabéticamente: " + cadenas);  // [hola, java, mundo, programación]

        // Ejemplo 3: Ordenar por longitud de cadena (comparador personalizado)
        ordenarConComparator(cadenas, Comparator.comparingInt(String::length));
        System.out.println("Cadenas ordenadas por longitud: " + cadenas);  // [hola, java, mundo, programación]

        // Ejemplo 4: Ordenar una lista de objetos Persona por edad
        List<Persona> personas = new ArrayList<>(Arrays.asList(
            new Persona("Ana", 25),
            new Persona("Carlos", 30),
            new Persona("Pedro", 20)
        ));
        ordenarConComparator(personas, Comparator.comparingInt(Persona::getEdad));
        System.out.println("Personas ordenadas por edad: " + personas);  // [Pedro (20), Ana (25), Carlos (30)]
    }
}

// Clase Persona para la prueba con objetos
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

