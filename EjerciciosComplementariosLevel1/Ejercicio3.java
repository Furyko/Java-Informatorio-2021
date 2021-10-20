import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int num = scan.nextInt();
        scan.close();
        String sec = "";
        for (int i=1; i<num+1; i++) {
            sec += i;
            System.out.println(sec);
        }
    }
}
