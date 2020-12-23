package ru.specialist.dbHibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.specialist.DAO.course.Course;
import ru.specialist.DAO.course.CourseDAO;
import ru.specialist.DAO.teacher.Teacher;
import ru.specialist.DAO.teacher.TeacherDAO;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CourseDAO courseDao = context.getBean(CourseDAO.class);
		TeacherDAO teacherDAO = context.getBean(TeacherDAO.class);

		for(Teacher teacher : teacherDAO.findByName("Иванов")){
			System.out.println(teacher);
		}
		
		/*
		Course spring = new Course();
		spring.setTitle("Spring");
		spring.setLength(40);
		spring.setDescription("Spring framework");
		courseDao.insert(spring);*/
		
		//courseDao.delete(8);
		
		
		//for(Course c : courseDao.findAll())
		//	System.out.println(c);
		
		//System.out.println(courseDao.findById(5));
		
//		for(Course c : courseDao.findByTitle("web"))
//			System.out.println(c);
		
		context.close();
    }
}
