package paqueteEmpleados;

public class TestEmpleado {

	public static void main(String[] args) {
//		creo un objeto
		Empleados e1= new Empleados();//constructor por defecto.
		Empleados e2= new Empleados();
         e1.setemail("e1@email.com");
         e1.getemail();
         e1.setNombre("ignacio");
         e1.getNombre();
         e1.setsueldo(12000);
         e1.getsueldo();
         e2.setemail("e2@email.com");
         e2.getemail();
         e2.setNombre("pepe");
         e2.getNombre();
         System.out.println("El email es: "+ e1.getemail() + "El nombre es: " + e1.getNombre() + "El sueldo es: "+ e1.getsueldo());
         System.out.println("El nombre es: " + e2.getNombre() + "El email es: " + e2.getemail());
         
         
	}

}
