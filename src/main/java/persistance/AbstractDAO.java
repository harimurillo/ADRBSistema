package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO {
	
	  private static final String URL = "jdbc:mysql://localhost:3306";
	  private static final String USER = "root";
	  private static final String PASS = "Quatorze14*";
	  
	  protected Connection getConnection() throws SQLException {
	    
	    Connection cn = DriverManager.getConnection(URL, USER, PASS);
	    return cn;
	  }
	  
	  protected void closeResources(
	      Connection cn, Statement st, ResultSet rs) {

	    if (rs != null) {
	      try {
	        rs.close();
	      } catch (SQLException e) {
	        // nao faca nada
	      }
	    }

	    if (st != null) {
	      try {
	        st.close();
	      } catch (SQLException e) {
	        // nao faca nada
	      }
	    }

	    if (cn != null) {
	      try {
	        cn.close();
	      } catch (SQLException e) {
	        // nao faca nada
	      }
	    }
	  }

}
