import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro numero entero:");
        int num2 = scan.nextInt();
        scan.close();
        int resultado = potencia(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + " = " + resultado);
    }

    static int potencia(int num1, int num2) {
        int resultado = 1;

        for (int i=0; i<num2; i++) {
            resultado = multiplicacion(resultado, num1);
        }

        return resultado;
    }

    static int multiplicacion(int num1, int num2) {
        int resultado = 0;
        for (int i=0; i<num2; i++) {
            resultado += num1;
        }
        return resultado;
    }
}
