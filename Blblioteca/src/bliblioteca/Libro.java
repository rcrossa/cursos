package bliblioteca;

public class Libro {
	private String autor;
	private int código;
	private String titulo;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public String toString() {
		return "Codigo: "+ código + "Titulo: " + titulo;
	}
	
}
