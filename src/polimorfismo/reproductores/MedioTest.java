package polimorfismo.reproductores;
import org.junit.jupiter.api.Test;

import main.java.calcuEjemplo.Calcu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import polimorfismo.Medio;

class MedioTest {
    @Test
     void testReproducir(){
    Medio medio = new Medio();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;  // Save the original System.out
    System.setOut(new PrintStream(outContent));
    try {
        medio.reproducir();
        assertEquals("Reproduciendo medio genérico\n",outContent.toString());
    } finally {
   System.setOut(originalOut);
    }

    }
 
   

    
}
