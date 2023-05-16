package networking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;



public class JDBC_update_values_1 {
	public static void main(String[] args) throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ankitdb","root","Ankit@999");
		String s="update unittest set name='Ankit Nainwal' where roll=15";
		PreparedStatement pre=con.prepareStatement(s);
		pre.setString(1, s);
		int b=pre.executeUpdate();
		System.out.println("done!");
	}
}
