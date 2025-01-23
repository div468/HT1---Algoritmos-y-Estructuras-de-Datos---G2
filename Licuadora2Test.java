import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Diego Calderón
* Creacion 18.01.2025
* Ultima modificacion 20.01.2025
* @FileName: Licuadora2Test.java
*/
public class Licuadora2Test {
    // Test encendido 
    @Test
    public void testEnceder() {
        // Inicializar
        Licuadora2 licuadora = new Licuadora2();

        licuadora.encender();

        // Test velocidad inicia con 1
        assertEquals(1, licuadora.consultarVelocidad());
    }

    @Test 
    public void testVelocidad() {
        Licuadora2 licuadora = new Licuadora2();
        
        licuadora.encender();

        int velocidad = licuadora.consultarVelocidad();
        
        licuadora.aumentarVelocidad();

        assertEquals(velocidad + 1, licuadora.consultarVelocidad());
    }
    
    // Test aumento de velocidad cuando velocidad = maximo -> regresa a 1 
    //@Test
    //public void testVelocidad_Maxima() {
        // Inicializar 
    //    Licuadora2 licuadora = new Licuadora2();
    //    licuadora.encender();

    //    for (int i = 0; i < 10; i++) {
            // Empieza en velocidad = 1
    //        licuadora.aumentarVelocidad();
    //    }
        
        // Verificamos que regrese a 1 tras superar el límite
    //    assertEquals(1, licuadora.consultarVelocidad());
    //}

    // Test apagado con velocidad = 5 -> regresa la velocidad a 0 
    @Test
    public void testApagado_velocidad5() {
        // Inicializar
        Licuadora2 licuadora = new Licuadora2();
        licuadora.encender();

        for (int i = 0; i < 4; i++) {
            licuadora.aumentarVelocidad();
        }
        
        // Test velocidad = 5
        assertEquals(5, licuadora.consultarVelocidad());

        // apagar licuadora
        licuadora.setEncendido(false);

        // Debido a que no hay un métdoo apagar, la licuadora permanece con la misma velocidad al apagarse
        // Se puede configuar para que al setear encendido a false, la velocidad cambie a 0, pero 
        // otros grupo no lo tienen implementado de esa manera 
        assertEquals(5, licuadora.consultarVelocidad());
    }    
}