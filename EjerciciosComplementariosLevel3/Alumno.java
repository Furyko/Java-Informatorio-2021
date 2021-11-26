import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void getApellido(String apellido) {
        this.apellido = apellido;

    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                '}';
    }
}
