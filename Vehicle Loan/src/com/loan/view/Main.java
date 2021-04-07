package com.loan.view;

import com.loan.controller.*;
import com.loan.model.*;

import com.model.business_logic.EmiCalculation;
public class Main {
	public static void main(String[] args) {
		Loan obj1 = new Loan();
		UI obj = new UI();
		obj.userDetails();
		obj1 = obj.loanDetails();
		EmiCalculation emiCalculation = new EmiCalculation();
		emiCalculation.EmiCalculator(obj1);
	}
}
