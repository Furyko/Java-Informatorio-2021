import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto en minusculas:");
        String texto = scan.nextLine();
        scan.close();
        String textoEnMayusulas = convertirTextoEnMayusculas(texto);

        System.out.println(textoEnMayusulas);
    }

    static String convertirTextoEnMayusculas(String txt) {
        String textoEnMayusculasFinal = "";
        char[] textoEnCaracteres = txt.toCharArray();

        for (int i=0; i<textoEnCaracteres.length; i++){
            char caracter = textoEnCaracteres[i];
            String letra = convertirLetraEnMayuscula(caracter);
            textoEnMayusculasFinal += letra;
        }
        return textoEnMayusculasFinal;
    }

    static String convertirLetraEnMayuscula(char caracter) {
        String letra = "";

        switch(caracter) {
            case 'a':
                letra = "A";
                break;
            case 'b':
                letra = "B";
                break;
            case 'c':
                letra = "C";
                break;
            case 'd':
                letra = "D";
                break;
            case 'e':
                letra = "E";
                break;
            case 'f':
                letra = "F";
                break;
            case 'g':
                letra = "G";
                break;
            case 'h':
                letra = "H";
                break;
            case 'i':
                letra = "I";
                break;
            case 'j':
                letra = "J";
                break;
            case 'k':
                letra = "K";
                break;
            case 'l':
                letra = "L";
                break;
            case 'm':
                letra = "M";
                break;
            case 'n':
                letra = "N";
                break;
            case 'ñ':
                letra = "Ñ";
                break;
            case 'o':
                letra = "O";
                break;
            case 'p':
                letra = "P";
                break;
            case 'q':
                letra = "Q";
                break;
            case 'r':
                letra = "R";
                break;
            case 's':
                letra = "S";
                break;
            case 't':
                letra = "T";
                break;
            case 'u':
                letra = "U";
                break;
            case 'v':
                letra = "V";
                break;
            case 'w':
                letra = "W";
                break;
            case 'x':
                letra = "X";
                break;
            case 'y':
                letra = "Y";
                break;
            case 'z':
                letra = "Z";
                break;
            default:
                String letraEnString = String.valueOf(caracter);
                letra = letraEnString;
        }

        return letra;
    }
}
