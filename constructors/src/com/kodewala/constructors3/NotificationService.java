package com.kodewala.constructors3;

public class NotificationService {
	
	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");
		if (_type.equalsIgnoreCase("sms")) {
			sendSms();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatApp();
		}
	}

	private void sendSms() 
	{
		System.out.println("NotificationService.sendSms() START");

		System.out.println("NotificationService.sendSms() END");
	}

	private void sendEmail() {

		System.out.println("NotificationService.sendEmail() START");

		System.out.println("NotificationService.sendEmail() END");
	}

	private void sendWhatApp() {
		System.out.println("NotificationService.sendWhatApp() START");

		System.out.println("NotificationService.sendWhatApp() END");
	}
}
