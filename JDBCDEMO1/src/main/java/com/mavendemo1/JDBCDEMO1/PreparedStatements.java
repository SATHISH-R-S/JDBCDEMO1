package com.mavendemo1.JDBCDEMO1;

import java.sql.*;

public class PreparedStatements {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

		final String URL="jdbc:oracle:thin:@localhost:1521:xe";
		final String userName="SYSTEM";
		final String password="sathish1718";
		 String query="INSERT INTO DATABASE.TEST_CHECK VALUES(?,?,?)";
		 String query1="SELECT * FROM DATABASE.TEST_CHECK WHERE TESTID=?";
		 String query2="UPDATE DATABASE.TEST_CHECK SET TESTSCORE=75 WHERE TESTNAME=?";
		 String query3="DELETE FROM DATABASE.TEST_CHECK WHERE TESTNAME=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try (Connection con=DriverManager.getConnection(URL,userName,password);){
//		PreparedStatement stat=con.prepareStatement(query);
		//PreparedStatement stat1=con.prepareStatement(query1);
//		PreparedStatement stat2=con.prepareStatement(query2);
		PreparedStatement stat3=con.prepareStatement(query3);
//			System.out.println(con);
//			stat.setInt(1,123);
//			stat.setString(2,"fgf");
//			stat.setFloat(3, 99);
			//stat.execute();
		//	stat1.setInt(1,102);
		//	stat2.setString(1,"PYTHON");
		    stat3.setString(1,"fgf");
		    stat3.execute();
			//ResultSet result1=stat1.executeQuery();
//			ResultSet result2=stat2.executeQuery("SELECT * FROM DATABASE.TEST_CHECK");
			ResultSet result3=stat3.executeQuery("SELECT * FROM DATABASE.TEST_CHECK");
//			int details=stat.executeUpdate();
//			ResultSet result=stat.executeQuery("SELECT * FROM DATABASE.TEST_CHECK");
//			System.out.println(details);
//			while(result.next()) {
//				System.out.println(result.getInt(1)+" | "+result.getString(2)+" | "+result.getString(3));
//
//				
//				
//
//			}
			
//			while(result1.next()) {
//				System.out.println(result1.getInt(1)+" | "+result1.getString(2)+" | "+result1.getString(3));				
//
//			}
//			while(result2.next()) {
//				System.out.println(result2.getInt(1)+" | "+result2.getString(2)+" | "+result2.getString(3));
//
//			}
			while(result3.next()) {
				System.out.println(result3.getInt(1)+" | "+result3.getString(2)+" | "+result3.getString(3));

			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//		}
//		
		//2.create connection
		
		}

	}

}
