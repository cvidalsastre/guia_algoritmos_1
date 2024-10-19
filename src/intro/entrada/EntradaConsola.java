package intro.entrada;

import java.util.Scanner;

import intro.salida.SalidaConsola;

public class EntradaConsola {
    public EntradaConsola(Integer cantidadEntradas) {
        String[] entradas = new String[cantidadEntradas];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cantidadEntradas; i++) {
            System.out.println("Ingrese la entrada " + (i + 1));
            entradas[i] = sc.nextLine();
            SalidaConsola.mostrarEnPantalla(entradas[i]);
        }
        sc.close();

    }
}
