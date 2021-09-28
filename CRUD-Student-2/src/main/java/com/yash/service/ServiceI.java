package com.yash.service;

import java.util.List;

import com.yash.model.Image;
import com.yash.model.Student;

public interface ServiceI {
	
	public void saveData(Student s);
	
	public List<Student>getAlldata();
	
	public Student updatedata(Student s);
	
	public List<Student> delete(int sid);
	
	public Student singledata(int sid);
	
	public void saveimage(Image img);
	
	

}
