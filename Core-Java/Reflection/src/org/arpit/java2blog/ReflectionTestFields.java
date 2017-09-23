package org.arpit.java2blog;
 
import java.lang.reflect.Field;
 
class TestClass2 {
	public int a;
	String b;
}
 
public class ReflectionTestFields {
	public static void main(String args[]) {
		try {
			Class c = Class.forName("org.arpit.java2blog.TestClass2");
			Field ff[] = c.getFields();
			
			System.out.println("Using getFields() method");
			System.out.println("=======================");
			for (int i = 0; i < ff.length; i++) {
				System.out.println(ff[i]);
			}
			Field f[] = c.getDeclaredFields();
			System.out.println("=======================");
			System.out.println("Using getDeclaredFields() method");
			System.out.println("=======================");
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 