import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int num1 = scan.nextInt();
        System.out.println("Introduzca otro numero:");
        int num2 = scan.nextInt();
        scan.close();

        int resultado = multiplicacion(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }

    static int multiplicacion(int num1, int num2) {
        int resultado = 0;
        for (int i=0; i<num2; i++) {
            resultado += num1;
        }
        return resultado;
    }
}
