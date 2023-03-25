package kodlama.ioWebHomePage.business;

import kodlama.ioWebHomePage.core.logging.Logger;
import kodlama.ioWebHomePage.dataAccess.CourseDao;
import kodlama.ioWebHomePage.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private static Course[] courses = {};
	
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) {
		
		for (Course kurs : courses) {
			if (kurs.getName() == course.getName()) {
				System.out.println("Kurs zaten var.");
				return;
			}
		}
		if (course.getPrice() < 0) {
			System.out.println("Kurs fiyatı geçersiz.");
			return;
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.Log(course.getName());
		}
	}
}
