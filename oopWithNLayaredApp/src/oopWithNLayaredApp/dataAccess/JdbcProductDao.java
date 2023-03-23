package oopWithNLayaredApp.dataAccess;

import oopWithNLayaredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//db erişim kodları yazılır...SQL bilmek gerekli.
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
