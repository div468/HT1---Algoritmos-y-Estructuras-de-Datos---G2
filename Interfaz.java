/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Julián Divas
* Creacion 19.01.2025
* Ultima modificacion 22.01.2025
* @FileName: Interfaz.java
*/
public interface Interfaz{

    /**
     * Método para encender la licuadora
     */
    void encender();

    /**
     * Método para llenar la licuadora
     */
    void llenar();

    /**
     * Método para aumentar velocidad a la licuadora
     */
    void aumentarVelocidad();

    /**
     * Método para consultar la velocidad de la licuadora
     * @return el número de la velocidad en la que se encuentra la licuadora
     */
    int consultarVelocidad();

    /**
     * Método para consultar si la licuadora se encuentra llena o vacía
     * @return true si la licuadora está llena y false si está vacía
     */
    boolean consultarLlenado();

    /**
     * Método para vaciar la licuadora
     */
    void vaciar();
}