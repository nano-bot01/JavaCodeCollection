package Exceptions;

import java.sql.SQLException;

/*
 * throws means we don't have to handle the exception, handled by caller point
 * 		either it throws back to calling point, or handle it using try-catch 
 * 
 * 
 * throw means we have to handle the exception 
 */


public class SQLException1 {
	
	static void db() throws SQLException{
		// DB Connect code 
		throw new SQLException();
	}
	static void logic() throws SQLException{
		// Business logic code 
		db();
	}
	static void view() throws SQLException{
		// Business logic code 
		logic();
	}
	public static void main(String[] args) {
		try{
			view();
		}
		catch(SQLException e) {
			System.out.println("Might be DB is Down....");
			e.printStackTrace();
		}
	}
}
