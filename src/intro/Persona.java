package intro;

public class Persona {
    // atributos
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public static void crearPersonaSaludar(String[] args) {
        Persona p = new Persona("marcos", 3);
        p.saludar();
    }
}
