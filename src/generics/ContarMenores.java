package generics;

public class ContarMenores {
    public static <T extends Comparable<T>> int contarMenores(T[] arreglo, T elemento){
        int total = 0;
        for(T e:arreglo){
            if(e.compareTo(elemento)<0){
                total++;
            }
        }
        return total;
    }
}
