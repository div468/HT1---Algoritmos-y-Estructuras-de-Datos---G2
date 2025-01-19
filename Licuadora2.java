public class Licuadora2 implements Interfaz {
    private boolean encendido;
    private boolean llena;
    private int velocidad;
    
    public Licuadora2() {
        this.encendido = false;
        this.llena = false; 
        this.velocidad = 0;
    }
    
    @Override
    public void aumentarVelocidad() {
        velocidad +=1;
        if (velocidad > 10){
            velocidad = 1;
        }    
    }

    public boolean getEncendido(){
        return encendido;
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
        this.velocidad = 1;
        this.encendido = true;
    }

    public void apagar(){
        this.velocidad = 0;
        this.encendido = false;
    }

    @Override
    public void llenar() {
        // Debe estar vacía
        this.llena = true;
    }

    @Override
    public void vaciar() {
        // Debe estar llena
        this.llena = false; 
    }
}
