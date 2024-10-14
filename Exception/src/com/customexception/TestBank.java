package com.customexception;

public class TestBank {

	public static void main(String[] args) {
		
	
	Bank b = new Bank();
	
	b.setBalance(5000);
	b.deposit(1000);
	System.out.println("amount deposited");
	
	try {
		b.withdrawl(2000);
		System.out.println(b.getBalance());
		
		} catch (BankException e) {
		System.out.println(e.getMessage());
		
		// TODO: handle exception
	}
		
		
	}
	
	
   
}
