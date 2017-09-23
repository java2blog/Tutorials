package org.arpit.java2blog;
 
import java.lang.reflect.Constructor;
 
class TestClass{
	public TestClass(){}
	protected TestClass(Integer a){}
}
 
public class ReflectionTestConstructor
{
	public static void main(String args[])
	{
		try
		{
			Class c = Class.forName("org.arpit.java2blog.TestClass");
			System.out.println("Using getConstructors()");
			Constructor< TestClass>[] ct = c.getConstructors();
			for(int i=0; i< ct.length; i++)
			{ System.out.println(ct[i]); }
			System.out.println("====================");
			System.out.println("Using getDeclaredConstructors()");
			Constructor< TestClass>[] cdt = c.getDeclaredConstructors();
			for(int i=0;i< cdt.length;i++)
			{ System.out.println(cdt[i]);}
 
		}
		catch(Exception e)
		{ e.printStackTrace();}
	}
}