
//This page is used to login and register to book tickets
import java.util.*;
public class Home {
	private String Userlogin;
	private String Userregister;
	
	public static void main(String arg[]){
		
		System.out.println("Welcome to Disney Land ");
		System.out.println("***********************");
		System.out.println("***********************");
		asd:
		while(true){
			System.out.println("      ");
			System.out.println("Select Option:");
			System.out.println("Login to book tickets....");
			System.out.println("1.Register");
			System.out.println("2.Login");
			
			System.out.println("3. Exit");
			
		
		Scanner ch=new Scanner(System.in);
		int value=ch.nextInt();
		switch(value){
		case 1:System.out.println("             ");
		RegisteredUser r1= new RegisteredUser(); 
		r1.register();
		break;
		case 2: RegisteredUser r= new RegisteredUser(); // This references to login
		r.login();
		break;
		
		case 3:
			break asd;
		
		default: 
			System.out.println("Enter Valid Number");
			break;
		
		
		}
		}
	}

}
