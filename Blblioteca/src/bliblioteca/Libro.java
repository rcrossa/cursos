package bliblioteca;

public class Libro {
	
	private int código;
	private String titulo;
	private Asignatura tema;
	private Autor nombreautor;
	private Autor apellidoautor;
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Asignatura getTema() {
		return tema;
	}
	public void setTema(Asignatura tema) {
		this.tema = tema;
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
	
	
	
//
//	public String toString() {
//		return "\nCodigo: " + código + "\nTitulo: " + titulo + "\nTema: "+ tema 
//		+ "\nAutor: "+ nombreautor+"\nApellido: "+ apellidoautor;
//	}

}
