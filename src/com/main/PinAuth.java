package com.main;

import java.util.Scanner;

import com.model.MainMenu;

public class PinAuth {

	int pinNo=3456;
	Scanner input=new Scanner(System.in);
	@SuppressWarnings("static-access")
	public void pinAuth()
	{
		System.out.println("Enter Your Pin");
	   int pinNum=input.nextInt();
	    
	    if(pinNo==pinNum)
	    {
	    	System.out.println("******** Success ******");
	    	new MainMenu();
	    }
	    
	    else
	    {
	    	System.out.println("******** Wrong Pin Try Again!  ******");
	    	ATMMain obj=new ATMMain();
	    	obj.main(null);
	    	
	    }
	}
}
