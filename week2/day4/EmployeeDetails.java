package week2.day4;

public class EmployeeDetails {
     
	public void printEmployeeName(String empName , int empId) {
		System.out.println("Employee Name is "+ empName + " and Employee Id is "+ empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Emp Address is " + empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Emp Salary is " + empSalary);
	}
	public void printEmployeeMobileNo(long mobNo) {
		System.out.println("Emp Mobile No is " + mobNo);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EmployeeDetails emp = new EmployeeDetails();
      emp.printEmployeeName("Surya", 28541);
      emp.getEmployeeAddress("Chennai");
      emp.printEmployeeSalary(50000.00);
      emp.printEmployeeMobileNo(9876543210l);
	}

}
