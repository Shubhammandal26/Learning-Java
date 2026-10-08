package com.kodewala.constructors6;

public class OnlineOrder extends Order
{
	String paymentMode;
	String deliveryAddress;
	
  public OnlineOrder(int _orderId, String _customerName, double _amount,String _paymentMode,String _deliveryAddress) {
		super(_orderId, _customerName, _amount);
		this.paymentMode = _paymentMode;
		this.deliveryAddress = _deliveryAddress;
	}

  }
