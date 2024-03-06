package agenda.persistencia;

import agenda.modelo.Contacto;

public interface ContactoDao {

	public void insertar(Contacto c);
	
	public void actualizar(Contacto c);
	
	public boolean eliminar(int idContacto);
	
	public boolean eliminar(Contacto c);
	
	public Contacto buscar(int idContacto);
	
//	public Contacto[] buscar(String nombre);
}
