package bliblioteca;

public class TestBiblioteca {

	private int numerosocio;
	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
	public int getNumerosocio() {
		return numerosocio;
	}
	public void setNumerosocio(int numerosocio) {
		this.numerosocio = numerosocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public static void main(String[] args) {
		Socio a1 = new Socio();
		Direccion abis = new Direccion(); 
		Prestamo abis2 = new Prestamo();
//		Libro abis3 = new Libro();
		
		abis.setaddress("Cabildo");
		abis.setNumero(1350);
		abis2.setTitulo("test");
		abis2.setFecha("13/10/20");
		
		
		
		a1.setNombre("Pepe");
		a1.setApellido("Lopez");
		a1.setDni(281457444);
		a1.setTelefono(5554444);
		a1.setAddress(abis); //debo incluir el objeto generado para direccion address
		a1.setNumero(abis); //debo incluir el objeto generado para direccion numero
		a1.setTitulo(abis2);
		System.out.println(a1.toString());
	}

}
