import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas_trabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valor_por_hora = new ArrayList<Integer>();
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);
        valor_por_hora.add(350);
        valor_por_hora.add(345);
        valor_por_hora.add(550);
        valor_por_hora.add(600);
        valor_por_hora.add(320);
        totalACobrar(horas_trabajadas, valor_por_hora);
    }

    public static void totalACobrar(ArrayList<Integer> horas_trabajadas, ArrayList<Integer> valor_por_hora) {
        ArrayList<Integer> porDia = new ArrayList<Integer>();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int suma = horas_trabajadas.get(i) * valor_por_hora.get(i);
            porDia.add(suma);
            total += suma;
        }
        System.out.println(porDia);
        System.out.println("Total Final: $" + total);
    }
}
