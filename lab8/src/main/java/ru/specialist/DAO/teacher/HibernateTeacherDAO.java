package ru.specialist.DAO.teacher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("teacherDao")
public class HibernateTeacherDAO implements TeacherDAO {
	private static final Log LOG = LogFactory.getLog(HibernateTeacherDAO.class);
	
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory () {
		return sessionFactory; 
	}
	
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory; 
	}

	@Override
	public List<Teacher> findByName(String name) {
		return getSessionFactory().getCurrentSession().
				createQuery("from Teacher t where name LIKE :name").
				setParameter("name", name+"%").list(); 	 // HQL
	}
}