/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío ("").
*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
            palabras.add("Hola");
            palabras.add(null);
            palabras.add("Informatorio");
            palabras.add("");
        List<String> palabrasFiltradas = palabras.stream()
            .filter(palabra -> palabra != null && palabra != "")
            .collect(Collectors.toList());
            System.out.println(palabrasFiltradas);
    }
}
