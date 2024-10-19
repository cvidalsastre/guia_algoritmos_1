package funcional.filtrarConPredicado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class Filtrado {

    // Método genérico que filtra una colección según un predicado
    public static <T> List<T> filtrarConPredicado(Collection<T> coleccion, Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : coleccion) {
            if (predicado.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo 1: Filtrar números pares
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12);
        List<Integer> pares = filtrarConPredicado(numeros, n -> n % 2 == 0);
        System.out.println("Números pares: " + pares);  // [2, 4, 6, 8, 10]

        // Ejemplo 2: Filtrar números mayores a 10
        List<Integer> mayoresADiez = filtrarConPredicado(numeros, n -> n > 10);
        System.out.println("Números mayores a 10: " + mayoresADiez);  // []

        // Ejemplo 3: Filtrar cadenas de más de 5 caracteres
        List<String> cadenas = Arrays.asList("hola", "mundo", "programación", "java");
        List<String> cadenasLargas = filtrarConPredicado(cadenas, s -> s.length() > 5);
        System.out.println("Cadenas de más de 5 caracteres: " + cadenasLargas);  // [programación]

        // Ejemplo 4: Filtrar elementos mayores a cierto elemento (usando Comparable)
        List<Integer> numerosOrdenados = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> mayoresAQuince = filtrarConPredicado(numerosOrdenados, n -> n > 15);
        System.out.println("Números mayores a 15: " + mayoresAQuince);  // [20, 25]
    }
}


