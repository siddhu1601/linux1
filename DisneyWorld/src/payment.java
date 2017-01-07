//this is the payment page where payment is done by debit or coupons.
import java.util.*;
public class payment {
	private String payment_name;
	private String payment_price;
	private String Invoice_number;
	private String payment_type;
}
	
	class Debit extends payment{
		public int Pay(int amount){
			System.out.println("Amount paid by credit card:"+amount);
			Ticket t= new Ticket();
			t.confirmation();
			return amount;
		}
		
	}
	class Coupon extends payment{
		public int Pays(int amount1){
			System.out.println("Amount paid by coupon/promo code:"+amount1);
			return amount1;
		}
	}
		class refund extends payment{
			public int refunds(int amount2){
				System.out.println("Amount refunded:"+amount2);
				return amount2;
			}
		}
	


