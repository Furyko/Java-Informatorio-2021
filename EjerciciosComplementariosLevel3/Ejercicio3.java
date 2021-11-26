import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
"Wonder Woman", "brainiac");
        int cantidad = 0;
        for (String palabra : palabras) {
            if (palabra.indexOf("b") == 0 || palabra.indexOf("B") == 0) {
                cantidad += 1;
            }
        }
        System.out.println(cantidad);
    }
}