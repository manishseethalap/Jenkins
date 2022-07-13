package JDBCPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;
public class ExecuteUpdatetest {
	@Test
	public void executeUpdatetest() throws Throwable {
		Connection con=null;
		try {
			// Register the driver
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			// Connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENTS","root", "root");
			// Create Statement
			Statement stmt = con.createStatement();
			//Execute update Query
			int result = stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values('2','Laxman','raghu','kul')");
			if(result==1) {
			System.out.println("Data is added");	
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
}
