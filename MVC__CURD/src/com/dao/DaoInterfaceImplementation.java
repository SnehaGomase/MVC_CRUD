package com.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Student;
import com.utility.HiberUtil;

public class DaoInterfaceImplementation implements DaoInterface 
{
    SessionFactory sf=HiberUtil.getSessionFactory();

	@Override
	public void savedata(Student stu) 
	{
		Session session=sf.openSession();
		
		session.save(stu);
		session.beginTransaction().commit();
		
	}

	@Override
	public List<Student> getAllData() 
	{
		Session session1=sf.openSession();
		Query que=session1.createQuery("from Student");
		List<Student>list=que.getResultList();
		return list;
		
	}

	@Override
	public List<Student> getSingleData(String un, String pw) 
	{
		Session session2=sf.openSession();
		Query que=session2.createQuery("from Student where username=? and password=?");
		que.setParameter(0, un);
		que.setParameter(1, pw);
		
		List<Student> list=que.getResultList();
	
		return list;
	}

	@Override
	public void deletdata(int id) 
	{
		Session session3=sf.openSession();
		Student stu=session3.load(Student.class, id);
		
		session3.delete(stu);
		session3.beginTransaction().commit();
	}

	@Override
	public Student editdata(int id) {
		Session session4=sf.openSession();
		Student stu=session4.load(Student.class, id);
		return stu;
		
	}

	@Override
	public void updatedata(Student stu) {
		Session session5=sf.openSession();
		session5.update(stu);
		session5.beginTransaction().commit();
		
	}

}


