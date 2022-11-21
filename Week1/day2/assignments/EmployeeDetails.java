package day2.assignments;

public class EmployeeDetails {
		
		public void EmployeeName() {
			String EmployeeName = "Kathiravan B";
			System.out.println("Employee Name- " +EmployeeName);
		}
		
		public void EmployeeId() {
			int EmployeeId = 2131;
			System.out.println("Employee Id- " +EmployeeId);
	    }

		public void EmployeeAddress() {
			String EmployeeAddress = "Palani";
			System.out.println("Employee HT- " +EmployeeAddress);
	    }
		
		public void EmployeeSalary() {
			double EmployeeSalary = 64200.00;
			System.out.println("Employee Salary- " +EmployeeSalary);
		}
		
		public void EmployeeMobileNumber() {
			long EmployeeMobileNumber = 7844564450L;
			System.out.println("Employee Phone Number- " +EmployeeMobileNumber);
		}
		
	public static void main(String[] args) {
		EmployeeDetails capital=new EmployeeDetails();
		capital.EmployeeName();
		capital.EmployeeId();
		capital.EmployeeAddress();
		capital.EmployeeSalary();
		capital.EmployeeMobileNumber();
	}
		
	}
		
		

