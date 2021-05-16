package com;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	    public static void main(String[] args) {
	    	  System.out.println("Welcome to user Registration");

	          Scanner sc = new Scanner(System.in);
	          System.out.println("Enter First Name: ");
	          String firstName = sc.next();
	          String regex = "^[A-Z]{1}[a-z]{2,}$";
	          Pattern pattern = Pattern.compile(regex);
	          Matcher matcher = pattern.matcher(firstName);
	          boolean result = matcher.matches();
	          if(result == true)
	              System.out.println("First Name is Valid");
	          else
	              System.out.println("First Name is not valid");
	          
	          
	          //validating last name
	          System.out.println("Enter Last Name: ");
	          String lastName = sc.next();
	          matcher = pattern.matcher(lastName);
	          result = matcher.matches();
	          if(result == true)
	              System.out.println("Last Name is Valid");
	          else
	              System.out.println("Last Name is not valid");

	          }
	  }