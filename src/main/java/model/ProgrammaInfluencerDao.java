package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProgrammaInfluencerDao {
	private Connection dbConn;
    private static final String DBURL = "jdbc:mysql://localhost:3306/wonderways";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public ProgrammaInfluencerDao() throws ClassNotFoundException, SQLException {
    	dbConn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    	ProgrammaInfluencerBean pinf=new ProgrammaInfluencerBean();
    
    }
    
	Statement st=dbConn.createStatement();
	String myquery="Select * From ProgrammaInfluencer WHERE id="+id;
	ResultSet rs=st.executeQuery(myquery);
	
	while(rs.next()) {
		idprogramma
		idutente
		puntireff
		.setId(rs.getInt(1));
		
	}
	rs.close();
	st.close();
	dbConn.close();
	return amministratore;
}
}



