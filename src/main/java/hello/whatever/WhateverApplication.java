package hello.whatever;
import hello.whatever.beans.Student;


import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"hello.whatever"})
public class WhateverApplication {
	
	public static HashMap<Long,Student> hmStudent;
	//public static HashMap<Long,Paint> hmPaint;
	

	public static void main(String[] args) {
		hmStudent=new HashMap<Long,Student>();
		//hmPaint = new HashMap<Long, Paint>();
		 
	      Student one=new Student("John","math");
	      hmStudent.put(new Long(one.getId()),one);
	      Student two=new Student("Jane","history");
	      hmStudent.put(new Long(two.getId()),two);
	      
	      
	      
		SpringApplication.run(WhateverApplication.class, args);

		
		
	}
}
