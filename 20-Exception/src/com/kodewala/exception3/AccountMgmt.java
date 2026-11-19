package com.kodewala.exception3;

public class AccountMgmt 
{
	public void  openAccount(String name, String accNo)
	{
		System.out.println("AccountMgmt.openAccount() START");
		activeAccount("234567456");
		
		System.out.println("AccountMgmt.openAccount() END");
	}
	
	private void activeAccount(String accNo)
	{
		
		System.out.println("AccountMgmt.activeAccount() START");
		try {
		checkAccountStatus(null);
		} catch (Exception e) 
		{
		 e.printStackTrace();	
		}
		System.out.println("AccountMgmt.activeAccount() END");
	}
	
	private boolean checkAccountStatus(String accNo) throws Exception
	{
		try {
		accNo.startsWith("SBI");  // NPE -> Risky code
		} 
		catch(NullPointerException e)
		{
//			throw --> create new Exception object and throw it to the caller
			throw new Exception("Account number is not starting with SBI"); // checked -> must be handled at the time of compiled
		}
		return false;
	}

}
