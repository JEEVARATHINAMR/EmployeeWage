package EmployeeWage;

public class ParTimrEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime = 1;
		int isPartTime = 2;
		int EmpHrs = 15;
		int EmpWage = 12000;
		int EmpWagePerHr = 20;
		
		double Empcheck = Math.floor(Math.random()* 10 %10);
		
		if (Empcheck == isFullTime) {
			EmpHrs = 12;
		}
		else if (Empcheck == isPartTime) {
			EmpHrs = 8;
			
		}
		EmpWage = EmpHrs * EmpWagePerHr;
		System.out.println("EmpWage"+EmpWage);
	}

}
