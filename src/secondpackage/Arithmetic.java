package secondpackage;

public class Arithmetic {
	int a;
	int b;
	
	void quotient_reminder() {
		double q = a/b;
		System.out.print("Quotient on dividing " + a + " by " + b + " = " + q);
		double r = a%b;
		System.out.print("Remainder on dividing " + a + " by " + b + " = " +  r);
	}
	

}
