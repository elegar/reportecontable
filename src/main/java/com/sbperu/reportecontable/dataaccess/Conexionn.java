package com.sbperu.reportecontable.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionn {
	public static Connection Cadena()
    {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://<ip>;database=<database>;";
            String userName = "<user>";
            String password = "<password>";
            cn = DriverManager.getConnection(connectionUrl,userName,password);
        }
        catch (SQLException ex) {
            System.out.println("Error.");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        }
        return cn;
    }

}
