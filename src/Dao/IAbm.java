package Dao;

import java.util.List;

public interface IAbm<T> {
	
	public void grabar(T entity);
	public T leerUno(Integer id);
	public List<T> leerTodos();
	

}
