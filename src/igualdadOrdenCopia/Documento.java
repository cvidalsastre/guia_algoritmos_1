package igualdadOrdenCopia;
import java.time.LocalDate;
public final class Documento {
    private final int numero ;
    private final LocalDate fechaEmision;
    private final LocalDate fechaVencimiento;
    public Documento (int numero){
        this.numero = numero;
        this.fechaEmision = LocalDate.now();
        this.fechaVencimiento = this.fechaEmision.plusYears(10);
    }
    public Documento (int numero,LocalDate fechaEmision){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = this.fechaEmision.plusYears(10);
    }
    public Documento renovarDocumento (LocalDate fecha) {

        return new Documento(this.numero,fecha);

    }
    public int getNumeroDocumento() {
        return this.numero;
    }
    public LocalDate getFechaEmision (){
        return this.fechaEmision;
    }
    public LocalDate getFechaVencimiento  (){
        return this.fechaVencimiento;
    }
    // public Documento getDocumento(){
    //     return new Documento(numero,this.fechaEmision);
    // }
}
