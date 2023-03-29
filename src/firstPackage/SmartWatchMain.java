package firstPackage;

public class SmartWatchMain {

	public static void main(String[] args) {
		Smartwatch Samsung = new Smartwatch();

		Samsung.Brandname = "Samsung";
		Samsung.Batterylife = 5;
		Samsung.Screensize = 35;
		Samsung.callcapability = true;
		Samsung.time();
		Samsung.messagenotification();
		Samsung.footstepscount();
		
		
	}

}
