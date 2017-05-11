/**
 * 
 */
package com.mycompany.final_part3.inheritance;

/**
 * @author Maxi
 *
 */
public class MainEntry{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1, p2;
		
		Teacher t = new TeacherImpl("ilker", "Java");
		Student s = new StudentImpl("Max", "Java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("p1: " + p1.getName());
		System.out.println("p2: " + p2.getName());
	}

}
