import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<Integer>();
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(8);
        cartas.add(9);
        cartas.add(10);
        System.out.println(cartas);

        ordenInverso(cartas);
        ordenAleatorio(cartas);
    }

    static void ordenInverso(ArrayList<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

    static void ordenAleatorio(ArrayList<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
}
