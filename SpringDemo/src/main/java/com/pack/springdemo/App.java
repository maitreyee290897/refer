package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. man \n 2.women");
		String op = sc.next();
		//Human obj=(Human) factory.getBean("human");
		
		Human obj=(Human) factory.getBean(op);
		//Human obj = new Man();
		//obj.setName("kiran");
		//obj.setAge(25);
		System.out.println(obj);
	}
}
