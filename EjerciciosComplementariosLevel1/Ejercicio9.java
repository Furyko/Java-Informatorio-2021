import java.util.Scanner;

public class Ejercicio9{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca algún tipo de texto (frase, texto, etc):");
        String texto = scan.nextLine();
        System.out.println("Introduzca una letra:");
        String letra = scan.nextLine();
        scan.close();

        int veces = encontrarLetras(texto.toLowerCase(), letra.toLowerCase());
        System.out.println(veces);
    }

    static int encontrarLetras(String texto, String letra){
        int veces = 0;
        char[] caracteres = texto.toCharArray();

        for (int i=0; i<caracteres.length; i++) {
            if (caracteres[i] == letra.charAt(0)) {
                veces += 1;
            }
        }
        return veces;
    }
}