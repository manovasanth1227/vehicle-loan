package com.loan.model;

import com.loan.validation.exceptions.LoanAmountException;
public class Loan {
	private int id;
	private String type;
	private int loan_amt;
	private String userId;
	int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLoan_amt() {
		return loan_amt;
	}
	public void setLoan_amt(int loan_amt) {
		try
		{	if(loan_amt < 500000)
				this.loan_amt = loan_amt;
			else
				throw new LoanAmountException(loan_amt);
		}
		catch(LoanAmountException la)
		{
			System.out.println(la);
		}
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String user_id) {
		this.userId = user_id;
	}
}
