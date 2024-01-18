/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author quann
 */
public class connectionClass {
    static String URL = "jdbc:mysql://localhost:3306/thuvien";
    static String USER_NAME = "root";
    static String PASSWORD = "123456";
    static Connection connection = null;
    static Statement statement = null;
    public static void ConnectDB(){
        try{
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            statement = connection.createStatement();
            System.out.println("Ket noi thanh cong");
        }catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Ket noi khong thanh cong ! " + e.getMessage());      
        }
    }
    public static Connection getConnection(){
        return connection;
    }
    public static Statement getStatement(){
        return statement;
    }
    

}

