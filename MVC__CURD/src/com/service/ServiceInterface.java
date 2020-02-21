package com.service;

import java.util.List;

import com.model.Student;

public interface ServiceInterface 
{
	public void savedata(Student stu);
	
	public List<Student> getAllData();
	
	//public List<Student> getSingleData( String un, String pw);
	
	public void deletdata(int id);
	
	public Student editdata(int id);
	 
	public void updatedata(Student stu);
}
