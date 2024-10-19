package interfacesYClasesAbstractas.wizards;

public class Paladin extends Personaje {
    private int damage = 5;

     public Paladin(String nombre,int nivel,int puntosVida ){
        super(nombre,nivel,puntosVida,4);
    }


    @Override
    public void atacar (Personaje objetivo){
        objetivo.defender(this.damage-objetivo.defensa);

    }
    @Override
    public void defender(int damage){
        this.puntosVida = this.puntosVida -damage;
      System.out.println(this.nombre + "recibe " + damage +" puntos de daño" );
        System.out.println("a " + this.nombre + "le quedan " + this.puntosVida + " puntos de vida" );
        
    }
    

}
