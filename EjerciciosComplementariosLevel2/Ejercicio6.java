import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Set<EmpleadoEjercicio6> empleados = new HashSet<>();
        Map<Integer, Integer> sueldoPorEmpleado = new HashMap<>();
        cargarSet(empleados);
        calcularSueldo(empleados, sueldoPorEmpleado);
        mostrarMap(sueldoPorEmpleado);
    }

    public static void cargarSet(Set<EmpleadoEjercicio6> empleados) {
        EmpleadoEjercicio6 empleado1 = new EmpleadoEjercicio6("Juan Gutierrez", 20345678, 10, 200);
        EmpleadoEjercicio6 empleado2 = new EmpleadoEjercicio6("Alejandra Bogado", 34124133, 12, 150);
        EmpleadoEjercicio6 empleado3 = new EmpleadoEjercicio6("Gimena Jaime", 23456789, 9, 300);
        EmpleadoEjercicio6 empleado4 = new EmpleadoEjercicio6("Malena Leiva", 48321456, 4, 100);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        System.out.println("EMPLEADOS:");
        for (EmpleadoEjercicio6 empleado : empleados) {
            System.out.println("Nombre y apellido: " + empleado.obtenerNombre() + ", DNI: " + empleado.obtenerDni() + ", Horas trabajadas: " + empleado.obtenerHorasTrabajadas() + ", Valor por hora: " + empleado.obtenerValorPorHora());
        }
    }

    public static void calcularSueldo(Set<EmpleadoEjercicio6> empleados, Map<Integer, Integer> sueldoPorEmpleado) {
        for (EmpleadoEjercicio6 empleado : empleados) {
            int sueldoCalculado = empleado.obtenerHorasTrabajadas() * empleado.obtenerValorPorHora();
            sueldoPorEmpleado.put(empleado.obtenerDni(), sueldoCalculado);
        }
    }

    public static void mostrarMap(Map<Integer, Integer> sueldoPorEmpleado) {
        System.out.println("SUELDOS:");
        for (Map.Entry<Integer, Integer> sueldos : sueldoPorEmpleado.entrySet()) {
            System.out.println("DNI: " + sueldos.getKey() + ", Sueldo: " + sueldos.getValue());
        }
    }
}
