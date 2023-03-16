package classesWithAttributes;

public class Product {

	private int id;
	private String nameString;
	private String descriptionString;
	private double price;
	private int stockAmount;
	private String renkString;
	private String kodString;

	public Product() {

	}

	public Product(int id, String nameString, String descriptionString, double price, int stockAmount,
			String renkString, String kodString) {
		this.id = id;
		this.nameString = nameString;
		this.descriptionString = descriptionString;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renkString = renkString;
		this.kodString = kodString;
	}

	public String getRenkString() {
		return renkString;
	}

	public void setRenkString(String renkString) {
		this.renkString = renkString;
	}

	public String getKodString() {
		return this.nameString.substring(0, 1) + id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getDescriptionString() {
		return descriptionString;
	}

	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
