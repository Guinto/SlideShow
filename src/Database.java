
public class Database {
	
	//TODO after direct db connection can be made through godaddy
	
	/*public Database() {
		// The following declarations are put outside the "try" block so that
	    // they are accessible everywhere in this main method.
	    Connection conn = null;
	    PreparedStatement  stmt = null;
	    ResultSet rset = null;  
	    
	    try {
	       conn = getConnection();
	       String query =          	
	                "select * " +
	                "from   base";
	       System.out.println("QUERY STRING is:\n" + query);
	       stmt = conn.prepareStatement(query);
	       	
	       // Exceute the query and obtain the result set 
	       rset = stmt.executeQuery();
	       	
	       // Iterate through the result set and print the attribute values
	       int i = 1; 
	       while (rset.next ()){
	          System.out.print(i + "\t");
	          System.out.print (rset.getString ("x_") + "\t");
	          System.out.print (rset.getString ("y_") + "\t");
	          System.out.println();
	          i++;
	       } //end while
	       rset.close( );
	    } //end try
	    catch (Exception ex){
		     ex.printStackTrace();
	    }
	    finally {
	    	 try {
	           stmt.close();
	           conn.close(); 
	       }
	       catch (Exception ex) {
	 	        ex.printStackTrace();    
	       }    	
	    }    	
	}
	
	public Connection getConnection() {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", "trentellingsen");
	    connectionProps.put("password", "MNP2Linux");

        try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	    try {
			conn = DriverManager.getConnection("jdbc:mysql://trentellingsen.db.7140214.hostedresource.com/trentellingsen", connectionProps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("Connected to database");
	    return conn;
	}*/
}
