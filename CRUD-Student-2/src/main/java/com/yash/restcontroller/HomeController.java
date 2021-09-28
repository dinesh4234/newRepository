package com.yash.restcontroller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yash.model.Image;
import com.yash.model.Student;
import com.yash.service.ServiceI;

@RestController
public class HomeController {

	@Autowired
	  ServiceI sr;
	@PostMapping(value = "/save",consumes = {"application/json","application/xml"},produces = {"application/json","application/xml"})
	public String save(@RequestBody Student s)
	{
		sr.saveData(s);
		
		return "Data saved successfully";
	}
	
	@GetMapping(value = "/get",consumes = {"application/json","application/xml"},produces = {"application/json","application/xml"})
	public List<Student> getdata() {
		
		List<Student> alldata = sr.getAlldata();
		return alldata;
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student s)
	{
		sr.updatedata(s);
		
		return "data update Successfully";
	}
	@DeleteMapping("/delete/{sid}")
	public String delet(@PathVariable("sid") int sid)
	{
		sr.delete(sid);
		return "Deletedata successfully";
		
	}
	@GetMapping("/single/{sid}")
	public String getsingledata(@PathVariable("sid") int sid)
	{  
		
		
		   Student singledata = sr.singledata(sid);
		   return "single data";
		
	}
	@PostMapping("/upload")
	public void imageupload(@RequestParam("file") MultipartFile file) throws IOException
	{
		Image img=new Image();
		  img.setData(file.getSize());
		  img.setName(file.getOriginalFilename());
		  img.setType(file.getContentType());
		  sr.saveimage(img);
		
	}
}

