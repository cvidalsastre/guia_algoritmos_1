package herencia.alquiler_vehiculos;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Double precioBase;

    public Vehiculo(String marca, String modelo, Double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }
    public Double calcularCostoAlquiler(int dias){
        return this.precioBase * dias;
    }

}
