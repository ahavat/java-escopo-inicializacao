
public class Main {
		public static void main (String[] args) {
			
			double price = 199.00;
			double discount;
			
			if( price < 200.00) {
				discount = price * 0.1;
			}
			else {
				discount = price * 0.2;
			}
			
			System.out.println(discount);
		}
}
