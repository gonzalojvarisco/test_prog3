package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Alumno;
import Entity.Curso;
import Entity.Profesor;

public class CursoDB extends BaseH2 implements IAbm<Curso> {

	public CursoDB() {
		super();
	}

	@Override
	public void grabar(Curso entity) {
		//String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)"; 
		
//		sql = sql.concat("'").concat(entity.getNombre()).concat("',");
//		sql = sql.concat("'").concat(entity.getApellido()).concat("',");
//		sql = sql.concat("'").concat(entity.getDocumento()).concat("',");
//		sql = sql.concat(String.valueOf(entity.getId())).concat(")");
		
		/*try {
			updateDeleteInsertSql(sql, entity.getNombre(), entity.getApellido(), entity.getDocumento(), entity.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}

	@Override
	public Curso leerUno(Integer id) {
//		String sql = "select * from PERSONAS where id = ";
//		sql = sql.concat(String.valueOf(id));
//		ResultSet rs = super.selectSql(sql);
		String sql = "select * from CURSO where id = ?";
		try {
			ResultSet rs = super.selectSql(sql, new Object[]{id});
			if (rs.first()) {
				//return new Curso(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4),rs.getDouble(5))
				// Extraer datos básicos del curso
	            String codigo = String.valueOf(rs.getInt("id"));
	            String nombre = rs.getString("nombre");
	            double precio = rs.getDouble("precio");
	            int cupo = rs.getInt("cupo");
	            double notaAprobacion = rs.getDouble("nota_aprobacion");

	            List<Alumno> alumnosInscritos = obtenerAlumnosMock();//obtenerAlumnosInscritos(id);

	            // Obtener información del profesor
	            Profesor profesor = obtenerProfesorMock();//rs.getInt("profesor_id"));

	            // Construir y retornar el curso
	            return new Curso(codigo, nombre, precio, cupo, notaAprobacion, alumnosInscritos, profesor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Curso> leerTodos() {
		String sql = "select * from CURSO";
		try {
			ResultSet rs = super.selectSql(sql, new Object[]{});
			List<Curso> cursos = new ArrayList<>();
			while (rs.next()) {
				//cursos.add(new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
				String codigo = String.valueOf(rs.getInt("id"));
	            String nombre = rs.getString("nombre");
	            double precio = rs.getDouble("precio");
	            int cupo = rs.getInt("cupo");
	            double notaAprobacion = rs.getDouble("nota_aprobacion");

	            List<Alumno> alumnosInscritos = obtenerAlumnosMock();//obtenerAlumnosInscritos(id);

	            // Obtener información del profesor
	            Profesor profesor = obtenerProfesorMock();//rs.getInt("profesor_id"));
	            
	            cursos.add(new Curso(codigo, nombre, precio, cupo, notaAprobacion, alumnosInscritos, profesor));
			}
			return cursos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return List.of();
	}
	
	private List<Alumno> obtenerAlumnosMock() {
		List<Alumno> alumnos = new ArrayList<>();
	    alumnos.add(new Alumno("1", "Pedro Gómez", "pedro.gomez@example.com", "password123", 3, true));
	    alumnos.add(new Alumno("2", "Ana López", "ana.lopez@example.com", "password456", 5, false));
	    return alumnos;
	}
	
	private Profesor obtenerProfesorMock() {
	    return new Profesor(
	        "1",
	        "Juan Pérez",
	        "juan.perez@example.com",
	        "password123",
	        obtenerCursosMock()
	    );
	}
	
	private List<Curso> obtenerCursosMock() {
	    List<Curso> cursos = new ArrayList<>();
	    cursos.add(new Curso("1", "Matemáticas", 1500.00, 30, 6.0, new ArrayList<>(), null));
	    cursos.add(new Curso("2", "Física", 1400.00, 25, 7.0, new ArrayList<>(), null));
	    return cursos;
	}

}
