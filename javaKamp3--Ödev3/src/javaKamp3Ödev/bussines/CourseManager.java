package javaKamp3Ödev.bussines;

import java.util.ArrayList;
import java.util.List;

import javaKamp3Ödev.core.logging.Logger;
import javaKamp3Ödev.dataAccses.course.CourseDao;

import javaKamp3Ödev.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	List<Course> courses=new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course newCourse) throws Exception {
		
		for (Course course : courses) {
			
			if(newCourse.getCourseName()==course.getCourseName()) {
				
				throw new Exception("Ayný ürün bir daha girilemez");
				
			}
			
			if(newCourse.getCoursePrice()<0) {
				
				throw new Exception("Ürün fiyatý 0 dan küçük olamaz");
				
			}
			
		}
		
		courses.add(newCourse);
		
		courseDao.add(newCourse);
		
		
		for (Logger logger : loggers) {
			
			logger.log(newCourse.getCourseName()); //loglama görevini
		}
		
	}
	
	
	

}
