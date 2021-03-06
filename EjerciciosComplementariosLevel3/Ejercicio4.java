/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos.
*/
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> sinRepetir = palabras.stream()
            .map(numero -> factorial(numero))
            .distinct()
            .collect(Collectors.toList());
        System.out.println(sinRepetir);
    }

    public static Integer factorial(int numero) {
        int iFactorial = 1;
        for (int i=2; i<=numero; i++) {
            iFactorial = iFactorial * i;
        }
        return iFactorial;
    }
}
