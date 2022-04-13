package EmployeeWage;

public class SwitchCase {
		public static final int isFullTime = 1;
		public static final int isPartTime = 2;
		public static final int isEmpRatePerHr = 2;
		
		public static void main(String [] args) {
			int EmpHrs = 8;
			int EmpWage = 120;
			
			double Empcheck = Math.floor(Math.random() * 10%2);
			switch ((int) Empcheck) {
					case 
						isFullTime:
						EmpHrs = 6;
					break;
					case
						isPartTime:
							EmpHrs = 4;
					break;
					default:
						EmpHrs = 120;
				
			}
			EmpWage = EmpHrs * isEmpRatePerHr;
			System.out.println("EmpWage" +EmpWage);	
			
		}
		
}
