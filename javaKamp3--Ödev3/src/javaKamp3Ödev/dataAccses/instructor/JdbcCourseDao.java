package javaKamp3�dev.dataAccses.instructor;


import javaKamp3�dev.entities.Instructor;

public class JdbcCourseDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Jbcd ile eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}


}
