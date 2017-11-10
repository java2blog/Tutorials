package org.arpit.java2blog;

import java.util.Arrays;

public class Employee implements Comparable<Employee>{
	String name;
	int age;
	
	Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args)
	{
		Employee e1=new Employee("Martin", 20);
		Employee e2=new Employee("Andy", 18);
		Employee e3=new Employee("John", 22);
		Employee e4=new Employee("Mary", 21);
		Employee[] empArray={e1,e2,e3,e4};
		
		System.out.println("Before Sorting");
		System.out.println("===============");
		for (int i = 0; i < empArray.length; i++) {
			System.out.print(empArray[i]+ " ");
		}
		
		Arrays.sort(empArray);
		
		System.out.println();
		System.out.println("===============");
		System.out.println("After Sorting");
		System.out.println("===============");
		for (int i = 0; i < empArray.length; i++) {
			System.out.print(empArray[i]+" ");
		}
	}
	
	public String toString()
	{
		return "[ name="+name+" age="+age+" ]";
	}
	
	@Override
	public int compareTo(Employee e) {
		return name.compareTo(e.name);
	}
}

	
