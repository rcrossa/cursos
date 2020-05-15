package creacionymanipulaciondeobjetos;

public class Customer {
		
	public int customerid;
	public String name;
	public String emailAddress;
	
	public void Displayinfo() {
		System.out.println(customerid);
		System.out.println(name);
		System.out.println(emailAddress);
//		return "id: "+ customerid +
//				"name: "+ name + "Email: " + emailAddress;
	}
}
