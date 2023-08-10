package org.system;
//method overloading
public class Employee {

	public void getEmployeeInfo(int id) {
		System.out.println("Id:"+id);
	}
	public void getEmployeeInfo(int id,String name) {
		System.out.println("Id:"+id+" Name:"+name);
	}
	public void getEmployeeInfo(String email,long phoneNumber) {
		System.out.println("Email:"+email+" phonenumber:"+phoneNumber);
	}
	
	public static void main(String[] args) {
		Employee details = new Employee();
		details.getEmployeeInfo(5929);
		details.getEmployeeInfo(5929,"Anu");
		details.getEmployeeInfo("anu5929@gmail.com",9876543298l);

	}

}
