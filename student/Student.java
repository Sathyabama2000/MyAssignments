package org.student;
import org.department.Department;
//multilevel inheritance
public class Student extends Department {
	 public void studentName(String name1)
     {
    	 System.out.println("student name:"+name1);
     }
	 public void studentDept(String name2)
     {
    	 System.out.println("student dept:"+name2);
     }
	 public void studentId(int id)
     {
    	 System.out.println("student id:"+id);
     }
	 
	public static void main(String[] args) {
		Student obj2 = new Student();
		obj2.collegeName("SRM");
		obj2.collegeCode(4224);
		obj2.collegeRank(25);
		obj2.deptName("ECE");
		obj2.studentName("Anu");
		obj2.studentDept("ECE");
		obj2.studentId(5667);
	}

}
