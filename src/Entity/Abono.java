package Entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Abono {
	private double valorTotal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor
    public Abono(double valorTotal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.valorTotal = valorTotal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Método para calcular el costo prorrateado
    public double calcularCostoProrrateado() {
        LocalDate hoy = LocalDate.now(); // Fecha actual
        if (hoy.isAfter(fechaFin)) {
            return 0; // Si el abono ya venció, el costo prorrateado es 0
        }

        long diasTotales = ChronoUnit.DAYS.between(fechaInicio, fechaFin); // Duración total del abono
        long diasRestantes = ChronoUnit.DAYS.between(hoy, fechaFin); // Días restantes del abono

        if (diasTotales > 0) {
            return (valorTotal / diasTotales) * diasRestantes; // Costo prorrateado
        } else {
            return 0; // Evita división por cero
        }
    }

    // Getters y setters
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
