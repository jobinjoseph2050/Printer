package firstPackage;

public class PrinterMain {

	public static void main(String[] args) {
		Printer Brother = new Printer();
		Brother.Brandname = "Brother";
		Brother.Printspeed = 27;
		Brother.Type= "Laser";
		Brother.print();
		Brother.scan();
		Brother.copy();
		System.out.println("Ready to Print");
		System.out.println("****************");
		System.out.println("Jobin Joseph");

	}

}
