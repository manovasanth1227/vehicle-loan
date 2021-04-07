package com.loan.controller;
import java.util.*;

import com.loan.model.Loan;
import com.loan.model.User;
public class UI extends SignIn implements UserDetails{
	Scanner sc= new Scanner(System.in);
	User usr = new User();
	Loan newloan=new Loan();
	@Override
	public Loan loanDetails()
	{
		System.out.println("Which type of loan you want?");
		newloan.setType(sc.next());
		System.out.println("What's the loan amount?");
		newloan.setLoan_amt(sc.nextInt());
		newloan.setId(15532);
		newloan.setUserId(usr.getUserId());
		return newloan;
	}
	@Override
	public void userDetails()
	{
		
		System.out.println("Enter Your Name");
		usr.setUserName(sc.next());
		System.out.println("Enter Your Phone No");
		usr.setPhoneNo(sc.nextLong());
		System.out.println("Enter your UserId");
		usr.setUserId(sc.next());
	}
}
