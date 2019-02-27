package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.bank.model.Customer;



public class Registration {
	
	static ArrayList<Customer> arraylist=new ArrayList<>();
	
	static void setInfo()//initializing the variables
	{
		Scanner sc=new Scanner(System.in);
		Customer customer=new Customer();
		System.out.println("enter the name : ");
		customer.setCustomername(sc.next());
		//System.out.println("enter the account number :");
	//	customer.setAccountnumber(sc.nextLong());
		System.out.println("enter the aadhar :");
		customer.setAdhaar(sc.nextLong());
		System.out.println("enter mobile number :");
		customer.setMobilenumber(sc.nextLong());
		System.out.println("enter the address :");
		sc.nextLine();
		customer.setAddress(sc.nextLine());
		
		arraylist.add(customer);
		
		
	}
	
	static void serializeArray()  
	{
		
		
		try {
			FileOutputStream  file = new FileOutputStream("E:\\honey.txt");
			ObjectOutputStream obj=new ObjectOutputStream(file);
			obj.writeObject(arraylist);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	static void deSerialization()
	{
		try {
			FileInputStream file1=new FileInputStream("E:\\honey.txt");
			ObjectInputStream obj1=new ObjectInputStream(file1);
			arraylist=(ArrayList<Customer>)obj1.readObject();
			//System.out.println(arraylist);
			for(Customer c:arraylist)
			{
				System.out.println("customer details are ");
				System.out.println("Customer name : "+c.getCustomername());
				//System.out.println("account number : "+c.getAccountnumber());
				System.out.println("address :"+c.getAddress());
				System.out.println("adhar : "+c.getAdhaar());
				System.out.println("mobile number : "+c.getMobilenumber());
				System.out.println("registration is done successfully");
			}
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
		static void verification( ArrayList<Customer> verify)
		{	
			
			
			for(Customer c: verify)
			{			
				Customer c1=new Customer();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the account number :");	
				long accno=sc.nextLong();			
				if(accno==c.getAccountnumber())
				{		
				System.out.println("valid account number");	
				}		
				else
				{
					//arraylist.add(c1);
					System.out.println("invalid");
				}
			}	
		}

	public static void generatingaccountno()
	{
		
	//	Random random1= new Random(); 
		long rand = ThreadLocalRandom.current().nextInt(); 
		 System.out.println("your account number is : "+Math.abs(rand));
		 Customer c2=new Customer();
		// arraylist.add(c2.getAccountnumber());
			arraylist.add(c2);
		
	}
	
	 static char[] password(int len) 
	    { 
		// int length = 10; 
	        
	        System.out.print("Your new password is : "); 
	  
	        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
	        String numbers = "0123456789"; 
	                String symbols = "!@#$%^&*_=+-/.?<>)"; 
	  
	  
	        String values = Capital_chars + Small_chars + 
	                        numbers + symbols; 
	  
	        
	        Random rndm_method = new Random(); 
	  
	        char[] password = new char[len]; 
	  
	        for (int i = 0; i < len; i++) 
	        { 
	           
	            password[i] = values.charAt(rndm_method.nextInt(values.length())); 
	  
	        } 
	        return password; 
	    } 

	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your choice 1 or 2 ");
		System.out.println("1.Registration");
		System.out.println("2.Login");
		int i=sc.nextInt();
		switch(i)
		{
		case 1:System.out.println("enter the following registration details");
				setInfo();
				serializeArray();
				 deSerialization();
				// verification(arraylist);
				 generatingaccountno();
			int length=10;
			System.out.println(password(length)); 
		
			break;
		case 2:System.out.println("enter the following login details ");
		verification(arraylist);
			break;
			default:System.out.println("invalid number");
		}
		
		
	/*	setInfo();
	//	setInfo();
	serializeArray();
	 deSerialization();
	 verification(arraylist);*/
	}

	
	
}
