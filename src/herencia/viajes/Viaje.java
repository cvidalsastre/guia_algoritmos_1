package herencia.viajes;

public class Viaje {
    private Trayecto trayecto;

    public Viaje(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public Double tiempoDeDemora(TipoDeViaje tipoDeViaje) {
        Double demora = 0.0;
        switch (tipoDeViaje.) {
            case DIESEL:
                demora = (this.distancia * this.cantidadDeEstaciones) / 2 + (this.cantidadDeEstaciones + this.capacidadMaxPasajeros) / 2;
                break;
            case ELECTRICO:
                demora = (this.distancia * this.cantidadDeEstaciones) / 2;
                break;
            case ALTAVELOCIDAD:
                demora = this.distancia / 10;
                break;
        }
        return demora;
    }

}
