package javaKamp3�dev.bussines;

import java.util.ArrayList;
import java.util.List;

import javaKamp3�dev.core.logging.Logger;
import javaKamp3�dev.dataAccses.category.CategoryDao;
import javaKamp3�dev.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	List<Category> categories = new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
		this.categories=categories;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category newCategory) throws Exception{
		
		
		for (Category category : categories) {
			
		      if(newCategory.getCategoryName()==category.getCategoryName()) {
		    	  
		    	  throw new Exception("Ayn� �r�n bir daha girilemez");
		          
		 }
		}
		
		 categories.add(newCategory);
		 categoryDao.add(newCategory); //hangi veri taban� ile eklendii�ini 		
		 for (Logger logger : loggers) {
				
				logger.log(newCategory.getCategoryName()); //loglama g�revini
			}

	}

}
