package oopWithNLayaredApp.business;

import java.util.List;

import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.dataAccess.HibernateProductDao;
import oopWithNLayaredApp.dataAccess.JdbcProductDao;
import oopWithNLayaredApp.dataAccess.ProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları yazılır.
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}
		
		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}
}
