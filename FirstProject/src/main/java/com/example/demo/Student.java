package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    
	//Field Injection
//	@Autowired
//	Laptop ref;
	
	
	ElectronicDevice ref;
	
	public Student(@Qualifier("mobile") ElectronicDevice ref) {
		this.ref = ref;
	}
	
	void workingwithDevice() {
		ref.useDevice();
	}


	void study() {
		System.out.println("Student is studying");
	}
	
	
//	void useLaptop() {
//		ref.work();
//	}

//	Setter injection
//	public Laptop getRef() {
//		return ref;
//	}
//
//	@Autowired
//	public void setRef(Laptop ref) {
//		this.ref = ref;
//	}
	
//	Constructor  injection
	
//	@Autowired
//	public Student(Laptop ref) {
//		this.ref = ref;
//	}
	
	
}
