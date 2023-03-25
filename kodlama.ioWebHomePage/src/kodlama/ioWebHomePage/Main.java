package kodlama.ioWebHomePage;

import kodlama.ioWebHomePage.business.CategoryManager;
import kodlama.ioWebHomePage.business.CourseManager;
import kodlama.ioWebHomePage.business.TeacherManager;
import kodlama.ioWebHomePage.core.logging.DatabaseLogger;
import kodlama.ioWebHomePage.core.logging.FileLogger;
import kodlama.ioWebHomePage.core.logging.Logger;
import kodlama.ioWebHomePage.core.logging.MailLogger;
import kodlama.ioWebHomePage.dataAccess.HibernateDao;
import kodlama.ioWebHomePage.dataAccess.JdbcDao;
import kodlama.ioWebHomePage.entities.Category;
import kodlama.ioWebHomePage.entities.Course;
import kodlama.ioWebHomePage.entities.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher(1, "Furkan", "Türk");
		Category category = new Category(1,"Yazılım");
		Course course = new Course(1, "Java", 100);
		
		Logger[] loggers = {
				new DatabaseLogger(),
				new FileLogger(),
				new MailLogger()
		};
		
		TeacherManager teacherManager = new TeacherManager(new JdbcDao(), loggers);
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		
		teacherManager.add(teacher);
		categoryManager.add(category);
		courseManager.add(course);
		
		
	}

}
