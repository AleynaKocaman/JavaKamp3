package javaKamp3�dev;

import java.util.ArrayList;
import java.util.List;

import javaKamp3�dev.bussines.CategoryManager;
import javaKamp3�dev.bussines.CourseManager;
import javaKamp3�dev.bussines.InstructorManager;
import javaKamp3�dev.core.logging.DatabaseLogger;
import javaKamp3�dev.core.logging.FileLogger;
import javaKamp3�dev.core.logging.Logger;
import javaKamp3�dev.dataAccses.category.HibernateCategoryDao;
import javaKamp3�dev.dataAccses.course.JdbcCourseDao;
import javaKamp3�dev.dataAccses.instructor.HibernateCourseDao;
import javaKamp3�dev.entities.Category;
import javaKamp3�dev.entities.Course;
import javaKamp3�dev.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

	///CATEGORY
		
	Logger[] loggers= {new FileLogger(),new DatabaseLogger()};
	
	//kategorilerimizi olu�turuyoruz
	Category category1=new Category(1,"Yaz�l�m");
	Category category2=new Category(2,"Sanat");
	Category category3=new Category(3,"K�lt�r");
    //olu�turdu�umuz kategorileri categories listesine ekliyoruz 
	List<Category> categories = new ArrayList<Category>();
	categories.add(category1);
	categories.add(category2);
	categories.add(category3);

	Category category=new Category(4,"Bilgisiyar mimarileri"); //ekleyece�imiz yeni kategorimizi olu�turuyoruz
	
	CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers,categories); 
	categoryManager.add(category);

	System.out.println("------------------------------------------------------");
	//COURSE
	
	//kurslar�m�z� olu�turuyoruz
	List<Course> courses = new ArrayList<Course>();
	Course course1=new Course(1,"java", 1200);
	Course course2=new Course(2,"c#", 1200);
	Course course3=new Course(3,"c++", 1200);
	//olu�turdu�umuz kurslar� courses listesine ekliyoruz
	courses.add(course1);
	courses.add(course2);
	courses.add(course3);

	Course course=new Course(4,"javaScript",2); //ekleyece�imiz yeni kursumuzu olu�turuyoruz
	
	CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers, courses);
	courseManager.add(course);

	System.out.println("------------------------------------------------------");
	
	//INSTRUCTOR
	
	List<Instructor> instructors = new ArrayList<Instructor>();
	Instructor instructor=new Instructor(1, "Engin", "Demiro�");
	InstructorManager instructorManager=new InstructorManager(new HibernateCourseDao(),loggers,instructors);
    instructorManager.add(instructor);	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
