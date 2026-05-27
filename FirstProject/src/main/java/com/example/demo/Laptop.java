package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop implements ElectronicDevice{
 void work() {
	 System.out.println("Laptop is working");
 }
 
 
public void useDevice() {
	 System.out.println("Using Laptop Device");
 }
}
