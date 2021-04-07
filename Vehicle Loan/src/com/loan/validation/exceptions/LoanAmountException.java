package com.loan.validation.exceptions;


public class LoanAmountException extends RuntimeException{
	private static final long serialVersionUID = 1L;
		int loan_amt;
		public LoanAmountException(int loan_amt)
		{
			this.loan_amt = loan_amt;
		}
		@Override
		public String toString()
		{
			return "Loan Amount should be less than 5 lakhs";
		}
}


