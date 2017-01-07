
public class Ticket {
	private String Customer_name;
	private String Ticket_type;
	private String ticket_status;
	private String ticket_history;
	private String ticket_payment;
	private float ticket_price;
	
public void confirmation(){
	System.out.println("Ticket confirmed ");
}
public void purchasehistory(){
	System.out.println("1. Amusement park ticket booked on 10/11/2016 ");
	System.out.println("2. Water park ticket booked on 11/11/2016 ");
}

public void cancelticket(){
	System.out.println("Upcoming Booked Tickets ");
	System.out.println("1. Amusement park ticket booked on 12/11/2016 ");
	System.out.println("       ");
	System.out.println("1. Amusement park ticket booked on 12/11/2016 is cancelled and payment refunded to your card");
	refund p2=new refund();
	
	int amount2= p2.refunds(160);
}
}
