package calificaciones;

public class Puebalibrocalificaciones {
		public static void main (String[] args) {
			
			Librocalificaciones a1 = new Librocalificaciones ();
			Librocalificaciones a2 = new Librocalificaciones ();
			
			a1.setcurso("Bienvenido al libro de calificaciones");
			a1.setCalificaciones(3.5);
			a1.setNombreDeLaMateria("Historia");
			a1.setInstructor("pepe");
			
			
			
			a2.setNombreDeLaMateria ("Matematicas");
			a2.setCalificaciones(1.5);
			a2.getCalificaciones();
			a2.setInstructor("pedro");
			a2.getInstructor();
			
			
			
			
			//a1.mostrarNombre();		
			System.out.println(a1.toString());
			System.out.println(" ---------- ");
			System.out.println("El nombre de la materia es: "+ a2.getNombreDeLaMateria()+ "\n La calificacion es: "+ a2.getCalificaciones()+ "\nEl instructor es: "+a2.getInstructor());
		}
}
