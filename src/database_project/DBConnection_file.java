package database_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection_file {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin"); //connection db and giving password admin detilas
		
		Statement stm = con.createStatement();//to create statement 
		
		ResultSet result =stm.executeQuery("select * from eproduct");//to select table
		
		while(result.next()) {
			
			System.out.println(result.getInt("ID"));//print id 
			System.out.println(result.getString("name"));//print name
			
		}







	}

}
