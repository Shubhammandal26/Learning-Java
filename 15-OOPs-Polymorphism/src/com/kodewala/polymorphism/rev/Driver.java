package com.kodewala.polymorphism.rev;


class Delivery
{
	public void doDeliver()
	{
		System.out.println("Delivery.doDeliver()... Delivery");
	}
}

class ExpressBee extends Delivery
{
	@Override
	public void doDeliver()
	{
	System.out.println("ExpressBee.doDeliver().... ExpressBee");	
	}
}

class Ekart extends Delivery
{
 @Override
 public void doDeliver()
 {
	 System.out.println("Ekart.doDeliver()... Ekart");
 }
}

public class Driver {

	public static void main(String[] args) 
	{
		
//		Delivery delivery = new Delivery();
//		compile time --> it will check the method in Delivery class
//		runtime --> it will call the method of Delivery class
//		 delivery.doDeliver();  // compile time
		 
		 Delivery delivery1 = (Delivery) new ExpressBee();
		 
//		  compile time --> it will check the method in Delivery class
//		  Run time --> it will call the method of ExpressBee class
		  delivery1.doDeliver();
		  
		  Delivery del = new ExpressBee();
		  ExpressBee expressBee = (ExpressBee) del;
		  expressBee.doDeliver();

	}

}
