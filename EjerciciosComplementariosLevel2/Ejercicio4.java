import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();
        estudiantes.add("Benjamin Lopez");
        estudiantes.add("Alejandro Silva");
        estudiantes.add("Gimena Ibarra");
        estudiantes.add("Gabriel Dominguez");
        estudiantes.add("Emilia Martinez");
        estudiantes.add("Estefania Benitez");
        estudiantes.add("Carmen Gonzalez");
        estudiantes.add("Saul Gutierrez");
        estudiantes.add("Alberto Terraza");
        estudiantes.add("Nahuel Caminos");
        estudiantes.add("Patricia Ramirez");
        estudiantes.add("Jaziel Fernandez");
        separarEstudiantes(estudiantes);
    }

    public static void separarEstudiantes(ArrayList<String> estudiantes) {
        int tamañoLista = estudiantes.size();
        int division = tamañoLista / 3;
        List<String> curso1 = estudiantes.subList(0, division);
        List<String> curso2 = estudiantes.subList(division, division * 2);
        List<String> curso3 = estudiantes.subList(division * 2, division * 3);
        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }
}
