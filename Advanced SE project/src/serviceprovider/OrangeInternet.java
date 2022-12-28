package serviceprovider;
import java.util.Map;

import form.Form;
import form.OrangeInternetForm;

public class OrangeInternet extends ServiceProvider {
	String name = "OrangeInternet";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Added ";
		
		message += m.get("subscription");
		
		message += "GB to Orange number"+ m.get("Number");
		
		return message;
	}

	@Override
	public Form create_form() {
		return new OrangeInternetForm();
	}

}