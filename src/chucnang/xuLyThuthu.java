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
    
    public static void select(javax.swing.JTextField txtusername5, javax.swing.JTextField txtusername4,
        javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2, 
        javax.swing.JTextField txtusername9, javax.swing.JTextField txtusername7, javax.swing.JTable jTable) {
    try {
        txtusername5.setText(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            ResultSet rs = connectionClass.getStatement().executeQuery(
                    "select ma_nv, hoten, gioi_tinh, dia_chi, sdt from nhanvien");
            rs.next();
            txtusername5.setText(rs.getString("ma_nv"));
            txtusername4.setText(rs.getString("hoten"));
            if(rs.getString("gender") != null){
                if((rs.getString("gender")).equals("Nam")){
                    JRadioButton1.setSelected(true);
                } else if(rs.getString("gender").equals("Nữ")){
                    JRadioButton2.setSelected(true);
                }
            }
            txtusername9.setText(rs.getString("dia_chi"));
            txtusername7.setText(rs.getString("sdt"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void edit(int ma_nv, javax.swing.JTable jTable,String tenNV, 
            javax.swing.JComboBox JComboBox1, javax.swing.JComboBox JComboBox2, javax.swing.JComboBox JComboBox3,
            javax.swing.JRadioButton JRadioButton1, javax.swing.JRadioButton JRadioButton2, 
            String diaChi, String sdt) {
        try {
            PreparedStatement ps = connectionClass.getConnection().prepareStatement(
                    "Update nhanvien set ma_nv = ?, hoten = ?, ngay_sinh = ?, gioi_tinh = ?, dia_chi = ?, sdt = ? where ma_nv = '"+ ma_nv +"'");
            ps.setInt(1, ma_nv);
            ps.setString(2, tenNV);
            ps.setString(3, String.valueOf(JComboBox1.getSelectedItem().toString() + "/" + JComboBox2.getSelectedItem().toString()
                + "/" + JComboBox3.getSelectedItem().toString()));
            if(JRadioButton1.isSelected()){
                ps.setString(4, "Nam");
            } else if(JRadioButton2.isSelected()){ 
                ps.setString(4, "Nữ");
            }
            ps.setString(5, diaChi);
            ps.setString(6, sdt);
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
    
    public static void delete(javax.swing.JTable jTable1) {
        try {
            Connection conn = connectionClass.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM nhanvien WHERE ma_nv = ?");
            ps.setInt(1, Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed " + e.getMessage());
        }
    }
}
