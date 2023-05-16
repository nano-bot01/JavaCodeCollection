package networking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//for importing driver for database and connection

public class JDBC_first_program_1 {
	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ankitdb","root","Ankit@999");
		
		Statement s=con.createStatement();
		String ss="insert into student values('Kushagra', 'CSE', 1000014499)";
		int a=s.executeUpdate(ss);
		System.out.println(a);
		System.exit(0);
	}
}
