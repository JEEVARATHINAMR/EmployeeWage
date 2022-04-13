package EmployeeWage;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num = read.nextInt();
		if (num>0) {
			System.out.println("It is positive number");
		}
		else {
			System.out.println("It is negative number");
		}
	}

}
