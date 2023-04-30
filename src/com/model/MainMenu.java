package com.model;

import java.util.Scanner;

public class MainMenu {

	Scanner input = new Scanner(System.in);
   
	public MainMenu() {
		System.out.println("----------- Choose Your Option -----------");
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		int choose = input.nextInt();

		switch (choose) {
		case 1:
                MachineOperations obj=new MachineOperations();
                obj.dipositeMoney();
			break;

		case 2:
			 MachineOperations obj2=new MachineOperations();
			 obj2.withdrawMoney();
			
			break;
			
		case 3:
			 MachineOperations obj3=new MachineOperations();
			 obj3.chkBalance();
			break;
			
		default:
			System.out.println("Invalid Option Try Again! ");
			 MainMenu obj4=new MainMenu();
			break;
		}
	}

}
