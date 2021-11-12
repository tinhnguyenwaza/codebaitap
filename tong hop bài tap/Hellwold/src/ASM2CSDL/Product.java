package ASM2CSDL;

public class Product {
	private String id;
	private String title;
	private int quanTiTy;
	private double price;
	
	
	//contructor
	public Product(String id, String title, int quanTiTy, double price) {
		super();
		this.id = id;
		this.title = title;
		this.quanTiTy = quanTiTy;
		this.price = price;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getQuanTiTy() {
		return quanTiTy;
	}


	public void setQuanTiTy(int quanTiTy) {
		this.quanTiTy = quanTiTy;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return id + "   " + title + "   " + quanTiTy + "   " + price;
	}

	
	
	
	
	
	
	
	
}
