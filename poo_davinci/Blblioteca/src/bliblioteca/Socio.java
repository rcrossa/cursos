package bliblioteca;

public class Socio {
	private int customerid;
	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
	private Direccion address;
	private Direccion numero;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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
	public Direccion getAddress() {
		return address;
	}
	public void setAddress(Direccion address) {
		this.address = address;
	}
	public Direccion getNumero() {
		return numero;
	}
	public void setNumero(Direccion numero) {
		this.numero = numero;
	}


	

//	public String toString() {
//		return 
//				"Numero de cliente: " + customerid + 
//				"\nNombre : " + nombre 	+ 
//				"\nApellido: " + apellido + 
//				"\nDni: " + dni + "\nTelefono: " + telefono 
//				+ "\nDireccion: " + address + 
//				"\nNumero: "+ numero ;
//	}

	

}
