package networking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;


public class JDBC_prepared_statements_1 {
	
	public static  String given() {
		char c[]= new char [10];
		
		for(int i=0;i<10;i++) {
			Random rnd = new Random();
			char cc = (char) ('a' + rnd.nextInt(26));
			c[i]=cc;
		}
		
		String str=String.valueOf(c);
		return str;
	}
	
	public static void main(String[] args) throws Exception{
		
//		System.out.println("the name is :"+JDBC_prepared_statements_1.given());
//		System.out.println("The name is "+JDBC_prepared_statements_1.given());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ankitdb","root","Ankit@999");
		String s ="insert into unittest values(?,?,?,? )";
		PreparedStatement ps=con.prepareStatement(s);
		
		for(int i=16;i<=30;i++) {
			ps.setInt(1, i);
			ps.setString(2,JDBC_prepared_statements_1.given());
			//int marks=(int)Math.random()*90+10;
			ps.setFloat(3,(int)Math.random()*100+1);
			ps.setString(4,"A");
			int b=ps.executeUpdate();
		}
		
		System.out.println("done!");
		System.exit(0);
	}
}
