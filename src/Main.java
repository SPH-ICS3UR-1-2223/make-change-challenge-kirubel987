import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		//Read in the amount paid
		//Print out the amount of change
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
			
			System.out.println("Enter the price");
			double price=in.nextDouble();
			System.out.println("Enter the amount paid");
			double paid=in.nextDouble();
			double change = paid-price;
			System.out.println("Your total change is: $"+change);
			
			int num100 = (int)(change/100);
			System.out.println("Your number of $100 bills is" +num100+" x 100");
			change -=100*num100;
			int num50 = (int)(change/50);
			System.out.println("Your number of $50 bills is" +num50+" x 50");
			change -=50*num50;
			int num20 = (int)(change/20);
			System.out.println("Your number of $20 bills is" +num20+" x 20");
			change -=20*num20;
			int num10 = (int)(change/10);
			System.out.println("Your number of $10 bills is" +num10+" x 10");
			change -=10*num10;
			int num5 = (int)(change/5);
			System.out.println("Your number of $5 bills is" +num5+" x 5");
			change -=5*num5;
			
					
			
			
			
			
			
			
			
			
			
			
			
		
		
			
		}

	
	
			
}
