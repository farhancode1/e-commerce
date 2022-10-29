package ProductDetails;

public class Catalogue {
private Product[] listOfAllProducts;
private Product[] sellerProducts;
public Product[] getSellerProducts() {
	Product product1=new Product();
	product1.setProductId("1");
	product1.setProductName(" shirt");
	product1.setCost(" 500rs");
	
	 Product product2=new Product();
	 product2.setProductId("8");
	 product2.setProductName(" Computers");
	 product2.setCost(" 15000RS");
	
	 sellerProducts=new Product[2];
	 sellerProducts[0]=product1;
	 sellerProducts[1]=product2;
	return sellerProducts;
}

public void setSellerProducts(Product[] sellerProducts) {
	this.sellerProducts = sellerProducts;
}

Category p1=new Category();
Category p2=new Category();
Category p3=new Category();

public Product[] getListOfAllProducts() {
	p1.setCategoryName("cloths");
	p2.setCategoryName("books");
	p3.setCategoryName("gedgets");
	Product product1=new Product();
	product1.setProductId("1");
	product1.setProductName(" shirt");
	product1.setCost(" 500rs");
	product1.setCategory(p1);
	Product product2=new Product();
	product2.setProductId("2");
	 product2.setProductName(" T-Shirt");
	 product2.setCost(" 250Rs");
	 product2.setCategory(p1);
	 Product product3=new Product();
	 product3.setProductId("3");
	 product3.setProductName(" jenes");
	 product3.setCost(" 1000RS");
	 product3.setCategory(p1);
	 
	Product product4=new Product();
	 product4.setProductId("4");
	 product4.setProductName(" Adventure Books");
	 product4.setCost(" 200RS");
	 product4.setCategory(p2);
	 Product product5=new Product();
	 product5.setProductId("5");
	 product5.setProductName(" Horror Books");
	 product5.setCost(" 300RS");
	 product5.setCategory(p2);
	 Product product6=new Product();
	 product6.setProductId("6");
	 product6.setProductName(" Subjects Books");
	 product6.setCost(" 400RS");
	 product6.setCategory(p2);
	 
	 Product product7=new Product();
	 product7.setProductId("7");
	 product7.setProductName(" Mobiles");
	 product7.setCost(" 6000RS");
	 product7.setCategory(p3);
	 Product product8=new Product();
	 product8.setProductId("8");
	 product8.setProductName(" Computers");
	 product8.setCost(" 15000RS");
	 product8.setCategory(p3);
	
	listOfAllProducts=new Product[8];
	listOfAllProducts[0]=product1;
	listOfAllProducts[1]=product2;
	listOfAllProducts[2]=product3;
	listOfAllProducts[3]=product4;
	listOfAllProducts[4]=product5;
	listOfAllProducts[5]=product6;
	listOfAllProducts[6]=product7;
	listOfAllProducts[7]=product8;
	return listOfAllProducts;
}

public void setListOfAllProducts(Product[] listOfAllProducts) {
	this.listOfAllProducts = listOfAllProducts;
}
}
