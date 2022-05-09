import java.util.Scanner ;
public class program2 {

	public static void main(String[] args) {
		String Empid ;
		String Name ;
		String BloodGroup ;
		String ContactNumber ;
		
		Scanner S = new Scanner (System.in) ; 
		
		System.out.println("Enter Employee Id ");
		Empid = S.nextLine();
		System.out.println("Enter Employee Name ");
		Name = S.nextLine();
		System.out.println("Enter Blood Group");
		BloodGroup = S.nextLine();
		System.out.println("Enter Employee Contact Number ");
		ContactNumber = S.nextLine();
		
		
		System.out.println("Employee Id : "+ Empid );
		System.out.println("Employee Name : "+ Name );
		System.out.println("Employee Name : "+ BloodGroup );
		System.out.println("Employee Contact Number : "+ ContactNumber );
		
		S.close();
	}
}
