package database_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "admin", "admin"); //connection db and giving password admin detilas
		
		Statement stm = con.createStatement();//to create statement 
		stm.executeUpdate("insert into eproduct(name ,price ,date_added)values ('Tablet',1500.00, now()_)");
	   ResultSet result =stm.executeQuery("select * from eproduct ");
	   
	   while(result.next()) {
		   
		   System.out.println(result.getInt("ID"));
		   System.out.println(result.getString("name"));
		   System.out.println(result.getTime("now"));
	   }
	}

}
