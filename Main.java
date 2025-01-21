/**
* @Project : HT1 - Algoritmos y Estructuras de Datos
* @author Julián Divas
* Creacion 19.01.2025
* Ultima modificacion 19.01.2025
* @FileName: Main.java
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a su licuadora :)");
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        Licuadora2 licuadora = new Licuadora2();
        while (menu){
            System.out.println("\nIngrese el numero de la opcion que desea realizar");
            System.out.println("1. Encender la licuadora");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Aumentar velocidad");
            System.out.println("4. Consultar la velocidad de la licuadora");
            System.out.println("5. Consultar el contenido de la licuadora");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Apagar la licuadora");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if ((licuadora.getEncendido() == false) && (licuadora.consultarLlenado() == true)){
                        licuadora.encender();
                        System.out.println("La licuadora ha sido encendida");
                    }
                    else {
                        System.out.println("La licuadora no ha sido llenada");
                    }
                    break;

                case 2:
                    if (licuadora.consultarLlenado()){
                        System.out.println("La licuadora ya esta llena");
                    }
                    else {
                        licuadora.llenar();
                        System.out.println("La licuadora se ha llenado");
                    }
                    break;

                case 3:
                if (licuadora.getEncendido()){
                    licuadora.aumentarVelocidad();
                    System.out.println("Se aumentó la velocidad de la licuadora");
                }
                else {
                    System.out.println("La licuadora aun no ha sido encendida");
                }
                break;

                case 4:
                if (licuadora.getEncendido()){
                    System.out.println("La licuadora se encuentra en la velocidad: " + licuadora.consultarVelocidad());
                }
                else {
                    System.out.println("La licuadora aun no ha sido encendida");
                }
                    break;
                
                case 5:
                    if (licuadora.consultarLlenado()){
                        System.out.println("La licuadora se encuentra llena");
                    }
                    else { 
                            System.out.println("La licuadora se encuentra vacia");
                    }
                    break;

                case 6:
                    if (licuadora.getEncendido()){
                        System.out.println("Para vaciar la licuadora, primero apaguela");
                    }
                    else {
                        if(licuadora.consultarLlenado()== false){
                            System.out.println("La licuadora ya esta vacia");
                        }
                        else {
                            licuadora.vaciar();
                            System.out.println("Se ha vaciado la licuadora");
                        }
                    }
                    break;
                
                case 7:
                    menu = false;
                    System.out.println("Gracias por usar este programa :)");
                    scanner.close();
                    break;

                default:
                    System.out.println("Ingrese una opcion valida porfavor");
                    break;
            }
        }
    }
}