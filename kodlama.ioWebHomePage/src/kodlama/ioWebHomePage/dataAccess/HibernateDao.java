package kodlama.ioWebHomePage.dataAccess;

import kodlama.ioWebHomePage.entities.Category;
import kodlama.ioWebHomePage.entities.Course;
import kodlama.ioWebHomePage.entities.Teacher;

public class HibernateDao implements  CategoryDao,CourseDao,TeacherDao{

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi. " + teacher.getName() );
	}

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi. " + course.getName() );
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi. " + category.getName() );
	}

}
