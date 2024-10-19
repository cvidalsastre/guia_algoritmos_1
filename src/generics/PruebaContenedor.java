package generics;

public class PruebaContenedor {

    public static void main(String[] args){
        Contenedor<String> caja1 = new Contenedor<String>();
        System.out.println(caja1.visualizar());
        System.out.println("vacio? "+caja1.vacio());
        caja1.agregar("hola");
        System.out.println(caja1.visualizar());
        System.out.println(caja1.vacio());
        caja1.quitar();
        caja1.agregar(2);
    }
    
}
