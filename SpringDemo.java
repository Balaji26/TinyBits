package org.ninja.spring.core;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        /*College coll =(College)context.getBean("coll");
        Student std = coll.getStudent();
        System.out.println(std.getName());
        System.out.println(std.getAge());*/
		
    		ConcreteCollection concreteCol = (ConcreteCollection) context.getBean("concrete");
    		
    		Properties prop = concreteCol.getProperties();
    		System.out.println(prop.getProperty("propKeyA"));
    		System.out.println(prop.getProperty("propKeyB"));
    		
    		Map<Integer, String> map = concreteCol.getMap();
    		System.out.println(map.get(0));
    		
    		List<String> list = concreteCol.getList();
    		System.out.println(list.get(0));
    		
    		Set<String> set = concreteCol.getSet();
    		Iterator<String> itr = set.iterator();
    		while(itr.hasNext()){
    			System.out.println(itr.next());
    		}
		
		
	}

}
