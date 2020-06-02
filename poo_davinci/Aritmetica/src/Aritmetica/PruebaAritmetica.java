package Aritmetica;

public class PruebaAritmetica {
	

	
//clase main
	public static void main(String[] args) {
//		 declaro el objeto		
		Aritmetica objeto1 = new Aritmetica();
		//declaro variable
		int resultado= objeto1.sumar(5,3);
		float resultado1 =objeto1.sumar(3, 4);
		
		System.out.println(resultado1);
		System.out.println(resultado);
	}
   
}
