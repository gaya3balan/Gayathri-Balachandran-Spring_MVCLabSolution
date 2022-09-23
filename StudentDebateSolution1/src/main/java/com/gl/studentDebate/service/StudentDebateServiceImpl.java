package com.gl.studentDebate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.studentDebate.entity.Student;

@Repository
public class StudentDebateServiceImpl implements StudentDebateService {

	private SessionFactory sessionFactory;

	 
	private Session session;

	@Autowired
	StudentDebateServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

	}

	@Transactional
	public List<Student> findAll() {
		Transaction tx = session.beginTransaction();

		 
		List<Student> students = session.createQuery("from Student").list();

		tx.commit();

		return students;
	}

	@Transactional
	public void deleteById(int theId) {

		Transaction tx = session.beginTransaction();
		
		Student studentRec = session.get(Student.class, theId);
		
		session.delete(studentRec);
		
		tx.commit();
	}
	
	@Transactional
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(theStudent);

		tx.commit();
	}
	
	@Transactional
	public Student findById(int theId) {

		Student studentRecord = new Student();

		Transaction tx = session.beginTransaction();

		studentRecord = session.get(Student.class, theId);

		tx.commit();

		return studentRecord;
	}

	 
	@Transactional
	public void print(List<Student> student) {

		for (Student stud : student) {
			System.out.println(stud);
		}

	}

}