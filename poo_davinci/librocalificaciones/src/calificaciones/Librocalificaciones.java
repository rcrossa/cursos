package calificaciones;

public class Librocalificaciones {
		public String curso;
		private double calificaciones;
		private String nombreDeLaMateria;
		private String instructor;
		
		
		public String getInstructor() {
			return instructor;
		}
		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}
		public void setcurso (String curso) {
			this.curso = curso;
		}
		public void mostrarNombre () {
			 System.out.println(curso);
		}
		
		
		
		//sobreescritura del método toString() de la clase object 
		public String toString() {
			return "Mensaje: " + curso + "\nCalificacion: " + calificaciones + "\nMateria: " + nombreDeLaMateria + "\nEl instructor es: "+ instructor;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public double getCalificaciones() {
			return calificaciones;
		}
		public void setCalificaciones(double calificaciones) {
			this.calificaciones = calificaciones;
		}
		public String getNombreDeLaMateria() {
			return nombreDeLaMateria;
		}
		public void setNombreDeLaMateria(String nombreDeLaMateria) {
			this.nombreDeLaMateria = nombreDeLaMateria;
		}
}
