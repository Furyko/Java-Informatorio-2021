/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.
*/
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Homero", "Simpson", LocalDate.parse("1956-05-15")),
            new Alumno("Marge", "Simpson", LocalDate.parse("1954-03-19")),
            new Alumno("Bart", "Simpson", LocalDate.parse("1979-12-17")),
            new Alumno("Lisa", "Simpson", LocalDate.parse("1982-01-25")),
            new Alumno("Maggie", "Simpson", LocalDate.parse("1985-09-19")));
        Map<String, Integer> alumnosMap = alumnos.stream()
                .collect(Collectors.toMap(alumno -> construirClave(alumno), alumno -> calcularEdad(alumno)));
        System.out.println(alumnosMap);
    }

    private static String construirClave(Alumno alumno) {
        return alumno.getApellido().concat(" ").concat(alumno.getNombre());
    }

    private static Integer calcularEdad(Alumno alumno) {
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }
}
