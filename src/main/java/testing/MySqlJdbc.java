package testing;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MySqlJdbc {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///test","root","Liger124!");
			
			Statement st = con.createStatement();
			
			String query = "select * from monsters";
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) 
				+ " " + rs.getString(3) + " " + rs.getString(4));
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
