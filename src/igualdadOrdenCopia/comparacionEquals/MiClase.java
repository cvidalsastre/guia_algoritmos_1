package igualdadOrdenCopia.comparacionEquals;
public class MiClase {
    String a ;
    String b ;
    public MiClase(String a,String b){
        this.a = a;
        this.b = b;

    }
     @Override
    public boolean equals(Object obj) {
        // Verificar si son la misma referencia
        if (this == obj) {
            return true;
        }
        // Verificar si el objeto es de la misma clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Convertir el objeto a MiClase
        MiClase otraClase = (MiClase) obj;
        // Comparar atributos
        return a.equals(otraClase.a) && b.equals(otraClase.b);
    }
}
