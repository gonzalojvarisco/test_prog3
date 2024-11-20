package Entity;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String codigo;
	private String nombre;
	private double precio;
	private int cupo;
	private double notaAprobacion;
	private List<Alumno> alumnosInscritos = new ArrayList<>();
	private Profesor profesor;

	
	

	public Curso(String codigo, String nombre, double precio, int cupo, double notaAprobacion,
			List<Alumno> alumnosInscritos, Profesor profesor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cupo = cupo;
		this.notaAprobacion = notaAprobacion;
		this.alumnosInscritos = alumnosInscritos;
		this.profesor = profesor;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCupo() {
		return cupo;
	}


	public void setCupo(int cupo) {
		this.cupo = cupo;
	}


	public double getNotaAprobacion() {
		return notaAprobacion;
	}


	public void setNotaAprobacion(double notaAprobacion) {
		this.notaAprobacion = notaAprobacion;
	}


	public List<Alumno> getAlumnosInscritos() {
		return alumnosInscritos;
	}


	public void setAlumnosInscritos(List<Alumno> alumnosInscritos) {
		this.alumnosInscritos = alumnosInscritos;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	
	
	
	public boolean inscribirAlumno(Alumno alumno) {
		return true;
	}

	public double calcularRecaudacion() {
		return 2;
	}

	public double verificarPromocion(){
		return 2;
	}

	
}
