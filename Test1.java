package com.proj.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String args[]){
		/*List<Integer> myList = new ArrayList<Integer>(50);
		myList.add(1);
		myList.add(7);
		myList.add(6);
		myList.add(8);
		myList.add(2);
		System.out.println("The list Contains "+ myList.size() + "  elements, and "+ "the first is "+myList.get(1));
		
		for(String s : myList){
			System.out.println("Next item: "+s);
		}
		
		Collections.sort(myList);
		*/
		
		/*Set<String> s = new HashSet<String>();
		for(String a : args){
			if(!s.add(a)){
				System.out.println("Duplicate Detected: "+a);
			}
		}
		System.out.println(s.size() + " distinct words: "+s);
*/
		/*Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		
		for(String a : args){
			if(!uniques.add(a))
				dups.add(a);
		}
		uniques.removeAll(dups);
		System.out.println("Unique words:  "+uniques);
		System.out.println("duplicate words:  "+dups);*/
		
		/*Vector v = new Vector(3,2);
		System.out.println("Initial size: "+v.size());
		System.out.println("Initial Capacity:  "+v.capacity());
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		
		v.addElement(new Double(5.45));
		
		System.out.println("Current Capacity: "+v.capacity());
		
		Enumeration vEnum = v.elements();
		System.out.println("\nElements in vector: ");
		while(vEnum.hasMoreElements())
			System.out.println(vEnum.nextElement() +" ");
		System.out.println();*/
		
		HashMap hm = new HashMap();
		hm.put("ram", new Double(100));
		hm.put("lakshman", new Double(99));
		hm.put("bharat", new Double(80));
		hm.put("sharudh", new Double(80));
		hm.put("Balaji", new Double(60));
		
		Set set = hm.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() +": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance = ((Double)hm.get("ram")).doubleValue();
		hm.put("ram", new Double(balance + 1000));
		System.out.println("Ram's new balance: " + hm.get("ram"));
	}
}
