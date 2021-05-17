package com;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration<pattern, matcher, result> {

	    public static void main(String[] args) {
	        // write your code here

	        System.out.println("Welcome to user registration");

	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter first name: ");
	        String firstName = sc.next();
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        boolean result = matcher.matches();
	        if (result == true)
	            System.out.println("first name is valid");
	        else
	            System.out.println("first name is not valid");


	        //validating last name
	        System.out.println("enter last name: ");
	        String lastname = sc.next();
	        matcher = pattern.matcher(lastname);
	        result = matcher.matches();
	        if (result == true)
	            System.out.println("last name is Valid");
	        else
	            System.out.println("last name is not valid");


	        //validating email
	        System.out.println("enter email : ");
	        String email = sc.next();
	        pattern = Pattern.compile("^([A-Z|a-z|0-9](\\.|_){0,1})+[A-Z|a-z|0-9]\\@([A-Z|a-z|0-9])+((\\.){0,1}[A-Z|a-z|0-9]){2}\\.[a-z]{2,3}$", Pattern.CASE_INSENSITIVE);
	        matcher = pattern.matcher(email);
	        result = matcher.matches();
	        if (result == true)
	            System.out.println("email is valid");
	        else
	            System.out.println("email is not valid");



	    //validate mobile format
	        System.out.println("enter mobile number : ");
	    String mobile = sc.next();
	    pattern =Pattern.compile("(?!:\\A|\\s)(?!(\\d{1,6}\\s+\\D)|((\\d{1,2}\\s+){2,2}))(((\\+\\d{1,3})|(\\(\\+\\d{1,3}\\)))\\s*)?((\\d{1,6})|(\\(\\d{1,6}\\)))\\/?(([ -.]?)\\d{1,5}){1,5}((\\s*(#|x|(ext))\\.?\\s*)\\d{1,5})?(?!:(\\Z|\\w|\\b\\s))",Pattern.CASE_INSENSITIVE);
	    matcher =pattern.matcher(mobile);
	    result =matcher.matches();
	        if(result ==true)
	            System.out.println("mobile number is valid");
	        else
	                System.out.println("mobile number is not valid");
	        
	        
	        //Rule three atleast one numeric number
	        System.out.println("enter password: ");
	        String password = sc.next();
	        pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[\\W])(?=.*[0-9])(?=.*[a-z]).{8,128}$",Pattern.CASE_INSENSITIVE);   
	        matcher = pattern.matcher(password);
	        result = matcher.matches();
	        if(result == true)
	            System.out.println("password is valid");
	        else
	            System.out.println("password is invalid");

	}
	}
	
	