/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chucnang;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lehuy
 */
public class xuLyThuthu {
    public static void updateTable(javax.swing.JTable jTable1) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            Statement stat = connectionClass.getStatement();
            ResultSet rs = stat.executeQuery(
                    "select ma_nv, hoten, ngay_sinh, gioi_tinh, dia_chi, sdt from nhanvien");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getString("ma_nv"), rs.getString("hoten"), rs.getString("ngay_sinh"), rs.getString("gioi_tinh"),
                        rs.getString("dia_chi"), rs.getString("sdt")
                });
            }
        } catch (Exception e) {
        }
    }
    public static void add(String tenNV, 
            javax.swing.JComboBox JComboBox1, javax.swing.JComboBox JComboBox2, javax.swing.JComboBox JComboBox3,
            javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2, 
            String diaChi, String sdt){
        try {
            Connection conn = connectionClass.getConnection();
            final PreparedStatement ps = conn
                    .prepareStatement(
                            "insert into nhanvien(hoten, ngay_sinh, gioi_tinh, dia_chi, sdt)"
                                    + "values(?, ?, ?, ?, ?)");
            ps.setString(1, tenNV);
            ps.setString(2, String.valueOf(JComboBox1.getSelectedItem().toString() + "/" + JComboBox2.getSelectedItem().toString()
                + "/" + JComboBox3.getSelectedItem().toString()));
            if(JRadioButton1.isSelected()){
                ps.setString(3, "Nam");
            } else if(JRadioButton2.isSelected()){ 
                ps.setString(3, "Nữ");
            }
            ps.setString(4, diaChi);
            ps.setString(5, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
}
