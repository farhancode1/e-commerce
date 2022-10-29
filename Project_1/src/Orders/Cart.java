package Orders;
import ProductDetails.*;
public class Cart {
private Product[] listOfProduct;

public Product[] getListOfProduct() {
	return listOfProduct;
}

public void setListOfProduct(Product[] listOfProduct) {
	this.listOfProduct = listOfProduct;
}
public boolean checkout() {
	return true;
}
}
