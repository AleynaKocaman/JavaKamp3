package javaKamp3�dev.dataAccses.category;

import javaKamp3�dev.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	public JdbcCategoryDao() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("jdbc ile eklendi: "+category.getCategoryName());
		
	}

}
