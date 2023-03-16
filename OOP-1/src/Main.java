import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String message = "Vade oranı";

		Product product1 = new Product();
		// set value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		// set value
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneString("055555555");
		individualCustomer.setCustomerNumberString("1111111");
		individualCustomer.setFirstNameString("Furkan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneString("5555555555");
		corporateCustomer.setCompanyNameString("Kodlama.io");
		corporateCustomer.setTaxNumberString("1111111111111111");
		corporateCustomer.setCustomerNumberString("111111");
		
		Customer[] customers = {corporateCustomer,individualCustomer};
		
	}

}
