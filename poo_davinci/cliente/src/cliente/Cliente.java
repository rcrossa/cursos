package cliente;

public class Cliente {
	private int customerID;	
	private String nombre;
	private Direccion address;
	private Direccion numero;
	public Direccion getNumero() {
		return numero;
	}
	public void setNumero(Direccion numero) {
		this.numero = numero;
	}


	private int phonenumber;
	private char status;
	private double totalPurchases;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getAddress() {
		return address;
	}
	public void setAddress(Direccion address) {
		this.address = address;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public double getTotalPurchases() {
		return totalPurchases;
	}
	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	

	public String toString() {
		
		return "\n El id es:" + customerID + "\n El nombre es: "+ nombre + "\nLa calle es: " + address.getaddress() + "\n El numero es: "+ numero.getNumero() + "\n El numero es:" + phonenumber + "\nEl status es :"+ status + "\n El total es: "+ totalPurchases;
	}
}


