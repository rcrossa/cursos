package cliente;

public class PruebaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente a1 =new Cliente();
		Cliente a2 =new Cliente();
		Cliente a3 =new Cliente();
		
		Direccion g1 = new Direccion ();
		g1.setaddress("cabildo");
		g1.setNumero(33);
		
		a1.setCustomerID(1);
		a1.setNombre("Pepe");
		a1.setAddress(g1);
		a1.setNumero(g1);
		a1.setPhonenumber(1091);
		a1.setStatus('a');
		a1.setTotalPurchases(1);
		
        //--------------//
		
		a2.setCustomerID(1);
		a2.setNombre("Alberto");
		
		a2.setPhonenumber(34);
		a2.setStatus('b');
		a2.setTotalPurchases(2);

		//----------------/
		
		a3.setCustomerID(1);
		a3.setNombre("Sergio");
		
		a3.setPhonenumber(36);
		a3.setStatus('c');
		a3.setTotalPurchases(3);
		
		System.out.println(a1.toString());
//		System.out.println(a2.toString());
//		System.out.println(a3.toString());
	}

}
