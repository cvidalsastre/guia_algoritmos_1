package intro;
// Ejercicio: Crear una Clase y un Objeto
// Crear una clase llamada Estudiante que tenga los siguientes atributos:

// Nombre (String)
// Edad (int)
// Carrera (String)
// Materias (arreglo de String)
// Luego, crear un objeto de tipo Estudiante con valores concretos para estos atributos e imprimir la información del estudiante en la consola.

// TIP: Investigar el método toString y cómo puede utilizarse para mostrar en formato String la información del estudiante.
public class Estudiante extends Persona {
    String nombre;
    int edad;
    String carrera;
    String[] materias;
    
    private static int estudiantesCreados = 0;

    public Estudiante(String nombre, int edad, String carrera, String[] materias){
        super(nombre, edad);
        this.carrera = carrera;
        this.materias = materias;
        estudiantesCreados++;
    }

    public static void mostrarEstudiantesCreados(){
        System.out.println("Estudiantes creados: " + estudiantesCreados);
    }


    public static void main(String[] args){
        System.out.println("Hola estudiante");
        String[] materias = {"Clonacion 1", "Economia"};
        Estudiante e1 = new Estudiante("milei", 45, "clonador de perros",materias);
        e1.saludar();
        // e1.mostrarEstudiantesCreados();

        Estudiante.mostrarEstudiantesCreados();

        Estudiante e2 = new Estudiante("cristina",  60, "presidenta",  new String[]{"Derecho", "Economia"});
        e2.saludar();

        // e2.mostrarEstudiantesCreados();
        Estudiante.mostrarEstudiantesCreados();
    }
}
