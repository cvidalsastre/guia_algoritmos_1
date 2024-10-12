package herencia.alquiler_vehiculos;
import herencia.alquiler_vehiculos.vehiculos.Moto;
import herencia.alquiler_vehiculos.vehiculos.Auto;
import java.util.ArrayList;

public class PruebaAlquiler {

    public static void main(String[] args){
        Vehiculo m1 = new Moto("scooter", "c90", 10.0);
        Vehiculo a1 = new Auto("ford", "k", 1000.2);

        // m1.calcularCostoAlquiler(1);
        // a1.calcularCostoAlquiler(1);
        System.out.println(m1.calcularCostoAlquiler(1));
        System.out.println(a1.calcularCostoAlquiler(1));

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(m1);
        vehiculos.add(a1);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.calcularCostoAlquiler(1));
        }
    }
    
}
