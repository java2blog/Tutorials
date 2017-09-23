package org.arpit.java2blog;
 
import java.lang.reflect.Method;
 
class TestClass1 {
	public void put() {
	}
 
	protected int show() {
		return 1;
	}
 
}
 
public class ReflectionTestMethod {
	public static void main(String args[]) {
 
		try {
			Class c = Class.forName("org.arpit.java2blog.TestClass1");
			Method mr[] = c.getMethods();
			System.out.println("==================");
			System.out.println("Using getMethods()");
			System.out.println("==================");
			for (int i = 0; i < mr.length; i++) {
				System.out.println(mr[i]);
			}
			Method md[] = c.getDeclaredMethods();
			System.out.println("===========================");
			System.out.println("Using getDeclaredMethods()");
			System.out.println("============================");
			for (int i = 0; i < md.length; i++) {
				System.out.println(md[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}