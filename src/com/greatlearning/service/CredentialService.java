package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "~!@#$%&*^[{}]";
		
		String finalString = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		
		char [] password = new char[8];
		
		for(int i=0; i<8; i++) {
			password[i]= finalString.charAt(random.nextInt(finalString.length()));
		}
		
		return password ;
	}
	
	public String generateEmailAddress(Employee emp, String dept) {
		
		
		return emp.getFirstName() + emp.getLastName() + "@" + dept + ".abc" + ".com";
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		
		
		System.out.println("Dear " + emp.getFirstName() + " your credentials are as following:\n" 
				+ "Email ---> " + email + "\n" + "Password ---> " + password);
	}

}
