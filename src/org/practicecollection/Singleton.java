package org.practicecollection;

public class Singleton {
	static Singleton a;
	public static Singleton getObject() {
		
		if (a==null) {
		 a=new Singleton();
		}
		return a;
	}
	private void empName() {
		System.out.println("the employee name is raja");

	}
	private void empId() {
System.out.println("the emp id is989655");

	}
		
		public static void main(String[] args) {
			 Singleton object = getObject();
			 object.empName();
			 Singleton object2 = getObject();
			 object2.empId();
		}

	

}
