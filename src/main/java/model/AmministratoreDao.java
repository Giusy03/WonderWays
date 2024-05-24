package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmministratoreDao {
	private Connection dbConn;
	private String dbURL="jdbc:mysql://localhost:3306/wonderways";
	private String username="root";
	private String password="root";
	
	public AmministratoreDao() throws ClassNotFoundException,SQLException{
		
	}
	public AmministratoreBean getAmministratore(int id) throws ClassNotFoundException,SQLException{
		dbConn=DriverManager.getConnection(dbURL,username,password);
		AmministratoreBean amministratore=new AmministratoreBean();
		
		Statement st=dbConn.createStatement();
		String myquery="Select * From Amministratore WHERE id="+id;
		ResultSet rs=st.executeQuery(myquery);
		
		while(rs.next()) {
			amministratore.setId(rs.getInt(1));
			amministratore.setNome(rs.getString(2));
			amministratore.setEmail(rs.getString(4));
			amministratore.setPassword(rs.getString(3));
		}
		rs.close();
		st.close();
		dbConn.close();
		return amministratore;
	}
}
