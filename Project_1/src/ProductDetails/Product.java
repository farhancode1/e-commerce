package ProductDetails;
import Users.*;
public class Product {
private String productId;
private String cost;
private String productName;
private Seller seller;
public Category category;
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Seller getSeller() {
	return seller;
}
public void setSeller(Seller seller) {
	this.seller = seller;
}

}
