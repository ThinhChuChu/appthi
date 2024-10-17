/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinhgiang.model;
import java.sql.*;

/**
 *
 * @author dinhgiang1
 */
public class ConnectDB {
    
    public Connection gConnection() throws ClassNotFoundException {   
        Connection con = null;
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=De01;encrypt=true;trustServerCertificate=true";
        String user="sa";
        String pass="1";
        con = DriverManager.getConnection (url, user, pass);
        } catch (SQLException ex) {
         ex.printStackTrace();
        }              
        return con;
        
        
    }
}
