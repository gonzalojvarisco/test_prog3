package Entity;

import java.time.LocalDateTime;

public class Reporte {

	private int id;  // O String si usas UUID
    private String tipo;  // O enum ReporteTipo
    private String contenido;
    private LocalDateTime fechaGeneracion;

    // Constructor
    public Reporte(int id, String tipo, String contenido, LocalDateTime fechaGeneracion) {
        this.id = id;
        this.tipo = tipo;
        this.contenido = contenido;
        this.fechaGeneracion = fechaGeneracion;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
	
}
