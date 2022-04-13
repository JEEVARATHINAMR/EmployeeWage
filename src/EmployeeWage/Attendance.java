package EmployeeWage;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int isFullTime = 15;
		double Empcheck = Math.floor(Math.random() *10%2);
		
		if (Empcheck == isFullTime) {
			System.out.println("Employee is present");
			
		}
		else {
			System.out.println("Employee is Absent");
			
		}

	}

}
