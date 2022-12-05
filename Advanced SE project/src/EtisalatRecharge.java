import java.util.Map;

public class EtisalatRecharge implements ServiceProvider {
	String name = "Etistalat Mobile Recharge Service";
	@Override
	public String get_name() {
		return name;
	}

	@Override
	public String handle(Map<String,String> m,double amount) {
		
		String message ="Number "+ m.get("Number")+ "Recieved ";
		
		message += amount;
		
		message += "EGP";
		
		return message;
	}

	@Override
	public Form create_form() {
		return new EtisalatRechargeForm();
	}

}
