package javaKamp3Ödev.dataAccses.instructor;


import javaKamp3Ödev.entities.Instructor;

public class JdbcCourseDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Jbcd ile eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}


}
