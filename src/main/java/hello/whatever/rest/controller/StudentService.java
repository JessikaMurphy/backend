package hello.whatever.rest.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.whatever.WhateverApplication;
import hello.whatever.beans.Student;

@RestController
@RequestMapping(value="/rest/student")
class StudentService {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public HashMap<Long,Student> getAllStudents(){
	      return WhateverApplication.hmStudent;
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Student addStudent(@RequestParam(value="name") String name
	      ,@RequestParam(value="subject",defaultValue = "unknown") String subject){
	 
	   Student student=new Student(name,subject);
	   WhateverApplication.hmStudent.put(new Long(student.getId()),student);
	   return student;
	 
	}
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) throws Exception {
	 
	   if(WhateverApplication.hmStudent.containsKey(new Long(student.getId()))){
	      WhateverApplication.hmStudent.put(new Long(student.getId()),student);
	   }else{
	      throw new Exception("Student "+student.getId()+" does not exists");
	   }
	 
	   return student;
	}
	@RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
	public Student deleteStudent(@PathVariable long id) throws Exception {
	 
	   Student student;
	 
	   if(WhateverApplication.hmStudent.containsKey(new Long(id))){
	      student=WhateverApplication.hmStudent.get(new Long(id));
	      WhateverApplication.hmStudent.remove(new Long(id));
	   }else{
	      throw new Exception("Student "+id+" does not exists");
	   }
	   return student;
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Student getStudent(@PathVariable long id){
	   return WhateverApplication.hmStudent.get(new Long(id));
	}
}