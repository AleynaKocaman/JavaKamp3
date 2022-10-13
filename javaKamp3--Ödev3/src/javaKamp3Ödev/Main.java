package javaKamp3Ödev;

import java.util.ArrayList;
import java.util.List;

import javaKamp3Ödev.bussines.CategoryManager;
import javaKamp3Ödev.bussines.CourseManager;
import javaKamp3Ödev.bussines.InstructorManager;
import javaKamp3Ödev.core.logging.DatabaseLogger;
import javaKamp3Ödev.core.logging.FileLogger;
import javaKamp3Ödev.core.logging.Logger;
import javaKamp3Ödev.dataAccses.category.HibernateCategoryDao;
import javaKamp3Ödev.dataAccses.course.JdbcCourseDao;
import javaKamp3Ödev.dataAccses.instructor.HibernateCourseDao;
import javaKamp3Ödev.entities.Category;
import javaKamp3Ödev.entities.Course;
import javaKamp3Ödev.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

	///CATEGORY
		
	Logger[] loggers= {new FileLogger(),new DatabaseLogger()};
	
	//kategorilerimizi oluþturuyoruz
	Category category1=new Category(1,"Yazýlým");
	Category category2=new Category(2,"Sanat");
	Category category3=new Category(3,"Kültür");
    //oluþturduðumuz kategorileri categories listesine ekliyoruz 
	List<Category> categories = new ArrayList<Category>();
	categories.add(category1);
	categories.add(category2);
	categories.add(category3);

	Category category=new Category(4,"Bilgisiyar mimarileri"); //ekleyeceðimiz yeni kategorimizi oluþturuyoruz
	
	CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers,categories); 
	categoryManager.add(category);

	System.out.println("------------------------------------------------------");
	//COURSE
	
	//kurslarýmýzý oluþturuyoruz
	List<Course> courses = new ArrayList<Course>();
	Course course1=new Course(1,"java", 1200);
	Course course2=new Course(2,"c#", 1200);
	Course course3=new Course(3,"c++", 1200);
	//oluþturduðumuz kurslarý courses listesine ekliyoruz
	courses.add(course1);
	courses.add(course2);
	courses.add(course3);

	Course course=new Course(4,"javaScript",2); //ekleyeceðimiz yeni kursumuzu oluþturuyoruz
	
	CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers, courses);
	courseManager.add(course);

	System.out.println("------------------------------------------------------");
	
	//INSTRUCTOR
	
	List<Instructor> instructors = new ArrayList<Instructor>();
	Instructor instructor=new Instructor(1, "Engin", "Demiroð");
	InstructorManager instructorManager=new InstructorManager(new HibernateCourseDao(),loggers,instructors);
    instructorManager.add(instructor);	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
