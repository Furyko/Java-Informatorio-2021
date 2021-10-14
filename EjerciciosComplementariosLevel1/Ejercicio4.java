import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero del que desee obtener el factorial:");
        int num = scan.nextInt();
        scan.close();
        int factorial = obtenerFactorial(num);
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static int obtenerFactorial(int numero) {
        int factorial = 1;
        for (int n=1;n<=numero;n++){
            factorial = factorial * n;
        }
        return factorial;
    }
}
