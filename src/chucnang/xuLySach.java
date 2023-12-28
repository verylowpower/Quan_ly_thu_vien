/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quann
 */
public class xuLySach {
    public static void updateTable(){
        
    }
    //Them phan tu tu database vao comboBox cua sachDialog
    public static void getComboBoxElements(javax.swing.JComboBox jComboBox, javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2){
        try {
            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM tacgia");
            while (rs.next()) {
                jComboBox.addItem(rs.getString("tentacgia"));
            }
            rs = stat.executeQuery("SELECT * FROM nha_xuat_ban");
            while(rs.next()){
                jComboBox1.addItem(rs.getString("ten_nxb"));
            }
            rs = stat.executeQuery("SELECT * FROM theloai");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("tentheloai"));
            }
        } catch (Exception e) {
        }
    }
    // Chay query them vao database 
    public static void add(javax.swing.JComboBox jComboBox, javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2, String tenSach, String namXb){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into sach(ten_sach, nam_xb, ma_nxb, ma_theloai, ma_tacgia)"
                                    + "values(?, ?, ?, ?, ?)");
            ResultSet rs = connectionClass.getStatement().executeQuery("SELECT * FROM tacgia WHERE tentacgia = '"+jComboBox.getSelectedItem().toString()+"'");
            rs.next();
            int idTacGia = rs.getInt("ma_tacgia");
            rs = connectionClass.getStatement().executeQuery("Select * from theloai WHERE tentheloai = '"+jComboBox2.getSelectedItem() +"'");
            rs.next();
            int idTheLoai = rs.getInt("ma_theloai");
            rs = connectionClass.getStatement().executeQuery("Select * from nha_xuat_ban WHERE tennxb = '"+jComboBox1.getSelectedItem() +"'");
            rs.next();
            int idNxb = rs.getInt("ma_nxb");
            ps.setString(1, tenSach);
            ps.setString(2, namXb);
            ps.setInt(3, idNxb);
            ps.setInt(4, idTheLoai);
            ps.setInt(5, idTacGia);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
}
