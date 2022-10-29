package Users;

import ProductDetails.Product;

public class Seller extends Users {

	Product[] productListed;
	public Product[] getProductListed() {
		return productListed;
	}
	public void setProductListed(Product[] productListed) {
		this.productListed = productListed;
	}
	public boolean verifyUser() {
		
		return true;
	}

}
