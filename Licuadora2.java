/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Julián Divas, Arturo Lima, Emilio Cumatz
* Creacion 19.01.2025
* Ultima modificacion 20.01.2025
* @FileName: Licuadora2.java
*/
public class Licuadora2 implements Interfaz {
    private boolean encendido;
    private boolean lleno;
    private int velocidad;
    
    public Licuadora2(){
        this.encendido = false;
        this.lleno = false; 
        this.velocidad = 0;
    }
    
    public boolean getEncendido(){
        return encendido;
    }
    
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }

    public boolean getLleno(){
        return lleno;
    }

    public void setLleno(boolean lleno){
        this.lleno = lleno;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    @Override
    public void aumentarVelocidad() {
        velocidad +=1;
        if (velocidad > 10){
            velocidad = 1;
        }    
    }

    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    @Override
    public void encender() {
        // Debe estar apagada
        this.velocidad = 1;
        this.encendido = true;
    }

    @Override
    public void llenar() {
        // Debe estar vacía
        this.lleno = true;
    }

    @Override
    public void vaciar() {
        // Debe estar llena
        this.lleno = false; 
    }
}