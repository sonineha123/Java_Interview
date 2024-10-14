package com.customexception;

public class Bank {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount){
		balance= balance+amount ;
		System.out.println(balance);
		
	}
	
	public double withdrawl(double amount) throws BankException {
		
     if((balance-amount)<2000) {
    	 
    	 throw new BankException("insuffiecient Message");
     }
   
		balance =balance - amount;
		
		return balance;
		
	}
		
		
		
	}
