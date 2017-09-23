package org.arpit.java2blog.methodinvocation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeReflectionMain {

	public static void main(String[] args) {
			Class<Employee> cls;
			
			// For constructor invocation
			Class[] constructorEmp = new Class[] { String.class, int.class ,String.class};
			String name="John";
			int age=20;
			String address="HighStreet";
			
			Constructor empConst;
			
		    Object[] constArgs = new Object[] { name,age,address};
			try {
				cls = (Class<Employee>) Class.forName("org.arpit.java2blog.methodinvocation.Employee");
				empConst = cls.getConstructor(constructorEmp);
				Employee e = (Employee) empConst.newInstance(constArgs);


				System.out.println("================================");
				System.out.println("Calling printName method using reflection");
				System.out.println("================================");
				//String parameter
				Class[] paramString = new Class[1];
				paramString[0] = String.class;

				//call the printName method and need to pass string parameter
				Method method = cls.getMethod("printName", paramString);
				method.invoke(e, e.name);
				
				System.out.println("================================");
				System.out.println("Calling protected printAge method using reflection");
				System.out.println("================================");
				
				//int parameter
				Class[] paramInt = new Class[1];
				paramInt[0] = Integer.TYPE;

				//call the printAge method and need to pass Integer parameter
				// As printAge is protected, need to call cls.getDeclaredMethod
				method = cls.getDeclaredMethod("printAge", paramInt);
				method.invoke(e, e.age);
				

				System.out.println("================================");
				System.out.println("Calling toString method using reflection and capturing return value");
				System.out.println("================================");
				//no paramater
				Class noparams[] = {};
				
				method = cls.getDeclaredMethod("toString", noparams);
				String toStringStr=(String) method.invoke(e, null);
				System.out.println(toStringStr);
				
				System.out.println("================================");
				System.out.println("Calling static method printNationality using Reflection");
				System.out.println("================================");
				
				
				method = cls.getMethod("printNationality", noparams);
				method.invoke(null,null);
				
				System.out.println("================================");
				System.out.println("Calling private method printAddress using Reflection");
				System.out.println("================================");
				
				
				method = cls.getDeclaredMethod("printAddress", paramString);
				method.setAccessible(true);
				method.invoke(e,e.address);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
					| NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		
	}

}
