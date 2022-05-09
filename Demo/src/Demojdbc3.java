import java.sql.*;


public class Demojdbc3 {
	
public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "root";
		int user_id =4 ;
		String student_name ="vinod";
		String student_parent ="Raju";
		String query = "insert into student values (?,?,?) ";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, user_id);
		st.setString(2, student_name);
		st.setString(3, student_parent);
		int count = st.executeUpdate();
		
	System.out.println(count +"rows effected");
		st.close();
		con.close();

}
}