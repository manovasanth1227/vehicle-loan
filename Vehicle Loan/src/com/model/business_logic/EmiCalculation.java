package com.model.business_logic;



import com.loan.model.Loan;

public class EmiCalculation {
	private float rate = 0.1f;
	private int noOfYears = 5;

	float totalAmt = 0.0f;
	public void EmiCalculator(Loan obj)
	{	
		totalAmt = obj.getLoan_amt()* noOfYears * rate;
		System.out.println("The Monthly Emi you have to pay is "+totalAmt/100+" for "+noOfYears*12+"months");
	}
}
