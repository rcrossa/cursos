package paquetecuentas;

public class TestCuentas {

public static void main(String[] args) {
		
		Cuentas a1 = new Cuentas();
		Cuentas a2 = new Cuentas();
		Cuentas a3 = new Cuentas();
		Cuentas a4 = new Cuentas();
        	
		a1.setSaldo(35);
		a1.abonar(10);
		
		a2.setSaldo(10);
		a2.abonar(10);
		
		a3.setSaldo(10);
		a3.abonar(10);
		
		a4.setSaldo(10);
		a4.abonar(10);
		
		System.out.println(a1);
		System.out.println("El nuevo saldo es :"+a1.validasaldo());
		System.out.println("----------------------------");
		
		System.out.println(a2);
		System.out.println("El nuevo saldo es :"+a2.validasaldo());
		System.out.println("----------------------------");
		
		System.out.println(a3);
		System.out.println("El nuevo saldo es :"+a3.validasaldo());
		System.out.println("----------------------------");
		
		System.out.println(a4);
		System.out.println("El nuevo saldo es :"+a4.validasaldo());
	}

}
	

