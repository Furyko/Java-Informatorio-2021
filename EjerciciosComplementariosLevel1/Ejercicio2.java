import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int num1 = scan.nextInt();
        System.out.println("Introduzca otro numero:");
        int num2 = scan.nextInt();

        int resultadoSuma = num1 + num2;
        int resultadoResta = num1-num2;

        System.out.println(num1 + " + " + num2 + " = " + resultadoSuma);
        System.out.println(num1 + " - " + num2 + " = " + resultadoResta);
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println(num1 + " % " + num2 + " = " + num1 % num2);

        scan.close();
    }
}
