
/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Julián Divas
* Creacion 19.01.2025
* Ultima modificacion 20.01.2025
* @FileName: Main.java
*/
//Se importan los recursos necesarios
import java.util.Scanner;

//Clase que contiene el metodo y programa principal
public class Main {
    // Metodo principal
    public static void main(String[] args) {
        // Se da la bienvenida al usuario
        System.out.println("Bienvenido a su licuadora :)");
        // Se inicializan variables necesarias para el funcionamiento del programa,
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        Licuadora2 licuadora = new Licuadora2();
        while (menu) {
            // Se muestran las opciones capaces de realizar el programa
            System.out.println("\nIngrese el numero de la opcion que desea realizar");
            System.out.println("1. Encender la licuadora");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Aumentar velocidad");
            System.out.println("4. Consultar la velocidad de la licuadora");
            System.out.println("5. Consultar el contenido de la licuadora");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Apagar la licuadora");
            System.out.println("8. Cerrar el programa");
            // Se le solicita al usuario la opción a escoger
            int choice = scanner.nextInt();
            scanner.nextLine();
            // Dependinendo de la elección del usuario se realiza una acción determinada
            switch (choice) {
                case 1:
                    // Si se elije la opción1
                    // Se hacen las verificaciones lógicas de la licuadora
                    if ((licuadora.getEncendido() == false) && (licuadora.getLleno() == true)) {
                        // Procede a encenderse si las verificaciones se cumplen
                        licuadora.setEncendido(true);
                        licuadora.setVelocidad(1);
                        System.out.println("La licuadora ha sido encendida");
                    } else {
                        // Si no se cumplen se muestra un aviso
                        System.out.println("La licuadora no ha sido llenada");
                    }
                    break;

                case 2:
                    // Si se elije la opción 1
                    // Se verifica que la licuadora esté llena
                    if (licuadora.getLleno()) {
                        // Si ya está llena se muestra un aviso
                        System.out.println("La licuadora ya esta llena");
                    } else {
                        // Si no lo está, se llena y notifica
                        licuadora.setLleno(true);
                        System.out.println("La licuadora se ha llenado");
                    }
                    break;

                case 3:
                    // Si se elije la opcion 3
                    // Se verifica que la licuadora esté encendida
                    if (licuadora.getEncendido()) {
                        // Si está encendida, se aumenta la velocidad de la velocidad en 1
                        licuadora.setVelocidad(licuadora.getVelocidad() + 1);
                        // Si la velocidad de la licuadora pasa de 10, se regresa la velocidad a 1 como
                        // metodo de disminuir la velocidad
                        if (licuadora.getVelocidad() > 10) {
                            licuadora.setVelocidad(1);
                        }
                        System.out.println("Se aumentó la velocidad de la licuadora");
                    } else {
                        // Si la licuadora no está encendida se muestra un aviso
                        System.out.println("La licuadora aun no ha sido encendida");
                    }
                    break;

                case 4:
                    // Si se elije la opción 4
                    // Se verifica que la licuadora esté encendida
                    if (licuadora.getEncendido()) {
                        // Se muestra la velocidad a la que se encuentra la licuadora
                        System.out.println("La licuadora se encuentra en la velocidad: " + licuadora.getVelocidad());
                    } else {
                        // Si no está encendida la licuadora se muestra un aviso
                        System.out.println("La licuadora aun no ha sido encendida");
                    }
                    break;

                case 5:
                    // Si se elije la opción 5
                    // Se verifica que la licuadora esté llena
                    if (licuadora.getLleno()) {
                        // Si lo está, se muestra el mensaje
                        System.out.println("La licuadora se encuentra llena");
                    } else {
                        // Si no lo está, también se notifica
                        System.out.println("La licuadora se encuentra vacia");
                    }
                    break;

                case 6:
                    // Si se elije la opción 6
                    // Se verifica que la licuadora esté encendida
                    if (licuadora.getEncendido()) {
                        // Si lo está, se indica que primero debe apagarse para vaciarla
                        System.out.println("Para vaciar la licuadora, primero apaguela");
                    } else {
                        // Si la licuadora ya está vacía, se indica
                        if (licuadora.getLleno() == false) {
                            System.out.println("La licuadora ya esta vacia");
                        } else {
                            // Si no, se vacía y se notifica del cambio
                            licuadora.setLleno(false);
                            System.out.println("Se ha vaciado la licuadora");
                        }
                    }
                    break;

                case 7:
                    // Si se elije la opcion 7
                    // Se verifica que la licuadora esté encendida
                    if (licuadora.getEncendido()) {
                        // Si lo está, procede a apagarse asignando los valores correspondientes, además
                        // se notifica
                        licuadora.setEncendido(false);
                        licuadora.setVelocidad(0);
                        System.out.println("La licuadora se ha apagado");
                    } else {
                        // Si ya está apagada, se notifica
                        System.out.println("La licuadora ya esta apagada");
                    }
                    break;

                case 8:
                    // Si se elije la opcion 8
                    // Se cierra el programa y se despide del usuario
                    menu = false;
                    System.out.println("Gracias por usar este programa :)");
                    scanner.close();
                    break;
                default:
                    // Se define una opcion específica para entradas no especificadas
                    System.out.println("Ingrese una opcion valida porfavor");
                    break;
            }
        }
    }
}