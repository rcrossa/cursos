package bliblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {

	private Socio customerid;
	private Socio nombre;
	private Socio apellido;
	private Socio dni;
	private Socio telefono;
	private Direccion address; 
	private Date fecha;
	private Libro titulo;
	private Autor nombreautor;
	private Autor apellidoautor;
	private Asignatura tema;
	private int cantidaddelibros;
	public Socio getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Socio customerid) {
		this.customerid = customerid;
	}
	public Socio getNombre() {
		return nombre;
	}
	public void setNombre(Socio nombre) {
		this.nombre = nombre;
	}
	public Socio getApellido() {
		return apellido;
	}
	public void setApellido(Socio apellido) {
		this.apellido = apellido;
	}
	public Socio getDni() {
		return dni;
	}
	public void setDni(Socio dni) {
		this.dni = dni;
	}
	public Socio getTelefono() {
		return telefono;
	}
	public void setTelefono(Socio telefono) {
		this.telefono = telefono;
	}
	public Direccion getAddress() {
		return address;
	}
	public void setAddress(Direccion address) {
		this.address = address;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Libro getTitulo() {
		return titulo;
	}
	public void setTitulo(Libro titulo) {
		this.titulo = titulo;
	}
	public Autor getNombreautor() {
		return nombreautor;
	}
	public void setNombreautor(Autor nombreautor) {
		this.nombreautor = nombreautor;
	}
	public Autor getApellidoautor() {
		return apellidoautor;
	}
	public void setApellidoautor(Autor apellidoautor) {
		this.apellidoautor = apellidoautor;
	}
	public Asignatura getTema() {
		return tema;
	}
	public void setTema(Asignatura tema) {
		this.tema = tema;
	}
	public int getCantidaddelibros() {
		return cantidaddelibros;
	}
	public void setCantidaddelibros(int cantidaddelibros) {
		this.cantidaddelibros = cantidaddelibros;
	}
	
	


	public Date Fecha1() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		formatter.format(date);
		   fecha= date;
			return fecha;
	}

	public String validartitulo() {
		
		return titulo.getTitulo();
	}

	public String tema() {
		return tema();
	}

	public String validarnombreautor() {
		nombreautor.getNombre();
		return nombreautor.getNombre() ; }

	public String validarapellidoautor() {
		apellidoautor.getApellido();
		return apellidoautor.getApellido(); 
		}


	public String toString() {
		return "\nCodigo de socio: " + customerid.getCustomerid() +
				"\nNombre del socio: "+ nombre.getNombre() +
				"\nApellido del socio: "+ apellido.getApellido()+
				"\nDni: "+ dni.getDni() +
				"\nTelefono: " + telefono.getTelefono()+
				"\nDireccion: " + address.getaddress() +
				"\nFecha: " + Fecha1()+
				"\nNombre del Libro: " + titulo.getTitulo()+
				" / Asignatura: " + tema.getTema() +
				" / Autor:" + nombreautor.getNombre() + 
				" / Apellido: " + apellidoautor.getApellido();
	}
	
	
	
	

}
