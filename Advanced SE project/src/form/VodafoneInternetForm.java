package form;
import java.util.Scanner;

public class VodafoneInternetForm extends Form {
public void take_input(Scanner i) {
		
		takeamount = false;
		System.out.println("Vodafone internet Choose Your Subscription");
		boolean flag = true;
		
		System.out.println("-----------------------------------------");
		System.out.print("Enter your Number:>");
		formdata.put("Number", i.nextLine());
		int choice  = 0;
		while (flag) {
			System.out.println("-----------------------------------------");
			System.out.println("Choose your subscription:>");
			System.out.println("1-140 GB for 160 EGP");
			System.out.println("2-180GB for 200EGP");
			System.out.println("3-220 GB for 220EGP");
			System.out.print("Enter your Number:>");
			 choice = i.nextInt();
			 
			 
			 if(choice<0 || choice >3)
			 {
				 System.out.println("Choose a valid number");
			 }
			 else
				 flag = false;
			
			
			
		}
		switch(choice) {
			case(1):formdata.put("subscription", "160");
					amount = 140;
					break;
			case(2):formdata.put("subscription", "200");
					amount = 180;
						break;
			case(3):formdata.put("subscription", "220");
					amount = 220;
					break;
		
		}
}
}