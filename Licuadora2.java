public class Licuadora2 implements Interfaz {
    private boolean encendido;
    private boolean llena;
    private int velocidad;
    
    public Licuadora2() {
        this.encendido = false;
        this.llena = false; 
        this.velocidad = 0; // Máxima velocidad 3, mínima 1. 0 = apagada
    }
    
    @Override
    public void aumentarVelocidad() {
        // Para esto debe estar encendida y llena
        velocidad += 1;
        
    }

    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    @Override
    public boolean consultarllenado() {
        return llena;
    }

    @Override
    public void encender() {
        // Debe estar apagada
        encendido = true;
        
    }

    @Override
    public void llenar() {
        // Debe estar vacía
        llena = true;
        
    }

    @Override
    public void vaciar() {
        // Debe estar llena
        this.llena = false; 
        
    }
}
