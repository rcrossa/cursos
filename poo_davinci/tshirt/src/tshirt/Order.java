package tshirt;

public class Order {
	
	   private double totalprice;
	    
	   public double addShirt(Shirt s) {
		    totalprice= totalprice + s.getPrice();
		    return totalprice ;
	   }
		}		
		

