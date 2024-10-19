package interfacesYClasesAbstractas.wizards;

public class Main {
    public static void main(String[] args) throws Exception {
        Personaje santoro = new Paladin("santoro",1,30);
        Wizard magito = new Wizard("magito", 1, 15);
        // santoro.atacar(magito);
        magito.atacar(santoro);
        magito.atacardistancia(santoro);
       
    }
}
