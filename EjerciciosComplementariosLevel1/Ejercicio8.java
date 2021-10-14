import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y Apellido:");
        String nombreYApellido = scan.nextLine();
        System.out.println("Edad:");
        int edad = scan.nextInt();  //nextInt() no consume el salto de linea que se genera al presionar ENTER
        scan.nextLine(); // consume el salto de linea que deja nextInt(). Sinó el siguiente scan no permite al usuario ingresar datos
        System.out.println("Direccion:");
        String direccion = scan.nextLine();
        System.out.println("Ciudad:");
        String ciudad = scan.nextLine();
        
        scan.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombreYApellido);
    }
}
