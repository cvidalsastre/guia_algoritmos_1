package igualdadOrdenCopia;
import java.time.LocalDate;
import java.util.ArrayList;

import igualdadOrdenCopia.Persona;
public class RegistroCivil {

    public static void main(String[] args) throws Exception{
        ArrayList<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("calros","salur",2131232132);
        Persona persona2 = new Persona("carvalo", "jorge", 231232312);
        Persona persona3 = new Persona("bristina", "lirner", 2132131213);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
       for(Persona persona : personas){
        Documento docu = persona.getDocumento();
        System.out.println(
            persona.getApellido() + " " 
            + docu.getNumeroDocumento()+ " " 
            + docu.getFechaEmision()+ " " 
            + docu.getFechaVencimiento());
            LocalDate nuevaFecha = LocalDate.now().plusDays(958);
            // System.out.println(nuevaFecha);
            Documento nuevoDocumento = docu.renovarDocumento(nuevaFecha);
               System.out.println(
            persona.getApellido() + " " 
            + docu.getNumeroDocumento()+ " " 
            + nuevoDocumento.getFechaEmision()+ " " 
            + nuevoDocumento.getFechaVencimiento());

       }
    

    }
    
}
