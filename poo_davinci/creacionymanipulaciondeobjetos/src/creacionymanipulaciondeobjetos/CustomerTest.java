package creacionymanipulaciondeobjetos;

public class CustomerTest {
 
	public static void main(String[] args) {
		 Customer cust1 = new Customer();
		 Customer cust2 = new Customer();
		 
         cust1.customerid=1;
         cust1.name="pepe";
         cust1.emailAddress="Pepe@hotmail.com";
         cust1.Displayinfo();
         System.out.println("============");
         cust2.customerid=2;
         cust2.name="Carlos";
         cust2.emailAddress="Carlos@hotmail.com";
         cust2.Displayinfo();
     
         System.out.println("===========");
         cust1 =cust2;
         cust1.Displayinfo();
		
//		System.out.println(cust1.toString() + cust2.toString());
	}
}

