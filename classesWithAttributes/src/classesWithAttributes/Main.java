package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		Product product2 = new Product(2, "Laptop1", "aciklama1", 5000, 3,"deneme", "deneme");
		product.setNameString("Laptop");
		product.setDescriptionString("acıklama"); 
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setId(12);
		ProductManager pManager = new ProductManager();
		pManager.Add(product);
		System.out.println(product.getKodString());
		
	}

}
