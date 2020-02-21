package com.service;

import java.util.List;

import com.dao.DaoInterface;
import com.dao.DaoInterfaceImplementation;
import com.model.Student;

public class ServiceInterfaceImplemen implements ServiceInterface
{
 DaoInterface di=new DaoInterfaceImplementation();
	
	@Override
	public void savedata(Student stu) 
	{
		di.savedata(stu);
		
	}

	@Override
	public List<Student> getAllData()
	{
		List<Student>list=di.getAllData();		
		return list;
		
	}

	@Override
	public List<Student> getSingleData(String un, String pw) 
	{
     List<Student> list=di.getSingleData(un, pw);
		
		return list;
	}

	@Override
	public void deletdata(int id) {
		di.deletdata(id);
		
	}

	@Override
	public Student editdata(int id) {
		
		Student stu=di.editdata(id);
		return stu;
	}

	@Override
	public void updatedata(Student stu) {
		di.updatedata(stu);
		
	}

	

}
