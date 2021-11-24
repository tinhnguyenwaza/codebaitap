package SEVERLET_ASM2;

public class Acount {
	private String user, passW;
	private int role, check;
	private String name, address, phone;
	
	
	
	public Acount(String user, String passW) {
		this.user = user;
		this.passW = passW;
	}
	public Acount(String user, String passW, int role, int check, String name, String address, String phone) {
		super();
		this.user = user;
		this.passW = passW;
		this.role = role;
		this.check = check;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassW() {
		return passW;
	}
	public void setPassW(String passW) {
		this.passW = passW;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
