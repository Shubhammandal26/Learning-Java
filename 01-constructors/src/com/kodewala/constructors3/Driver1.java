package com.kodewala.constructors3;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotificationService notificationService = new NotificationService();
		
		notificationService.sendNotification("SMS");
		notificationService.sendNotification("Email");
		notificationService.sendNotification("other");
		

		
		
	}

}

 // f5 - go inside the method/ constructor/ block (Step Into)
// f6 -  go next line / Step Over
// f7 -  Return to the calling / Step Return
// f8 -  Move to next Break Point
