package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    
    

    static Connection con;
static final String url="jdbc:mysql://localhost/employeedb";
static final String username="root";
static final String pass="root";


    public static Connection createCp() throws SQLException
    {
        
        Connection con=DriverManager.getConnection(url,pass,username);
        
        
         return  con;
    
        
    }
    

}

