package EmployeeWage;

public class TotalWoringHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime = 1;
		int isPartTime = 2;
		int EmpHrs = 12;
		int EmpWage = 2500;
		int EmpRatePerHrs = 12;
		int TotalDayWage = 15;
		int TotalHrs = 120;
		
		double Empcheck = Math.floor(Math.random() *10%2);
		if (Empcheck == isFullTime) {
			EmpHrs = 12;
		}
		else if (Empcheck == isPartTime) {
			EmpHrs = 6;
		}
		EmpWage = EmpHrs * EmpRatePerHrs * TotalDayWage * TotalHrs;
		System.out.println("Total Working Hour in Month" +EmpWage);
	}

}
