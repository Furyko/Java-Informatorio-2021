import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero1 = scan.nextInt();
        System.out.println("Introduzca un numero mayor al introducido anteriormente:");
        int numero2 = scan.nextInt();
        scan.close();
        System.out.println(fizzBuzzFuncion(numero1, numero2));
    }

    public static ArrayList<String> fizzBuzzFuncion(int arg1, int arg2){
        ArrayList<String> secuencia = new ArrayList<String>();
        for (int i = arg1; i < arg2; i++) {
            if (i%2==0 && i%3==0) {
                secuencia.add("FizzBuzz");
            } else if (i%2==0) {
                secuencia.add("Fizz");
            } else if (i%3==0) {
                secuencia.add("Buzz");
            } else {
                String valor = String.valueOf(i);
                secuencia.add(valor);
            }
        }
        return secuencia;
    }
}
