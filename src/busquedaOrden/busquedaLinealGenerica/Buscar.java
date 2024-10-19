package busquedaOrden.busquedaLinealGenerica;

public class Buscar {

    public static <T> int buscar(T[] array, T elemento){

        for(int i=0;i<array.length;i++){
            if(array[i].equals(elemento))
            return i;
        }
        return -1;

    }

    public static void main(String[] args) throws Exception {

        String[] nombres = {"carlos","saul","menem"};
        int indiceNombre = buscar(nombres,"meneem");
        System.out.println(indiceNombre);

        Number[] numeros = {1,2,3};
        int indiceNumero = buscar(numeros,1);
        System.out.println(indiceNumero);

    }
    
}
