package JDBCPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryTest {
@Test
public void executeQueryTest() throws Throwable {
	
	//Step 1 Register the Driver
	Driver dref = new Driver();
	DriverManager.registerDriver(dref);
	
	//Step 2 Connect to Database
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENTS","root", "root");
	
	//step 3 Create statement
	Statement stmt=con.createStatement();
	
	//step 4 execute Query
	ResultSet result = stmt.executeQuery("select * from students_info;");
	while(result.next()) {
	System.out.println(result.getString(1)+" "+result.getString(2));
	}
	con.close();
}
}
