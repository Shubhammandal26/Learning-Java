package com.kodewala.intr1;

public class Booking  {

	private String bookingId;
	private String status;
	private String passengerName;
	private String source;
	private String destination;
	private double ticketPrice;
	private String paymentStatus;
	private String seatNumber;
	
	public String getBookingId()
	{
		return bookingId;
	}
	 public void setBookingId(String bookingId)
	 {
		 this.bookingId = bookingId;
	 }
	 
	 public String getStatus()
	 {
		 return status;
	 }
	 
	 public void setStatus(String status)
	 {
		 this.status = status;
	 }
	  
	 public String getPassengerName()
	 {
		 return passengerName;
	 }
	 
	 public void setPassengerName(String passengerName)
	 {
		 this.passengerName = passengerName;
	 }
	 
	 public String getSource()
	 {
		 return source;
	 }
	 
	 public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		
		public double getTicketPrice() {
			return ticketPrice;
		}

		public void setTicketPrice(double ticketPrice) {
			this.ticketPrice = ticketPrice;
		}

		public String getPaymentStatus() {
			return paymentStatus;
		}

		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public void setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
		}

}
