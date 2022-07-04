/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;
import java.sql.*;
/**
 *
 * @author tanvi
 */
public class ConectionProvidor {
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","tmm866");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
