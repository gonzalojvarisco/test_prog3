package Entity;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario{

	private List<Curso> cursosDictados = new ArrayList<>();
	
	
	
	public Profesor(String id, String nombre, String email, String password, List<Curso> cursosDictados) {
		super(id, nombre, email, password);
		this.cursosDictados = cursosDictados;
	}

	public List<Curso> getCursosDictados() {
		return cursosDictados;
	}

	public void setCursosDictados(List<Curso> cursosDictados) {
		this.cursosDictados = cursosDictados;
	}
	
	
	

	 public void crearCurso(Curso curso) {
		 
	 }
	 
	public void ingresarCalificacion(Alumno Alumno, Curso curso, double nota) {
		
	}
	
}
