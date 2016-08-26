/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.narayanatutorial.opencsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rbns
 */
public class DatabaseConnection {

    static String driver="";
    static String url="";
    static String username="";
    static String password="";
    Connection con=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    String SQL="";

     public void CreateConnection()  {
       try {
        Class.forName(driver);
        con = DriverManager.getConnection(url,username,password);

         } catch (Exception e) {
            System.out.println("Exception getting connection.");
            e.printStackTrace();
        }
    }
     public ResultSet getData(){
         try{
             SQL="SELECT * FROM PROFILE";
             stmt=con.createStatement();
             rs=stmt.executeQuery(SQL);
         }catch(SQLException s){
             s.printStackTrace();
         }
         return rs;
     }

     public void closeConnections() throws SQLException {
        try{
        con.commit();
        }catch(Exception e){
            System.out.println("Exception while commit the connection.."+e);
        }


        if (rs != null) {
            rs.close();
            rs = null;
        }

        if (stmt != null) {
            stmt.close();
            stmt = null;
        }

         if (pstmt != null) {
            pstmt.close();
            pstmt = null;
        }
        if (con != null) {
            con.close();
            con = null;
        }
    }
}
