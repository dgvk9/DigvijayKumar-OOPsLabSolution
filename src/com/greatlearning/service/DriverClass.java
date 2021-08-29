package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Digvijay", "Kumar");
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String dept ="";
			switch(input) {
			case 1: dept = "tech";
				break;
			case 2: dept = "admin";
				break;
			case 3: dept = "hr";
				break;	
			case 4: dept = "legal";
				break;
			default: System.out.println("INVALID INPUT");
				break;		
			}		
		
		
		CredentialService service = new CredentialService();
		
		String emailadd = service.generateEmailAddress(emp, dept);
		String password = new String(service.generatePassword());
		
		service.showCredentials(emp, emailadd, password);
		
		sc.close();
		
	}

}
