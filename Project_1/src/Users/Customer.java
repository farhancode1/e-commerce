package Users;
import Orders.*;
public class Customer extends Users {
private Cart cart;

public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

@Override
public boolean verifyUser() {
	// TODO Auto-generated method stub
	return true;
}




	


}
