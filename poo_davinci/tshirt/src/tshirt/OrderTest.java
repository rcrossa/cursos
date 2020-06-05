package tshirt;

public class OrderTest {

	private static double totalcost;

	public static void main(String[] args) {
		    Order o1= new Order();
		    Order o2 = new Order();
			Shirt c1 = new Shirt();
			Shirt c2= new Shirt();
			c1.setShirtID(1);
			c1.setPrice(14);
			c1.setDescription("camisa azul");
			c1.setColorCode("b");
			c1.setQuantityInStock("2");
			
			c2.setShirtID(2);
			c2.setPrice(15);
			c2.setDescription("camisa verde");
			c2.setColorCode("c");
			c2.setQuantityInStock("3");
			
			totalcost=o1.addShirt(c1);
			totalcost=o2.addShirt(c2);
			System.out.println(c1.toString()+"\n"+c2.toString());
			
			
	}

}
