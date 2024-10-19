package generics;


public class Contenedor<T> {
    private T elemento;
    // construye contenedor con elemnto
    public Contenedor(T elemento){
        this.elemento = elemento;
    }
   // instancia contenedor vacio
    public Contenedor(){
        this.elemento = null;
    }

    public void agregar(T elemento) {
        this.elemento = elemento;

    }

    public void quitar(){
        this.elemento = null;

    }

    public boolean vacio(){
        return this.elemento == null;

    }

    public T visualizar(){
        return this.elemento;

    }

    public boolean comparar(T compara){

        if (this.elemento == null){
            return compara == null;
        }else{
        return this.elemento.equals(compara);

        }


    }

    
}
