package tshirt;

public class Shirt {
	
	private int shirtID;
	private String description;
	private double price;
	private String quantityInStock;
	private String colorCode;
	
public int getShirtID() {
	return shirtID;
}

public void setShirtID(int shirtID) {
	this.shirtID = shirtID;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getQuantityInStock() {
	return quantityInStock;
}

public void setQuantityInStock(String quantityInStock) {
	this.quantityInStock = quantityInStock;
}

public String getColorCode() {
	return colorCode;
}

public void setColorCode(String colorCode) {
	this.colorCode = colorCode;
}

public double price(double s) {
	return s;
}

//public void display() {
//	
//	System.out.println("Item ID: " + shirtID);
//	System.out.println("Item description:" + description);
//	
//	System.out.println("Color Code: " + colorCode);
//	System.out.println("Item price: " + price);
//	
//	System.out.println("Quantity in stock: " + quantityInStock);
//	} // end of display method

public String toString() {
return "\nID:"+ shirtID
		+ "\nDescripcion:" + description
+ "\nColor: " + colorCode + "\nPrecio: " 
+ price + "\nCantidad en stock: " + quantityInStock;
} // end of display method

}


	

