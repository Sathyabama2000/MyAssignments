package org.system;
//method overloading
public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Id:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Id:"+id+" Name:"+name);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Email:"+email+" phonenumber:"+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students details = new Students();
		details.getStudentInfo(5929);
		details.getStudentInfo(5929,"Anu");
		details.getStudentInfo("anu5929@gmail.com",9876543298l);

	}

}
