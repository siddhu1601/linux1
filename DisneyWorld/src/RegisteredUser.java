//user can login, register, check his purchase history and cancel his tickets
import java.util.Scanner;


public class RegisteredUser {
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private String town;
	private String county;
	private String city;
	private String state;
	private String zip;
	private String email;
	private int contact;
	private int payment;
	private String Account_history;
	public void register(){
		
		System.out.println("User is registered here");
		System.out.println("");
	}
	
public void login(){
	System.out.println("Please enter email id");
	System.out.println("Please enter password");
	System.out.println("                 ");
	System.out.println("sachin@gmail.com");
	System.out.println("**********");
	asd:
		while(true){
			System.out.println("             ");
			System.out.println("Select Option:");
			System.out.println("1.Book Ticket");
			System.out.println("2.Purchase History");
			System.out.println("3.Cancel Ticket");
			System.out.println("4. Exit");
			
		
		Scanner ch5=new Scanner(System.in);
		int value=ch5.nextInt();
		switch(value){
		case 1:System.out.println("Please enter the vacation details");
		vacation v =new vacation();
		v.Details();
		break;
		case 2: 
			Ticket tp= new Ticket();
			tp.purchasehistory();
			
			
		break;
		case 3:
			Ticket tc= new Ticket();
			tc.cancelticket();
			break;
			
		case 4:
			break asd;
		
		default: 
			System.out.println("Enter Valid Number");
			break;
		}
		}
	
	
}
}
