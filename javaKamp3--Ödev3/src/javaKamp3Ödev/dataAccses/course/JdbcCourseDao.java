package javaKamp3Ödev.dataAccses.course;

import javaKamp3Ödev.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("jdbc ile eklendi: "+course.getCourseName());
		
		
	}

}
