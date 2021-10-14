import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(12);
        numeros.add(5);
        numeros.add(23);
        numeros.add(90);
        numeros.add(8);

        System.out.println("===========================");
        System.out.println("Lista antes de los cambios:");
        System.out.println("===========================");
        iterarEImprimirLista(numeros);
        agregarNumeros(numeros);
    }

    static void agregarNumeros(ArrayList<Integer> list) {
        list.add(0, 4321);
        list.add(1234);
        System.out.println("=============================");
        System.out.println("Lista después de los cambios:");
        System.out.println("=============================");
        iterarEImprimirLista(list);
    }

    static void iterarEImprimirLista(ArrayList<Integer> list) {
        int tamanio = 0;
        System.out.println("Elementos de la lista:");
        for (Integer i : list) {
            System.out.println(i);
            tamanio += 1;
        }
        System.out.println("Tamaño de la lista: " + tamanio);
    }
}
