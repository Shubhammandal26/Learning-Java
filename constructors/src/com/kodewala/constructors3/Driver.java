package com.kodewala.constructors3;

class Invoice extends Object
{
	 static int gst = 18;
	int amount;
	String itemName;
	String bilingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _bilingAddress, String _customerId, String _customerName)
	{
	 this.amount = _amount;
	 this.itemName = _itemName;
	 this.bilingAddress = _bilingAddress;
	 this.customerId = _customerId;
	 this.customerName = _customerName;
	}
	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoice.gst = 28; // change it
		
		Invoice inv = new Invoice(180000, "iPhone18", "kodewala BTM 2nd stage, Bangalore", "C4321", "Shubham");
		Invoice inv1 = new Invoice(5000, "oppo", "kodewala BTM 2nd stage, Bangalore", "C0987", "Ajay");
		
		System.out.println("first invoice : " + inv.amount + " , " + inv.customerId + " , " + inv.gst);
		System.out.println("second invoice : " + inv1.amount + " , " + inv1.customerId + " , " + inv1.gst);

	}

}
