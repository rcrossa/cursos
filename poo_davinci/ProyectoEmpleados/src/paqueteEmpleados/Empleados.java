package paqueteEmpleados;

public class Empleados {
			//declaracion de variables encapsuladas
	private String nombre;
	private int nLegajo;
	private double sueldo;
	private String email;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setnLegajo(int nLegajo) {
		this.nLegajo= nLegajo;
	}
	public int getnLegajo() {
		return nLegajo;
	}
	
	public void setsueldo(double sueldo) {
		this.sueldo= sueldo;
	}
	public double getsueldo() {
		return sueldo;
	}
	
	public void setemail(String email) {
		this.email= email;
	}
	public String getemail() {
		return email;
	}
}
