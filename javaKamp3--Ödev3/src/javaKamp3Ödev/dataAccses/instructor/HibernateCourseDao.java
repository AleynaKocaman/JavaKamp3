package javaKamp3�dev.dataAccses.instructor;


import javaKamp3�dev.entities.Instructor;

public class HibernateCourseDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
