package igualdadOrdenCopia;
// import  igualdadOrdenCopia.Documento;
public final class Persona {
    private final String nombre;
    private final String apellido;
    private final Documento documento;
    public Persona(String nombre,String apellido,int documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = new Documento(documento);
    }

    public String getNombre (){
        return this.nombre;

    }   
    public String getApellido(){
        return this.apellido;

    } 
    public Documento getDocumento(){
        return this.documento;

    }
}
