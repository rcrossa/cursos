package bliblioteca;

public class TestBiblioteca {
	
	public static void main(String[] args) {
		Prestamo prestamo1 = new Prestamo();
		Socio socio1 = new Socio();
		Direccion calle = new Direccion();
		Libro libro1 = new Libro();
		Autor nombreautor = new Autor();
		Asignatura asignatura =new Asignatura();
		
		socio1.setCustomerid(1);
		socio1.setNombre("pepe");
		socio1.setApellido("Lopez");
		socio1.setDni(281453840);
		socio1.setTelefono(5554444);
		//----------//
		calle.setaddress("Cabildo");
		calle.setNumero(1350);
		 //---------//
		libro1.setTitulo("Aventuras de cera");
		nombreautor.setNombre("steven");
		nombreautor.setApellido("spielberg");
		//------//
		asignatura.setTema("Aventuras");

		//------------//
//		
		prestamo1.setCustomerid(socio1);
		prestamo1.setNombre(socio1);
		prestamo1.setApellido(socio1);
		prestamo1.setDni(socio1);
		prestamo1.setTelefono(socio1);
		prestamo1.setAddress(calle);
		prestamo1.setTema(asignatura);
		prestamo1.setTitulo(libro1);
		prestamo1.setNombreautor(nombreautor);
		prestamo1.setApellidoautor(nombreautor);;
		
		System.out.println(prestamo1.toString());
//		
		
		
		
	}

}
