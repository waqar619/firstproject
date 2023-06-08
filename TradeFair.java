import java.util.*;
public class TradeFair {

	public static void main(String[] args) {
		System.out.println("Welcome to trade fair event");
		System.out.println("Enter the total number of employee");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = (2/5)*a;
		//b=Math.round (a*0.28);
		System.out.println("No of attendee on day 1 :" + b);
		double c = 2*b;
		System.out.println("No of attendee on day 2 :" + c);
		sc.close();
				
				

	}

}
