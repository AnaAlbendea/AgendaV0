package agenda.modelo;

import java.util.Comparator;

public class Contacto {

	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	private Domicilio dom;
	private String[] telefonos;
	private String[] correos;
	
	private int cantTelefonos;
	private int cantCorreos;
	
	public Contacto() {
		telefonos = new String[10];
		correos = new String[10];
		dom = new Domicilio();
	}

	public Contacto(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Contacto(String nombre, String apellidos, String apodo) {
		this(nombre);
		this.apellidos = apellidos;
		this.apodo = apodo;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Domicilio getDom() {
		return dom;
	}

	public void setDom(Domicilio dom) {
		this.dom = dom;
	}

	public String[] getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefono(String telefono) {
		if (cantTelefonos < 10) {
			telefonos[cantTelefonos++] = telefono;
		}
	}

	public String[] getCorreos() {
		return correos;
	}

	public void setCorreos(String[] correos) {
		this.correos = correos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Contacto other = (Contacto) obj;
		return idContacto == other.idContacto;
	}

	@Override
	public String toString() {
		return "Contacto [" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + "]";
	}

	public static Comparator<? super Contacto> getIdComparator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
