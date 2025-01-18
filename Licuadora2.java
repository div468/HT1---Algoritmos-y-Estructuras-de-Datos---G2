public class Licuadora2 implements Interfaz {
    private boolean encendido, llena;
    private int velocidad;
    
    public Licuadora2() {
        this.encendido = false;
        this.llena = false; 
        this.velocidad = 0;
    }
    
    @Override
    public void aumentarVelocidad() {
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }
    @Override
    public void llenar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void vaciar() {
        this.llena = false; 
        
    }

    
}
