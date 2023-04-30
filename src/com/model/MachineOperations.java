package com.model;

import java.util.Scanner;

import com.dao.ATMOperations;

public class MachineOperations implements ATMOperations {

	double total_balance=100000.00;
	double depo,with,bal;
	Scanner input=new Scanner(System.in);
	
	
	@Override
	public void dipositeMoney() {
		 System.out.println("Enter Amount");
		 depo=input.nextDouble();
		 total_balance+=depo;
		System.out.println("YOUR MONEY HAS BEEN DEBITED SUCCESSFULLY ");
		chkBalance();
		
	}

	@Override
	public void withdrawMoney() {
		
		System.out.println("Enter Amount ");
		with=input.nextDouble();
		if (with>total_balance) {
			System.out.println("Sorry Balance Insuffient :(");
		    new	MainMenu();
		}
		else
		{
			System.out.println("Please Collect Your Money");
		      total_balance=total_balance-with; 
		      chkBalance();
		      System.out.println("Thanks for Using My ATM");
		      new	MainMenu();
		}
	}

	@Override
	public void chkBalance() {
		 System.out.println("Total Balance is : "+total_balance);
		
	}

}
