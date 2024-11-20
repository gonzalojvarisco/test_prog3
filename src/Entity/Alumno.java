package Entity;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Usuario {
	
	 private List<Curso> cursosInscritos = new ArrayList<>();
	 private int limiteCursos;
	 private boolean abono;

	 
	 public Alumno(String id, String nombre, String email, String password, int limiteCursos, boolean abono) {
	        super(id, nombre, email, password);
	        this.limiteCursos = limiteCursos;
	        this.abono = abono;
	    }

	public List<Curso> getCursosInscritos() {
		return cursosInscritos;
	}

	public void setCursosInscritos(List<Curso> cursosInscritos) {
		this.cursosInscritos = cursosInscritos;
	}

	public int getLimiteCursos() {
		return limiteCursos;
	}

	public void setLimiteCursos(int limiteCursos) {
		this.limiteCursos = limiteCursos;
	}

	public boolean getAbono() {
		return abono;
	}

	public void setAbono(boolean abono) {
		this.abono = abono;
	}
	
	
	

	public boolean inscribirseCurso(Curso curso) {
		 return true;
	 }

	 public void verCalificaciones() {
		 
	 }

	 public  void finalizarCurso(Curso curso) {
		 
	 }
}
