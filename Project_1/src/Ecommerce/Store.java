package Ecommerce;

import java.util.Scanner;
import ProductDetails.*;
import Users.*;
import Orders.*;
public class Store {
public static void main(String[] args) {
	System.out.println("Welcome to ecommerce store!");
	System.out.println("Which user are you? 1.Customer 2.Seller 3.Admin");
	Scanner sc =new Scanner(System.in);
	int choice=sc.nextInt();
	String typeOfUser;
	if(choice==1) {
		typeOfUser="Customer";
		Customer current=new Customer();
	System.out.println("What is your Userid?");
	sc.nextLine();
	current.setUserId(sc.nextLine());
	System.out.println("What is your Password");
	//sc.nextLine();
	current.setPassword(sc.nextLine());
    if(current.verifyUser()==true) {
    System.out.println("user verified!**********");
    while(true) {
    	
    System.out.println("Do you want to- 1.View product 2.View cart 3.Contact us 4.Exit");
    choice=sc.nextInt();
    if(choice==1) {
    	Catalogue catalogue=new Catalogue ();
    Product[] allProducts=catalogue.getListOfAllProducts();
    System.out.println("1.Cloths 2.Books 3.Gedgets");
  //  sc.nextInt();
    int pick=sc.nextInt();
    String select="";
    if(pick==1) 
    	select="cloths";
    
    else if(pick==2) 
    	select="books";
    
    else if(pick==3) 
    	select="gedgets";
    
       for(int i=0;i<allProducts.length;i++) {
    	   if(allProducts[i].getCategory().getCategoryName().equals(select)) {
        System.out.println( allProducts[i].getProductId()+""+allProducts[i].getProductName()+""+allProducts[i].getCost());
        }}
        System.out.println("Do you want to add any product  Add to cart? Y/N");
        sc.nextLine();
        String addToCart=sc.nextLine();
        if(addToCart.equals("Y")) {
        	 System.out.println("Input the product id of the product which you want to add to cart");
        	 String productId=sc.nextLine();
        	Product[] cartProducts=new 	Product[1] ;
        	 for(int i=0;i<allProducts.length;i++) {
        		 if(allProducts[i].getProductId().equals(productId)) {
        			 cartProducts[0]=allProducts[i];
        			 
        		 }
        	 }
        	 Cart cart =new Cart();
        	 cart.setListOfProduct(cartProducts);
        	 current.setCart(cart);
        }
       System.out.println("The product is successfully added to cart"); 
    }
    else if(choice==2) {  
        	  Product[] cartProducts= current.getCart().getListOfProduct();
        	  for(int i=0;i<cartProducts.length;i++) {
        	        System.out.println( cartProducts[i].getProductId()+""+cartProducts[i].getProductName()+""+cartProducts[i].getCost());
        	        }
        	  System.out.println("Do you want to check out cart? Y/N");
        	  sc.nextLine();
        	  String checkout= sc.nextLine();
        	  Order order=new Order();
        	  if(checkout.equals("Y")) {
        		  current.getCart().checkout();
        		   order.setUserId(current.getUserId());
        		   System.out.println("Your user Id is "+order.getUserId());}
        		   for(int i=0;i<cartProducts.length;i++) 
        		   order.setOrderId(cartProducts[i].getProductId());
        		   System.out.println("Product ID is "+order.getOrderId());
        System.out.println("Receipt is generating***************************");
        System.out.println("Receipt is generated sucessfully");
        System.out.println("  User ID:-"+order.getUserId());
        for(int i=0;i<cartProducts.length;i++) {
        System.out.println("  Product Id:-"+cartProducts[i].getProductId());
        System.out.println("  Product Name:-"+cartProducts[i].getProductName());
        System.out.println("  Product Cost:-"+cartProducts[i].getCost());}
        	  System.out.println("Your Order Is Placed successfully");
    }
          
          else if(choice==3) {
        	  System.out.println("to contact us just email on swag@gmail.com");
          }
          else if(choice==4) {
        	  break;
          }
          else {
        	  System.out.println("invalid request , please try again!");
          }}
    
    }
    }
	else if(choice==2) {
		
		typeOfUser="Seller";
		Seller seller1=new Seller();
		System.out.println("Enter your seller Id");
		sc.nextLine();
		seller1.setUserId(sc.nextLine());
		System.out.println("Enter your seller password");
		
		seller1.setPassword(sc.nextLine());
		if(seller1.verifyUser()==true)
			System.out.println("seller is verified");
		while(true) {
		System.out.println("Do you want to - 1. View products  2. Add Product 3. Contact us");
		choice=sc.nextInt();
		if (choice==1) {
			Catalogue catalogue=new Catalogue ();
			  Product[] sellerProducts=catalogue.getSellerProducts();
			  for(int i=0;i<sellerProducts.length;i++) {
      	        System.out.println( sellerProducts[i].getProductId()+""+sellerProducts[i].getProductName()+""+sellerProducts[i].getCost());
      	        }
		}
		else if(choice==2) {
			System.out.println("select the product id to add");
			sc.nextLine();
			String getId=sc.nextLine();
			Catalogue catalogueS2=new Catalogue ();
			Product[] SellerProduct=catalogueS2.getSellerProducts();
			Product[] SellerAddedProduct =new Product[0];
			for(int i=0;i<SellerAddedProduct.length;i++) 
				if(SellerAddedProduct[i].getProductId().equals(getId)) {
					SellerAddedProduct[0]=SellerProduct[1];
					seller1.setProductListed(SellerAddedProduct);
					System.out.println("Product is successfully added");
				}
				else if(choice==3) {
					System.out.println("to contact us please email us on swag@gmail.com");
				}
				else if(choice==4) {
					break;
				}
				else {
					System.out.println("Invalid choice");
				}
		}
		}}
	else if(choice==3) {
		typeOfUser="Admin";
		while(true) {
		System.out.println("Do you want to 1. View all product 2.seller product 3.Exit");
		int choiceAdmin =sc.nextInt();
		if(choiceAdmin==1) {
			Catalogue catalogue=new Catalogue ();
			Product[] admin=catalogue.getListOfAllProducts();
			 for(int i=0;i<admin.length;i++) {
		     System.out.println( admin[i].getProductId()+""+admin[i].getProductName()+""+admin[i].getCost());
		        }
		}
		else if(choiceAdmin==2) {
			Catalogue catalogueS=new Catalogue ();
			Product[] admin=catalogueS.getSellerProducts();
			 for(int i=0;i<admin.length;i++) {
	      	        System.out.println( admin[i].getProductId()+""+admin[i].getProductName()+""+admin[i].getCost());
	      	        }
			
		}
		else if(choiceAdmin==3) {
			break;
		}
		else {
			System.out.println("Invalid choice");
		}
	}}
	else {
		System.out.println("Invalid user. Try again!");
	}}
			
}
