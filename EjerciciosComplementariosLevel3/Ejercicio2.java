/*
Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2.
*/
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> resultado = palabras.stream()
            .map(numero -> potenciacion(numero))
            .collect(Collectors.toList());
        System.out.println(resultado);
    }

    public static Integer potenciacion(Integer numero) {
        return numero * numero;
    }
}
