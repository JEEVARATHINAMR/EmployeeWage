package EmployeeWage;

public class EmployeeWageDaily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime = 1;
		int EmpHrs =8;
		int EmpWage = 5000;
		int EmpRatePerHr = 20;
		
		double Empcheck = Math.floor(Math.random()*10%2);
		if (Empcheck == isFullTime) {
			
			EmpHrs = 12;
		}
		EmpWage = EmpHrs * EmpRatePerHr;
		System.out.println("EmpWage" +EmpWage);
		
		

	}

}
