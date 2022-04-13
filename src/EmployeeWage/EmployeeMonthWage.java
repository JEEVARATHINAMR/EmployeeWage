package EmployeeWage;

public class EmployeeMonthWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int isFullTime = 1;
			int isPartTime = 2;
			int EmpHrs = 18;
			int EmpWage = 120;
			int EmpRatePerHr = 20;
			int TotalDayWage = 20;
			
			double Empcheck = Math.floor(Math.random()*10%2);
			if(Empcheck == isFullTime) {
				
				EmpHrs = 8;
			}
			else if (Empcheck == isPartTime) {
				
				EmpHrs = 4;
				
			}
			EmpWage = EmpHrs * EmpRatePerHr * TotalDayWage;
			System.out.println("TotalDayWage" +EmpWage);

	}

}
