package calcularCuentas;

public class Cuenta {

	private int calcular=0;
	private int contador;
	
	public int suma() {
		
		for(int i=1; i<=10;i++) {
			calcular+=i;
			
			
		   System.out.println("El resultado es: "+ calcular);
		}
		return calcular;
	}
	public String toString() {
		return ("El resultado es:" + suma());
	}
	public static void main(String[] args) {
		
		Cuenta a1 = new Cuenta();
		a1.suma();
		System.out.println(a1.calcular);
	}
	
}

