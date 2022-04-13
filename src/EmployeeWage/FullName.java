package EmployeeWage;
import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String f_name = scan.next();
		System.out.println("Enter the Last Name");
		String l_name = scan.next();
		
		System.out.println("Your FullName is");
		System.out.println(f_name+ ""+l_name);
	}

}
