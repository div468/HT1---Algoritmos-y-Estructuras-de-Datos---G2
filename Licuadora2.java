/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Julián Divas, Arturo Lima, Emilio Cumatz
* Creacion 19.01.2025
* Ultima modificacion 20.01.2025
* @FileName: Licuadora2.java
*/
public class Licuadora2 implements Interfaz {
    
    private boolean encendido; //Indica el estado de la licuadora en cuanto a funcionamiento, true indica que la licuadora está encendida y false que está apagada
    private boolean lleno; //Indica el estado de la licuadora aen cuanto a contenido, true indica que la licuadora esta llena y false que esta vacia
    private int velocidad; //Indica las distintas velocidades de la licuadora, 0 indica que está apagada y hay velocidades del 1 al 10.
    
    /**
     * Constructir secundario sin parámetros de la licuadora
     */
    public Licuadora2(){
        this.encendido = false;
        this.lleno = false; 
        this.velocidad = 0;
    }

    /**
     * Constructor principal de la licuadora solicitando todos sus atributos
     * @param encendido Estado de la licuadora, true si está encendida y false si está apagada
     * @param lleno Contenido dentro de la licuadora, true si está llena y false si está vacía
     * @param velocidad velocidad de la licuadora, del 0 al 10
     */
    public Licuadora2(boolean encendido, boolean lleno, int velocidad){
        this.encendido = encendido;
        this.lleno = lleno;
        this.velocidad = velocidad;
    }
    
    /**
     * Get correspondiente del atributo encendido
     * @return el valor del atributo encendido
     */
    public boolean getEncendido(){
        return encendido;
    }
    
    /**
     * Set correspondiente del atributo encendido
     * @param encendido el valor  booleano a asignar al atributo  encendido
     */
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }

    /**
     * Get correspondiente del atributo lleno
     * @return el valor del atributo lleno
     */
    public boolean getLleno(){
        return lleno;
    }

    /**
     * Set correspondiente del atributo lleno
     * @param lleno el valor  booleano a asignar al atributo lleno
     */
    public void setLleno(boolean lleno){
        this.lleno = lleno;
    }

    /**
     * Get correspondiente del atributo velocidad
     * @return el valor del atributo velocidad
     */
    public int getVelocidad(){
        return velocidad;
    }

    /**
     * Set correspondiente del atributo velocidad
     * @param velocidad el valor entero a asignar al atributo velocidad
     */
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Método para aumentar la velocidad de la licuadora, al llegar a 10 (la velocidad máxima) regresa a 1 para bajar la velocidad en caso se necesite
     */
    @Override
    public void aumentarVelocidad() {
        velocidad +=1;
        if (velocidad > 10){
            velocidad = 1;
        }    
    }

    /*
     * Método para consultar la velocidad de la licuadora
     */
    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    /*
     * Método para consultar el contenido de la licuadora
     */
    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    /*
     * Método para encender la licuadora, asigna los valores correspondientes al estado
     */
    @Override
    public void encender() {
        // Debe estar apagada
        this.velocidad = 1;
        this.encendido = true;
    }

    /*
     * Método para apagar la licuadora, asigna los valores correspondientes al estado
     */
    public void apagar(){
        this.velocidad = 0;
        this.encendido = false;
    }

    /*
     * Método para llenar la licuadora, asigna los valores correspondientes al estado
     */
    @Override
    public void llenar() {
        // Debe estar vacía
        this.lleno = true;
    }

    /*
     * Método para vaciar la licuadora, asigna los valores correspondientes al estado
     */
    @Override
    public void vaciar() {
        // Debe estar llena
        this.lleno = false; 
    }
}