import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class Demo4 
{
	 public static void main(String[] args) throws Exception 
	 {
		// Class.forName("Pqr");
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
	
	 }

}
 class Pqr
 {
	 static 
	 {
		 System.out.println("in static");
	 }
	 
	 //instance
	 {
		 System.out.println("in instance");
	 }
	 
 }
