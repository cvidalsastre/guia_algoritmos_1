package intro;

public class Rectangulo {
    double largo;
    double ancho;


    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    private double perimetro () {
        return 2 * (largo + ancho);
    }
    private double area (){
        return largo * ancho;
    }
    
    public void areaPerimetro(){
        System.out.println("El perimetro es: " + perimetro());
        System.out.println("El area es: " + area());
    }

}
