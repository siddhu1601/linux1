//This code is used to enter vacation details needed for booking a ticket
import java.util.Scanner;



public class vacation {
	private String passtype;
	private float passprice;
	private String passrides;
	private String passdiscounts;
	private String ridetype;
	private String rideamount;
	private String ridetimings;
	private String packagedetails;
	private String packagetype;
	private String packageprice;
	private float totalamount;
	public void Details(){
		
		asd:
			while(true){
				System.out.println("      ");
				System.out.println("Select Option:");
				System.out.println("1.Book a pass");
				System.out.println("2.Book a package");
				System.out.println("3.Book by rides");
				System.out.println("4. Exit");
				
			
			Scanner ch5=new Scanner(System.in);
			int value=ch5.nextInt();
			switch(value){
			case 1:System.out.println("Passes price varies with number of days selected ");
				System.out.println("Please select the pass\n 1.Fast Pass\n2. Annual Pass\n 3.Multiday pass ");
			break asd;
			
			case 2: 
				System.out.println("Different packages are selected over here ");
				
				
			break asd;
			case 3:
				System.out.println("Different rides are selected over here ");
				break asd;
				
			case 4:
				break asd;
			default: 
				System.out.println("Enter Valid Number");
				break;
			}
			}
			
		System.out.println("Enter number of days");
		Scanner ch=new Scanner(System.in);
		int value1=ch.nextInt();
		System.out.println("Enter the start date (mmddyyyy)");
		Scanner ch2=new Scanner(System.in);
		int date=ch2.nextInt();
		
		System.out.println("Enter number of tickets");
		Scanner ch3=new Scanner(System.in);
		int value2=ch3.nextInt();

		System.out.println("Select the park");
		park p=new park();
		p.parks();
		System.out.println("                 ");
		System.out.println("Review the details");
		System.out.println("                 ");
		
		System.out.println("Number of days: " +value1);
		System.out.println("The start date: "+date);
			System.out.println("Number of tickets: "+value2);
		System.out.println("Park selected: amusement park");
		int price = value1*80*value2+100;
		System.out.println("Total Price is: "+price);//final ticket amount is generated.
		System.out.println("Please enter the payment option:");
		System.out.println("1.Debit/credit card\n 2.coupon/promo code\n ");
		Scanner ch4=new Scanner(System.in);
		int value3=ch4.nextInt();
		switch(value3){
		case 1:
			Debit p1=new Debit();
			
			int amount= p1.Pay(price);
			
			
				break;
		case 2:		
		
            Coupon p2=new Coupon();
			
			int amount1= p2.Pays(price);
			
			
		break;
		default: 
					System.out.println("Enter Valid Number");
					break;

		}
		}
			
	public void pass(){
		
	}
	}


