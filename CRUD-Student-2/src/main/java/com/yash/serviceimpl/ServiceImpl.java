package com.yash.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Image;
import com.yash.model.Student;
import com.yash.repository.HomeRepository;
import com.yash.service.ServiceI;
@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		
		hr.save(s);
		
		
	}

	@Override
	public List<Student> getAlldata() {
		
		List<Student> findAll = hr.findAll();
		return findAll;
	}

	@Override
	public Student updatedata(Student s) {
		
		return hr.save(s);
	}

	@Override
	public List<Student> delete(int sid) {
	
		hr.deleteById(sid);
	 
		return (List<Student>) hr.findAll();
	}

	@Override
	public Student singledata(int sid) {
		
		
		Student student = hr.findById(sid).get();
		return student;
	}

	@Override
	public void saveimage(Image img) {
		
		hr.save(img);
		
	}

}
