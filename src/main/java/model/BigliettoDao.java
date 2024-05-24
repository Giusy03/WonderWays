package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BigliettoDao {
	private Connection dbConn;
    private static final String DBURL = "jdbc:mysql://localhost:3306/wonderways";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public BigliettoDao() throws ClassNotFoundException, SQLException {
    	dbConn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    	BigliettoBean biglietto=new BigliettoBean();
    
    }
    
    

    public BigliettoBean getBiglietto(int id) throws SQLException {
        BigliettoBean biglietto = new BigliettoBean();

        String query = "SELECT * FROM Biglietto WHERE id = ?";

        try (Connection dbConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
             PreparedStatement pst = dbConn.prepareStatement(query)) {

            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    biglietto.setIdbiglietto(rs.getInt("id"));
                    biglietto.setIdutente(rs.getInt("idutente"));
                    biglietto.setDataacquisto(null);
                    biglietto.setPrezzo(rs.getDouble("prezzo"));
                    biglietto.setIdviaggio(rs.getInt("idviaggio"));
                }
            }
        }
        return biglietto;
    }
}
