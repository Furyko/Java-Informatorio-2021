import java.util.ArrayList;

public class Ejercicio1{
    
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("San Miguel");
        ciudades.add("Saenz Peña");
        ciudades.add("Tandil");
        ciudades.add("San Luis");

        ranking(ciudades);
    }

    static void ranking(ArrayList<String> list) {
        int posicion = 1;
        for (String i : list) {
            System.out.println("#" + posicion + " - " + i);
            posicion += 1;
        }
    }
}