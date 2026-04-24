package com.transaction;

import java.util.Scanner;

public class LoginSystem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int correctPassword =1234;
		int attempts= 3;
		 Scanner sc = new Scanner(System.in);

	        for (int i = 1; i <= attempts; i++) {

	            System.out.print("Enter password: ");
	            int enteredPassword = sc.nextInt();

	            if (enteredPassword == correctPassword) {
	                System.out.println("Login successful!");
	                break; 
	            } else {
	                System.out.println("Wrong password!");

	                
	                if (i == attempts) {
	                    System.out.println("Account locked. Too many failed attempts.");
	                } else {
	                    System.out.println("Attempts left: " + (attempts - i));
	                }
	            }
	        }

	       
	    }
	}
