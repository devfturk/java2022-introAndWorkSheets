package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// jdbc
		System.out.println(product.getNameString() + " eklendi");
	}
}
