package org.arpit.java2blog.methodinvocation;

public class Employee {
	String name;
	int age;
	String address; 
	
	public Employee(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printName(String name)
	{
		System.out.println("Name:"+ name);
	}
	
	protected void printAge(int age)
	{
		System.out.println("Age : "+age);
	}
	
	private void printAddress(String address)
	{
		System.out.println("Address : "+address);
	}
	
	public String toString()
	{
		return name+"_"+age+"_"+address;
	}
	
	public static void printNationality()
	{
		System.out.println("Nationality: Indian");
	}
}
