package firstPackage;

public class Printer {
	
	String Brandname;
	
	String Type;
	
	int Printspeed;
	
	void print() {
		System.out.println("Printing from "+ Brandname);	
    }
	
	void scan() {
		System.out.println("Scanning document...");	
	}
	
	void copy() {
		System.out.println("copying document...");
		
	}
}
