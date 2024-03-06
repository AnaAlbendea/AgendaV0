package agenda.tests;

import agenda.modelo.Contacto;

public class Test01 {
	public static void main(String[] args) {
		Contacto c = new Contacto("Pedro", "Ramirez", "Peter");
		c.setIdContacto(148);
		System.out.println(c.getApodo());
		
//		String[] telefonos = {"621123456"};
//		c.setTelefonos(telefonos);
//		c.setTelefonos(new String[] {"621123456"});
		
		String mensaje = "Mi colega es: " + c;
		
		System.out.println(mensaje);
	}
}
