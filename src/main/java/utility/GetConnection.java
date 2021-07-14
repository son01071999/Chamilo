package utility;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection implements Serializable {
	
	    public static Connection makeConnection() {
	    	
	        try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            String url = "jdbc:sqlserver://localhost:1433;databaseName=Chamilo";
	            Connection con = DriverManager.getConnection(url, "sa", "password");
	            return con;
	        } catch (ClassNotFoundException e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	        return null;
	    }
	
}
