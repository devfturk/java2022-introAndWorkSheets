package kodlama.ioWebHomePage.business;

import kodlama.ioWebHomePage.core.logging.Logger;
import kodlama.ioWebHomePage.dataAccess.TeacherDao;
import kodlama.ioWebHomePage.entities.Teacher;

public class TeacherManager {
 
	private TeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.Log(teacher.getName() + " " + teacher.getLastName());
		}
	}
	
}
