package Users;

public abstract class Users {
String userId="";
String password="";
  public abstract boolean verifyUser() ;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
