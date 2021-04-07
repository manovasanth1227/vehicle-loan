package com.loan.validation.exceptions;

public class LengthMismatchException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public long phoneNo;
	public LengthMismatchException(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString()
	{
		return "Phone Number Length is Not enough";
	}
}
