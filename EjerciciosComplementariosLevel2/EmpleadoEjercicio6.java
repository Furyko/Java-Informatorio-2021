public class EmpleadoEjercicio6 {
    private String nombreYApellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    EmpleadoEjercicio6(String nombreYApellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String obtenerNombre() {
        return this.nombreYApellido;
    }

    public Integer obtenerDni() {
        return this.dni;
    }

    public Integer obtenerHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public Integer obtenerValorPorHora() {
        return this.valorPorHora;
    }
}
