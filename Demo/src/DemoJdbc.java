import java.sql.*;

public class DemoJdbc {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "root";
		String query = "select student_name from student where user_id=3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
        rs.next();
		String name = rs.getString(1);
		System.out.println(name);
		
		st.close();
		con.close();
		
		
	}
}
