import java.util.Scanner ;
public class program3 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner (System.in) ; 
		
		int p; 		// store principle amount
		int n;		// number of months 
		double r;	// rate of interest 
		double si;	// simple interest 
		System.out.println("Enter principle amount");
		p=S.nextInt();
		System.out.println("Enter number of months");
		n=S.nextInt();
		System.out.println("Enter rate of interest");
		r=S.nextDouble();
		
		
		si=(p*n*r)/100;
		
		System.out.println("Simple interest amount is "+si);
		System.out.println("Total amount "+(p+si));
		
		S.close();
		
	}

}
