package bliblioteca;


import java.util.Date;

public class Prestamo {
	
	private Libro autor;
	private Libro codigo;
	private String titulo;
	private Date fecha;
	public Libro getAutor() {
		return autor;
	}
	public void setAutor(Libro autor) {
		this.autor = autor;
	}
	public Libro getCodigo() {
		return codigo;
	}
	public void setCodigo(Libro codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setFecha(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	public String toString() {
		return "Autor:" + autor.getAutor() + "Codigo: " + codigo.getCódigo() + "Titulo: " + titulo.getBytes() + "Fecha:" + fecha;
	}
	
	

	

	
}
