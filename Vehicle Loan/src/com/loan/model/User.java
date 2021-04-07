package com.loan.model;

import com.loan.validation.exceptions.LengthMismatchException;

//import com.loan.view.LengthMismatchException;

public class User {
	private String userName;
	private String userId;
	private long phoneNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		try
		{	if(String.valueOf(phoneNo).length() == 10)
				this.phoneNo = phoneNo;
			else
				throw new LengthMismatchException(phoneNo);
		}
		catch(LengthMismatchException le)
		{
			System.out.println(le);
		}
	}
}
