package javaKamp3�dev.bussines;

import java.util.ArrayList;
import java.util.List;

import javaKamp3�dev.core.logging.Logger;
import javaKamp3�dev.dataAccses.instructor.InstructorDao;
import javaKamp3�dev.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	List<Instructor> instructors=new ArrayList<Instructor>();
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers,List<Instructor> instructors) {
		
		this.instructors=instructors;
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
		
	}
	

}
