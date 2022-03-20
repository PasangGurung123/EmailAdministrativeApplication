package emailapp;

import java.util.Scanner;

public class Email {
//	make variables private so others can't directly access
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity;
	private String email;
	private String alternateEmail;
	private String companySuffix = "wakandaforever.com";
	
	//constructor to initialize firstName and lastName
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
//		call a method asking for a department to return the department
		
		department = setDepartment();//this department refers to the class department
		System.out.println("Department: " + department);
		
//		Combine elements to generate email
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +  department + "." + companySuffix;
		System.out.println("Your Email is: " + email);
		
//		call a method that returns a random password
		
		password = generatePassword(defaultPasswordLength); 
		System.out.println( "Your Password is: " + password);
	}
//	 Asking for the department
	private String setDepartment() {
		System.out.println("Department Codes: \n1. Sales \n2. Development \n3. Accounting \n0. none");
		System.out.println("Enter the department codes: ");
		
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		if(option == 1) {return "Sales";}
		else if(option == 2) {return "Development";}
		else if(option == 3) {return "Accounting";}
		else {return ""; }
		}
		
// generate a random password
	
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@#$%";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
		int random = (int)(Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(random);
		}
		return new String (password);
	}
	
//	set the mailbox capacity
	
//	set the alternate email
//	change the password
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	}
	

