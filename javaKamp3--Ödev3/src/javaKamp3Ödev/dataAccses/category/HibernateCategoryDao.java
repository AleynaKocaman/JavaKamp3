package javaKamp3�dev.dataAccses.category;

import javaKamp3�dev.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	public HibernateCategoryDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile eklendi: "+category.getCategoryName());
		
	}

}
