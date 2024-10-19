package herencia.viajes;

import herencia.viajes.TipoDeViaje;

public class Trayecto {
    private String estacionOrigen;
    private String estacionDestino;
    private Double distancia;
    private Integer cantidadDeVagones;
    private Integer cantidadDeEstaciones;
    private Integer capacidadMaxPasajeros;

    public Trayecto(String estacionOrigen, String estacionDestino, Double distancia, Integer cantidadDeVagones,
            Integer capacidadMaxPasajeros, Integer cantidadDeEstaciones) {
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
        this.distancia = distancia;
        this.cantidadDeVagones = cantidadDeVagones;
        this.capacidadMaxPasajeros = capacidadMaxPasajeros;
        this.cantidadDeEstaciones = cantidadDeEstaciones;

    }

   

}
