package kodlama.ioWebHomePage.business;

import kodlama.ioWebHomePage.core.logging.Logger;
import kodlama.ioWebHomePage.dataAccess.CategoryDao;
import kodlama.ioWebHomePage.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private static Category[] categories = {};
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		
		for (Category kategori : categories) {
			if (kategori.getName() == category.getName()) {
				System.out.println("Kategori zaten var.");
				return;
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.Log(category.getName());
		}
	}
}
