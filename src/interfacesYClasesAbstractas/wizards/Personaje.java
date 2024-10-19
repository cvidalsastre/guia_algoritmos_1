package interfacesYClasesAbstractas.wizards;

public abstract class Personaje {
    String nombre;
    int nivel;
    int puntosVida;
    int defensa;
    public Personaje (String nombre,int nivel, int puntosVida,int defensa){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntosVida = puntosVida;
        this.defensa = defensa;
    }
    abstract void atacar(Personaje objetivo);
    abstract void defender(int daño);
}
