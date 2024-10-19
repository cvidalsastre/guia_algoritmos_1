package interfacesYClasesAbstractas.wizards;

public class Wizard extends Personaje implements AtaqueDistancia {
    private int damage = 3;


    public Wizard(String nombre,int nivel,int puntosVida ){
        super(nombre,nivel,puntosVida,2);
    }


    @Override
    public void atacar (Personaje objetivo){
        System.out.println(objetivo.defensa);
        objetivo.defender(this.damage - objetivo.defensa);

    }
    public void atacardistancia(Personaje objetivo){
        objetivo.defender(this.damage);
    }
    @Override
    public void defender(int damage){
        this.puntosVida = this.puntosVida - damage;
        System.out.println(this.nombre + " recibe " + damage +" puntos de daño" );
        System.out.println("a " + this.nombre + "le quedan " + this.puntosVida + " puntos de vida" );
        
    }
    
    
}
