package herencia.alquiler_vehiculos.vehiculos;

import herencia.alquiler_vehiculos.Vehiculo;

public class Moto extends Vehiculo {


    public Moto(String marca, String modelo, Double precioBase){
        super(marca, modelo, precioBase);
    }


    @Override
    public Double calcularCostoAlquiler(int dias){
        return super.calcularCostoAlquiler(dias)*1.15;
    }
    
}
