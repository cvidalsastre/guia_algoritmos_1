package herencia.viajes;
// 
import herencia.viajes.Viaje;
import herencia.viajes.Trayecto;
import herencia.viajes.TipoDeViaje;

public class PruebaViajes {

    public static void main(String[] args) {
        Trayecto trayecto = new Trayecto("Retiro", "La Plata", 50.0, 10, 100,3);
        Viaje viaje = new Viaje(trayecto);
        System.out.println(viaje.tiempoDeDemora(TipoDeViaje.DIESEL));
        System.out.println(viaje.tiempoDeDemora(TipoDeViaje.ELECTRICO));
        System.out.println(viaje.tiempoDeDemora(TipoDeViaje.ALTAVELOCIDAD));

    }

}
