package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagamentoDao {
	private Connection dbConn;
    private static final String DBURL = "jdbc:mysql://localhost:3306/wonderways";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public PagamentoDao() throws ClassNotFoundException, SQLException {
    	dbConn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
    	PagamentoBean pagamento=new PagamentoBean();
    
    }
    
    

    public PagamentoBean getPagamento(int id) throws SQLException {
        PagamentoBean pagamento = new PagamentoBean();

        String query = "SELECT * FROM Pagamento WHERE id = ?";

        try (Connection dbConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
             PreparedStatement pst = dbConn.prepareStatement(query)) {

            pst.setInt(1, id);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                	pagamento.setIdpagamento(rs.getInt("id"));  
                }
            }
        }
        return pagamento;
    }
}
