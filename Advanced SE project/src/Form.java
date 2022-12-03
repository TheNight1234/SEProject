import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public abstract class Form {
	
	protected Map<String,String> formdata = new HashMap<String,String>();
	
	protected double amount;
	
	boolean start() {
//Template Method	
		Scanner i = new Scanner(System.in);

		take_input(i);
		
		System.out.print("Enter Amount of money:>");
		amount = i.nextDouble();
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("1-Confirm payment         2-Cancel");
		System.out.println("-----------------------------------------");
		System.out.print(">");
		int choice = i.nextInt();
		
		if(choice==1)
			return true;
		else
			return false;
	}
	Map<String,String> get_data()
	{
		return formdata;
	}
	double get_amount()
	{
		return amount;
	}
	
	abstract void take_input(Scanner i);
	
}