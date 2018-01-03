package db;
/* Sport is a persistent class representing a database entity table.
*/
public class User {
	private int cart_id;
	private String username;
	private String password;
	private String email;
	private String first_name;
	private String last_name;
	private String phone;
	private String add1;
	private String add2;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public int getcart_id() {
		return cart_id;
	}
	
	public void setcart_id(int id) {
		this.cart_id = id;	
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;	
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}

	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;	
	}
	
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String name) {
		first_name = name;	
	}
	
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String name) {
		last_name = name;	
	}
	
	public String getphone() {
		return this.phone;
	}
	public void setphone(String phone) {
		this.phone = phone;	
	}
	
	public String getadd1() {
		return add1;
	}
	public void setadd1(String add) {
		add1 = add;	
	}
	
	public String getadd2() {
		return add2;
	}
	public void setadd2(String add) {
		add2 = add;	
	}
	
	public String getcity() {
		return this.city;
	}
	public void setcity(String city) {
		this.city = city;	
	}
	
	public String getstate() {
		return this.state;
	}
	public void setstate(String state) {
		this.state = state;	
	}
	
	public String getzip() {
		return this.zip;
	}
	public void setzip(String zip) {
		this.zip = zip;	
	}
	
	public String getcountry() {
		return this.country;
	}
	public void setcountry(String country) {
		this.country = country;	
	}
	
}
