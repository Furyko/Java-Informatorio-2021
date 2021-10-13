import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nombre de usuario:");
        String nombre = scan.nextLine();
        System.out.println("HOLA " + nombre);
        scan.close();
    }
}