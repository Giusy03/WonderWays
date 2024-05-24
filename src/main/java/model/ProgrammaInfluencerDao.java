package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgrammaInfluencerDao {
	private Connection dbConn;
    private static final String DBURL = "jdbc:mysql://localhost:3306/wonderways";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public ProgrammaInfluencerDao() throws ClassNotFoundException, SQLException {
    	dbConn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    
    }
    
	Statement st=dbConn.createStatement();
}



